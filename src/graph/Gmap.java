package graph;

import java.util.*;

public class Gmap {
    Map<Emp, LinkedList<Emp>> gmap;

    public Gmap() {
        gmap=new HashMap<>();
    }
    public void add(Emp v1,Emp v2,boolean b)
    {
        LinkedList<Emp> n=gmap.getOrDefault(v1,new LinkedList<Emp>());
        n.add(v2);
        gmap.put(v1,n);
        if(b)
        {
            LinkedList<Emp> n2=gmap.getOrDefault(v2,new LinkedList<Emp>());
            n2.add(v1);
            gmap.put(v2,n2);
        }
    }
    public void print()
    {
        for (Map.Entry<Emp,LinkedList<Emp>> e:gmap.entrySet()
             ) {
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    public void bfsTraverse(Emp source)
    {
        Queue<Emp> bfs=new LinkedList<>();
        bfs.add(source);
        Set<Emp> visited=new HashSet<>();
        visited.add(source);
        while(!bfs.isEmpty())
        {
            Emp front=bfs.poll();
            System.out.println(front);
            LinkedList<Emp> n=gmap.get(front);
            for (Emp i:n ) {
                if(!visited.contains(i))
                {
                    bfs.add(i);
                    visited.add(i);
                }
            }
        }
    }
    public void ssspByBfs(Emp source)
    {
        Queue<Emp> bfs=new LinkedList<>();
        bfs.add(source);
        Map<Emp,Integer> dis=new HashMap<>();
        for (Emp i:gmap.keySet()
             ) {
            dis.put(i, Integer.MAX_VALUE);
        }
        dis.put(source,0);
        while(!bfs.isEmpty())
        {
            Emp front=bfs.poll();
            LinkedList<Emp> n=gmap.get(front);
            for (Emp i:n ) {
                if(dis.get(i)==Integer.MAX_VALUE)
                {
                    bfs.add(i);
                    int distance=dis.get(front)+1;
                    dis.put(i,distance);
                    System.out.println("Distance of "+i+" from source "+source+" is "+distance);
                }
            }
        }
    }
}
