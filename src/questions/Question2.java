package questions;

// public class Question2 extends GetQuestion2 {
//     public static void main(String[] args) {
//         for(int i = 0; i < 5; i++) {
//                 if(true){
//                     System.out.println(a); // will give error because a is private
//                     System.out.println(b); // will give error because b is non-static
//                     System.out.println(c);
//                 }
//         }
//     }
// }

// public class GetQuestion2 {
//     private String a = "Hello";
//     public String b = "asdasd";
//     public static String c = "asdasd";
// }
// understood non-static fields cannot be accessed in a static method (main)

public class Question2 {
    public static void main(String[] args) {
        GetQuestion2Improved obj = new GetQuestion2Improved(); // Create an instance of GetQuestion2

        for (int i = 0; i < 5; i++) {
            if (true) {
                System.out.println(obj.getA()); // Access private 'a' using getter
                System.out.println(obj.b); // Access public 'b' via instance
                System.out.println(GetQuestion2Improved.c); // Access static 'c' directly
            }
        }
    }
}

class GetQuestion2Improved { // Removed 'public' since only one public class is allowed
    private String a = "Hello"; // Still private, can't be accessed directly
    public String b = "asdasd"; // Can be accessed via an instance
    public static String c = "asdasd"; // Can be accessed using GetQuestion2.c

    public String getA() { // Getter method to access private 'a'
        return a;
    }
}