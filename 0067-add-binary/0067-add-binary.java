class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        // int numA = a.charAt(i);
        // int numB = b.cahrAt(j);
        int carry = 0; 
        int sum = 0;
        StringBuilder s = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0){
            sum = carry;
            if (i >= 0){
                sum += a.charAt(i) - '0';
            }
            if (j >= 0){
                sum += b.charAt(j) - '0';
            }
            // sum += carry;
            s.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }
        return s.reverse().toString();
    }
}