package it.abstractanimali;

public class Cane extends Animali implements INuotante {
	
	
	public Cane() {
		this.nome = "cane";
		this.dieta = "mangio tutto";
		this.verso = "bau";	
	}
	@Override
	public void verso() {
        System.out.println("il mio verso è: " + verso);
    }
	
	@Override
	public void mangia() {
        System.out.println("la mia dieta è: " + dieta);
    }
	
	public void nuota () {
		System.out.println("so nuotare");
	}
	
}
