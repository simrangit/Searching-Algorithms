# Searching-Algorithms

1. Linear Search
The algorithm performs search on an array and compares each element one by one. The algorithm terminates as soon as it encounters the element and return the specified position, where an element is present. Else, it prints that number does not exist in an array. 

The linear search linearly checks for all elements one by one starting from index 0, and hence complexity of O(n).

2. Binary Search (Array must be sorted)
The algorithm performs search on an array when an array is sorted. Search a sorted array by repeatedly dividing the search interval in half. Begin with an interval covering the whole array. If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half. Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.

The idea of binary search is to use the information that the array is sorted and reduce the time complexity to O(Log n/2).
