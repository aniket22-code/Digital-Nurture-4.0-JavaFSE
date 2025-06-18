package com.product;

public class SearchAlgorithm {

	public static int linearSearch(Product[] productArray, String target) {

		for (int i = 0; i < productArray.length; i++) {
			if (productArray[i].getProductName().equalsIgnoreCase(target)) {
				return i;
			}

		}
		return -1;
	}
	
	public static int binarySearch(Product[] productArray, String target) {
		int low=0,high=productArray.length;
		
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			int idx=(productArray[mid].getProductName().compareToIgnoreCase(target));
			if(idx==0) return mid;
			else if(idx<0) { high=mid-1; }
			else {
				low=mid+1;
			}
		}
		return -1;
	}

}
