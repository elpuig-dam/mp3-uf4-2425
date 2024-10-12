package s2_s3.InheritanceConstructor;

public class A {

    public A() {
        System.out.println();
    }
}

class A2 extends A {

}

class MainA {
    public static void main(String[] args) {
        //A a = new A(4);
        A2 a2 = new A2();
    }
}

