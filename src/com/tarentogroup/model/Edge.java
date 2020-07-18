package com.tarentogroup.model;

public class Edge<T> {



    private Vertex<T> sourceVertex;
    private Vertex<T> destVertex;

    Edge(Vertex<T> vertex1, Vertex<T> vertex2){
        this.sourceVertex = vertex1;
        this.destVertex = vertex2;
    }
    public Vertex<T> getSourceVertex() {
        return sourceVertex;
    }

    public Vertex<T> getDestVertex() {
        return destVertex;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((sourceVertex == null) ? 0 : sourceVertex.hashCode());
        result = prime * result + ((destVertex == null) ? 0 : destVertex.hashCode());
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
        Edge other = (Edge) obj;
        if (sourceVertex == null) {
            if (other.sourceVertex != null)
                return false;
        } else if (!sourceVertex.equals(other.sourceVertex))
            return false;
        if (destVertex == null) {
            if (other.destVertex != null)
                return false;
        } else if (!destVertex.equals(other.destVertex))
            return false;
        return true;
    }
    @Override
    public String toString(){
        return "Edge [Source vertex=" + sourceVertex
                + ", Dest vertex =" + destVertex + "]";
    }

}
