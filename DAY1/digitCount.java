public class digitCount {
    public static void main(String[] args){
        long arr[] = {8247377406L,1234567890L,987654321L};
        int  countereve;
        int counterodd,r;
        //for(int n:arr){
        for(int i=0;i<arr.length;i++){
            long n=arr[i];
            countereve=0;
            counterodd=0;
            while(n>0){
                r=(int)n%10;
                if(r%2==0){
                    countereve++;
                }else{
                    counterodd++;
                }
                n=n/10;
            }
            if(countereve==counterodd){
                System.out.println("Neutral");
            }else if(countereve>counterodd){
                System.out.println("Even Biased number");
            }else{
                System.out.println("Odd Biased Number");
            }
            // System.out.println("Mobile Number "+(i+1)+" has "+ countereve+ " even digits "+counterodd+" odd digits");
            System.out.println(String.format("Mobile Number %d has  %d even digits %d odd digits",(i+1),countereve,counterodd));
        }
    }
}
