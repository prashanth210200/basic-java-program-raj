public class Print123 {
    public static void main(String args[]) {
        /*for(int row=1;row<=3;row++) {
            for(int col=1;col<=3;col++) {
                System.out.print(col);
            }
            System.out.println();
        }
       // 123
       // 123
        //123*/
        /*for(int row=1;row<=3;row++) {
            for(int col=3;col>=1;col--) {
                System.out.print(col);
            }
            System.out.println();
        }
       //321
        //321
        //321*/

       /*for(int row=3;row>=1;row--) {
            for(int col=3;col>=1;col--) {
                System.out.print(row);
            }
            System.out.println();
        }
       // 333
       // 222
        //111*/

       /* for(int row=1;row<=3;row++) {
            for(int col=3;col>=1;col--) {
                System.out.print(row);
            }
            System.out.println();
        }
        //111
        //222
        //333*/

        /*for(int row=1;row<=3;row++) {
            for(int col=3;col>=row;col--) {
                System.out.print(row);
            }
            System.out.println();
        }
       // 111
       // 22
       // 3*/

       /* for(int row=1;row<=3;row++) {
            for(int col=1;col<=row;col++) {
                System.out.print(row);
            }
            System.out.println();
        }
       // 1
        //22
        //333*/
        /*for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(row);
            }
            System.out.print(",");
        }
       // 1,22,333,*/

       /* for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
      //  1
      //  12
       // 123*/
        /*String input = "ABCDEDCBA";
        int length = input.length();
        // Outer loop to control the number of rows
        for (int i = 0; i < length; i++) {
            // Inner loop to print the characters for each row
            for (int j = 0; j < length - i; j++) {
                System.out.print(input.charAt(j));
            }
            System.out.println(); // Move to the next line after printing each row
        }*/
    }
}