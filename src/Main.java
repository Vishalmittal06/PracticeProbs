public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] arr = {1,2,7,8,19,38,8,9,10,2,7};
        SelectionSort sorting = new SelectionSort();
        sorting.sort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}