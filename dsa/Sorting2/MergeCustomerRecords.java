import java.util.Arrays;

public class MergeCustomerRecords {

    public static int[] merge(int[] a,int[] b){

        int[] result = new int[a.length+b.length];

        int i=0,j=0,k=0;

        while(i<a.length && j<b.length){

            if(a[i]<=b[j])
                result[k++]=a[i++];
            else
                result[k++]=b[j++];
        }

        while(i<a.length)
            result[k++]=a[i++];

        while(j<b.length)
            result[k++]=b[j++];

        return result;
    }

    public static void main(String[] args){

        int[] branchA={1,4,8};

        int[] branchB={2,5,7};

        System.out.println(Arrays.toString(merge(branchA,branchB)));

    }
}