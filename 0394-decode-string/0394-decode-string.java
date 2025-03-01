class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder currentString = new StringBuilder();
        int repeatCount = 0;

        for (int i = 0; i < s.length(); i++){
            char nowChar = s.charAt(i);
            if (Character.isDigit(nowChar)){
                repeatCount = repeatCount * 10 + Character.getNumericValue(nowChar);
            }else if(nowChar == '['){
                // 넣어주기
                numStack.push(repeatCount);
                strStack.push(currentString);

                // 초기화
                currentString = new StringBuilder();
                repeatCount = 0;
            }else if(nowChar == ']'){
                int repeatNum = numStack.pop();
                currentString = strStack.pop().append(currentString.toString().repeat(repeatNum));
            }else{
                currentString.append(nowChar);
            }
        }
        return currentString.toString();
    }
}
