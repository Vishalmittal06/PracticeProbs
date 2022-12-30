public class InsertionSort {
    public void sort(int[] num){
        for(int i=1;i<num.length;i++){
            int currentIndex = i;
            while(currentIndex>0 && num[currentIndex]<num[currentIndex-1]){
                    int temp = num[currentIndex];
                    num[currentIndex] = num[currentIndex-1];
                    num[currentIndex-1] = temp;
                    currentIndex--;
            }
        }
    }
}
