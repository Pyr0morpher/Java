import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;


class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    // initializes the array sizes
    System.out.println("Enter the array size: ");
    int size1 = scan.nextInt();
    System.out.println("Enter the other array size: ");
    int size2 = scan.nextInt();

    int[] array1 = new int[size1];
    int[] array2 = new int[size2];

    // assigns random numbers between 1 - 100 for the arrays
    for (int x = 0; x < size1; x++) {
      array1[x] = new Random().nextInt(101);
    }
    for (int y = 0; y < size2; y++) {
      array2[y] = new Random().nextInt(101);
    }
    System.out.print("Merged Array: ");
    for(int z = 0; z < mergeArray(array1,array2).length;z++)
        System.out.print(removeDupes(mergeArray(array1,array2))[z] + " ");

  }

  // merges two arrays inputed and returns a new int[] with all the values from both arrays
  public static int[] mergeArray(int[] first, int[] second) {

    int[] output = new int[first.length + second.length];

    for (int a = 0; a < first.length; a++){
      output[a] = first[a];
    }
    for (int b = 0; b < second.length; b++){
      output[b + first.length] = second[b];
    }
    //Arrays.sort(output);

    return output;
  }

  //takes an int[] input and removes duplicate elements 
  public static int[] removeDupes(int[] input){

    int[] noDupes = new int[input.length];

    for (int c = 0; c < noDupes.length; c++){
      noDupes[c] = input[c];
    }
    for(int d = 1; d < noDupes.length; d++){
      if (noDupes[d] == noDupes[d - 1]){
        noDupes[d] = 0;
      }
    }
    //Arrays.sort(noDupes);

    return noDupes;
  }
}
