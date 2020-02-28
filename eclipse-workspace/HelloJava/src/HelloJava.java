/**
 	Using the while loop statemate to calculate the result which (1 + 1/2! + 1/3! + ...... + 1/20!)
 	Developed by JJ(柳佳君)
 	March，14，2018
*/
public class HelloJava {
	public static void main(String[] args) {
		//Define an integer variable.
		//Named i.
		int i = 1;
		//Define two integer variables.
		//One named sum,another named a;
		double sum = 0,a = 1;
		//Using the while loop statemate (less than 20)
		while(i <= 20) 
		{
			//add the a to the sum.
			sum += a;
			//add the a to itself
			i ++;
			//Multiply the result by a and assign it to a.
			//the result is 1.0 divided by i.
			a *= (1.0 / i);
		}
		//print the sum.
		System.out.println(sum);
	}
}
