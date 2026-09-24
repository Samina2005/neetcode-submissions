class Solution {
    public int numIslands(char[][] grid) {
        int count =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    count++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }

    public static void dfs(char[][]g,int r, int c){
        if(r<0 || c<0||r>=g.length ||c>=g[0].length ||g[r][c]!='1'){
            return;
        }
        g[r][c]='0';
        dfs(g,r+1,c);
        dfs(g,r-1,c);
        dfs(g,r,c+1);
        dfs(g,r,c-1);
    }
}
