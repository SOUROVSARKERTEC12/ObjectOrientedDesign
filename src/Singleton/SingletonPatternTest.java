package Singleton;

public class SingletonPatternTest {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error : The construct SingleObject() is not visible
        //SingleObject object = new SingleObject();

        //Get the only object available
        SingleObject object = SingleObject.getInstance();

        //show the message
        object.showMessage();
    }
}
