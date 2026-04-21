class Solution {
    public boolean validTree(int n, int[][] edges) {
        if(edges.length != n-1){
            return false;
        }

        int[]parent = new int[n];

        for(int i=0;i<n;i++){
            parent[i] = i;
        }

        for(int[]edge:edges){
            int rootX = find(parent,edge[0]);
            int rootY = find(parent,edge[1]);

            if(rootX == rootY) return false;
            parent[rootX] = rootY;
        }
        return true;
    }
    private int find(int[]parent,int x){
        if(parent[x]!=x){
            parent[x] = find(parent,parent[x]);
        }
        return parent[x];
    }
}
