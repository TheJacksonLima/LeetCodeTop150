class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int total_papers = citations.length;
        int paper_citation = 0;
        int ret = 0;

        for (int i=0;i<total_papers;i++)
        {   
            paper_citation = total_papers - i;
            if (citations[i] >= paper_citation){
                ret = paper_citation;
                break;
            }
        }
        return ret;
        
    }
}