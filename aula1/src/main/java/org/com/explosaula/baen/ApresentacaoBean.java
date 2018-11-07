package org.com.explosaula.baen;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class ApresentacaoBean {

	public String menssagem() {

		String msgHoras;
		SimpleDateFormat sdfHoraMinuto = new SimpleDateFormat("HH:mm");
		SimpleDateFormat sdfData = new SimpleDateFormat("dd-mm-yyyy");

		Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("Brazil/East"));
		int hora = calendar.get(Calendar.HOUR_OF_DAY);

		String horaMinutoFormatado = sdfHoraMinuto.format(calendar.getTime());
		String dataFormatada = sdfData.format(calendar.getTime());

		if (hora > 18 && hora <= 23) {
			return "A biblioteca está fechada";
		} else if (hora > 0 && hora < 7) {
			return "A biblioteca está fechada";
		} else {
			return "A loja está aberta";
		}

	}

}
