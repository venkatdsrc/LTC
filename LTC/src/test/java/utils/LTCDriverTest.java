/*@Author: Venkat
Tests new user registration via email functionality

*/

package test.java.utils;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;


public class LTCDriverTest {

	
public LTCDriverTest() throws Exception {
		System.out.println("Inside SEDriverTest constructor..");
	}

@BeforeSuite
public void setUpGrid() throws Exception {
	  
	System.out.println("Inside before suite..");
	String sAbsPath = System.getProperty("user.dir") + "/grid/runHubSeGrid244.bat";
	System.out.println("Current user directory : " + sAbsPath);
	List cmdAndArgs = Arrays.asList("cmd", "/c", sAbsPath);
	ProcessBuilder pb = new ProcessBuilder(cmdAndArgs);
	Process pr = pb.start();
	//ProcessBuilder pb = new ProcessBuilder("cmd /c "+sAbsPath+ "/runHubSeGrid244.bat");
	//Process process = pb.start();
	//Process pr = Runtime.getRuntime().exec("cmd /c"+sAbsPath+ "./runHubSeGrid244.bat");
	//Process pr = Runtime.getRuntime().exec("cmd /c"+sAbsPath+ "./runHubSeGrid244.bat");
	
	//pr.waitFor();
	//BufferedReader reader = new BufferedReader(new InputStreamReader(pr.getInputStream()));
	BufferedReader reader = new BufferedReader(new InputStreamReader(pr.getInputStream()));
	    String line = reader.readLine();
	    while (line != null) {
	        System.out.println(line);
	        line = reader.readLine();
	        System.out.println("Line: " + line);
	    }
		
	   
}


@AfterSuite
public void shutDownGrid() throws Exception {
	System.out.println("Inside after suite..");
	
}

}