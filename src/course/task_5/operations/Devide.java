package course.task_5.operations;

public class Devide extends Operation{


    @Override
    public double operate(double num1, double num2){
        if (num2 == 0) throw new ArithmeticException("Devide by zero. In our world we can`t divide by zero.");
       return num1 / num2;
    }
}
