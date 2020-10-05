package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

	//Conversão do tipo Date para String:
	SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	//Mudar o Timezone para GMT:
	SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
	
	//Imprimir data:
	Date y1 = sdf1.parse("25/06/2020");
	//Imprimir data com horas:
	Date y2 = sdf2.parse("25/06/2020 20:40:00");
	//Data no padrão ISO 8601 (O Z no final indica que é UTC):
	Date y3 = Date.from(Instant.parse("2020-06-13T15:42:07Z"));
	
	//Imprimir Data atual:
	Date x1 = new Date();
	//Outra forma de imprimir a data atual:
	Date x2 = new Date(System.currentTimeMillis());
	//Data que o Java armazenou em milissegundos:
	Date x3 = new Date(0L);
	//Um segundo, que passou para um minuto, que passou para uma hora, que passou para cinco horas:
	Date x4 = new Date(1000L * 60L * 60L * 5L);

	System.out.println("----------- Sem formatacao -----------");
	System.out.println("y1: "+y1);
	System.out.println("y2: "+y2);
	System.out.println("y3: "+y3);
	System.out.println("x1: "+x1);
	System.out.println("x2: "+x2);
	System.out.println("x3: "+x3);
	System.out.println("x4: "+x4);
	System.out.println("----------- UTC -----------");
	System.out.println("y1: "+sdf1.format(y1));
	System.out.println("y2: "+sdf2.format(y2));
	System.out.println("y3: "+sdf2.format(y3));
	System.out.println("x1: "+sdf2.format(x1));
	System.out.println("x2: "+sdf2.format(x2));
	System.out.println("x3: "+sdf2.format(x3));
	System.out.println("x4: "+sdf2.format(x4));
	System.out.println("----------- GMT -----------");
	System.out.println("y1: "+sdf1.format(y1));
	System.out.println("y2: "+sdf3.format(y2));
	System.out.println("y3: "+sdf3.format(y3));
	System.out.println("x1: "+sdf3.format(x1));
	System.out.println("x2: "+sdf3.format(x2));
	System.out.println("x3: "+sdf3.format(x3));
	System.out.println("x4: "+sdf3.format(x4));
	
	
	
	
	}

}
