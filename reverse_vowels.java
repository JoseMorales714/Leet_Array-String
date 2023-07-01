class Solution {

    public String reverseVowels(String s) {

        StringBuilder str = new StringBuilder();

        for (char x : s.toCharArray()) {
            if ((x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A'
                    || x == 'E' || x == 'I' || x == 'O' || x == 'U')) {
                str.append(x);
            }
        }

        str = str.reverse();

        StringBuilder rtn_str = new StringBuilder();
        int counter = 0;

        for (char x : s.toCharArray()) {
            if ((x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A'
                    || x == 'E' || x == 'I' || x == 'O' || x == 'U')) {
                rtn_str.append(str.charAt(counter++));
            } else {
                rtn_str.append(x);
            }
        }

        return rtn_str.toString();

    }
}

// Given a string s, reverse only all the vowels in the string and return it.