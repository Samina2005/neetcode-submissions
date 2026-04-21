class Solution {
    public int countComponents(int n, int[][] edges) {
        int[] parent = new int[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
        }

        int comp =n;
        for(int[]edge:edges){
            if(union(parent,edge[0],edge[1])){
                comp--;
            }
        }
        return comp;
        
    }

    private int find(int[]parent,int x){
        if(parent[x]!=x){
            parent[x] = find(parent,parent[x]);
        }
        return parent[x];
    }

    private boolean union(int[]parent,int x,int y){
        int rootX = find(parent,x);
        int rootY = find(parent,y);

        if(rootX== rootY)return false;
        parent[rootX]= rootY;
        return true;
    }
}
