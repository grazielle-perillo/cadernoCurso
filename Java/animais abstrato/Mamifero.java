package br.com.rd.quartaturma.oo.abstrato;

public abstract class Mamifero extends Animal{
	
	@Override
	public String mover() {
		// TODO Auto-generated method stub
		return "Usando as Patas";
	}
	
	public abstract String mamar();
}
