package com.product;

import java.util.Arrays;
import java.util.Comparator;

public class Test {
	 public static void main(String[] args) {
	        Product[] products = {
	            new Product(101, "Laptop", "Electronics"),
	            new Product(102, "Shoes", "Fashion"),
	            new Product(103, "Mobile", "Electronics"),
	            new Product(104, "Book", "Education")
	        };

	      
	        int index1 = SearchAlgorithm.linearSearch(products, "Mobile");
	        System.out.println("Linear Search: Found at index " + index1);

	        
	        Arrays.sort(products, Comparator.comparing(Product::getProductName));

	        
	        int index2 = SearchAlgorithm.binarySearch(products, "Mobile");
	        System.out.println("Binary Search: Found at index " + index2);
	    }

}
