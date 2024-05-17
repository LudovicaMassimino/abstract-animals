package it.abstractanimali;

public class Passerotto extends Animali implements IVolante {
	
	public Passerotto() {
		this.nome = "passerotto";
		this.dieta = "mangio semi, vermi, piante";
		this.verso = "cip";	
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
