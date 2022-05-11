package com.simplilearn.Projecttest1.package1;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count=25;
		for (int row=1;row<=n;row++) {
			for(int col=1;col<=n;col++) {
				if (count/10==0)
				System.out.print("0"+count);
				else
					System.out.print(count);
				System.out.print("  ");
				count--;
			}
			System.out.println();
		}
	}
}
