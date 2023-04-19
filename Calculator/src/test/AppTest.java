package test;

import static org.junit.Assert.*;
import org.junit.Test;

import main.App;

public class AppTest {
    
    @Test
    public void Addition1(){
        App app = new App();

        int AddResult = app.add(2, 2);

        assertEquals(4, AddResult);
    }
    @Test
    public void Addition2(){
        App app = new App();

        int AddResult = app.add(3, 2);

        assertEquals(5, AddResult);
    }

//---------------------------------------------------

    @Test
    public void Subtraction1(){
        App app = new App();

        int MinusResult = app.minus(3, 2);

        assertEquals(1, MinusResult);
    }
    @Test
    public void Subtraction2(){
        App app = new App();

        int MinusResult = app.minus(12, 2);

        assertEquals(10, MinusResult);
    }

//---------------------------------------------------

    @Test
    public void Division1(){
        App app = new App();

        int DivideResult = app.divide(10, 2);

        assertEquals(5, DivideResult);
    }
    @Test
    public void Division2(){
        App app = new App();

        int DivideResult = app.divide(10, 5);

        assertEquals(2, DivideResult);
    }

//---------------------------------------------------

    @Test
    public void Multiplication1(){
        App app = new App();

            int MultiplyResult = app.multiply(20, 2);

            assertEquals(40, MultiplyResult);
    }
    @Test
    public void Multiplication2(){
        App app = new App();

            int MultiplyResult = app.multiply(2, 2);

            assertEquals(4, MultiplyResult);
    }
}
