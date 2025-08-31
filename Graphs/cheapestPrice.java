import java.util.*;

class Solution {
    static class Edge {
        int src, dest, cost;
        public Edge(int s, int d, int c){
            this.src = s;
            this.dest = d;
            this.cost = c;
        }
    }

    static class Info {
        int v, cost, stops;
        public Info(int v, int cost, int stops){
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public void createGraph(ArrayList<Edge>[] graph, int[][] flights){
        for (int i = 0; i < flights.length; i++){
            int source = flights[i][0];
            int destination = flights[i][1];
            int cost = flights[i][2];
            graph[source].add(new Edge(source, destination, cost));
        }
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = (ArrayList<Edge>[]) new ArrayList[n];
        for (int i = 0; i < n; i++){
            graph[i] = new ArrayList<>();
        }

        createGraph(graph, flights);

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0)); // src, cost=0, stops=0

        while (!q.isEmpty()){
            Info curr = q.remove();

            if (curr.stops > k) continue;

            for (Edge e : graph[curr.v]) {
                int v = e.dest;
                int wt = e.cost;

                if (curr.cost + wt < dist[v]) {
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v, dist[v], curr.stops + 1));
                }
            }
        }

        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
    }
}
