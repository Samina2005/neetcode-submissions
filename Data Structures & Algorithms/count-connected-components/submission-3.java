class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[]edge:edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[]v = new boolean[n];
        int comp =0;

        for(int i=0;i<n;i++){
            if(!v[i]){
                dfs(graph,v,i);
                comp++;
            }
        }
        return comp;
    }

    private void dfs(List<List<Integer>>graph, boolean[]visited,int node){
        visited[node]= true;

        for(int nb:graph.get(node)){
            if(!visited[nb]){
                dfs(graph,visited,nb);
            }
        }
    }
}
