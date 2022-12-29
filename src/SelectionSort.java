public class SelectionSort {
    public void sort(int[] arr){
        int currentIndex=0;
        while(currentIndex<arr.length){
            int minIndex= currentIndex;
            for(int index=currentIndex+1;index<arr.length;index++){
                if(arr[index]<arr[minIndex])
                    minIndex = index;
            }
            swap(arr,minIndex,currentIndex);
            currentIndex++;
        }
    }

    private void swap(int[] arr,int minIndex,int currentIndex){
        int temp = arr[currentIndex];
        arr[currentIndex] = arr[minIndex];
        arr[minIndex] = temp;
    }
}
