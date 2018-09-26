package org.loop.demo;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		int r,i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Value of r: ");
		r= sc.nextInt();
		sc.close();
		for(i=0;i<r;i++)
		{
			for(j=0;j<r;j++)
			{
				if(i<=j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
