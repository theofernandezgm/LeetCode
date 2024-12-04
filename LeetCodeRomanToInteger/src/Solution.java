class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int firstvalue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int nextvalue = 0;

            switch (s.substring(i, i + 1)) {
                case "I": nextvalue = 1; break;
                case "V": nextvalue = 5; break;
                case "X": nextvalue = 10; break;
                case "L": nextvalue = 50; break;
                case "C": nextvalue = 100; break;
                case "D": nextvalue = 500; break;
                case "M": nextvalue = 1000; break;
            }

            if (nextvalue < firstvalue){
                total = total - nextvalue;
            } else {
                total = total + nextvalue;
            }

            firstvalue = nextvalue;
        }

        return total;
    }
}
