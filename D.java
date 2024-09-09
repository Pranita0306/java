class A {
}

class B extends A {
}

class C extends A {
}

public class D extends B {
    public static void main(String[] args) {
        A A1 = new A();   
        B B1 = new B();   
        C C1 = new C();   
        D D1 = new D();   

        System.out.println(A1 instanceof A);  
        System.out.println(B1 instanceof B);  
        System.out.println(D1 instanceof A);  
        System.out.println(D1 instanceof B);  
        System.out.println(D1 instanceof D);  
    }
}
