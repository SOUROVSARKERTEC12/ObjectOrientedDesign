package Singleton;

public class SingleObject {

    //create an object of SingleObject
    private static SingleObject instance = new SingleObject();

    //make the construct private so that this class cannot be
    //instantiated
    private SingleObject(){}

    //Get only object available
    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello Singleton Pattern.");
    }
}
