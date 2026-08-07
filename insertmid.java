public class insertmid {
    public static void main(String[]args){
        int [] arr = { 10,20,30,40,50};
        int newVal = 25;
        int [] arr1 = new int[arr.length + 1];
        int midIndex = arr.length / 2;
        for(int i =0;i<midIndex;i++){
            arr1[i] = arr[i];
        }
        arr1[midIndex] = newVal;
        for(int i =midIndex;i<arr.length;i++){
            arr1[i+1] = arr[i];
        }
        for(int i =0;i<arr1.length;i++ ){
            System.out.print(arr1[i] + " ");
        }
    }
}
