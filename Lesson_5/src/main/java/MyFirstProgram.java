
public class MyFirstProgram {
    public static void main(String[] args) {

      hello("Alex");
      hello("Nikolay");
      hello("Denis");

      double len = 5; //Для квадрата
        System.out.println("Площадь квардрата со стороной " + len + " * "+ len + " = " + area(len));

        double a = 5;
        double b = 6;
        System.out.println("Площадь квардрата со стороной " + a + " и " + b + " = " + prem(a,b));
    }

    public static void hello(String somebody) {
        System.out.println("hello world " + somebody + "! ");
    }

    public static double area(double l){
        return l*l;
    }

    public static double prem(double a, double b){
        double S;
        S = a * b;
        return S;
    }
}