package br.com.rd.quartaturma.oo.abstrato;

public class TesteAbstract {
	
	public static void main(String[] args) {
		Cachorro c = new Cachorro();
		
		System.out.println(c.respirar());
		System.out.println(c.mover());
		System.out.println(c.mamar());
		System.out.println(c.mamar("TESTE"));
	}
	
	
	
}
