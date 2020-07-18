# TarentoCodingProb

You are given a DAG (Directed Acyclic Graph) which may be disjointed (this
represents courses in a university that must be taken in a particular order, but
may represent different streams). For each such graph, generate all possible
paths that originate from a particular node. For example, in the following graph
assume that all edges point downward


1

/ \ \  \

2 3  4 5 

\ |\ |\|

  6  7  8
  
  
  
You should generate following path from “1”

● 1 -> 2 -> 6

● 1 -> 3 -> 7

● 1 -> 3 -> 6

● 1 -> 4 -> 7

● 1 -> 4 -> 8

● 1 -> 5 -> 8


You are given three strings assuming the length of each string is equal and equal to N.

P = P 1 P 2 P 3 P 4 P 5 … ……… ….. P (n-1) P n

Q = Q 1 Q 2 Q 3 Q 4 Q 5 … ……… ….. Q (n-1) Q n

R = R 1 R 2 R 3 R 4 R 5 … ……… ….. R (n-1) R n

Now mix all three strings to generate a new string S that is as follows

S = P 1 Q 1 R 1 P 2 Q 2 R 2 … ……… ….. P (n-1) Q (n-1) R (n-1) P n Q n R n

You are supposed to use “recursive” function to achieve mixing for all three string.
