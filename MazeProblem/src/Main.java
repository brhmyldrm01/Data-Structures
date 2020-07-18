import java.util.Stack;

public class Main {

    public static void main(String[] args) {

            int[][] Maze = new int[][]{
                    {1, 1, 1, 1, 0, 1, 1},
                    {0, 0, 0, 0, 0, 0,1 },
                    {1, 0, 1, 1, 1, 0,1},
                    {1, 0, 1, 0, 1, 1, 1},
                    {1, 0,  0, 0, 0, 0, 1},
                    {1, 1, 1, 1, 1, 1, 1}};

            int currentrow = 1, currentcolumn = 0;
            Stack<Integer> s_Row = new Stack<>();
            Stack<Integer> s_Column = new Stack<>();
            boolean control = false;
            int rowUp=0,rowDown=0;
            int columnUp=0,columnDown=0;

            while(control==false) {
                rowUp =currentrow+1;
                columnUp=currentcolumn+1;
                rowDown=currentrow-1;
                columnDown=currentcolumn-1;
                if (Maze[rowUp][currentcolumn] == 0) {
                    s_Row.push(currentrow);
                    s_Column.push(currentcolumn);
                    currentrow++;
                    Maze[currentrow][currentcolumn]=2;
                } else if (rowDown >= 0 && Maze[rowDown][currentcolumn] == 0) {
                    s_Row.push(currentrow);
                    s_Column.push(currentcolumn);
                    currentrow--;
                    Maze[currentrow][currentcolumn]=2;
                } else if (columnUp != 7 && Maze[currentrow][columnUp] == 0) {
                    s_Row.push(currentrow);
                    s_Column.push(currentcolumn);
                    currentcolumn++;
                    Maze[currentrow][currentcolumn]=2;
                }
                else if (columnDown>= 0 && Maze[currentrow][columnDown] == 0) {
                    s_Row.push(currentrow);
                    s_Column.push(currentcolumn);
                    currentcolumn--;
                    Maze[currentrow][currentcolumn]=2;

                }

                else {
                    if(s_Row.size()!=1){
                        currentcolumn=s_Column.pop();
                        currentrow=s_Row.pop();
                    }else {
                        currentcolumn = s_Column.peek();
                        currentrow = s_Row.peek();
                    }
                }

                if ((currentrow == 5 || currentcolumn == 6 || currentcolumn == 0 || currentrow == 0)){
                    control=true;
                    s_Row.push(currentrow);
                    s_Column.push(currentcolumn);

                }

            }

            while (!s_Column.empty()) {
                System.out.println("(" + s_Row.pop() + "," + s_Column.pop() + ")");

            }

        }


    }
