class Solution {

    public String getValue(int i, int j){
        //return Integer.toString(i) + Integer.toString(j);
        return i + "," + j;
    }

    public int[][] doBfs(int[][] mat, Queue<int[]> queue, Set<String> visited){

        int level_count = 1; //0th distance are already in the queue        

        /* NOTE: what ever was added in the queue is visited/explored
        */
        while(!queue.isEmpty()){
            
            int no_of_elements_in_level = queue.size();
            
            for(int k = 0; k < no_of_elements_in_level; k++){
                
                int[] address = queue.poll();
                int i = address[0];
                int j = address[1];
               
                i--;
                if(i >= 0 && !visited.contains(getValue(i, j))){
                    mat[i][j] = level_count;
                    visited.add(getValue(i, j));
                    queue.add(new int[]{i, j});
                }
                i++;

                i++;
                if(i < mat.length && !visited.contains(getValue(i, j))){
                    mat[i][j] = level_count;
                    visited.add(getValue(i, j));
                    queue.add(new int[]{i, j});
                    
                }
                i--;

                j--;
                if(j >= 0 && !visited.contains(getValue(i, j))){
                    mat[i][j] = level_count;
                    visited.add(getValue(i, j));
                    queue.add(new int[]{i, j});
                }
                j++;

                j++;
                if(j < mat[0].length && !visited.contains(getValue(i, j))){
                    mat[i][j] = level_count;
                    visited.add(getValue(i, j));
                    queue.add(new int[]{i, j});
                }
                j--;
            }
            level_count++;
        }
    return mat;
    }



    public int[][] updateMatrix(int[][] mat) {

        Queue<int[]> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        for(int i = 0; i <  mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 0){
                    queue.add(new int[]{i, j});
                    visited.add(getValue(i, j));
                }
            }
        }

        mat = doBfs(mat, queue, visited);
        return mat;
    }
}