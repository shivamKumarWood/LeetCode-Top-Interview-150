class RandomizedSet {
    HashSet<Integer>set;
    public RandomizedSet() {
        set=new HashSet<>();
    }    
    public boolean insert(int val) {
        return set.add(val);
    }
    
    public boolean remove(int val) {
        return set.remove(val);
    }
    
    public int getRandom() {
        Integer[] arr = set.toArray(new Integer[set.size()]);
        Random rndm = new Random();
  
        // this will generate a random number between 0 and
        // HashSet.size - 1
        int rand = rndm.nextInt(set.size());
        return arr[rand];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */