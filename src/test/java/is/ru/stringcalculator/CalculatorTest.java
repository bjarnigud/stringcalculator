package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

    @Test
    public void testIfStringEmpty(){
    	assertEquals(0, Calculator.add(""));
    }

    @Test 
    public void testIfOneNumber(){
    	assertEquals(1,Calculator.add("1"));
    }

    @Test
    public void testIfTwoNumbers(){
    	assertEquals(3, Calculator.add("1,2"));
    }

    @Test 
    public void testMultipleNumbers(){
        assertEquals(6, Calculator.add("1,2,3"));
    }

    @Test 
    public void newlineTest(){
        assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test 
    public void delimiterTest(){
        assertEquals(6, Calculator.add("//;1;2;3"));
    }
/*
    @Test 
    public void negativenumberTest(){

        try {
            calculator.add("-1");
            fail();
        }catch (Exeption e) {
        }
    }
*/
}
