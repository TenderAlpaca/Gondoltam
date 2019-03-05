import java.util.Scanner;

public class Kitalalos {

	private Jatekos[] jatekosok;

	int gondolt = 0;

	public Kitalalos(int szam) {
		this.jatekosok = new Jatekos[szam];
	}

	public Kitalalos() {
		this.jatekosok = new Jatekos[2];
	}

	public void szambeker() {
		Scanner be = new Scanner(System.in);
		System.out.println("Gondolj egy szamra 1 és 20 között: ");
		gondolt = be.nextInt();
		be.close();
	}

	public void jatekInditasa() {
		
		System.out.println("JATEKINDITAS");

		for (int i = 0; i < jatekosok.length; i++) {

			this.jatekosok[i].setTip();
			System.out.println("Az " + i + ". jatekos tippje: " + jatekosok[i].getTip());

		}

		System.out.println("A jatekmester tippje: " + gondolt);

		boolean talalt = false;

		for (int i = 0; i < jatekosok.length; i++) {

			if (this.jatekosok[i].getTip() == gondolt) {
				System.out.println("jatekos " + i + " talált");
				talalt = true;
			}

		}

		if (!talalt) {
			System.out.println("Nincs nyertes");
		}

	}

}
