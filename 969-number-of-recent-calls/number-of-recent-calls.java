class RecentCounter {

    // It like sliding window

    Queue<Integer> queue;

    public RecentCounter() {
        queue = new LinkedList<>();
    }
    
    public int ping(int t) {
        queue.add(t);
        int left_range = t - 3000;
        if(left_range > 0){
            int firstVal = queue.peek();
            while(!queue.isEmpty() && left_range > firstVal){
                queue.remove();
                firstVal = queue.peek();
            }
        }
        return queue.size();
    }
}