public class DiagonalStar {

    /**
     * Method should print diagonals to generate a rectangular pattern composed of stars (*)
     * 3Should be accomplished using loops
     * @param number - int
     */
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
            return;
        }

        for(int row = 1; row <= number; row++){
            for(int col = 1; col <= number; col++){
                if(row == 1 || row == number){
                    System.out.print('*');
                } else if(col == 1 || col == number){
                    System.out.print('*');
                } else if(col == row){
                    System.out.print('*');
                } else if(col == (number - row + 1)){
                    System.out.print('*');
                } else{
                    System.out.print(' ');
                }

            }
            System.out.println(); // Move to another line
        }

    }
}
