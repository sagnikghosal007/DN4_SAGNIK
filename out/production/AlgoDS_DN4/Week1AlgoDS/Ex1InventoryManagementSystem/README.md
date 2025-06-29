## Why DSA is important?

In a warehouse, quick addition, lookup, and modification of products are critical. Efficient data structures like HashMap provide O(1) average-time complexity for such operations.

DataStructures which are suitable are : 
ArrayList and HashMap

## Input

The input objects are initialised as :
Product p1 = new Product("P1","TShirt",100,799);
-Product p2 = new Product("P2","Kurta",34,1899);
-Product p3 = new Product("P3","Crop Top",67,1299);
-Product p4 = new Product("P4","Saree",23,4599);


## Output 

The output of Inventory Management System:

![image](https://github.com/user-attachments/assets/472d56cb-76c2-4758-a5ea-92c23a8e688c)






## Analysis


Time Complexities (using HashMap):

-Add: O(1)

-Update: O(1)

-Delete: O(1)

-Lookup: O(1)

Optimization Tips:

-Use ConcurrentHashMap for multi-threaded environments.

-Use validation for duplicate productId.
