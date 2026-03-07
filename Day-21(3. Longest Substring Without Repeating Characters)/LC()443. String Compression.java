class Solution {
    public int compress(char[] chars) {
        int index = 0;   // position to write
        int i = 0;// position to read

        while (i < chars.length) {
            char current = chars[i];// current character
            int count = 0;// count of current character

            // count same characters
            while (i < chars.length && chars[i] == current) {
                i++;// move to next character
                count++;// increment count
            }

            // write character
            chars[index++] = current;// write count if greater than 1

            // write count if greater than 1
            if (count > 1) {// convert count to string and write each digit
                String num = Integer.toString(count);// convert count to string and write each digit
                for (char c : num.toCharArray()) {// write each digit
                    chars[index++] = c;// write each digit
                }
            }
        }

        return index;// return new length of compressed array.
    }
}