public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int row = 0; row < 8; row++) {
         for (int col = 0; col < 8; col++) {
            if ((row + col) % 2 == 0) {
               chessboard[row][col] = '\u25A1'; // Unicode character for white square
            } else {
               chessboard[row][col] = '\u25A0'; // Unicode character for black square
            }
         }
      }

      // Print the chessboard
      for (int row = 0; row < 8; row++) {
         for (int col = 0; col < 8; col++) {
            System.out.print(chessboard[row][col]);
         }
         System.out.println(); // Move to the next row

      }
   }
}