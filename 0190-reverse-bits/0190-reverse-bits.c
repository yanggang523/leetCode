uint32_t reverseBits(uint32_t n) {
    // 옮길 변수 선언
    uint32_t num = 0b0;
    // n의 가장 뒤에 있는 비트를 num에 넣어주고, num(알아서 밀리겠지), 앞에서 0비트를 넣어주기 
    for (int i = 0; i < 32; i++){
        num = (num<<1) | (n & 1);
        n = n >> 1;        
    }
    return num;
    
    

    
}