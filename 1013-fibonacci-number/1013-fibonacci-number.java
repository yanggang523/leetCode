class Solution {
    public int fib(int n) {
        int f1 = 0;
        int f2 = 1;
        if (n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }else{            
            for (int i = 2; i <= n; i++){
                int k = f2;
                f2 = f1 + f2;
                f1 = k; 
            }
            return f2;
        }

    }
}