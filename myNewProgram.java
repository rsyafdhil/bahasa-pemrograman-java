import java.util.*;

public class myNewProgram {

    public static void main(String[] args) {
        // int ages[] = new int[5];
        // ages[0] = 35;
        // System.out.println(Arrays.toString(ages));

        final int ROWS = 2;
        final int COLS = 3;
        int grades[][] = new int[ROWS][COLS];
        grades[0][0] = 100;
        grades[0][1] = 90;
        grades[0][2] = 80;
        grades[1][0] = 70;
        grades[1][1] = 60;
        grades[1][2] = 50;

        for (int rows = 0; rows < ROWS; rows++) {
            for (int cols = 0; cols < COLS; cols++) {
                System.out.println("Rows: " + rows + " Cols: " + cols + " Value: " + grades[rows][cols]);
            }
            System.out.println();
        }

        // System.out.println(Arrays.toString(grades[1]));

    }
}