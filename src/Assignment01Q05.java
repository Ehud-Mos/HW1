public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        if(i == j){return 0;}
        int[] queue = new int[m.length];
        int head = 0;
        int tail = 0;
        int[] distances = new int[m.length];
        for (int k = 0; k < distances.length; k++){distances[k] = -1;}
        distances[i] = 0;
        queue[tail] = i;
        tail ++;
        while(head < tail)
        {
            int cur = queue[head];
            head ++;
            if(cur == j) {return distances[cur];}
            else
            {
                for(int k = 0; k < m.length; k++){
                    if(m[cur][k] == 1 && distances[k] == -1){
                        distances[k] = distances[cur] + 1;
                        queue[tail] = k;
                        tail++;
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}