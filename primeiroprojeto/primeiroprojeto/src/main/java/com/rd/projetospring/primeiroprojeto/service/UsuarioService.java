package com.rd.projetospring.primeiroprojeto.service;

import com.rd.projetospring.primeiroprojeto.dto.*;
import com.rd.projetospring.primeiroprojeto.entity.*;
import com.rd.projetospring.primeiroprojeto.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private TipoUsuarioRepository tipoUsuarioRepository;

    @Autowired
    private UfRepository ufRepository;

    @Autowired
    private EspecialidadeRepository especialidadeRepository;

    @Autowired
    private TipoContatoRepository tipoContatoRepository;

    public UsuarioEntity getUsuario(BigInteger id){
        System.out.println("ID: " + id);
        Optional<UsuarioEntity> optional = repository.findById(id);
        UsuarioEntity entity = optional.get();

        return entity;
    }

    public List<UsuarioEntity> getUsuario(){

        return repository.findAll();
    }

    @Transactional
    public String alterar(Usuario usuario, BigInteger id){

        UsuarioEntity entity= repository.findById(id).get();

        EspMedEntity espEntity = especialidadeRepository.findById(usuario.getIdEspMed().getIdEspMed()).get();
        entity.setIdEspMed(espEntity);

        UfEntity ufEntity = ufRepository.findById(usuario.getUf().getIdUf()).get();
        entity.setUf(ufEntity);

        TipoUsuarioEntity tipoUsuarioEntity = tipoUsuarioRepository.findById(BigInteger.valueOf(2)).get();
        entity.setIdTipoUsuario(tipoUsuarioEntity);

        entity.setNome(usuario.getNome());
        entity.setDtNascimento(usuario.getDtNascimento());
        entity.setNrCpf(usuario.getNrCpf());
        entity.setNrCrm(usuario.getNrCrm());

        PrecoEntity precoEntity = new PrecoEntity();
        Preco preco = usuario.getPreco();
        precoEntity.setVlConsulta(preco.getVlConsulta());
        entity.setPreco(precoEntity);

        List<ContatoEntity> contatosEntity = entity.getContatos();
        for(Contato contato : usuario.getContatos()){
            ContatoEntity contatoEntity = new ContatoEntity();
            TipoContatoEntity tpContatoEntity = tipoContatoRepository.findById(BigInteger.valueOf(2)).get();
            contatoEntity.setTipoContato(tpContatoEntity);
            contatoEntity.setDsContato(contato.getDsContato());
        }

        entity.setContatos(contatosEntity);

        repository.save(entity);

        return "Alteração realizado com sucesso";
    }

    @Transactional
    public String cadastrar(Usuario usuario){

        UsuarioEntity entity = new UsuarioEntity();

        EspMedEntity espEntity = especialidadeRepository.findById(usuario.getIdEspMed().getIdEspMed()).get();
        entity.setIdEspMed(espEntity);

        UfEntity ufEntity = ufRepository.findById(usuario.getUf().getIdUf()).get();
        entity.setUf(ufEntity);

        TipoUsuarioEntity tipoUsuarioEntity = tipoUsuarioRepository.findById(BigInteger.valueOf(2)).get();
        entity.setIdTipoUsuario(tipoUsuarioEntity);

        entity.setNome(usuario.getNome());
        entity.setDtNascimento(usuario.getDtNascimento());
        entity.setNrCpf(usuario.getNrCpf());
        entity.setNrCrm(usuario.getNrCrm());

        PrecoEntity precoEntity = new PrecoEntity();
        Preco preco = usuario.getPreco();
        precoEntity.setVlConsulta(preco.getVlConsulta());
        entity.setPreco(precoEntity);

        List<EnderecoEntity> enderecosEntity = new ArrayList<>();
        for(Endereco endereco : usuario.getEnderecos()){
            EnderecoEntity enderecoEntity = new EnderecoEntity();
            enderecoEntity.setIdCidade(endereco.getIdCidade());
            enderecoEntity.setDsComplemento(endereco.getDsComplemento());
            enderecoEntity.setDsEndereco(endereco.getDsEndereco());
            enderecoEntity.setDsBairro(endereco.getDsBairro());
            enderecoEntity.setNrCep(endereco.getNrCep());

            enderecosEntity.add(enderecoEntity);
        }

        entity.setEnderecos(enderecosEntity);

        List<ContatoEntity> contatosEntity = new ArrayList<>();
        for(Contato contato : usuario.getContatos()){
            ContatoEntity contatoEntity = new ContatoEntity();
            TipoContatoEntity tpContatoEntity = tipoContatoRepository.findById(BigInteger.valueOf(2)).get();
            contatoEntity.setTipoContato(tpContatoEntity);
            contatoEntity.setDsContato(contato.getDsContato());

            contatosEntity.add(contatoEntity);
        }

        entity.setContatos(contatosEntity);

        repository.save(entity);

        return "Usuário cadastrado com sucesso";
    }
}