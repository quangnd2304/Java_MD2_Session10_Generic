import ra.dev.Demo01;
import ra.dev.GenericDemo;
import ra.dev.GenericMethod;
import ra.dev.Student;

public class Main {
    public static void main(String[] args) {
        Demo01<Student> demo01 = new Demo01<>();
        Demo01<String> demo02 = new Demo01<>();
        GenericDemo<Integer,String> gd = new GenericDemo<>();
        gd.setKey(1);
        gd.setValue("Nguyen Van A");
        System.out.println(gd.toString());
        GenericDemo<String,Float> gd2 = new GenericDemo<>();
        gd2.setKey("Test1");
        gd2.setValue(6.7F);
        System.out.println(gd2.toString());
        GenericMethod gm = new GenericMethod();
        Integer[] arrInt = {3,4,5};
        String[] arrString = {"Nguyen Van B","Nguyen Van C"};
        gm.printArray(arrInt);
        gm.printArray(arrString);

    }
}