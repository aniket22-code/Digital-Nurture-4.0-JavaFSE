package com.future;

public class OptimisedPrediction {

	public static double optimisePredictFinance(int principal, int years, double rate) {
		int result = principal;
		for (int i = 0; i < years; i++) {
			result *= (1 + rate);
		}
		return result; 
	}

}
