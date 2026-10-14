package Abstraction;

public abstract class AbstractClass {

    abstract void run();
    abstract void start();

    void display()
    {
        System.out.println("Display");
    }
}

class ChildAbstract extends AbstractClass
{

    @Override
    void run() {
        System.out.println("run");
    }

    @Override
    void start() {
        start();
    }

    public static void main(String[] args) {
        AbstractClass ob = new ChildAbstract();
    }
}
