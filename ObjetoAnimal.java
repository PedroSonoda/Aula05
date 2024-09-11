package Carro;

public class ObjetoAnimal {

	public static void main(String[] args) {
		Animal vaca = new Animal();
		Animal vacabb = new Animal();
		Animal cordeiro = new Animal();
		Animal cachorro = new Animal();
		Animal coelho = new Animal();
		Animal coelhobb = new Animal();
		Animal galinha = new Animal();
		Animal pintinho = new Animal();

		vaca.setraca("Angus");
		vaca.setpeso(510);
		vaca.setamamentam("sim");
		vaca.setidade(5);
		vaca.setpelagem("pelos");
		vaca.setcor("branco e preto");
		vaca.setalimento("sim");
		vaca.setsom("mugir");

		vacabb.setraca("Angus");
		vacabb.setpeso(64);
		vacabb.setamamentam("não");
		vacabb.setidade(1);
		vacabb.setpelagem("pelos");
		vacabb.setcor("branco e preto");
		vacabb.setalimento("não");
		vacabb.setsom("mugir");


		cordeiro.setraca("Doper");
		cordeiro.setpeso(15);
		cordeiro.setamamentam("não");
		cordeiro.setidade(1);
		cordeiro.setpelagem("lã");
		cordeiro.setcor("branco");
		cordeiro.setalimento("sim");
		cordeiro.setsom("balir");

		cachorro.setraca("Pastor alemão");
		cachorro.setpeso(6);
		cachorro.setamamentam("não");
		cachorro.setidade(1);
		cachorro.setpelagem("pelos");
		cachorro.setcor("mesclado");
		cachorro.setalimento("não");
		cachorro.setsom("latir");

		coelho.setraca("leão");
		coelho.setpeso(1);
		coelho.setamamentam("não");
		coelho.setidade(1);
		coelho.setpelagem("pelos");
		coelho.setcor("acinzentado");
		coelho.setalimento("não");
		coelho.setsom("chiar");

		coelhobb.setraca("leão");
		coelhobb.setpeso(0);
		coelhobb.setamamentam("não");
		coelhobb.setidade(0);
		coelhobb.setpelagem("pelos");
		coelhobb.setcor("amarelado");
		coelhobb.setalimento("não");
		coelhobb.setsom("chiar");

		galinha.setraca("Polonesa");
		galinha.setpeso(1);
		galinha.setamamentam("não");
		galinha.setidade(2);
		galinha.setpelagem("penas");
		galinha.setcor("marrom");
		galinha.setalimento("sim");
		galinha.setsom("sisca");


		pintinho.setraca("Polonesa");
		pintinho.setpeso(0);
		pintinho.setamamentam("não");
		pintinho.setidade(0);
		pintinho.setpelagem("penas");
		pintinho.setcor("amarelo");
		pintinho.setalimento("não");
		pintinho.setsom("sisca");

		
		System.out.println("-----OBJETO 1-----");
		System.out.println(vaca.getraca());
		System.out.println(vaca.getpeso());
		System.out.println(vaca.getamamentam());
		System.out.println(vaca.getidade());
		System.out.println(vaca.getpelagem());
		System.out.println(vaca.getcor());
		System.out.println(vaca.getalimento());
		System.out.println(vaca.getsom());
		
		System.out.println("-----OBJETO 2-----");
		System.out.println(vacabb.getraca());
		System.out.println(vacabb.getpeso());
		System.out.println(vacabb.getamamentam());
		System.out.println(vacabb.getidade());
		System.out.println(vacabb.getpelagem());
		System.out.println(vacabb.getcor());
		System.out.println(vacabb.getalimento());
		System.out.println(vacabb.getsom());

		System.out.println("-----OBJETO 3-----");
		System.out.println(cordeiro.getraca());
		System.out.println(cordeiro.getpeso());
		System.out.println(cordeiro.getamamentam());
		System.out.println(cordeiro.getidade());
		System.out.println(cordeiro.getpelagem());
		System.out.println(cordeiro.getcor());
		System.out.println(cordeiro.getalimento());
		System.out.println(cordeiro.getsom());
		
		System.out.println("-----OBJETO 4-----");
		System.out.println(cachorro.getraca());
		System.out.println(cachorro.getpeso());
		System.out.println(cachorro.getamamentam());
		System.out.println(cachorro.getidade());
		System.out.println(cachorro.getpelagem());
		System.out.println(cachorro.getcor());
		System.out.println(cachorro.getalimento());
		System.out.println(cachorro.getsom());
		
		
		System.out.println("-----OBJETO 5-----");
		System.out.println(coelho.getraca());
		System.out.println(coelho.getpeso());
		System.out.println(coelho.getamamentam());
		System.out.println(coelho.getidade());
		System.out.println(coelho.getpelagem());
		System.out.println(coelho.getcor());
		System.out.println(coelho.getalimento());
		System.out.println(coelho.getsom());
		
		System.out.println("-----OBJETO 6-----");
		System.out.println(coelhobb.getraca());
		System.out.println(coelhobb.getpeso());
		System.out.println(coelhobb.getamamentam());
		System.out.println(coelhobb.getidade());
		System.out.println(coelhobb.getpelagem());
		System.out.println(coelhobb.getcor());
		System.out.println(coelhobb.getalimento());
		System.out.println(coelhobb.getsom());
		
		System.out.println("-----OBJETO 7-----");
		System.out.println(galinha.getraca());
		System.out.println(galinha.getpeso());
		System.out.println(galinha.getamamentam());
		System.out.println(galinha.getidade());
		System.out.println(galinha.getpelagem());
		System.out.println(galinha.getcor());
		System.out.println(galinha.getalimento());
		System.out.println(galinha.getsom());
		
		
		System.out.println("-----OBJETO 8-----");
		System.out.println(pintinho.getraca());
		System.out.println(pintinho.getpeso());
		System.out.println(pintinho.getamamentam());
		System.out.println(pintinho.getidade());
		System.out.println(pintinho.getpelagem());
		System.out.println(pintinho.getcor());
		System.out.println(pintinho.getalimento());
		System.out.println(pintinho.getsom());
		
		
	}

}
