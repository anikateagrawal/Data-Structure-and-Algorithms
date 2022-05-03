package graph;

import java.util.Scanner;

public class BellmanFord {
    static class Edge {
        int v1;
        int v2;
        int weight;

        public Edge(int v1, int v2, int weight) {
            this.v1 = v1;
            this.v2 = v2;
            this.weight = weight;
        }
    }
    static int v,e;
    public static void bellmanFord(Edge arr[],int src)
    {
        int dis[]=new int[v];
        for (int i = 0; i < v; i++) {
            dis[i]=Integer.MAX_VALUE;
        }
        dis[src]=0;
        for (int i = 1; i < v; i++) {
            for (int j = 0; j < e; j++) {
                int u=arr[j].v1;
                int v=arr[j].v2;
                int weight=arr[j].weight;
                if(dis[u]!=Integer.MAX_VALUE && dis[u]+weight<dis[v])
                    dis[v]=dis[u]+weight;
            }
        }
        for (int j = 0; j< e; j++) {
            int u=arr[j].v1;
            int v=arr[j].v2;
            int weight=arr[j].weight;
            if(dis[u]!=Integer.MAX_VALUE && dis[u]+weight<dis[v])
                return;
        }
        print(dis);
    }
    public static void print(int arr[])
    {
        System.out.println("Vertex Distance from source");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"\t\t "+arr[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // how many vertex
        v = sc.nextInt();
        // how many edges
        e = sc.nextInt();
        Edge edgearray[] = new Edge[e];
        for (int i = 0; i < e; i++) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            int weight = sc.nextInt();
            Edge obj = new Edge(v1, v2, weight);
            edgearray[i] = obj;
        }
        System.out.println("Enter source");
        bellmanFord(edgearray,sc.nextInt());
    }
}
