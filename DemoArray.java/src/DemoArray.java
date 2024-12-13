public class DemoArray {
    public static void main(String[] args) {
        int x1 = 3;
        int x2 = 10;
        int x3 = 11;

        // declare array
        int[] arr = new int[3];
        arr[0] = 3;
        arr[1] = 10;
        arr[2] = 11;
        // for loop -> read array values
        // Print all values, which >=10
        for (int i = 0; i < arr.length; i++) { // i = 0,1,2
            if (arr[i] >= 10) {
                System.out.println(arr[i]);
            }
            // declare double array, length = 5
            // assign values10.4, 4.3, 3.3, 1.9, 9.9
            // Sum up all values in the double array
        }
        double[] arr2 = new double[5];
        arr2[0] = 10.4;
        arr2[1] = 4.3;
        arr2[2] = 3.3;
        arr2[3] = 1.9;
        arr2[4] = 9.9;
        double sum = 0;
        for (int i = 0; i < arr2.length; i++) {
        sum = sum + arr2[i];
        }
        System.out.println(sum);
    
    //"abc", "def", "ijk";
    //"abc"
    String[] arr3 = new String[3];
    arr3[0] = "abc";
    arr3[1] = "def";
    arr3[2] = "ijk";
    String target = "abc";
    boolean isTargetExist = false; 
    for(int i = 0; i <arr3.length; i++) {
    if (target.equals(arr3[i])) {
        isTargetExist = true;
    }
    }
    System.out.println(isTargetExist); //true

    char[] arr4 = new char[] {'b', 'c', 'a'};
    //arr4[0] = 'b'
    //arr4[1] = 'c'
    //arr4[2] = 'a'
    int[] ascii = new int [arr4.length];
    for (int i = 0; i < arr4.length; i++) {
        ascii[i] = arr4[i]; //char value - int variable(ascii[i])
    }
    for (int i = 0; i < arr4.length; i++) {
        System.out.println(ascii[i]);
    }
    // covert the char value to int value, and then assign them to a new int array
    //98.99.97
    // Find the max ascii value in the int array
    int max = arr4[0];
    for (int i = 0; i < arr4.length; i++) {
    if (arr4[i] > max){
    max = ascii[i];
    System.out.println(max);//99
    }
    }

    // Find the min value in the int array
    int[] arr5 = new int[] {9, -8, -99, 98};{
    int min = arr5[0];
    for (int i =0; i < arr5.length; i++) 
    if (arr5[i] < min)
    min = arr5[i];{
    System.out.println(min);
    }
    }


    //System.out.println(min); //-99




















    }
}

