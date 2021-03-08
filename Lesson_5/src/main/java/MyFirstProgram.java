
public class MyFirstProgram {
    public static void main(String[] args) {

      hello("Alex");
      hello("Nikolay");
      hello("Denis");

        Square s = new Square(5);//Для квадрата
        System.out.println("Площадь квардрата со стороной " + s.l + " * "+ s.l + " = " + area(s));

        Rectangle r = new Rectangle(5,6);
        System.out.println("Площадь квардрата со стороной " + r.a + " и " + r.b + " = " + prem(r));
    }

    public static void hello(String somebody) {
        System.out.println("hello world " + somebody + "! ");
    }

    public static double area(Square s){
        return s.l*s.l;
    }

    public static double prem(Rectangle r){
      return r.a * r.b;
    }
}