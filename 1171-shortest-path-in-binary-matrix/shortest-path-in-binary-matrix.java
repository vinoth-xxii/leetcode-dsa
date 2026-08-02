class Solution {

    public void addingAdjacent(Queue<int[]> queue, int[][] grid, int[] arr, Set<String> visited){
        //adding elements present in the south-east triangle
        int i = arr[0];
        int j = arr[1];

        j++;
        if(j < grid[0].length && grid[i][j] == 0 && !visited.contains(i + "" + j)){
            queue.add(new int[]{i , j});
            visited.add(i + "" + j);
            //j--; //will this affect globally
        }
        j--;

        j--;
        if(j >= 0 && grid[i][j] == 0 && !visited.contains(i + "" + j)){
            queue.add(new int[]{i , j});
            visited.add(i + "" + j);
        }
        j++;
        
        i++;
        if(i < grid.length && grid[i][j] == 0 && !visited.contains(i + "" + j)){
            queue.add(new int[]{i, j});
            visited.add(i + "" + j);
        }
        i--;

        i--;{
            if(i >= 0 && grid[i][j] == 0 && !visited.contains(i + "" + j)) {
                queue.add(new int[]{i , j});
                visited.add(i + "" + j);
            }
        }
        i++;

        i++; j++; //North-east
        if(i < grid.length && j < grid[0].length && grid[i][j] == 0 && !visited.contains(i + "" + j)){
            queue.add(new int[]{i, j});
            visited.add(i + "" + j);
        }
        i--; j--;

        i--; j--; //south-west
        if(i >= 0 && j >= 0 && grid[i][j] == 0 && !visited.contains(i + "" + j)){
            queue.add(new int[]{i , j});
            visited.add(i + "" + j);
        }
        i++; j++;

        i++; j--; //North-west
        if(i < grid.length && j >= 0 && grid[i][j] == 0 && !visited.contains(i + "" + j)){
            queue.add(new int[]{i,j});
            visited.add(i + "" + j);
        }
        i--; j++;

        i--; j++; //south-east
        if( i >= 0 && j < grid[0].length && grid[i][j] == 0 && !visited.contains(i + "" + j)){
            queue.add(new int[]{i,j});
            visited.add(i + "" + j);
        }
        i++; j--;

    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        if(grid[0][0] != 0) return -1;
        queue.add(new int[]{0,0});
        visited.add(0 + "" + 0);
        int stage = 0;

        while(!queue.isEmpty()){
            int count_atStage = queue.size();

            while(count_atStage > 0){ 
                int[] current = queue.poll();
                int i = current[0];
                int j = current[1];

                if(i == grid.length -  1 && j == grid[0].length - 1){
                    return stage + 1;
                }
                
                addingAdjacent(queue, grid, current, visited);
                count_atStage--;
            }

            stage++; //sudden confusion will this update globally?
        }

        return -1;
    }
}

/*how much tikes will this be getting excured? 
based on the size of the existing call queue, the size does varies
but that being said, it would affect the size determined already and 
wiil be updated or made to check in the next stage only
*/