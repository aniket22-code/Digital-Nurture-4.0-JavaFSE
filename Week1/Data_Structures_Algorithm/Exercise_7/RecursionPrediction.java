package com.future;

public class RecursionPrediction {
	
	public static double predictFinance(int principle,int years,double rate) {
		if(years==0) {
			return principle;
		}
		
		return  predictFinance(principle, years-1, rate)*(1+rate);
	}

}
