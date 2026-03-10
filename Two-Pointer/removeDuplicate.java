class removeDuplicate {
    public static void main(String[] args) {
        int [] arr = {1,1,2,2,3,4,5,5};
        int newLength = removeDuplicates(arr);  
        System.out.println("New length of the array: " + newLength);
        System.out.print("Array after removing duplicates: ");  
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static int removeDuplicates(int[] arr)
{
    int i = 1 ;
    for (int j = 1 ; j < arr.length ; j++)
{
    if (arr[j] != arr[j-1]){
        arr[i]= arr[j];
        i++;
    }
}
return i;}
}