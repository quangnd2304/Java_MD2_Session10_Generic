package ra.dev;

public class GenericMethod {
    public <T> void printArray(T[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
