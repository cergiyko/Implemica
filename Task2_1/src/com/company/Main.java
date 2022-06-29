package com.company;

public class Main {

    public static void main(String[] args) {

        Graph graph = new Graph();//create an object of class graph

        //input of the given parameters

        graph.setS(1);
        graph.setN(4);
        graph.setRelationMatrix();// matrix is filled with maximum costs

    graph.addCity("gdansk");
        graph.setP(2);
        graph.addEdge(2, 1);
        graph.addEdge(3, 3);

    graph.addCity("bydgoszcz");
        graph.setP(3);
        graph.addEdge(1,1);
        graph.addEdge(3,1);
        graph.addEdge(4,4);

   graph.addCity("torun");
        graph.setP(3);
        graph.addEdge(1,3);
        graph.addEdge(2,1);
        graph.addEdge(4,1);

   graph.addCity("warszawa");
        graph.setP(2);
        graph.addEdge(2,4);
        graph.addEdge(3,2);

        //result output

        graph.dijkstra("gdansk","warszawa");
        graph.dijkstra("bydgoszcz","warszawa");
        }

        }


