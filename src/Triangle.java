//Name: Davis Tyler
//Project: Pascal's Triangle
//Class: Cs145
//Project Description:
//  This Program Prints out a visual representation of pascals Triangle.
//
//File Description:
//  The Triangle class contains the methods which create and modify all the
//data objects.

public class Triangle {

    private int[][] intTriangle; // int array which represents the ints in
    // the triangle. intTriangle[] represents a row intTriangle[][] represents
    // an int in that row. for example int Triangle[0] = [0,null,null, etc...]
    // and intTriangle[2]=[1,2,1,null,null,etc...]

    int length; // number of rows in triangle


    public Triangle(int count) { // constructor takes int representing length
    // of triangle initializes intTriangle and stringTriangle

        length = count;

        intTriangle = new int[length][];

        for(int h = 0; h < intTriangle.length; h ++){
            intTriangle[h] = new int[h+1];
        }

        int[] oldRow = intTriangle[0];

        oldRow[0] = 1; // first row will always just be 1 and must
        // always be created

        int[] newRow = intTriangle[1];

        newRow[0] = 1;
        newRow[1] = 1;

        for(int i = 1; i < length; i++) { // iterate through each row of intTriangle

            newRow[0] = 1; // first int of any row is always 1

            for(int j = 1; j < oldRow.length; j++) { // iterate through each
            // index of newRow adding two ints of indexes above in oldRow;

                newRow[j] = oldRow[j-1] + oldRow[j];

            }

            newRow[newRow.length-1] = 1;

            oldRow = newRow;


            if(i < length-1){
            newRow = intTriangle[i+1];
            }
            
        }

    }

    public void print() { // method to print formatted triangle to terminal.

        int fenceSpace = length*4;

        for(int[] intarray: intTriangle){ // iterates through rows of triangle

            fenceSpace = fenceSpace - 2;

            // if(intarray.length == 5){
            //     fenceSpace -- ;
            // }
            if(intarray.length > 5){
                fenceSpace -- ;
            }

            for(int i = 0; i < fenceSpace; i++){ 

                System.out.print(" ");
            }

            for(int j = 0; j < intarray.length; j++){ // iterate through indexes of rows 

                int currentInt = intarray[j];

                if(currentInt != 1){ // used to check position in row
                    int newInt = intarray[j+1];
                    int additionInt = currentInt + newInt;

                    if(additionInt == intarray.length && j < intarray.length-3){
                        // formatting for spaces in ints of different lengths
                        System.out.print("     ");
                    } else  if(additionInt>100000 ){
                        System.out.print("     ");
                    }
                     else {
                        System.out.print("   ");
                    }

                } else {
                    System.out.print("   ");
                
                }


                System.out.print(currentInt);

            }
            System.out.println();
        }

    }
}
