package Carro;

public class Cliente {

	int id;
	String nome;
	String telefone;
	long cpf;
	int rg;
	String fala;
	String anda;
	String moradia;
	String pcd;

	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;

	}	public String gettelefone() {
		return telefone;
	}
	public void settelefone(String telefone) {
		this.telefone = telefone;
	}
	public long getcpf() {
		return cpf;
	}
	public void setcpf(long cpf) {
		this.cpf = cpf;}
 
public int getrg() {
	return rg;
}
public void setrg(int rg) {
	this.rg = rg;}

public String getfala() {
	return fala;
}
public void setfala(String fala) {
	this.fala = fala;
	
}public String getanda() {
	return anda;
}
public void setanda(String anda) {
	this.anda = anda;
	
}public String getmoradia() {
	return moradia;
}
public void setmoradia(String moradia) {
	this.moradia = moradia;
}
public String getpcd() {
	return pcd;
}
public void setpcd(String pcd) {
	this.pcd = pcd;
}}