import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rows = 10;
        int columns = 10;
        int run = 10;

        Scanner sc = new Scanner(System.in);

        int[][] array = new int[rows][columns];

        for(int i = 0; i<rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = 0;
            }
        }

        Display(array, rows,columns);

        while(run == 10){
            System.out.println("Enter X: ");
            int x = sc.nextInt();
            System.out.println("Enter Y: ");
            int y = sc.nextInt();
            System.out.println("Enter Value: ");
            int Val = sc.nextInt();

            floodfill(array, x, y, Val);

            Display(array, rows,columns);



        }

    }

    public static void floodfill(int array[][], int x, int y, int score){
        if(score != 0){
            array[x][y] = score;
            floodfill(array,x+1,y, score-1);
            floodfill(array,x-1,y, score-1);
            floodfill(array,x,y+1, score-1);
            floodfill(array,x,y-1, score-1);
        }
    }

    public static void Display(int[][] array, int rows, int columns){
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
