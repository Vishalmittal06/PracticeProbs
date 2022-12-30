public class Main {
    public static void main(String[] args) {
        System.out.println("Selection Sort:");
        int[] arr = {1,2,7,8,19,38,8,9,10,2,7};
        SelectionSort sorting = new SelectionSort();
        sorting.sort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println("\nBubble Sort:");
        int[] arr2 = {1,2,7,8,19,38,8,9,10,2,7};
        BubbleSort sorting2 = new BubbleSort();
        sorting2.sort(arr2);
        for(int num:arr2){
            System.out.print(num+" ");
        }

        System.out.println("\nBubble Sort:");
        int[] arr3 = {1,2,7,8,19,38,8,9,10,2,7};
        InsertionSort sorting3 = new InsertionSort();
        sorting3.sort(arr3);
        for(int num:arr3){
            System.out.print(num+" ");
        }
    }
}