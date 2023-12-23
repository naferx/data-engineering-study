## MapReduce: Simplified Data Processing on Large Clusters

### Abstract
MapReduce is a programming model for processing large datasets.

It is based on an abstraction that provides the map and reduce operations allows to distribute and parallelize large computations.


The runtime takes care of the details of partitioning the input data, scheduling the program's execution across a set of machines, handling machine fauilures, and managing the required inter-machine communication.


### Introduction
The input data is usually large and the computations have to be distributed across hundreds or thousands of machines in order to finish in a reasonable amount of time.

The MapReduce abstraction hides details of parallelization, fault tolerance, data distribution and load balancing. Computations that involve applying a map operation to each logical record in the input in order to compute a set of intermediary key/value pairs, and then applying a reduce operation that share the same key. 


### Fault tolerance
Re-execution as the primary mechanism for fault tolerance.


### Questions
