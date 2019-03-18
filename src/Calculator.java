public class Calculator {
    //inside  the class - outside the method with static keyword
    static int a = 15;   //static/class variable
    static int b = 10;
    int c;
    //this method will do addition
    static void add () {//no return type no argument user defined method
        System.out.println(a+b);
         }
         //this method will do substraction
         static void sub (){//no return type no argument user defined method
        System.out.println(a-b);
    }
    //this method will do multiplication
      static void multiply (){//no return type no argument user defined method
        System.out.println(a*b);
         }
//this method will do division
    static void divide(){//no return type no argument user defined method
         System.out.println(a/b);
    }
    //Java main method
    public static void main (String [] args){
        add();
        sub();
        multiply();
        divide();
    }
}
