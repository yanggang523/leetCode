int hammingWeight(int n) {
    int k = 0;

    while (n > 0){
        
        // 하나씩 밀면서 비트 비교하기 
        k += n & 1;
        n = n >> 1;

    }
    return k;
    
}