public class MergeTwoArray {
    static int[] merge(int[] a, int[] b){
        int[] merge = new int[a.length+b.length];
       int i = 0;
       int j = 0;
       int k =0;
       while(i < a.length && j < b.length){
        if(a[i] < b[j]){
            merge[k] = a[i];
            i++;
            k++;
        }
        else{
            merge[k] = b[j];
            j++;
            k++;
        }
       }

       while(i< a.length){
            merge[k++] = a[i++];
       }

       while(j< b.length){
        merge[k++] = b[j++];
     }
     return merge;
    }
    public static void main(String[] args) {
        int[] a={1, 2, 3, 4, 5};
        int[] b={2, 3, 6, 7};

        int[] ans = merge(a, b);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
