public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      int size = 8;
      for (int row = 0; row < size; row++){
         for (int col = 0; col < size; col++) {
            if ((col + row) % 2 == 0) {
               chessboard[row][col] = '\u25A1';
               System.out.print(chessboard[row][col]);
            }
            else {
               chessboard[row][col] = '\u25A0';
               System.out.print(chessboard[row][col]);
            }

         }
         System.out.println();
      }
   }
}