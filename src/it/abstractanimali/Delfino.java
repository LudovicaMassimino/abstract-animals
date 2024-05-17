package it.abstractanimali;

public class Delfino extends Animali implements INuotante {
	public Delfino() {
		this.nome = "delfino";
		this.dieta = "mangio pesce";
		this.verso = "iiiiii";	
	}
	public void verso() {
        System.out.println("il mio verso è: " + verso);
    }
	
	public void mangia() {
        System.out.println("la mia dieta è: " + dieta);
    }
	
	public void nuota () {
		System.out.println("so nuotare");
	}
	
}
