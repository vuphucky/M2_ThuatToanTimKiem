import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++) {
            System.out.println("enter element " + i + ": ");
            list[i] = scanner.nextInt();
        }
        System.out.println("your list:");
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println("enter value want to know index:");
        int value = scanner.nextInt();
        System.out.println(binarySearch(list,0,list.length-1,value));
    }
    public static int binarySearch(int[] list, int minIndex, int maxIndex, int searchValue){
        if (minIndex > maxIndex){
            return -1;
        }
        int midIndex = (minIndex + maxIndex) / 2;
        if (list[midIndex] == searchValue){
            return midIndex;
        } else if (list[midIndex] > searchValue) {
           return binarySearch(list,minIndex,midIndex -1,searchValue);
        } else {
            return binarySearch(list,minIndex + 1, maxIndex, searchValue);
        }
    }
}