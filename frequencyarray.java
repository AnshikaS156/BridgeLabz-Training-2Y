//frequency of each no. in an array

public class frequencyarray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,1,2,3,4,1,2,3,1,2,1};
        int n = arr.length;
        int[] freq = new int[n];
        boolean[] visited = new boolean[n];
        
        for(int i=0; i<n; i++){
            if(visited[i] == true){
                continue;
            }
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                    visited[j] = true;
                }
            }
            freq[i] = count;
        }
        
        for(int i=0; i<n; i++){
            if(visited[i] == false){
                System.out.println(arr[i] + " occurs " + freq[i] + " times");
            }
        }
        
    }
    
}
