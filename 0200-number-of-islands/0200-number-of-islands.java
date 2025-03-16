class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        Uf uf = new Uf(row * col);
        int count = 0;
        
        int[][] directions = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    count++; 
                    int index = i * col + j;
                    grid[i][j] = '0'; 

                    for (int d = 0; d < 4; d++) {
                        int dx = i + directions[d][0];
                        int dy = j + directions[d][1];

                        if (dx >= 0 && dx < row && dy >= 0 && dy < col && grid[dx][dy] == '1') {
                            int newIndex = dx * col + dy;
                            if (uf.union(index, newIndex)){
                                count--;
                            }
                        }
                    }
                }
            }
        }
        return count;
    }
}

class Uf {
    private int[] parent;
    private int[] rank;

    public Uf(int size) {
        parent = new int[size]; 
        rank = new int[size];   
        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    public boolean union(int a, int b) {
        int rootA = find(a);
        int rootB = find(b);
        if (rootA != rootB) {
            if (rank[rootA] > rank[rootB]) {
                parent[rootB] = rootA;
            } else if (rank[rootA] < rank[rootB]) {
                parent[rootA] = rootB;
            } else {
                parent[rootB] = rootA;
                rank[rootA]++;
            }
            return true;
        }
        return false;
    }

    public int find(int a) {
        if (parent[a] != a) {
            parent[a] = find(parent[a]);
        }
        return parent[a];
    }
}
