# DSAJ Notes

## Chapter 2 - Arrays and Big O
Insertion in an unordered array is O(1), insertion into ordered arrays is O(N)

Linear Search of an unsorted array is O(N)

Binary Search of a sorted array is O(log N)

Deletion in un/ordered array is O(N)

### Big O Basics
O(1) - constant time (Perfect)

O(log n) - logarithmic time (pretty good)

O(n) - Linear time (ok)

O(n log n) - linearithmic time (meh)

O(n^2) - quadratic time (bad)

O(c^n) - exponential time (really bad)

O(n!) - factorial time - (the worst)

## Chapter 3 - Simple Sorting Algos
###Bubble Sort
For each iteration the largest unsorted value is 'bubbled up' to its sorted place

Runs in O(n^2) time

Makes comparisons for all unsorted elements on each iteration, swaps occur as required to continue bubbling up
###Selection Sort
Reduces swaps compared to Bubble Sort from O(n^2) to O(n), however the comparisons are still O(n^2)

On each iteration find the smallest unsorted value, and then perform a single swap to place that value in the correctly
sorted postion 

###Insertion Sort
Usually the best of the basic sorting algorithms - roughly 2x faster than Bubble Sort and usually faster than Selection Sort.
It still runs in O(n^2) time.  Works well with partially sorted data, however if something 100% inversely sorted, then 
Insertion sort is equal to Bubble Sort.

Insertion sort results in a partially sorted list as it runs. For each iteration the marked value is inserted so that 
everything to the left of its initial position is sorted, everything to the right remains unsorted.

## Chapter 4 - Stacks and Queues
###Stack
Last In, First Out (LIFO) - Typical interface is Push, Pop, Peek
Push and Pop run in O(1)

###Queue
First In, First Out (FIFO) - Typical interface is Insert, Remove, Peek

###Deques
A double ended Queue - insert / remove from either end.  Restriction operations can make it behave like Stack, Queue etc.
Not as common

###Priority Queue
Similar to a normal queue in terms of interface, however items are sorted according to a key value.  Depending on function
the lowest or highest keys will be removed first.
Big O of insertion can depend on underlying implementation and data structure used to represent the queue.  Removal
remains O(1).

##Chapter 5 - Linked Lists
###Standard Linked List
Common data structure - Typical interface is Insert, Remove, Display, Find, Is Empty
Reference maintained to the head of the list.  Because of this insertion and removal from the head of the list is O(1).
Find, Delete specific, insert in specific spot are O(n).
Advantage over Arrays is that memory footprint is improved, as space does not need to be allocated for it at creation time.
Stacks and Queues can be implemented using Linked Lists.

###Double-Ended Linked List
Similar to standard linked list, however references are maintained with the Head and Tail of the list.
This opens up additional methods to the interface: InsertFirst, InsertLast, DeleteFirst, DeleteLast

###Doubly Linked List
References are maintained to both previous and next items in the list

