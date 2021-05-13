# BPlusTree
B+ Tree implementation in Java


Original at https://github.com/linli2016/BPlusTree

Order of inner nodes defined by BTreeInnerNode.INNERORDER

Order of leaf nodes defined by BTreeLeafNode.LEAFORDER
		
This tree implementation allows multiple insertions of the same key.

Searching for a specific key, will return a value, and we do not know if there are other keys with different values for the same key!

Branch PLH201 contains a Test class with some very basic insertions and deletions, and as data a Data class with 4 int data variables and overriden toString() method. Note that the Test class inserts the same key with different values. We **do not want that** for the 2020/2021 assignment! For the purpose of the assignment, we will make sure that we insert unique keys only!

# PLH201_File_Store
Branch PLH201_File_Store tries to add some skeleton classes to handle storage of nodes and data into files. We need 2 files. One jsut for the nodes, and another for the data.

THIS CODE IS NOT COMPLETE AND MAY CONTAIN ERRORS!!!

Instead of references to siblings, parents, childs etc, we use int indexes that correspond to data pages of our node file. We use int (instead of long) for these indexes.

Instead of references to data, we use byte offsets to our data file. We use int (instead of long) for these offsets.

We must access our files only with read/write accesses with specific byte array sizes!!

For our purpose we do not care to initialize a program with existing files. So we do not need to store in the node file the position to the root node. And we do not need to store in the data file the next position within the last data page that is free. We will handle those internally.

For the purpose of this assignment, when deleting a key, we do not actually delete the corresponding data from the node file and the data file. The corresponding information in the files will just become orphan, and will lead to useless data. 

We need convenient methods to
- read a data page from the node file and convert it to a node
- convert a node to a data page to a byte array (fixed size) and write it to the node file
- read a data page from the data file and convert it to data
- convert a data page to a byte array (fixed size) and write it to the file

As the same nodes will be accessed multiple times during a tree operation, we would like to minimize the reading and writing from/to the files. Thus we can use some kind of caching during each operation. We initialize the cache at the start of each operation, and flush it (for data changes) before returning the result of the operation.

We add a "dirty" flag to each node, that tells us that this node has been changed, and thus must be flushed to disk.

Each of our nodes and data classes, will know at which position in our node file or data file it is stored. So we can write it to disk in case it is dirty.

**This branch is incomplete. It does not compile. Look for comments "CHANGE FOR STORING ON FILE" to see the kind of changes needed to complete the code**. Compare with branch master under https://github.com/sksksksk/BPlusTree/compare/master...sksksksk:PLH201_File_Store
 