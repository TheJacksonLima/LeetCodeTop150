class Solution {

    private void merge_rec(int [][]a, int i, int[] curr, List<int[]> out){
          if (i == a.length){
            out.add(curr);
            return;
          }

          int [] next = a[i];
          if(overlap(curr,next)){
            curr = merge_aux(curr,next);
          }
          else{
            out.add(curr);
            curr=next;
          }

          merge_rec(a,i+1,curr,out);
    }

    private boolean overlap(int []x, int y[]){
        return x[1]>=y[0];
    }

    private int[] merge_aux(int []x, int y[]){
        return new int [] { Math.min(x[0],y[0]), Math.max(x[1],y[1])};
    }


    public int[][] merge(int[][] intervals) {
        if ((intervals == null) || (intervals.length == 0)) return new int [0][2];

        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));

        List<int[]> out = new ArrayList<>();
        merge_rec(intervals,1,intervals[0],out);
        return out.toArray(new int[out.size()][]);

     }   
}