class SubArray_1{
    public static void main(String[] args) {
        int arr[] ={1, 2, 3, 4, 5};
        for(int st =0; st<5; st++){
             for(int end = st; end< 5; end++){
                for(int i =st; i<=end; i++){
                    System.out.print(arr[i]+" ");
                }
               System.out.println(); 
             }
        }
    }
}