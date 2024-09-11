package Carro;

public class ObjetoCadeira {

	public static void main(String[] args) {

		Cadeira Cadeira1 = new 	Cadeira ();
		
		Cadeira1.setnumrodas(4);
		Cadeira1.setrodas("possui");
		Cadeira1.setapoibra("2");
		Cadeira1.setsobedesce("sim");
		Cadeira1.setanda("sim");

		System.out.println("-----OBJETO 1-----");
		System.out.println(Cadeira1.getnumrodas());
		System.out.println(Cadeira1.getrodas());
		System.out.println(Cadeira1.getapoibra());
		System.out.println(Cadeira1.getsobedesce());
		System.out.println(Cadeira1.getanda());

	}

}
