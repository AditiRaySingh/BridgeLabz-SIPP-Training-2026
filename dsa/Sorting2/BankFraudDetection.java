public class BankFraudDetection {

    static int count=0;

    public static void main(String[] args){

        int[] amount={12,4,5,2};

        for(int i=0;i<amount.length;i++){

            for(int j=i+1;j<amount.length;j++){

                if(amount[i] > 3*amount[j])
                    count++;

            }
        }

        System.out.println(count);
    }
}