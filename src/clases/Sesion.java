package clases;

import java.util.ArrayList;

public class Sesion {
	int idSesion;
	String noSesion;
	String hoDesde;
	String hoHasta;
	boolean tieneRefrigerio;
	String hoDesdeRefri;
	String hoHastaRefri;
	boolean tieneMesaRedonda;
	String hoDesdeMesa;
	String hoHastaMesa;
	ArrayList<Exposicion> listExpo;
	
	public int getIdSesion() {
		return idSesion;
	}
	public void setIdSesion(int idSesion) {
		this.idSesion = idSesion;
	}
	public String getNoSesion() {
		return noSesion;
	}
	public void setNoSesion(String noSesion) {
		this.noSesion = noSesion;
	}
	public String getHoDesde() {
		return hoDesde;
	}
	public void setHoDesde(String hoDesde) {
		this.hoDesde = hoDesde;
	}
	public String getHoHasta() {
		return hoHasta;
	}
	public void setHoHasta(String hoHasta) {
		this.hoHasta = hoHasta;
	}
	public boolean isTieneRefrigerio() {
		return tieneRefrigerio;
	}
	public void setTieneRefrigerio(boolean tieneRefrigerio) {
		this.tieneRefrigerio = tieneRefrigerio;
	}
	public String getHoDesdeRefri() {
		return hoDesdeRefri;
	}
	public void setHoDesdeRefri(String hoDesdeRefri) {
		this.hoDesdeRefri = hoDesdeRefri;
	}
	public String getHoHastaRefri() {
		return hoHastaRefri;
	}
	public void setHoHastaRefri(String hoHastaRefri) {
		this.hoHastaRefri = hoHastaRefri;
	}
	public boolean isTieneMesaRedonda() {
		return tieneMesaRedonda;
	}
	public void setTieneMesaRedonda(boolean tieneMesaRedonda) {
		this.tieneMesaRedonda = tieneMesaRedonda;
	}
	public String getHoDesdeMesa() {
		return hoDesdeMesa;
	}
	public void setHoDesdeMesa(String hoDesdeMesa) {
		this.hoDesdeMesa = hoDesdeMesa;
	}
	public String getHoHastaMesa() {
		return hoHastaMesa;
	}
	public void setHoHastaMesa(String hoHastaMesa) {
		this.hoHastaMesa = hoHastaMesa;
	}
	public ArrayList<Exposicion> getListExpo() {
		return listExpo;
	}
	public void setListExpo(ArrayList<Exposicion> listExpo) {
		this.listExpo = listExpo;
	}
}
