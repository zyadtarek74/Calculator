import Operations.*;

public class Main {
    public static void main(String[] args) {
    Calculator s = new Calculator();
    char z = s.operation('*');
    double i = s.num1(4);
    double j = s.num2(5);
    Add plus = new Add();
    Subtract minus = new Subtract();
    Multiplication multiply = new Multiplication();
    Division divided = new Division();
//----------------------------------------------------------//
    double result = 0;
    switch (z){
        case '+':
    System.out.println(result = plus.add(i,j));
    break;
        case '-':
    System.out.println(result = minus.sub(i,j));
    break;
        case '*':
    System.out.println(result = multiply.mult(i,j));
    break;
        case '/':
    if (j != 0) System.out.println(result = divided.div(i, j));
    else System.out.println("can not divided by zero");
    break;
    default:
        System.out.println("use real operation");
    }
    }
}