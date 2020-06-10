package javabasics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class basics3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   Date d = new Date();
	        
	        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy hh:mm:ss");
	        System.out.println(sdf.format(d));
	        System.out.println(d.toString());
	        
	        Calendar cl = Calendar.getInstance();
	        System.out.println(cl.get(Calendar.DAY_OF_WEEK));
	        System.out.println(cl.get(Calendar.DAY_OF_MONTH));
	        

	}

}
