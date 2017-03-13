package base;

import java.util.Arrays;

/**
 * Created by david_him on 3/7/2017.
 */
public class MergeArray {

    public MergeArray() {

    }

    public void merge2Arrays(int[] a, int[] b, int aLength, int bLength){

        int aIndex = aLength -1;
        int bIndex = bLength - 1;

        int mergeIndex = aLength + bLength - 1;

        while(aIndex >= 0 && bIndex >=0) {
            if(a[aIndex] > b[bIndex]) {
                a[mergeIndex] = a[aIndex];
                aIndex--;
            } else {
                a[mergeIndex] = b[bIndex];
                bIndex--;
            }
            mergeIndex--;
        }


        System.out.println(Arrays.toString(a));

    }
    public static void main(String[] args) {

        int[] array1 = {-3,-1,4,8,0,0,0};
        int[] array2 = {-2,6,7};

        MergeArray merge = new MergeArray();

        merge.merge2Arrays(array1,array2, 4, 3);
    }
}
