class Solution 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if(strs.length==0)
            return "";
        int plen=0;
        while(true)
        {
            if(plen<strs[0].length())
            {
                boolean allwell=true;
                char ch=strs[0].charAt(plen);
                for(int i=1;i<strs.length;i++)
                {
                    if(plen<strs[i].length() && strs[i].charAt(plen)==ch)
                    {
                        // do nothing
                    }
                    else
                    {
                        allwell=false;
                        break;
                    }
                }
                if(allwell)
                    plen++;
                else
                    break;
            }
            else
                break;

        } 
        return strs[0].substring(0,plen);   
    }
}