class MinimumMoves {
    public int minimumMoves(String s) {
        char[] temp = s.toCharArray();
        int out = 0;

        for(int i=0; i<temp.length-2; i++){
            if(temp[i]!='O'){
                out++;
                temp[i] = 'O';
                temp[i+1] = 'O';
                temp[i+2] = 'O';
            }
        }
        int len = temp.length;
        if(temp[len-2]!='O' || temp[len-1]!='O'){
            out++;
        }
        return out;
    }
}
