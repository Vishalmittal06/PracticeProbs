public class BubbleSort {
    public void sort(int[] arr){
        if(arr.length==1)
            return;
        boolean swapDone=true;
        while(swapDone) {
            swapDone = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    swapDone = true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
