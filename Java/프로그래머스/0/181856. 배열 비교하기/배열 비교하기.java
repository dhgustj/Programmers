class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int arr1_sum = 0;
        int arr2_sum = 0;
        
        for(int i=0; i<arr1.length; i++){
            arr1_sum += arr1[i];
        }
        for(int j=0; j<arr2.length; j++){
            arr2_sum += arr2[j];
        }
        
        if(arr1.length != arr2.length){
            if(arr1.length < arr2.length){
                answer = -1;
            }else{
                answer = 1;
            }
        }else{
            if(arr1_sum != arr2_sum){
                if(arr1_sum < arr2_sum){
                    answer = -1;
                }else if(arr1_sum > arr2_sum){
                    answer = 1;
                }else{
                    answer = 0;
                }
            }
        }
        return answer;
    }
}