
public class MyFirstProgram {
    public static void main(String[] args) {

      Hello("Alex");
      Hello("Nikolay");
      Hello("Denis");

      double len = 5;
        System.out.println("Площадь квардрата со стороной " + len + " * "+ len + " = " + area(len));
    }

    public static void Hello(String somebody) {
        System.out.println("hello world " + somebody + "! ");
    }

    public static double area(double l){
        return l*l;

    }
}