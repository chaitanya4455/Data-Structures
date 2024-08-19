import java.util.*;
import java.util.Queue;
//import NSE.stack;
public class IPO {

 static class Edge{
 
   int src;
  int dest;
  Edge(int src,int dest){
    
    this.src=src;
    this.dest=dest;
  }
 }
 public static void createGraph(ArrayList<Edge> graph[]){
   for(int i=0;i<graph.length;i++){
    graph[i]= new ArrayList<Edge>();
   }
  graph[0].add(new Edge(0, 2));
  graph[2].add(new Edge(2, 0));
  graph[2].add(new Edge(2, 3));
  graph[2].add(new Edge(2, 1));
  graph[3].add(new Edge(3, 2));
  graph[3].add(new Edge(3, 1));
  graph[1].add(new Edge(1, 2));
  graph[1].add(new Edge(1, 3));
 }
 public static void BFS(ArrayList<Edge> graph[]){
Queue <Integer>q= new LinkedList<>();
boolean vis[]= new boolean[4];
q.add(0);
while (!q.isEmpty()) {
  int curr = q.remove();
  if(vis[curr]==false){
    System.out.println(curr);
  vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
      Edge e = graph[curr].get(i);
      q.add(e.dest);
    }
  }
}

 }
 public static void DFS (ArrayList <Edge> graph[],int curr,boolean vis[]){
System.out.println(curr+" ");
vis[curr]=true;
  for(int i=0;i<graph[curr].size();i++){
    Edge e = graph[curr].get(i);
    if(vis[e.dest] == false){
    DFS(graph, e.dest, vis);
  }
}
 }
 public static void StoD (ArrayList <Edge> graph[],int curr,boolean vis[],int dest){
  System.out.println(curr+" ");
  vis[curr]=true;
  if (curr != dest) {
    
  
    for(int i=0;i<graph[curr].size();i++){
      Edge e = graph[curr].get(i);
      if(vis[e.dest] == false){
      DFS(graph, e.dest, vis);
    }
  }
}
   }



  public static void main(String[] args) {
  
 ArrayList <Edge>  graph[] = new ArrayList[5];
createGraph(graph);
/*for(int i=0;i<graph[2].size();i++){
  //System.out.println(graph[2].get(i).dest);
}
//BFS(graph);*/
boolean vis[]= new boolean[4];
int curr= graph[0].get(0).src;
int dest = 2;
//System.out.println(curr);
//DFS(graph, curr, vis);
StoD(graph, curr, vis,dest);
  }
}