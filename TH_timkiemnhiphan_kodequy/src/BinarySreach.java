public class BinarySreach {
    static int [] list = {2,4,7,10,11,45,50,59,60,66,69,70,79};

    static int binarySreach(int[] list, int searchValue ){
        int minIndex = 0;
        int maxIndex = list.length ;
        while (maxIndex > minIndex){
            int midIndex = (minIndex + maxIndex)/2;
            if (searchValue < list[midIndex]) {
                maxIndex = midIndex - 1;
            }else if (searchValue == list[midIndex]){
                return midIndex;
            } else {
                minIndex = midIndex + 1;
            }
        }
         return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySreach(list,2));
        System.out.println(binarySreach(list,11));
        System.out.println(binarySreach(list,79));
        System.out.println(binarySreach(list,1));
        System.out.println(binarySreach(list,88));
    }
}
