//Name: Davis Tyler
//Project: Pascal's Triangle
//Class: Cs145
//Project Description:
//  See Test.java Header
//
//File Description:
//  The Triangle class contains the methods which create and modify all the
//data objects.

public class Triangle {

    private int[][] intTriangle; // int array which represents the ints in
    // the triangle. intTriangle[] represents a row intTriangle[][] represents
    // an int in that row. for example int Triangle[0] = [0,null,null, etc...]
    // and intTriangle[2]=[1,2,1,null,null,etc...]

    private String[] stringTriangle; // a String representation of the int
    // array above. Each row of int Triangle is turned into a formatted String.
    //For example stringTriangle[0] = "  1 " stringTriangle[2] = "1 2 1 "

    int length; // number of rows in triangle

    public Triangle(int count) { // constructor takes int representing length
    // of triangle initializes intTriangle and stringTriangle

        length = count;

        intTriangle = new int[length][length];

        intTriangle[0][0] = 1; // first row will always just be 1 and must
        // always be created

        int[] oldRow = intTriangle[0];

        int[] newRow = intTriangle[1];

        for(int i = 0; i < length; i++) { // iterate through each row of intTriangle

            newRow[0] = 1; // first int of any row is always 1

            newRow[newRow.length-1] = 1; // last int of any row is always 1

            for(int j = 1; j < oldRow.length-1; j++) { // iterate through each
            // index of newRow adding two ints of indexes above in oldRow;

                newRow[j] = oldRow[j-1] + oldRow[j];

            }


            oldRow = newRow;
            newRow = intTriangle[i+2];

            
        }

    }

    public String row(int[] currentRow){ // takes an array of ints representing
    // one row of the triangle and returns a formatted string of that row. 

        int count = 0;

        int[] newRow = new int[currentRow.length+1];

        newRow[0] = 1;
        
        newRow[newRow.length-1] = 1;

        for(int i = 1; i <newRow.length-1; i=i+2) {

            newRow[i] = currentRow[i]+currentRow[i-1];

        }

        row(newRow);

        count++;

    }

    public void print() {

        for(int)

    }


}
