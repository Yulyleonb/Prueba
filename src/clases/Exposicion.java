package clases;

public class Exposicion {
	int idExposicion;
	String noExposicion;
	int nuDuracion;
	boolean isProgramada;
	String horaInicio;
	
	public Exposicion(){
	}
	
	public Exposicion(int id,String nombre,int duracion,boolean isProgramado){
		this.idExposicion=id;
		this.noExposicion=nombre;
		this.nuDuracion=duracion;
		this.isProgramada=isProgramado;
	}
	
	
	public int getIdExposicion() {
		return idExposicion;
	}
	public void setIdExposicion(int idExposicion) {
		this.idExposicion = idExposicion;
	}
	public String getNoExposicion() {
		return noExposicion;
	}
	public void setNoExposicion(String noExposicion) {
		this.noExposicion = noExposicion;
	}
	public int getNuDuracion() {
		return nuDuracion;
	}
	public void setNuDuracion(int nuDuracion) {
		this.nuDuracion = nuDuracion;
	}
	public boolean isProgramada() {
		return isProgramada;
	}
	public void setProgramada(boolean isProgramada) {
		this.isProgramada = isProgramada;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
}
