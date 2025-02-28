package questions;

public class Question1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        if(a+b == c) {
            System.out.println(method1()[0]);
        }
    }
    private static String[] method1(){
        String[] arr = new String[1];
        StringBuffer sb = new StringBuffer();
        sb.append("Hello");
        sb.append("World");
        arr[0] = sb.toString();
        return arr;
    }
}
