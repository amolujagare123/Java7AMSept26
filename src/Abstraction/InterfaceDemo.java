package Abstraction;

public interface InterfaceDemo {

     void run();
     void start();
     void display();

}

interface Interface2
{
    void display();
}

class ChildInterface implements InterfaceDemo,Interface2
{

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void start() {
        start();
    }

    @Override
    public void display() {
        System.out.println("display");
    }

    public static void main(String[] args) {
        InterfaceDemo ob = new ChildInterface();

        ob.display();

        Interface2 ob2 = new ChildInterface();

        ob2.display();

    }
}