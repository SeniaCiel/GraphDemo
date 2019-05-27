import java.util.*;

public class Graph {

    public Map<Vertex, List<Vertex>> vertices;

    public Graph() {
        vertices = new HashMap<>();
    }

    public List<Vertex> getNeighbors(int id) {
        Vertex v = new Vertex(id);
        return this.vertices.get(v);
    }

    public void addVertex(int id) {
        Vertex v = new Vertex(id);
        vertices.putIfAbsent(v, new ArrayList<>());
    }

    public void removeVertex(int id) {
        Vertex v = new Vertex(id);
        if (vertices.containsKey(v)) {
            vertices.remove(v);
        }
    }

    public void addEdge(int id1, int id2) {
        Vertex v1 = new Vertex(id1);
        Vertex v2 = new Vertex(id2);
        vertices.get(v1).add(v2);
        vertices.get(v2).add(v1);
    }

    public void removeEdge(int id1, int id2) {
        Vertex v1 = new Vertex(id1);
        Vertex v2 = new Vertex(id2);
        vertices.get(v1).remove(v2);
        vertices.get(v2).remove(v1);
    }

    public void DFS(int root) {
        List<Integer> visited = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            int id = stack.pop();
            if (!visited.contains(id)) {
                System.out.print(id + " ");
            }
            if (!visited.contains(id)) {
                for (Vertex v : getNeighbors(id)) {
                    stack.push(v.id);
                }
                visited.add(id);
            }
        }
    }

    public void BFS(int root) {
        List<Integer> visited = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int id = queue.poll();
            if (!visited.contains(id)) {
                System.out.print(id + " ");
            }
            if (!visited.contains(id)) {
                for (Vertex v : getNeighbors(id)) {
                    queue.add(v.id);
                }
                visited.add(id);
            }
        }
    }

}
