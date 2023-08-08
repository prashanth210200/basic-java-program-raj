public class PatternProgram {
    public static void main(String[] args) {
        String input = "ABCDEDCBA";
        int length = input.length();

        // Outer loop to control the number of rows
        for (int i = 0; i < length; i++) {
            // Inner loop to print the characters for each row
            for (int j = 0; j < length - i; j++) {


                System.out.print(input.charAt(j));
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
