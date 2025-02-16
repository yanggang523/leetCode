class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i =0; i < flowerbed.length; i++){
            if (n == 0){
                return true;
            }
            // if (flowerbed[0] == 0 && flowerbed[i+1] == 0){
            //     flowerbed[0] = 1;
            //     n--;
            //     continue;
            // }
            // if (flowerbed.length -1 == i){
            //     // flowerbed 체크하기 
            //     if (flowerbed[flowerbed.length -2] == 0){
            //         n--;
            //     }
            //     break;
            // }
            if (flowerbed[i] == 0 
                && (i == 0 || flowerbed[i-1] == 0)
                && (i == flowerbed.length - 1 || flowerbed[i+1] == 0)){
                flowerbed[i] = 1;
                n--;
            }
        }
        if (n != 0){
            return false;
        }else{
            return true;
        }
        
    }
}