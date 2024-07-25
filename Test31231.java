package e2e.cbr.validation;

public class Test31231 {
    public static void main(String[] args) {
        ParentClass p = new ParentClass();
        ParentClass c = new ChildClass();
        p.print();
        c.print();


    }

    static class ParentClass {
        void print() {
            System.out.println("asdasd");
        }
    }

    static class ChildClass extends ParentClass {
        void print() {
            System.out.println("potul");
        }
    }
}
