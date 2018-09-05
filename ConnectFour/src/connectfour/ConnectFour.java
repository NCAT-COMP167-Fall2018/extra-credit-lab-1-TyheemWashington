/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectfour;

import java.util.Random;

/**
 *
 * @author Tyheem Washington
 */
public class ConnectFour {
 private static char[][] gameBoard;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     gameBoard = createBoard('b');
     takeTurn('y');
     printBoard();
    
     // TODO code application logic here
    }
    
    private static char [][] createBoard(char startingCha){
char[][] returnBoard = new char [6][7];
     for (char[] returnBoard1 : returnBoard) {
         for (int j = 0; j < returnBoard1.length; j++) {
             returnBoard1[j] = startingCha;
//TODO: DO some stuff
         }
     }
return returnBoard;        
 }

private static void printBoard(){
     for (char[] gameBoard1 : gameBoard) {
         for (int j = 0; j < gameBoard1.length; j++) {
             System.out.print(gameBoard1[j]); //TODO: Print some stuff
         }
         System.out.println();
     }  
}
 private static void takeTurn( char currentPlayer){
    Random rand = new Random();
    int col = rand.nextInt(7);
    int row = 5; 
    while(true){
    if(gameBoard[row][col]=='b'){
        gameBoard[row][col]= currentPlayer;
        break;
    }else if (row==0){
    col = rand.nextInt(7);
    }else{ row--;
 }
    
    }   
}
 private static char playGame (char [][] gameBoard){
         int win = 10;
         while(win>0){
                if (win%2==0){
                takeTurn('y');
         }else{ 
                 takeTurn('r');
                 }               
         }win--;
        
 return ('t');
 
 
}
}
