//method overridding
class A{
    int a = 5;
    String b = "ball";
    void method1(){
        System.out.println("I am Method 1 in Class A");

    }
    void method2(){
        System.out.println("I am Method 2 in Class A");
    }
}
class B extends A{
    void method3(){
        System.out.println("I am Method 3 in class B");
    }
}

public class practical12 {
    public static void main(String[] args) {
        A a = new A();
        a.method1();
        B b = new B();
        b.method1();

    }
}
