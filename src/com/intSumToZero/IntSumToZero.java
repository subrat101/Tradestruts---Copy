package com.intSumToZero;

public class IntSumToZero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int arr[] = new int[8];;
		arr[0] = 30;
		arr[1] = -40;
		arr[2] = -20;
		arr[3] = -10;
		arr[4] = 40;
		arr[5] = 0;
		arr[6] = 10;
		arr[7] = 5;
		
		printSum(arr);
		
 	}
	public static void printSum(int [] arr){
		
		int sum = 0;
		int cnt = 1;
		for(int i=0; i<=arr.length-1; i++){
			for(int j=0; j<=arr.length-1; j++){
				for(int k=0; k<=arr.length-1; k++){
					sum = arr[i]+arr[j]+arr[k];
					if(sum == 0){
						System.out.println(cnt+".) "+arr[i]+", "+arr[j]+", "+arr[k]);
						cnt += 1;
					}
				}
			}
		}
	}

}
