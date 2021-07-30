package day03_operator;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1, num2;
		System.out.print("수 입력 : ");
		num1 = input.nextInt();
		String s;
		s = (num1%2 == 0)?"짝수":"홀수";
		System.out.println(num1+"="+s);
		s = (num1%3 == 0)?"3의배수":"3의배수 아님";
		System.out.println(num1+"="+s);
		System.out.print("두 수 입력 : ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		s = (num1>num2)?"num1이 num2보다 크다":
						"num2가 num1보다 크다";
		System.out.println("num1 : "+num1+", num2 : "+num2);
		System.out.println(s);
	}
}




