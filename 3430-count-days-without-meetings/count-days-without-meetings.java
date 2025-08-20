class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a,b) -> Integer.compare(a[0],b[0]));

        long covered = 0L;
        int curStart = meetings[0][0];
        int curEnd = meetings[0][1];

        for (int i=1;i < meetings.length;i++){
            int s = meetings[i][0];
            int e = meetings[i][1];

            if(s <= curEnd+1){
                curEnd = Math.max(curEnd,e);
            }
            else{
                covered +=(long) (curEnd - curStart +1);
                curStart =s;
                curEnd =e;
            }
        }
        covered += (long) (curEnd - curStart +1);
        long free = (long) days - covered;
        return (int) free;

        }
}