class StockSpanner {

    /* I am simple using array iterations approach */

    List<Integer> list;
    int size;
    public StockSpanner() {
        list = new ArrayList<>();
    }
    
    public int next(int price) {
        list.add(price);
        size = list.size();
        int count = 0;
        int pt = size - 1;
        while(pt >= 0 && list.get(pt) <= price){
            count++;
            pt--;
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */