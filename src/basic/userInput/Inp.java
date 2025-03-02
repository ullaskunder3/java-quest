package basic.userInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inp {
    public static void main(String[] args){
        BufferedReader readInput = new BufferedReader(new InputStreamReader(System.in));
        String numberAsString = "";
        long numberAsLong = 0;
        boolean numberIsValid = false;
        do{
            System.out.println("Enter a number: ");
            try{
                numberAsString = readInput.readLine();
                System.out.println("Entered number is: " + numberAsString);
            }catch(IOException ex){
                System.out.println("Error reading input: " + ex);
            }
            try {
                numberAsLong = Long.parseLong(numberAsString);
                System.out.println("Number as long: " + numberAsLong);
                numberIsValid = true;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid number: " + ex);
            }
        }while(numberIsValid == false);
    }
}
