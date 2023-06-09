/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
import java.util.*;
public class DFSTraversal {
    private final LinkedList<Integer> adj[];
    private final boolean visited[];
    
    DFSTraversal(int v){
      adj = new LinkedList[v];
      visited = new boolean[v];
      
      for (int i=0; i<v; i++)
          adj[i] = new LinkedList<>();
    }
    
    void insertEdge(int src, int dest){
      adj[src].add(dest);
    }
    
    void DFS(int vertex){
      visited[vertex] = true;
        System.out.println(vertex +"");
        
        Iterator<Integer> it = adj[vertex].listIterator();
        while(it.hasNext()){
         int n = it.next();
         if (!visited[n])
             DFS(n);
        }
    }
    
    public static void main(String args[]){
      DFSTraversal graph = new DFSTraversal(8);
      
         graph.insertEdge(0, 1);
         graph.insertEdge(0, 2);
         graph.insertEdge(0, 3);
         graph.insertEdge(1, 3);
         graph.insertEdge(2, 4);
         graph.insertEdge(3, 5);
         graph.insertEdge(3, 6);
         graph.insertEdge(4, 7);
         graph.insertEdge(4, 5);
         graph.insertEdge(5, 2);
         
         System.out.println("Depth First Traversal for graph is: ");
         graph.DFS(0);
    }
}
