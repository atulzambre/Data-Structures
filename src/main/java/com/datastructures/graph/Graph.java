package com.datastructures.graph;

import java.util.LinkedList;

public class Graph {

        private int V;
        private LinkedList<Integer> adj[];

        Graph(int s){
            V=s;
            adj=new LinkedList[s];

            for(int i=0;i<s;i++){
                adj[i]=new LinkedList<>();
            }
        }

        void addEdge(int s, int d){
                adj[s].add(d);
        }

    public static void main(String[] args) {
        Graph g=new Graph(8);

    }
}
