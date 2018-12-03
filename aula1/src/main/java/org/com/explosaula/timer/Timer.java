package org.com.explosaula.timer;

import javax.ejb.Schedule;
import javax.ejb.Stateless;

@Stateless
public class Timer {

	
	@Schedule(second="*/10", minute="*", hour="8-23", dayOfWeek="Mon-Fri", dayOfMonth="*", month="*", year="*", info="MyTimer")
    private void scheduledTimeout() {
        System.out.println("@Schedule called at: " + new java.util.Date());
    }
}