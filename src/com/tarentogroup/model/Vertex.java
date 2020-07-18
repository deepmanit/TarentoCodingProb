package com.tarentogroup.model;

import java.util.ArrayList;
import java.util.List;

public class Vertex<T> {
    T id;
    private List<Edge<T>> edges = new ArrayList<>();
    private List<Vertex<T>> neighbours = new ArrayList<>();

     public Vertex(T id){
            this.id = id;
     }

    public void addAdjacentVertex(Edge<T> edge, Vertex<T> vertex) {
        edges.add(edge);
        neighbours.add(vertex);
    }
    
    public List<Vertex<T>> getAdjacentVertexes(){
        return neighbours;
    }

    public List<Edge<T>> getEdges(){
        return edges;
    }

    public int getOutDegree(){
        return edges.size();
    }
    public T getId() {
        return id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (int) (id.hashCode() ^ (id.hashCode() >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vertex other = (Vertex) obj;
        if (id != other.id)
            return false;
        return true;
    }
    @Override
    public String toString(){
        return String.valueOf(id);
    }

}
