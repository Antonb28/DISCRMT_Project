import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rows = 25, columns = 20, choice = 0;
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[rows][columns];

        Initialize(array, rows, columns);

        while(choice != 6){
            Display(array, rows,columns);
            System.out.println("MAIN MENU:");
            System.out.println("[1] Analyze Risk Rating");
            System.out.println("[2] Search Risk Rating");
            System.out.println("[3] Average Scores per District");
            System.out.println ("[4] Scores per District");
            System.out.println("[5] Reset Grid");
            System.out.println("[6] Exit Program");
            System.out.print("Input Choice: ");
            choice = sc.nextInt();

            if(choice == 1){
                System.out.print("\nEnter X Coordinate: ");
                int x = sc.nextInt();
                System.out.print("Enter Y Coordinate: ");
                int y = sc.nextInt();
                System.out.print("Enter Number of Cases: ");
                int Cases = sc.nextInt();
                floodfill(array,x,y,calculateScore(Cases));
            }
            else if(choice ==2){
                System.out.println("\nEnter X Coordinate: ");
                int x = sc.nextInt();
                System.out.println("Enter Y Coordinate: ");
                int y = sc.nextInt();
                System.out.println("-----------------------------");
                System.out.println("       RISK ANALYSIS");
                System.out.println("-----------------------------");
                System.out.println("Risk Rating: " + array[x][y]);
                System.out.println("Area: " + Areas.Area(x,y) + "\n");
            }
            else if(choice == 3){
                ArrayList<LinkedList> set = new ArrayList<>();
                for(int i = 0; i<rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        boolean exists = false;
                        if (set.size() == 0) {
                            set.add(new LinkedList(1));
                            set.get(0).push(Areas.Area(i, j));
                            set.get(0).push(0);
                        }
                        else {
                            for (LinkedList linkedList : set) {
                                if (linkedList.front().equals(Areas.Area(i, j))) {
                                    int total = (int) linkedList.back() + array[i][j];
                                    linkedList.push(total);
                                    exists = true;
                                }
                            }
                        }

                        if (!exists) {
                            set.add(new LinkedList(1));
                            set.get(set.size()-1).push(Areas.Area(i, j));
                            set.get(set.size()-1).push(0);
                        }
                    }
                }
                System.out.println("-----------------------------");
                System.out.println("       RISK ANALYSIS");
                System.out.println("-----------------------------");
                for (LinkedList district : set) {
                    System.out.println("District: " + district.front());
                    System.out.println("Average Risk Rating: " + (int) district.back()/(district.size()-1) + "\n");
                }
            }

            else if (choice==4) {
                System.out.println("Enter District: ");
                Scanner scan = new Scanner(System.in);
                String district = "";
                district += scan.nextLine();

                System.out.println("-----------------------------");
                System.out.println("District: " + district);
                System.out.println("-----------------------------");
                for(int i = 0; i<rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        if(Areas.Area(i,j).equals(district)){
                            System.out.println("Risk Rating: " + array[i][j]);
                        }
                    }
                }
            }
            else if(choice == 5){
                Initialize(array, rows, columns);
            }
        }
    }

    public static void floodfill(int[][] array, int x, int y, int score) {
        if (score != 0 && array[x][y] < score) {
            array[x][y] = score - 1;
            if (x + 1 < array.length && array[x + 1][y] < array[x][y]) floodfill(array, x + 1, y, score - 1);
            if (x - 1 >= 0 && array[x - 1][y] < array[x][y]) floodfill(array, x - 1, y, score - 1);
            if (y + 1 < array[0].length && array[x][y + 1] < array[x][y]) floodfill(array, x, y + 1, score - 1);
            if (y - 1 >= 0 && array[x][y - 1] < array[x][y]) floodfill(array, x, y - 1, score - 1);
            array[x][y] = score;
        }
    }

    public static int calculateScore(int cases) {
        if (cases > 0 && cases <= 3) return 1;
        else if (cases > 3 && cases <= 6) return 2;
        else if (cases > 6 && cases <= 12) return 3;
        else if (cases > 12 && cases <= 18) return 4;
        else if (cases > 18) return 5;
        else return 0;
    }

    public static void Display(int[][] array, int rows, int columns){
        for(int i = 0; i<rows; i++)
        {
            for(int j = 0; j<columns; j++)
            {
                if(array[i][j] > 9){
                    System.out.print(array[i][j] + " ");
                }
                else {
                    System.out.print(array[i][j] + "  ");
                }
            }
            System.out.println();
        }
        System.out.println(" ");
    }

    public static void Initialize(int[][] array, int rows, int columns){
        for(int i = 0; i<rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = 0;
            }
        }
    }
}