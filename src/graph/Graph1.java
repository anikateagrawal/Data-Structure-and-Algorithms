package graph;
import java.util.*;
public class Graph1 {
    HashMap<Integer, List<Integer>>obj;
    public Graph1()
    {
        obj = new HashMap<Integer,List<Integer>>();
    }

    // Single Source Shortest Path using BFS

    public void sssp(int src)
    {
        Queue<Integer> bfs= new LinkedList<>();
        bfs.add(src);
        Map<Integer,Integer>dis = new HashMap<>();
        for(int vertex : obj.keySet()) {
            dis.put(vertex, Integer.MAX_VALUE);
        }
        dis.put(src,0);
        while(!bfs.isEmpty()) {
            int front = bfs.poll();
            List<Integer> neighbourlist = obj.get(front);
            for (int neighbour : neighbourlist) {
                if(dis.get(neighbour)==Integer.MAX_VALUE)
                {
                    bfs.add(neighbour);
                    int distance = dis.get(front)+1;
                    dis.put(neighbour,distance);

                    System.out.println("Distance of "+ neighbour+ " from source "+ src+ " is=  "+distance );
                }
            }
        }
    }
    // BFS Traversal uses Queue DS
    // Level Order Traversal
    public void bfs(int src)
    {
        Queue<Integer> bfs= new LinkedList<>();
        bfs.add(src);
        Set<Integer>vis = new HashSet<>();
        vis.add(src);
        while(!bfs.isEmpty()) {
            int front = bfs.poll();
            System.out.print(front + " ");
            List<Integer> neighbourlist = obj.get(front);
            for (int neighbour : neighbourlist) {
                if (!vis.contains(neighbour)) {
                    bfs.add(neighbour);
                    vis.add(neighbour);
                }
            }
        }
    }
    // Graph Creation Method

    public void addedge(int source, int desti, boolean isbidirection)
    {
        List<Integer> sourceneighbour=obj.getOrDefault(source,new ArrayList<>());
        sourceneighbour.add(desti);
        obj.put(source,sourceneighbour);
        if(isbidirection)
        {
            List<Integer>destineighbour = obj.getOrDefault(desti,new ArrayList<>());
            destineighbour.add(source);
            obj.put(desti,destineighbour);
        }
    }
    public void display()
    {
        for (Map.Entry<Integer,List<Integer>> entry:obj.entrySet()) {
            System.out.println(entry.getKey() + "   " +entry.getValue());

        }
    }


    // DFS Traversal of Graph by using recursion
    public void Dfs(int source)
    {
        Set<Integer>vis = new HashSet<>();
        DfsHelper(source,vis);
    }
    public void DfsHelper(int source,Set<Integer>vis)
    {
        System.out.print(source+ " ");
        vis.add(source);
        List<Integer>neighbourlist = obj.get(source);
        for(int neighbour : neighbourlist)
        {
            if(!vis.contains(neighbour))
            {
                DfsHelper(neighbour,vis);
            }
        }
    }
    public static void main(String[] args) {
        Graph1 obj = new Graph1();
        obj.addedge(1,2,true);
        obj.addedge(1,4,true);
        obj.addedge(2,3,true);
        obj.addedge(3,4,true);
        obj.addedge(3,5,true);
        obj.addedge(5,6,true);
        System.out.println("Graph Details");
        obj.display();
        System.out.println("BFS Traversal");
        obj.bfs(1);
        System.out.println("\nDFS Traversal ");
        obj.Dfs(1);
        System.out.println("\nSSSP details ");
        obj.sssp(4);

    }
}