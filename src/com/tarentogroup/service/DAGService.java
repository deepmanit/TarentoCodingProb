package com.tarentogroup.service;

import com.tarentogroup.model.Graph;
import com.tarentogroup.model.Vertex;

import java.util.LinkedHashSet;
import java.util.Set;

public class DAGService<T> {

    Graph<T> graph = new Graph<>();

    public void addLink(T v1, T v2) {
        graph.addEdge(v1, v2);
    }

    public void PrintAllPathFromSource(T source) {
        Set<Vertex<T>> visited = new LinkedHashSet<Vertex<T>>();
        Vertex<T> sourceVertex = graph.getVertex(source);
        printPath(visited, sourceVertex);
    }

    private void printPath(Set<Vertex<T>> visited, Vertex<T> current) {
        if (visited.contains(current)) {
            return;
        }

        if (current.getOutDegree() == 0) {
            for (Vertex<T> v : visited) {
                System.out.print(v.getId() + " ");
            }
            System.out.println(current.getId());
            return;
        }

        visited.add(current);
        for (Vertex<T> child : current.getAdjacentVertexes()) {
            printPath(visited, child);
        }
        visited.remove(current);

    }

}
