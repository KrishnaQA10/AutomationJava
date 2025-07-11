package MostCommonQuestions;

public class Calculator {
    //Polymorphism - Overloading
   int add(int a, int b){
      int c = a+b;
      return c;
   }

   int add(int a , int b , int c){
       int d = a+b+c;
       return d;
   }

   double add (double a , double b){
       double c = a+b;
       return c;
   }

   public static void main (String[] args){
       Calculator c = new Calculator();
       System.out.println(c.add(10,20));
       System.out.println(c.add(10.1,20.3));
       System.out.println(c.add(10,20,41));

   }

}
