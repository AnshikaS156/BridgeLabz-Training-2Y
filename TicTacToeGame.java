import java.util.*;
public class TicTacToeGame{
    static char[] board= new char[10];
    static char playerLetter, computerLetter;
    Scanner sc= new Scanner(System.in);
    static Random rand = new random();

    

    //UC1=CREATE BOARD
    static void createBoard(){
        for(int i=1;i<board.length;i++){
            board[i]=' ';

        }
    }
    
    //UC2=CHOOSE LETTER
    static void chooseLetter(){
        System.out.print("Choose your letter (X/O): ");
        playletter=scanner.next().toUpperCase().charAt(0);
        computerLetter = (playerLetter == 'X') ? 'O' : 'X';
        System.out.println("You are " + playerLetter + ", Computer is " + computerLetter);
    }

    //UC3=SHOW BOARD
    static void showBoard() {
        System.out.println("\n " + board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("_______________");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("_______________");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
    }

  
    


    //UC 4 =  FIRST MOVE
    
    static void playerMove() {
    int pos;
    while (true) {
        System.out.print("Enter your move (1-9): ");
        pos = sc.nextInt();
        
        if (pos >= 1 && pos <= 9) {
            if (isFreeSpace(pos)) {
                board[pos] = playerLetter;
                break;
            } else {
                System.out.println("That space is already taken! Try again.");
            }
        } else {
            System.out.println("Invalid position! Choose between 1-9.");
        }
    }
    }

    // UC5: Check if space is free
    static boolean isFreeSpace(int pos) {
    return board[pos] == ' ';

    }

    //UC6: TOSS
    static 

}



















    
