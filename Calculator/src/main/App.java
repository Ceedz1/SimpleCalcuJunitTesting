package main;

public class App {
    public App(){
    }

    public int add(int a, int b){
        int AddResult = a + b;

        //Error Testing
        //AddResult = 5;

        return AddResult;
    }

    public int minus(int a, int b){
        int MinusResult = a - b;

        //Error Testing
        // MinusResult = 1;

        return MinusResult;
    }

    public int divide(int a, int b){
        int DivideResult = a / b;
    
        //Error Testing
        // DivideResult = 2;

        return DivideResult;
    }

    public int multiply(int a, int b){
        int MultiplyResult = a * b;

        //Error Testing
        // MultiplyResult = 4;

        return MultiplyResult;
    }

}
