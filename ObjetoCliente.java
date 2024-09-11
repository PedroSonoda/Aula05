package Carro;


public class ObjetoCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		Cliente cliente2= new Cliente();

		cliente1.setid(2175984);
		cliente1.setnome("Carlos");
		cliente1.settelefone("15)998252624");
		cliente1.setcpf(47499182886l);
		cliente1.setrg(141516758);
		cliente1.setfala("sim");
		cliente1.setanda("sim");
		cliente1.setmoradia("possui. Apartamento");
		cliente1.setpcd("não");
		
		cliente2.setid(23653149);
		cliente2.setnome("Fernando");
		cliente2.settelefone("(11)997262524");
		cliente2.setcpf(47899286836l);
		cliente2.setrg(784596356);
		cliente2.setfala("sim");
		cliente2.setanda("não");
		cliente2.setmoradia("possui. Casa");
		cliente2.setpcd("sim");
		
		System.out.println("-----OBJETO 1-----");
		System.out.println(cliente1.getid());
		System.out.println(cliente1.getnome());
		System.out.println(cliente1.getnome());
		System.out.println(cliente1.gettelefone());
		System.out.println(cliente1.getcpf());
		System.out.println(cliente1.getrg());
		System.out.println(cliente1.getfala());
		System.out.println(cliente1.getanda());
		System.out.println(cliente1.getmoradia());
		System.out.println(cliente1.getpcd());
		

		System.out.println("-----OBJETO 2-----");
		System.out.println(cliente2.getid());
		System.out.println(cliente2.getnome());
		System.out.println(cliente2.getnome());
		System.out.println(cliente2.gettelefone());
		System.out.println(cliente2.getcpf());
		System.out.println(cliente2.getrg());
		System.out.println(cliente2.getfala());
		System.out.println(cliente2.getanda());
		System.out.println(cliente2.getmoradia());
		System.out.println(cliente2.getpcd());
		
		
	}

}
