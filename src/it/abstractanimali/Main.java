package it.abstractanimali;

public class Main {

	public static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}
	
	public static void main(String[] args) {
		Cane cane = new Cane();
		Aquila aquila = new Aquila();
		Passerotto passerotto = new Passerotto();
		Delfino delfino = new Delfino();
		
		System.out.println("Sono un cane:");
		cane.dormi();
		cane.verso();
		cane.mangia();
		faiNuotare(cane);
		
		System.out.println("\nSono un'aquila:");
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		faiVolare(aquila);
		
		System.out.println("\nSono un passerotto:");
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		faiVolare(passerotto);
		
		System.out.println("\nSono un delfino:");
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		faiNuotare(delfino);
	}

}
