
package csc402.week6;
public class UnionFind {
    private int[] parent;

    // Constructor to initialize the data structure
    public UnionFind(int size) {
        parent = new int[size];
        for (int i = 0; i < size; i++) {
            parent[i] = i; // Each element is its own parent initially
        }
    }

    // Find the root of the set containing element x
    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    // Union the sets containing elements x and y
    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX != rootY) {
            parent[rootY] = rootX; // Union by attaching rootY to rootX
        }
    }

    // Check if elements x and y are in the same set
    public boolean connected(int x, int y) {
        return find(x) == find(y);
    }

    public static void main(String[] args) {
        UnionFind uf = new UnionFind(10);

        uf.union(1, 2);
        uf.union(2, 3);
        uf.union(4, 5);

        System.out.println(uf.connected(1, 3)); // true
        System.out.println(uf.connected(1, 4)); // false

        uf.union(3, 4);

        System.out.println(uf.connected(1, 5)); // true
    }
}