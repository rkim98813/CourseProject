package lesson.day4.innerClass;

class DOuter {
    private int i;

    private void m1() {
        System.out.println("m1()");
    }

    class Dinner {
        int j;

        void m2() {
            System.out.println("m2()");
        }

        class DInnerInner {
            void use() {
                System.out.println("i: " + i); // Accessing the private field of DOuter
                m1(); // Accessing the private method of DOuter
                System.out.println("j: " + j); // Accessing the field of Dinner
                m2(); // Accessing the method of Dinner
            }
        }
    }
}

public class D {
    public static void main(String[] args) {
        DOuter out = new DOuter();
        DOuter.Dinner in = out.new Dinner();
        DOuter.Dinner.DInnerInner inin = in.new DInnerInner();
        inin.use();
    }
}
