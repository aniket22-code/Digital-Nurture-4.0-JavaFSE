package com.future;

public class Test {

	public static void main(String[] args) {
		
		 // Recursion is used to divide the problem into smaller parts.
        // However, for large input sizes, it may lead to stack overflow or slow performance.
        
        double resultRecursive = RecursionPrediction.predictFinance(1000, 2, 0.05);
        double resultIterative = OptimisedPrediction.optimisePredictFinance(1000, 2, 0.05);
        
        System.out.println("Recursive Result: " + resultRecursive+"\n");
        
        
        System.out.println("Iterative Result: " + resultIterative);
	}

}
