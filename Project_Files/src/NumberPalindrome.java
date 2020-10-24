public class NumberPalindrome {

    /**
     * Check if the given number is a palindrome
     * @param number - int
     * @return boolean
     */
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int last_digit;
        int numberCopy = Math.abs(number);

        while(numberCopy != 0){
            last_digit = numberCopy % 10;
            reverse += last_digit; // add to most sig. digit
            numberCopy /= 10; // decrement numberCopy
            if(numberCopy != 0){
                reverse *= 10; // increase place
            }
        }

        // Check if number is negative
        if(number < 0){
            reverse *= -1;
        }

        // Check if numbers are equal
        if(reverse == number){
            return true;
        } else{
            return false;
        }
    }
}
