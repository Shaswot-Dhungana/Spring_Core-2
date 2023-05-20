package com.SpringCore2.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Value("#{2+3}")
	public int sum;
	
	@Value("#{3-2}")
	public int sub;
	
	@Value("#{3*2}")
	public int mult;
	
	@Value("#{10/5}")
	public int div;

	@Value("#{1==1}")
	public boolean equalValid;

	@Value("#{2 gt 3}") // gt-greater than , lt-less than
	public boolean checkStatus;
	
	@Value("#{5 lt 10 && 15 gt 10}")
	public boolean checkTF;

	@Value("#{2>3 ? 'YES 2 is greater than 3 ' : 'NO 2 is not greater than 3'}")
	public String terinaryCheck;
	
	@Value("#{T(java.lang.Math).sqrt(200)}")
	public int num;

	@Value("#{T(com.SpringCore2.SpEL.Student).callMe()}")
	public String Calling;
	

	
	


	
	
	
	
	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mult=" + mult + ", div=" + div + ", equalValid=" + equalValid
				+ ", checkStatus=" + checkStatus + ", checkTF=" + checkTF + ", terinaryCheck=" + terinaryCheck
				+ ", num=" + num + ", Calling=" + Calling + "]";
	}










	public static String callMe() {
		return "Hey there , you are awesome.....";
	}
	
	
	
	
	
}
