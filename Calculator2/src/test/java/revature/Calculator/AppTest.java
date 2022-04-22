package revature.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest 
{
	Calculator ti32 = new Calculator();
	
    public void mathTest()
    {
    	//test string output
    	String s = "12+3";
    	String[] abba = ti32.convert(s);
    	for (String i=0; i<=abba.size;  i++) {
    		System.out.println(abba[i]);
    	}
    	
    	// test addition
    	int sum = ti32.plus(12, 3);
    	assertTrue(sum==15);
    	
    	// test subtraction
    	int difference = ti32.minus(12, 3);
    	assertTrue(difference==9);
    	
    	// test multiplication
    	int product = ti32.multiply(12, 3);
    	assertTrue(product==36);
    	
    	// test division
    	double quotient = ti32.divide(12, 3);
    	assertTrue(quotient==4);
    	
    	// test percentage
    	 double percentValue= ti32.plus(12, 3);
    	assertTrue(percentValue==3.6);
    }
}
