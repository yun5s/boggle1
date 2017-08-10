package boggle;

import java.util.Scanner;

public class boggle3 {
    /**
     * @param board: A list of lists of character
     * @param word: A string
     * @return: A boolean
     */


    public static boolean valid(char[][] board, String word) {
        if (board==null || board.length==0){
            return false;
        } 
        boolean visited[][] = new boolean[board.length][board[0].length];
        for (int i=0; i < board.length; i++){
            for (int j=0; j < board[0].length; j++){
                if (search(word, 0, board, i, j, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean search(String word, int index, char[][] board, int i, int j, boolean[][] visited){
        if (i<0 || j<0 || i==board.length || j==board[0].length || visited[i][j]==true) {
            return false;
        }
        visited[i][j] = true;
        boolean result = false;
        if (board[i][j]==word.charAt(index)){
            if (index == word.length()-1){
                return true;
            } 
            //save the result here instead of just return the result, as we need to unset the visited matrix before return
            result =search(word, index+1, board, i-1, j, visited) ||
                    search(word, index+1, board, i+1, j, visited) ||

                    search(word, index+1, board, i-1, j-1, visited) ||
                    search(word, index+1, board, i+1, j-1, visited) ||

                    search(word, index+1, board, i-1, j-1, visited) ||
                    search(word, index+1, board, i+1, j+1, visited) ||


                    search(word, index+1, board, i, j-1, visited) ||
                    search(word, index+1, board, i, j+1, visited);
        }
        visited[i][j] = false;
        return result;
    }

    public static void main(String [] args){

        char[][] board = {
            {'I','L','A','W'},
            {'B','N','G','E'},
            {'I','U','A','O'}, 
            {'A','S','R','L'}
            };

            Scanner scanner = new Scanner (System.in);
            System.out.print("Enter a word ");  
            String words = scanner.next();

            boolean validd = valid(board, words);
            System.out.println(validd ? "YES" : "NO");


    }
}

