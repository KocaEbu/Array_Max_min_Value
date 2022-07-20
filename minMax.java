
import java.util.Arrays;
import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {

        int[] arr = {21, 3, 47, 135, -21, 57, -300, -65};
        Arrays.sort(arr);
        System.out.println("Dizinin Kucukten Buyuge Siralanmasi");
        System.out.println(Arrays.toString(arr));

        Scanner inp = new Scanner(System.in);
        System.out.print("Lutfen Bir Sayi Giriniz : ");
        int number = inp.nextInt();


        for (int i = 0; i < arr.length; i++) {

            if (number < arr[i]) {
                System.out.println("Girilen Sayidan Kucuk En Yakin Sayi :" + arr[i - 1]);
                System.out.println("Girilen Sayidan Buyuk En Yakin Sayi :" + arr[i]);
                break;

            }
        }
    }
}