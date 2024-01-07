/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String answer = "" + s.charAt(0) ;
        boolean exist=false;
        for (int i = 1; i < s.length(); i++){
            for (int j = 0; j < answer.length(); j++){
                // checks if char at i is already in the new string
                if (s.charAt(i) == answer.charAt(j)) { 
                    exist = true;
                }
            }
            // adds new chars to the ew string and adds space char
            if (!exist || s.charAt(i) == ' ') {
                answer += s.charAt(i);
            }
            exist = false;
        }
        return answer;
    }
}
