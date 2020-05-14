package switchcase;

import java.util.Scanner;

public class SwitchCaseStatement {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the operation(+,-,*,/)");
		char op=sc.nextLine().charAt(0);
		switch(op)
		{
		case '+': System.out.println(a+b);break;
		case '-':System.out.println(a-b);break;
		case '*':System.out.println(a*b);break;
		case '/':System.out.println((double)a/(double)b);break;
		default:System.out.println("Invalid input");
		}
	}

}



/*
Enter first number
12
Enter the second number
5
Enter the operation(+,-,*,/)
/
2.4
*/

/*
Enter first number
12
Enter the second number
6
Enter the operation(+,-,*,/)
+
18
*/

/*
Enter first number
12
Enter the second number
6
Enter the operation(+,-,*,/)
-
6
*/

/*
Enter first number
12
Enter the second number
6
Enter the operation(+,-,*,/)
*
72
*/