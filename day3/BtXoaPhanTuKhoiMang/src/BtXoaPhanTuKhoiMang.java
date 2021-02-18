import java.util.Scanner;

public class BtXoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter size");
        size = scanner.nextInt();
        arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("nhập số  thứ" + (i + 1) + " : ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.print("dãy số là : ");
        for (int k : arr) {
            System.out.print(k + " ");
        }
        delete(arr);
    }
    public static void delete(int[] array){
        int number;
        int index = 0;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhập số cần xóa ");
        number = scanner.nextInt();
        for(int j = 0 ; j <array.length; j ++){
            if(number == array[j]){
                index = j;
                check = true;
            }
        }
        if(check) {
            while (index<array.length-1){
                array[index] = array[index+1];
                index++;
            }
            array[array.length-1] = 0;
            System.out.println("dãy số mới là" );
            for (int k : array) {
                System.out.print(k + " ");
            }
        }else {
            System.out.print("số không có trong dãy");
        }
    }
}
