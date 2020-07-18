package com.tarentogroup.model;

import java.util.*;

public class Graph<T> {

    private List<Edge<T>> edgeList;
    private Map<T,Vertex<T>> vertexMap;

    public Graph(){
        edgeList = new ArrayList<Edge<T>>();
        vertexMap = new HashMap<T,Vertex<T>>();

    }
    public void addEdge(T id1, T id2){

        vertexMap.put(id1,vertexMap.getOrDefault(id1,new Vertex<T>(id1)));
        vertexMap.put(id2,vertexMap.getOrDefault(id2,new Vertex<T>(id2)));
        Vertex<T> vertex1 = vertexMap.get(id1);;
        Vertex<T> vertex2 = vertexMap.get(id2);;
        Edge<T> edge = new Edge<T>(vertex1,vertex2);
        edgeList.add(edge);
        vertex1.addAdjacentVertex(edge, vertex2);
    }

    public Collection<Vertex<T>> getAllVertex(){
        return vertexMap.values();
    }

    public Vertex<T> getVertex(T id){
        return vertexMap.get(id);
    }

    public List<Edge<T>> getEdgesList(){
        return edgeList;
    }

    @Override
    public String toString(){
        StringBuffer buffer = new StringBuffer();
        for(Edge<T> edge : getEdgesList()){
            buffer.append(edge.getSourceVertex() + " " + edge.getDestVertex() );
            buffer.append("\n");
        }
        return buffer.toString();
    }
}
