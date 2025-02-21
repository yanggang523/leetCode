// 햄스터에게 도넛을 주면 안될 것 같은데....
class Solution {
    public int minimumBuckets(String hamsters) {
        Set<Integer> donuts = new HashSet<>();
        boolean isHamsterExist = false; 
        for (int i = 0; i < hamsters.length(); i++){
            char hamster = hamsters.charAt(i);

            // 예외처리
            if (hamsters.length() <= 1){
                if (hamster == 'H'){
                    isHamsterExist = true;
                }
                break;
            }
            
            // 길이가 1일 때 예외처리 
            if (i == 0 && hamster == 'H' && hamsters.length() > 0){
                    isHamsterExist = true;

                if (hamsters.charAt(i + 1) != 'H'){
                    donuts.add(i + 1);
                }
                continue;
            }

            // "HH"가 문자열 맨 앞이나 맨 뒤에 붙어나올 경우 예외처리 
            if (i == 1 && i + 1 < hamsters.length() && hamster == 'H' && hamsters.charAt(i - 1) == 'H'){
                return -1;
            }else if (
                i == hamsters.length() - 2 && i + 1 < hamsters.length() 
                && hamster == 'H' && 'H' == hamsters.charAt(i + 1)){
                return -1;
            }else if (hamsters.length() == 2 && hamster == 'H' && i == 1 && hamsters.charAt(i -1) == 'H'){
                return -1;
            }


            if (i == hamsters.length() - 1 && hamster == 'H' && !donuts.contains(i - 1)){
                donuts.add(i - 1);
                break;
            }

            // 1. 햄스터 발견 2. 앞에 도넛 X
            if (hamster == 'H' && !donuts.contains(i - 1)){

                // HHH인 경우 or HH인데 끝에 붙어있는 경우 
                // if ((i + 1 < hamsters.length() && hamsters.charAt(i - 1) == 'H' && hamsters.charAt(i + 1) == 'H')
                // || (i + 1 == hamsters.length() && hamsters.charAt(i -1) == 'H') 
                // || (i - 1 == 0 && hamsters.charAt(i + 1) == 'H')
                // ){
                //     return -1;
                // }
                if (i > 0 && i + 1 < hamsters.length() && hamsters.charAt(i - 1) == 'H' && hamsters.charAt(i + 1) == 'H'){
                    return -1;
                }
                    isHamsterExist = true;

                //뒤에 햄스터 여부 
                if (hamsters.charAt(i + 1) == 'H'){
                    donuts.add(i - 1);
                }else{ 
                    donuts.add(i + 1);
                }
            }
        }

        // return 부분 
        if (donuts.size() == 0 && isHamsterExist){
            return -1;
        }else if(donuts.size() == 0 && !isHamsterExist){
            return 0;
        }else{
            return donuts.size();
        }
    }
}