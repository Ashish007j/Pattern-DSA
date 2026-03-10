class SquaresSortedArray {
    public int[] sortedSquares(int[] arr) {

        int n = arr.length;
        int[] result = new int[n];

        int i = 0;
        int j = n - 1;

        for (int k = n - 1; k >= 0; k--) {

            int iSqr = arr[i] * arr[i];
            int jSqr = arr[j] * arr[j];

            if (iSqr > jSqr) {
                result[k] = iSqr;
                i++;       // move left pointer
            } 
            else {
                result[k] = jSqr;
                j--;       // move right pointer
            }
        }

        return result;
    }
}