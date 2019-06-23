package clases;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Vector;

public class Generador {

	public ArrayList<Horario> getHorario(ArrayList<Sala> lstSalas,ArrayList<Exposicion> lstExposiciones){
		long horDura=0;
		long horAsig=0;
		Date ultHora = null;
		
		Horario objHorario;
		//ArrayList<Horario> listHorarios=new ArrayList<Horario>();
		ArrayList<Horario> listHorarios=new ArrayList<Horario>();
		
		
		if(lstSalas!=null){
			if(lstSalas.size()>0){
				//Recorro las salas
				for (Sala objS : lstSalas) {
				    if(objS.getListSesiones()!=null){
				    	if(objS.getListSesiones().size()>0){
				    		for (Sesion objSes : objS.getListSesiones()) {
				    			objSes.setListExpo(new ArrayList<Exposicion>());
				    			if(objSes.isTieneRefrigerio()){
				    				//Sesión de la mañana
				    				DateFormat formatter = new SimpleDateFormat("HH:mm");
				    				try {
										horDura=(((((Date)formatter.parse(objSes.hoDesdeRefri)).getTime()-((Date)formatter.parse(objSes.hoDesde)).getTime())/1000)/3600)*60;
										ultHora=(Date)formatter.parse(objSes.hoDesde);
										horAsig = 0;
										
										for(Exposicion objE:lstExposiciones){
											if(horAsig==horDura)
												break;
											
											if(objE.nuDuracion<=(horDura-horAsig) && objE.isProgramada()==false){
												objSes.getListExpo().add(objE);
												horAsig = horAsig + objE.getNuDuracion();
												objE.setProgramada(true);
												objE.setHoraInicio(new SimpleDateFormat("HH:mm").format(ultHora));											
												
										        Calendar calendar = Calendar.getInstance();
										        calendar.setTime(ultHora);
										        calendar.add(Calendar.MINUTE, objE.getNuDuracion());
										        
										        ultHora=calendar.getTime();
										        
										        //Horario
										        objHorario=new Horario();
										        objHorario.setNoSala(objS.getNoSala());
										        objHorario.setNoSesion(objSes.getNoSesion());
										        objHorario.setHorarioDesde(objE.getHoraInicio());
										        objHorario.setNoExposicion(objE.getNoExposicion());
										        
										        listHorarios.add(objHorario);
											}
											
										}
										
		
									} catch (ParseException e) {
										e.printStackTrace();
									}
				    			}else{
				    				//Sesión de la tarde
				    				DateFormat formatter = new SimpleDateFormat("HH:mm");
				    				try {
										horDura=(((((Date)formatter.parse(objSes.hoDesdeMesa)).getTime()-((Date)formatter.parse(objSes.hoDesde)).getTime())/1000)/3600)*60;
										ultHora=(Date)formatter.parse(objSes.hoDesde);
										horAsig = 0;
										
										for(Exposicion objE:lstExposiciones){
											if(horAsig==horDura)
												break;
											
											if(objE.nuDuracion<=(horDura-horAsig) && objE.isProgramada()==false){
												objSes.getListExpo().add(objE);
												horAsig = horAsig + objE.getNuDuracion();
												objE.setProgramada(true);
												objE.setHoraInicio(new SimpleDateFormat("HH:mm").format(ultHora));											
												
										        Calendar calendar = Calendar.getInstance();
										        calendar.setTime(ultHora);
										        calendar.add(Calendar.MINUTE, objE.getNuDuracion());
										        
										        ultHora=calendar.getTime();
										        
										        //Horario
										        objHorario=new Horario();
										        objHorario.setNoSala(objS.getNoSala());
										        objHorario.setNoSesion(objSes.getNoSesion());
										        objHorario.setHorarioDesde(objE.getHoraInicio());
										        objHorario.setNoExposicion(objE.getNoExposicion());
										        listHorarios.add(objHorario);
											}
											
										}
										
		
									} catch (ParseException e) {
										e.printStackTrace();
									}
				    				
				    				//Pregunto si aún tengo exposiciones pendientes para programarlas hasta las 17:00
				    				try{
				    					horDura=(((((Date)formatter.parse(objSes.hoHastaMesa)).getTime()-((Date)formatter.parse(objSes.hoDesdeMesa)).getTime())/1000)/3600)*60;
				    					horAsig = 0;
				    					for(Exposicion objEAux:lstExposiciones){
											if(horAsig==horDura)
												break;
											if(objEAux.nuDuracion<=(horDura-horAsig) && objEAux.isProgramada()==false){
												objSes.getListExpo().add(objEAux);
												horAsig = horAsig + objEAux.getNuDuracion();
												objEAux.setProgramada(true);
												objEAux.setHoraInicio(new SimpleDateFormat("HH:mm").format(ultHora));
												
										        Calendar calendar = Calendar.getInstance();
										        calendar.setTime(ultHora);
										        calendar.add(Calendar.MINUTE, objEAux.getNuDuracion());
										        
										        ultHora=calendar.getTime();
										        
										        //Horario
										        objHorario=new Horario();
										        objHorario.setNoSala(objS.getNoSala());
										        objHorario.setNoSesion(objSes.getNoSesion());
										        objHorario.setHorarioDesde(objEAux.getHoraInicio());
										        objHorario.setNoExposicion(objEAux.getNoExposicion());
										        listHorarios.add(objHorario);
											}
				    					}
				    				}catch(ParseException e){
				    					e.printStackTrace();
				    				}
				    			}
				    		}
				    	}
				    }
				}
			}
		}
		
		
		Collections.sort(listHorarios);

		
		return listHorarios;
	}
	
}
