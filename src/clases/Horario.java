package clases;

public class Horario implements Comparable<Horario> {
		String noSala;
		String noExposicion;
		String noSesion;
		String horarioDesde;
		
		public String getNoSala() {
			return noSala;
		}
		public void setNoSala(String noSala) {
			this.noSala = noSala;
		}
		public String getNoExposicion() {
			return noExposicion;
		}
		public void setNoExposicion(String noExposicion) {
			this.noExposicion = noExposicion;
		}
		public String getNoSesion() {
			return noSesion;
		}
		public void setNoSesion(String noSesion) {
			this.noSesion = noSesion;
		}
		public String getHorarioDesde() {
			return horarioDesde;
		}
		public void setHorarioDesde(String horarioDesde) {
			this.horarioDesde = horarioDesde;
		}
		
	    public int compareTo(Horario other) {
	        return horarioDesde.compareTo(other.getHorarioDesde());
	    }
}
