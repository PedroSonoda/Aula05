package Carro;

public class ObjetoAviao {

	public static void main(String[] args) {
		Aviao Aviao1 = new Aviao();
		Aviao Aviao2 = new Aviao();
		Aviao Aviao3 = new Aviao();
		Aviao Aviao4 = new Aviao();
		

		Aviao1.setcor("branco");
		Aviao1.setjanela(92);
		Aviao1.setmotor(2);
		Aviao1.setasas(2);
		Aviao1.setacelera("165 km/h");
		Aviao1.setluz("desligado");
		Aviao1.setdecola("sim");
		Aviao1.setrodas("sim");
		
		Aviao2.setcor("azul");
		Aviao2.setjanela(92);
		Aviao2.setmotor(2);
		Aviao2.setasas(2);
		Aviao2.setacelera("286 km/h");
		Aviao2.setluz("ligado");
		Aviao2.setdecola("sim");
		Aviao2.setrodas("sim");
		
		Aviao3.setcor("verde");
		Aviao3.setjanela(108);
		Aviao3.setmotor(4);
		Aviao3.setasas(2);
		Aviao3.setacelera("296 km/h");
		Aviao3.setluz("desligado");
		Aviao3.setdecola("sim");
		Aviao3.setrodas("sim");
		
		Aviao4.setcor("bege");
		Aviao4.setjanela(92);
		Aviao4.setmotor(2);
		Aviao4.setasas(2);
		Aviao4.setacelera("154 mm/h");
		Aviao4.setluz("ligado");
		Aviao4.setdecola("sim");
		Aviao4.setrodas("sim");
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(Aviao1.getcor());
		System.out.println(Aviao1.getjanela());
		System.out.println(Aviao1.getmotor());
		System.out.println(Aviao1.getasas());
		System.out.println(Aviao1.getacelera());
		System.out.println(Aviao1.getluz());
		System.out.println(Aviao1.getdecola());
		System.out.println(Aviao1.getrodas());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(Aviao2.getcor());
		System.out.println(Aviao2.getjanela());
		System.out.println(Aviao2.getmotor());
		System.out.println(Aviao2.getasas());
		System.out.println(Aviao2.getacelera());
		System.out.println(Aviao2.getluz());
		System.out.println(Aviao2.getdecola());
		System.out.println(Aviao2.getrodas());
	
		
		System.out.println("-----OBJETO 3-----");
		System.out.println(Aviao3.getcor());
		System.out.println(Aviao3.getjanela());
		System.out.println(Aviao3.getmotor());
		System.out.println(Aviao3.getasas());
		System.out.println(Aviao3.getacelera());
		System.out.println(Aviao3.getluz());
		System.out.println(Aviao3.getdecola());
		System.out.println(Aviao3.getrodas());
	
		System.out.println("-----OBJETO 4-----");
		System.out.println(Aviao4.getcor());
		System.out.println(Aviao4.getjanela());
		System.out.println(Aviao4.getmotor());
		System.out.println(Aviao4.getasas());
		System.out.println(Aviao4.getacelera());
		System.out.println(Aviao4.getluz());
		System.out.println(Aviao4.getdecola());
		System.out.println(Aviao4.getrodas());
	
	}

}
