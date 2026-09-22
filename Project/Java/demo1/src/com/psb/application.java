package com.psb;

import java.util.Scanner;

public class application {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input values of array: ");
		int n = scan.nextInt();
		int [][] arr = new int [2][3];
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0) {
					//base 10
					arr [i][j] = 10 * (j + 1);
				}else {
					//base 40
					arr [i][j] = 40 + (j * 10);
				}
				System.out.println("arr[" + i + "] [" + j + "]=" + arr[i][j]);
			}
		}
		System.out.println("values of array are: ");
		for(int i = 0; i < n - 1; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + ", ");
			}
		}
	}
	
	private static double rectangePerimeter(double weight, double length) {
		int r = 2;
		//p = 2(w+l);
		return r*(weight + length);
	}
	private static double rectangeArea(double weight, double length) {
		//a = w * l
		return (weight * length);
	}
	
	private void doc() {
//		System.out.print("Pls enter weight:");
//		double w = scan.nextDouble();
//		System.out.print("Pls enter length:");
//		double l = scan.nextDouble();
//		
//		System.out.println("========== Result ==========");
//		System.out.println("Weight: " + w + ", Height: " + l);
//		double rectangePerimeter = rectangePerimeter(w, l);
//		System.out.println("Perimeter: " + rectangePerimeter);
//		double rectangeArea = rectangeArea(w, l);
//		System.out.println("Area: " + rectangeArea);
		
//		System.out.print("input value of array: ");
//		int n = scan.nextInt();
//		int sum = 0;
//		for(int i = 0; i < n; i++) {
//			System.out.println("arr[" + i + "]= " + (i+1));
//			sum += i + 1;
//		}
//		System.out.println("Total of array value: " + sum);

		
		
//		System.out.print("Input values of array: ");
//		int n = scan.nextInt();
//		int [][] arr = new int [2][3];
//		for(int i = 0; i < n - 1; i++) {
//			for(int j = 0; j < n; j++) {
//				if(i == 0) {
//					//base 10
//					arr [i][j] = 10 * (j + 1);
//				}else {
//					//base 40
//					arr [i][j] = 40 + (j * 10);
//				}
//				System.out.println("arr[" + i + "] [" + j + "]=" + arr[i][j]);
//			}
//		}
//		System.out.println("values of array are: ");
//		for(int i = 0; i < n - 1; i++) {
//			for(int j = 0; j < n; j++) {
//				System.out.print(arr[i][j] + ", ");
//			}
//		}
	}
}
