package lesson.day3;
public class MyObject {
    private int id;
    private String name;

    public MyObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    // This is a basic example of an extensible class. You can add more methods and fields as needed.
}

class MyFinalObject extends MyObject implements Cloneable {
    private boolean isActive;

    public MyFinalObject(int id, String name, boolean isActive) {
        super(id, name);
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }

    public void activate() {
        isActive = true;
    }

    public void deactivate() {
        isActive = false;
    }

    @Override
    public MyFinalObject clone() {
        try {
            return (MyFinalObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e); // This should not happen, as MyFinalObject implements Cloneable
        }

        /*@Override
        public void printInfo () {
            super.printInfo();
            System.out.println("Active: " + isActive);
        }
*/
        // You can add more methods or fields specific to MyFinalObject.
    }

    public class Main {
        public static void main(String[] args) {
            MyFinalObject original = new MyFinalObject(1, "Original Object", true);

            // Cloning the original object
            MyFinalObject clone = original.clone();

            System.out.println("Original Object Info:");
            original.printInfo();
            System.out.println("\nCloned Object Info:");
            clone.printInfo();

            // Verify that the cloned object is a separate instance
            System.out.println("\nIs clone the same object as original? " + (clone == original));
        }
    }
}