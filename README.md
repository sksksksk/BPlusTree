# BPlusTree
B+ Tree implementation in Java


Original at https://github.com/linli2016/BPlusTree

Order of inner nodes defined by BTreeInnerNode.INNERORDER

Order of leaf nodes defined by BTreeLeafNode.LEAFORDER
		
This tree implementation allows multiple insertions of the same key.

Searching for a specific key, will return a value, and we do not know if there are other keys with different values for the same key!

Branch PLH201 contains a Test class with some very basic insertions and deletions, and as data a Data class with 4 int data variables and overriden toString() method. Note that the Test class inserts the same key with different values. We **do not want that** for the 2020/2021 assignment! For the purpose of the assignment, we will make sure that we insert unique keys only! 