public class CountOfDigits {
    public static void main(String[] args){
        int arr[] = {1234,54,87513,345,1};
        int  counter;
        //for(int n:arr){
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            counter =0;
            while(n>0){
                counter++;
                n=n/10;
            }
            System.out.println("Number "+(i+1)+" has "+ counter+ " digits");
        }
    }
}
