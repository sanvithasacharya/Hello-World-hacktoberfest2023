package PRACTICE;

import java.util.Scanner;

public class DisplayingEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=100,i;
Scanner userInput = new Scanner(System.in);
for(i=2;i<=num;i++) {
	if(i%2==0) {
		System.out.println(+i);
	}
}
	}

}
