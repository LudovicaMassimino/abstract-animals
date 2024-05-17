package it.abstractanimali;

public class Aquila extends Animali implements IVolante {
	
	public Aquila() {
		this.nome = "aquila";
		this.dieta = "mangio carne";
		this.verso = "iaaaaa";	
	}
	public void verso() {
        System.out.println("il mio verso è: " + verso);
    }
	
	public void mangia() {
        System.out.println("la mia dieta è: " + dieta);
    }
	
	public void vola () {
		System.out.println("so volare");
	}
}
