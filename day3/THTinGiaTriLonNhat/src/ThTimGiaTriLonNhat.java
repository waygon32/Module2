import java.util.Scanner;

public class ThTimGiaTriLonNhat {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size :");
        size = scanner.nextInt();
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("enter element " + (i+1) + ":");
            array[i]= scanner.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int k : array) {
            System.out.print(k + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}
