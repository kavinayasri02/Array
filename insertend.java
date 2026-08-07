public class insertend {
    public static void main(String[]args){
        int [] arr = { 10,20,30,40,50};
        int newVal = 60;
        int [] arr1 = new int[arr.length + 1];
        for(int i =0;i<arr.length;i++){
            arr1[i] = arr[i];
        }
        arr1[arr.length] = newVal;
        for(int i =0;i<arr1.length;i++ ){
            System.out.print(arr1[i] + " ");
        }
    }
}
