package com.simplilearn.Projecttest1.package1;

public class Program12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count=25;
		for (int row=1;row<=n;row++) {
			for(int col=10;col>=1;col--) {
				if (col<=5)
				System.out.print("#");
				else
					System.out.print("$");
				System.out.print("  ");
				count--;
			}
			System.out.println();
		}
	}
}