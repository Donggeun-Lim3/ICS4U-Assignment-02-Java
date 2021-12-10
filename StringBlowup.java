/*
* This program gets string containgin numbers from user,
* converts to many occurrences of the character to the right of the digit
* and show the converted string.
*
* @author  Donggeun Lim
* @version 1.0
* @since   2021-12-08
*/

import java.util.Scanner;

/** This class is StringBlowup. */
public final class StringBlowup {

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private StringBlowup() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method get the type of food, number of food and
    * prints out the time to reheat in the microwave.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final Scanner myObj = new Scanner(System.in);
        String convertedString = "";

        // String input
        System.out.print("Enter a string containing numbers to blow up "
                                                        + "(ex. a3tx2z): ");
        final String stringWithNumber = myObj.nextLine();

        // Process
        for (int strIndex = 0; strIndex < stringWithNumber.length();
                                                            strIndex++) {
            if (Character.isDigit(stringWithNumber.charAt(strIndex))) {
                if (strIndex != stringWithNumber.length() - 1) {
                    for (int charIndex = 1; charIndex
                            < Character.getNumericValue(
                            stringWithNumber.charAt(strIndex)); charIndex++) {
                        convertedString += stringWithNumber.charAt(strIndex
                                                                   + 1);
                    }
                }
            }
            else {
                convertedString += stringWithNumber.charAt(strIndex);
            }
        }
        // Output
        System.out.println("The blow up string is " + convertedString + ".");

        System.out.println("\nDone.");
    }
}
