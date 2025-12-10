class RandomizedSet {   
    Set<Integer> h;

    public RandomizedSet() {
        this.h = new HashSet<>();
        
    }
    
    public boolean insert(int val) {
        try{
            if(this.h.contains(val))
            {
                return false;
            }

            this.h.add(val);
            return true;
        }
        catch (Exception e){
            return false;
        }
         
    }
    
    public boolean remove(int val) {
        if(this.h.contains(val))
        {
            this.h.remove(val);
            return true;
        }
        else{
            return  false;
        }
        
    }
    
    public int getRandom() {
        int size = this.h.size();
        
        if(size == 0)
        {
            return 0;
        }

        Random r = new Random();
        int i = r.nextInt(size);
        List<Integer> list_ = new ArrayList<>(this.h);
        return list_.get(i);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */