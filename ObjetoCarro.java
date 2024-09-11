package Carro;

public class ObjetoCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		Carro carro4 = new Carro();
				
	
		carro1.setcor("amarelo");
		carro1.setmarca("Honda");
		carro1.setmodelo("esportivo");
		carro1.settipo("carro");
		carro1.setplaca(545512);
		carro1.setfarol("alto");
		carro1.setaceleracao(180);
		carro1.setnome("lancer");

		carro2.setcor("branco");
		carro2.setmarca("fiat");
		carro2.setmodelo("picape");
		carro2.settipo("RUV");
		carro2.setplaca(84455);
		carro2.setfarol("alto");
		carro2.setaceleracao(564);
		carro2.setnome("torro");
		
		carro3.setcor("cinza");
		carro3.setmarca("renaut");
		carro3.setmodelo("Sedã");
		carro3.settipo("economico");
		carro3.setplaca(84656);
		carro3.setfarol("alto");
		carro3.setaceleracao(987);
		carro3.setnome("sandero");
		
		carro4.setcor("Branco");
		carro4.setmarca("Toyota");
		carro4.setmodelo("esportivo");
		carro4.settipo("SUV");
		carro4.setplaca(545512);
		carro4.setfarol("alto");
		carro4.setaceleracao(250);
		carro4.setnome("yaris");
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(carro1.getcor());
		System.out.println(carro1.getmodelo());
		System.out.println(carro1.getmarca());
		System.out.println(carro1.getplaca());
		System.out.println(carro1.getfarol());
		System.out.println(carro1.getaceleracao());
		System.out.println(carro1.getnome());
		
		
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(carro2.getcor());
		System.out.println(carro2.getmodelo());
		System.out.println(carro2.getmarca());
		System.out.println(carro2.getplaca());
		System.out.println(carro2.getfarol());
		System.out.println(carro2.getaceleracao());
		System.out.println(carro2.getnome());
		
		System.out.println("-----OBJETO 3-----");
		System.out.println(carro3.getcor());
		System.out.println(carro3.getmodelo());
		System.out.println(carro3.getmarca());
		System.out.println(carro3.getplaca());
		System.out.println(carro3.getfarol());
		System.out.println(carro3.getaceleracao());
		System.out.println(carro3.getnome());
		
		
		System.out.println("-----OBJETO 4-----");
		System.out.println(carro4.getcor());
		System.out.println(carro4.getmodelo());
		System.out.println(carro4.getmarca());
		System.out.println(carro4.getplaca());
		System.out.println(carro4.getfarol());
		System.out.println(carro4.getaceleracao());
		System.out.println(carro4.getnome());
		

	
	}

}
