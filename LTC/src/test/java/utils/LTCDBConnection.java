package test.java.utils;

import java.io.File;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Hashtable;



public class LTCDBConnection {

	private static Connection connect = null;
	
	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/setestdb", "root", "vrsnov1976") ;
		Statement stmt = conn.createStatement() ;
		/*
		 select o.id, departure_id, d.name from offer o, allocation a, departure d
		 where o.id = a.offer_id and a.departure_id = d.id
		 */
		/*
		String sql = "INSERT INTO  shiro_user_permissions (shiro_user_id, permissions_string)" + "VALUES (?, ?)";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.setInt(1, 3);
		preparedStatement.setString(2, "*:*");
		preparedStatement.executeUpdate(); 
		
		String sql = "DELETE FROM shiro_user_permissions WHERE shiro_user_id=3";
		PreparedStatement preparedStatement = conn.prepareStatement(sql);
		preparedStatement.executeUpdate(sql);
		String query1 = "select name from offer_translation" ;
		ResultSet rs1 = stmt.executeQuery(query1) ;
		while (rs1.next()) {
			System.out.println("Resultset returns: " + rs1.getString("name"));	
		}
		
		String query2 = "select username,password_hash from shiro_user" ;
		ResultSet rs2 = stmt.executeQuery(query2) ;
		while (rs2.next()) {
			System.out.println("Resultset returns: " + rs2.getString("username") + " " + rs2.getString("password_hash"));	
			
			
			
		}
		*/
		//String str = "February 2015";
		//String monYearArr[] = str.split(" ");
		//System.out.println(monYearArr[0].substring(0, 3) + " " + monYearArr[1]);
		
		
		//DateFormat dfDate = new SimpleDateFormat("dd-MM-yyyy");
		//Date sDate = new Date();
		//String dDate = dfDate.format(sDate);
		File f = new File("../grid/runHubSeGrid244.bat");
		System.out.println(f.getPath());
		System.out.println(f.getAbsolutePath());
		try {
			System.out.println(f.getCanonicalPath());
		}
		catch(Exception e) {}
	}
	/*
	       DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
	       //get current date time with Date()
	       Date date = new Date();
	       System.out.println(dateFormat.format(date));

	       //get current date time with Calendar()
	       Calendar cal = Calendar.getInstance();
	       System.out.println(dateFormat.format(cal.getTime()));
	       */
        /*
		newDateFormat.applyPattern("d");
		String currentDay = newDateFormat.format(MyDate);
		System.out.println("My date is : " + currentDay);
		newDateFormat.applyPattern("MMM");
		String currentMonth = newDateFormat.format(MyDate);
		System.out.println("My date is : " + currentMonth);
		newDateFormat.applyPattern("YYYY");
		String currentYear = newDateFormat.format(MyDate);
		System.out.println("My date is : " + currentYear);
		System.out.println(currentDay + " " + currentMonth + " " + currentYear);
		//11 Feb 2015
		//18 Feb 2015 - 19 Feb 2015
		
		Hashtable ht = new Hashtable();
		ht.put("January", 0);
		ht.put("February", 1);
		ht.put("March", 2);
		ht.put("April", 3);
		ht.put("May", 4);
		ht.put("June", 5);
		ht.put("July", 6);
		ht.put("August", 7);
		ht.put("September", 8);
		ht.put("October", 9);
		ht.put("November", 10);
		ht.put("December", 11);
		
		String monYear = "February 2015";
		String monYearArr[] = monYear.split(" ");
		System.out.println("Month and Year : " + monYearArr[0] + " " + monYearArr[1]);
		Object obj = ht.get(monYearArr[0]);
        int year = Integer.valueOf(monYearArr[1]);
		int month = Integer.valueOf(obj.toString());
         
		Calendar cal = new GregorianCalendar(year, month, 1);
	     do {
	            int day = cal.get(Calendar.DAY_OF_WEEK);
	            System.out.println ("Day of week : " + day);
	            if (day == Calendar.SATURDAY) {
	                System.out.println(cal.get(Calendar.DAY_OF_MONTH));
	            }
	            cal.add(Calendar.DAY_OF_YEAR, 1);
	        }  while (cal.get(Calendar.MONTH) == month);
	    }
	
		*/
		
}

