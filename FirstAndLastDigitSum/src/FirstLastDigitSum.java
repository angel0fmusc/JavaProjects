public class FirstLastDigitSum {

    /**
     * Find the first and last digit of the parameter.
     * Return the sum of the first and last digit of that number.
     * Use a loop
     * @param number
     * @return int
     */
    public static int sumFirstAndLastDigit(int number){
        if(number < 0 ){
            return -1;
        }

        // Get last digit before entering loop
        int last_digit = number % 10;
        int first_digit = number;

        while(number != 0){
            // Check if you are at first digit already
            if(number / 10 == 0){
                first_digit = number;
            }
            number = number / 10;
        }
        return last_digit + first_digit;
    }
}
