class Solution {
    public String predictPartyVictory(String senate) {
        /* the person can ban opposition not just from the adjacent
        for that requirement we could simple use simple set 
        
        we could use another hashMap (set won't keep tack of repeated members) to detemine wherther we could add the member in the queue
        
        we could use hashmap to track the count of the party member so one could declare
        
        victory whenever possible*/

        Map<Character, Integer> senateCount = new HashMap<>();
        Map<Character, Integer> banList = new HashMap<>();
        Queue<Character> queue = new LinkedList<>();

        senateCount.put('D', 0);
        senateCount.put('R', 0);

        for(char c : senate.toCharArray()){
            queue.add(c);
            senateCount.put(c, senateCount.getOrDefault(c, 0) + 1);
            banList.put(c, 0);
        }
        

        while(!queue.isEmpty()){
            //i would have to take to as his chance is utilised in the round
            char currentSenate = queue.poll();
            if(banList.get(currentSenate) > 0){
                //just don't add him in the queue, and strip the rights and remove from the ban list
                banList.put(currentSenate, banList.get(currentSenate) - 1);
                senateCount.put(currentSenate, senateCount.get(currentSenate) - 1);
            }
            else{
                if(senateCount.get('R') <= 0 || senateCount.get('D') <= 0){
                    if(senateCount.get('R') <= 0){
                        return "Dire";
                    }
                    else{
                        return "Radiant";
                    }
                }

                else{
                    if(currentSenate == 'R') {
                        banList.put('D', banList.get('D') + 1);
                        queue.add(currentSenate);
                    }
                    else{
                        banList.put('R', banList.get('R') + 1);
                        queue.add(currentSenate);
                    }
                }
            }

        }
    return "";
    }
}