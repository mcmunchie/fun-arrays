# Fun Arrays
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
## Table of Contents
+ [OneArray](https://github.com/mcmunchie/fun-arrays#onearray)
+ [TwoArray](https://github.com/mcmunchie/fun-arrays#twoarray)
+ [SubArray](https://github.com/mcmunchie/fun-arrays#subarray)
+ [RandomArray](https://github.com/mcmunchie/fun-arrays#randomarray)
+ [Fruits](https://github.com/mcmunchie/fun-arrays#fruits)

## OneArray
Creates a 1-dimensional array with *n* elements and gets the size of the array as user input. 
+ maximum size is 15 (declared as named constant)
+ fill the 1-dimensional array
+ print the 1-dimensional array
+ compute the sum and average of the elements in the array
+ compute the sum of all elements with odd indexes
+ compute the sum of all elements with even indexes

> Example output
<img src=img\one-array-part-one.png />

> Sample output (continued)
<img src=img\one-array-part-two.png />

## TwoArray
Creates a 2D array and gets the row and column size of the array as user inputs. 
+ fill the 2D array with random integers (range [MIN, MAX], declared as named constants, and MIN = 1 and MAX = 100)
+ print the 2D array
+ calculate the average of each column
+ print the averages of each column as a 1-dimensional array

> Sample output
<img src=img\two-array.png />

## SubArray
Creates a 2D array and declares the row size of 15 and column size of 20 as named constants. 
+ fill the 2D array with random integers (range [MIN, MAX], declared as named constants, and MIN = -100 and MAX = 100)
+ return `true` if all elements in the 2D array are positive and `false` otherwise (use boolean method named `allPositive`)
+ print the 2D array

> Sample output
<img src=img\subarray-part-one.png />

> Sample output (continued)
<img src=img\subarray-part-two.png />

## RandomArray
Creates an array with 20 random numbers between 1 and 100. 
+ print the array
+ print the array in reverse order
+ find the maximum element in the array
+ find the minimum element in the array

The prototype of the methods: 
``` java
public static void printArray(int arr[])
public static void printArrayReverse(int arr[])
public static int searchMax(int arr[])
public static int searchMin(int arr[])
```

Sample output
<img src=img\random-array.png />

## Fruits
Reads a list of 30 fruits from the file `"fruits.txt"`, and inserts them into a string array, and sorts the array in alphabetical order.
+ string objects can be compared using `public int compareTo(String str)` method

For example, there are two strings `str1` and `str2`:
+ if `str1>str2`, `str1.compareTo(str2)` will return positive number
+ if `str1<str2`, `str1.compareTo(str2)` will return negative number
+ if `str1==str2`, `str1.compareTo(str2)` will return 0

Example formatting: 
``` java
Before Sorting: Cherry, Honeydew, Cranberry, Lemon, Orange, Persimmon, 
Watermelon, Kiwifruit, Lime, Pomegranate, Jujube, Pineapple, Durian, Plum, 
Banana, Coconut, Apple, Tomato, Raisin, Mandarine, Blackberry, Raspberry, Peach, 
Mango, Melon, Grape, Strawberry, Blueberry, Pear, Avocado 

After Sorting: Apple, Avocado, Banana, Blackberry, Blueberry, Cherry, Coconut, 
Cranberry, Durian, Grape, Honeydew, Jujube, Kiwifruit, Lemon, Lime, Mandarine, 
Mango, Melon, Orange, Peach, Pear, Persimmon, Pineapple, Plum, Pomegranate, 
Raisin, Raspberry, Strawberry, Tomato, Watermelon
```

Sample output
<img src=img\sorting-fruits.png />

## Main
Main driver for testing each array-based class.
