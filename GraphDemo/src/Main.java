public class Main {

    public static void main(String[] args) {
        Graph g = new Graph();
        init(g);
        System.out.print("DFS: ");
        g.DFS(1);
        System.out.println();
        System.out.print("BFS: ");
        g.BFS(1);
    }

    public static void init(Graph g) {
        for(int i = 1; i <= 9; i++) {
            g.addVertex(i);
        }
        g.addEdge(1, 2);
        g.addEdge(1, 6);
        g.addEdge(2, 3);
        g.addEdge(2, 7);
        g.addEdge(2, 9);
        g.addEdge(3, 4);
        g.addEdge(3, 9);
        g.addEdge(4, 5);
        g.addEdge(4, 7);
        g.addEdge(4, 8);
        g.addEdge(4, 9);
        g.addEdge(5, 6);
        g.addEdge(5, 8);
        g.addEdge(6, 7);
        g.addEdge(7, 8);
    }

}
