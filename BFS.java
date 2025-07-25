import java.util.*;

public class BFSGraph {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    public BFSGraph(int v) {
        vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w) {
        adjList[v].add(w);
        // If the graph is undirected, also add reverse edge
        // adjList[w].add(v);
    }

    public void bfs(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList[vertex]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        BFSGraph graph = new BFSGraph(v);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges (from to):");
        for (int i = 0; i < e; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            graph.addEdge(from, to);
        }

        System.out.print("Enter starting vertex for BFS: ");
        int startVertex = sc.nextInt();

        graph.bfs(startVertex);

        sc.close();
    }
}
