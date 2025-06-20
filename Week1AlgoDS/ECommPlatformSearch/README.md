# Exercise 2: E-commerce Platform Search Function

##  Scenario:
Implementing efficient search functionality for an e-commerce platform by comparing Linear and Binary Search techniques.

---

##   Asymptotic Notation:
- **Big O Notation** helps analyze algorithm performance as input size grows.
- **Linear Search**:
  - Best Case: O(1) (item found at the beginning)
  - Average Case: O(n)
  - Worst Case: O(n)
- **Binary Search** (requires sorted data):
  - Best Case: O(1)
  - Average Case: O(log n)
  - Worst Case: O(log n)

---

##  Setup:
Defined a `Product` class with:
- `productId`
- `productName`
- `category`

---


##   Analysis:
- **Linear Search** is simple but slow for large datasets.
- **Binary Search** is much faster with sorted data.
- Hence, **Binary Search** is preferred for performance-critical applications like product search in e-commerce.

---

> In conclusion we can say that , Binary Search significantly improves search time with large product listings when the data is sorted.


## Input : 

productId     productName     Category       

 - 101     "Laptop"        "Electronics"
  - 102      "Table"         "Furniture"
  - 103       "Shoes"         "Fashion"
  - 104      "Headphone"      "Accessories"
  - 105       "DSLR Camera"   "Electronics"
  - 106    "Washing Machine"     "Electronics"
  
  
  



## Output : 
The output of the implementation of this exercise is :

![image](https://github.com/user-attachments/assets/50becfbf-02b2-461e-a953-75b31bae441f)
