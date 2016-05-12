package gissoft.calculator;

import android.content.Context;
import android.test.mock.MockContext;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;


/**
 * Created by Administrator on 11/5/2016.
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void TestPlus() {
        //Arrange
//        Calculator calculator = new Calculator();
        //Act การกระทำ
        double actualResult = calculator.addplus(1, 1);
        //Assert การทดสอบ
        assertEquals(2.0, actualResult);
    }

    @Test
    public void TestSub()
    {
        assertEquals(0.0, calculator.sub(1, 1));
        assertEquals(1.0, calculator.sub(2, 1));
        assertEquals(-1.0, calculator.sub(2, 3));
    }

    @Test
    public void TestMul()
    {
        double actualResult = calculator.mul(1, 1);
        assertEquals(1.0, actualResult);
//        Context context = new MockContext();
//        double actualResult = calculator.mul(1, 1);
//        String add = context.getResources().getString(R.string.add_operation_text);
//        assertEquals("ADD", add);
    }

    @Test(expected = DivideByZeroException.class)
    public void TestDiv()
    {
        double actualResult = calculator.div(1, 1);
        assertEquals(1.0, actualResult);
        calculator.div(2, 0);
    }

//    @Test(expected = DivideByZeroException.class)
//    public void TestDivZeroException()
//    {
//        calculator.div(2, 0);
////        fail("");
//    }
}