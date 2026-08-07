public class insertfirst {
    public static void main(String[]args){
        int [] arr = { 10,20,30,40,50};
        int newVal = 5;
        int [] arr1 = new int[arr.length + 1];
        arr1[0] = newVal;
        for(int i =0;i<arr.length;i++){
            arr1[i+1] = arr[i];
        }
        for(int i =0;i<arr1.length;i++ ){
            System.out.print(arr1[i] + " ");
        }
    }
}
Output : 5 10 20 30 40 50 
