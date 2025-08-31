import java.util.PriorityQueue;

class Solution {
    public static class Edge implements Comparable<Edge> {
        int dest;
        int cost;

        public Edge(int d, int c) {
            this.dest = d;
            this.cost = c;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.cost - e2.cost; //ascending order
        }
    }

    public int minimumCost(int cities[][]) {
        int finalCost = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        boolean visited[] = new boolean[cities.length];

        pq.add(new Edge(0, 0));

        while (!pq.isEmpty()) {
            Edge curr = pq.remove();
            if (!visited[curr.dest]) {
                visited[curr.dest] = true;
                finalCost += curr.cost;

                for (int i = 0; i < cities.length; i++) {
                    if (cities[curr.dest][i] != 0) {
                        Edge e = new Edge(i, cities[curr.dest][i]);
                        pq.add(e);
                    }
                }
            }
        }

        return finalCost;
    }
}
