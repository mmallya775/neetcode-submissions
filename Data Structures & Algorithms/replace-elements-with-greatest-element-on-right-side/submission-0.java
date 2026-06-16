class Solution {
    public int[] replaceElements(int[] arr) {
        int current ;
        int maxRight = -1;
        for (int i = arr.length -1; i>=0; i--){
            current = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(current,arr[i]);
        }

        return arr;
    }
}