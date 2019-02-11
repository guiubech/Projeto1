package br.com.step.jsf.bean;

import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class HoraBean{

	public String getCurrentHour() {
		Calendar c = Calendar.getInstance();
		int timeOfDay = c.get(Calendar.HOUR_OF_DAY);

				
		if(timeOfDay >= 0 && timeOfDay < 12){
		    return Hora.getDia() + ", São: " + c.getTime();    		    
		}else if(timeOfDay >= 12 && timeOfDay < 16){
		    return Hora.getTarde() + ", São: " + c.getTime();
		}else if(timeOfDay >= 16 && timeOfDay < 24){
		    return Hora.getNoite() + ", São: " + c.getTime();
		
		}
		return null;
	}
	
	public Date getHora() {
		Calendar c = Calendar.getInstance();
		return c.getTime();
	}

}
