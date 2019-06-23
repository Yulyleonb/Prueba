package clases;

import java.util.ArrayList;

public class Sala {
	int idSala;
	String noSala;
	ArrayList<Sesion> listSesiones;
	
	public Sala(){
	}
	
	public Sala(int id,String noSala){
		this.idSala=id;
		this.noSala=noSala;
	}
	
	public int getIdSala() {
		return idSala;
	}
	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}
	public String getNoSala() {
		return noSala;
	}
	public void setNoSala(String noSala) {
		this.noSala = noSala;
	}
	public ArrayList<Sesion> getListSesiones() {
		return listSesiones;
	}
	public void setListSesiones(ArrayList<Sesion> listSesiones) {
		this.listSesiones = listSesiones;
	}
	
}
