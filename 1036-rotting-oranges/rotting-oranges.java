import java.util.*;

class Solution {

    int queue_count = 0;
    int row_length = 0;
    int col_length = 0;
    int healthy = 0;
    int[][] visited = null; //if i don't know the size of the array\
    int[][] grid = null;

    public void getRottenOrange(int[][] arr, Queue<int[]> queue) {
        
        for (int i = 0; i < row_length; i++) {
            for (int j = 0; j < col_length; j++) {
                if (arr[i][j] == 2) {
                    queue.add(new int[] { i, j });
                    visited[i][j] = 2;
                    queue_count++; // i don't have to increment the count ie count++
                }
                if(arr[i][j] == 1){ //mistake : i didn't consider the empty cell
                    healthy++;
                }
            }
        }
    }

    public void putVisited(int[] rotten, int[][] track, Queue<int[]> queue) {

        int i = rotten[0];
        int j = rotten[1];

        if(i - 1 >= 0){
            if((track[i - 1][j] == 0) && (grid[i - 1][j] == 1)){ //didn't consider where orange it present or not
                track[i - 1][j] = 2;
                queue.add(new int[]{i - 1, j});
                healthy--;
                queue_count++;
            }
        }

        if(i + 1 < row_length){
            if((track[i + 1][j] == 0)  && (grid[i + 1][j] == 1)){
                track[i + 1][j] = 2;
                queue.add(new int[]{i + 1, j});
                healthy--;
                queue_count++;
            }
        }

        if(j - 1 >= 0){
            if((track[i][j - 1] == 0) && (grid[i][j - 1] == 1)){
                track[i][j - 1] = 2;
                queue.add(new int[]{i, j - 1});
                healthy--;
                queue_count++;
            }
        }

        if(j + 1 < col_length){
            if((track[i][j + 1] == 0) && (grid[i][j + 1] == 1)){
                track[i][j + 1] = 2;
                queue.add(new int[]{i, j + 1});
                healthy--;
                queue_count++;
            }
        }
    }

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        this.grid = grid;

        row_length = grid.length;
        col_length = grid[0].length;
        visited = new int[row_length][col_length];


        getRottenOrange(grid, queue);

        int count = -1;

        while (!queue.isEmpty()) {

            int temp_count = queue_count;
            queue_count = 0;

            while (temp_count > 0) {
                int[] rotten = queue.poll();
                putVisited(rotten, visited, queue);
                temp_count--;
            }

            count++;
        }

        if(healthy != 0) { //there are some oranges left unaffected
            return -1;
        }
        if(count < 0){
            return 0;
        }
        return count;
    }
}