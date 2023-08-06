public class RomanIntegerMain {
    public static void main(String[] args){
        int total = 0;
        RomanInteger ri = new RomanInteger();
        String s1 = "XVIII";
        String s2 = "III";
        String s3 = "MCMLXXXV";

        total = ri.romanToInteger(s1);
        total = ri.romanToInteger(s2);
        total = ri.romanToInteger(s3);
    }
}
