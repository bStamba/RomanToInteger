public class RomanInteger {
    //We want to be able to receive a string input of roman numerals, and then
    //convert those to an integer and have the integer output.

    public int romanToInteger(String s){
        int total = 0;
        int currentNum = 0;
        int nextNum = 0;
        //Loop through the roman numeral string from left to right, if the
        //second element is less than or equal to the first element in the string
        //then we will add it to the total, otherwise subtract.
        for(int i = 0; i < s.length(); i++){
            currentNum = convertRoman(s.charAt(i));
            //If there are no chars left in the string, set the secondary value to 0.
            if(i < s.length() - 1) {
                nextNum = convertRoman(s.charAt(i + 1));
            }
            else{
                nextNum = 0;
            }
            //If the current number is greater than the next number, then we will add it
            //otherwise we will subtract it from the total.
            if(currentNum >= nextNum){
                total = total + currentNum;
            }
            else{
                total = total - currentNum;
            }
        }
        System.out.println("The integer value of " + s + " is: " + total);
        return total;
    }

    public int convertRoman(char c){
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
