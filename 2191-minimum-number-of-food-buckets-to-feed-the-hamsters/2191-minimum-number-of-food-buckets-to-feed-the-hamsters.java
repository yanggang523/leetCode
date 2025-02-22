// 햄스터에게 도넛을 주면 안될 것 같은데....
class Solution {
    public int minimumBuckets(String hamsters) {
        char[] hamArray = hamsters.toCharArray();
        int donuts = 0;
        for (int i = 0; i < hamsters.length(); i++){
            if (hamArray[i] == 'H'){
                if (i > 0 && hamArray[i - 1] == 'D'){
                    continue;
                }else if(i < hamsters.length() - 1 && hamArray[i + 1] == '.'){
                    hamArray[i + 1] = 'D';
                    donuts++;
                }else if(i > 0 && hamArray[i - 1] == '.'){
                    hamArray[i - 1] = 'D';
                    donuts++;
                }else{
                    return -1;
                }
            }
        }
        return donuts;
    }
}