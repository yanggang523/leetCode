class Solution {
    public boolean lemonadeChange(int[] bills) {
        int[] POS = {0, 0, 0}; // 순서대로 5달러, 10달러 20달러 저장
        for (int i = 0; i < bills.length; i++){
            int bill = bills[i];
            if (bill == 5){
                POS[0] += 1;
            }else if(bill == 10){
                if (POS[0] >= 1){
                    POS[0] -= 1;
                    POS[1] += 1;
                }else{
                    return false;
                }
            }else if(bill == 20){
                if (POS[1] >= 1 && POS[0] >= 1){
                    POS[1] -= 1;
                    POS[0] -= 1;
                    POS[2] += 1;
                }else if(POS[0] >= 3){
                    POS[0] -= 3;
                    POS[2] += 1;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}