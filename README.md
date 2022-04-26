# Lambda Programming Language
 
**Members:**

Polina Minina - implements type checker, implements compiler <br /> 
Amina Khusnutdinova - implements syntax, implements compiler <br /> 
Kseniya Evdokimova - implements syntax, implements tests <br /> 
 
## General Description:
Lambda is general-purpose functional interpreted language with support of:
- variables
- operations on base types 
- homogeneous lists
- user-defined terms and types (user-defined types are structured algebraic data types)
- auto types
- first-class functions, functions with multiple arguments
- nested definitions 
- subtyping exceptions
- standard library
 
**User-defined terms and types**

At least global, structured algebraic data types. The subtypes will be created by using “my_type” keyword, then the name of the name of the new data type, “::” sign and then the new data type will be the “synonym” of the existing type or will be composed with the Sum types of existing types


**Sequencing**

t : : = unit | t;t


**Type Ascription**

t : : = t as T


**Let-bindings**

t : : = let x = t in t


**Tuples**

t : : = {t_i} | t.i


**Records**

t : : = {d_i = t_i} | t.d


**Exceptions**

To raise an exception in our program the “try t1 with t2” structure will be used. The evaluation rules for the error will happen with the use of the call stack, which will consist of a set of activation records for the active function calls. Raising an exception causes activation records to be popped off the call stack until it becomes empty. Exceptions will hold values relying on subtyping.
 
 
## Operators:

The grammar allows infix binary notation (the placement of operators between operands). The table below presents precedences of operators:
<img width="686" alt="image" src="https://user-images.githubusercontent.com/69860125/165295850-dd094d89-522f-4dec-a5d7-66c76e8cf757.png">


## Standard Lambda Language types:
**> Bool**

The boolean type Bool is an enumeration. The basic boolean functions are && (and), || (or), and not.
type Bool  =  False | True


**> Numeric**

The numeric type will hold the integer values
Will be addressed in the program as int


**>  Characters and Strings**

The String type is an enumeration whose values represent Unicode characters. Сharacter literals are nullary constructors in the data type Char. A string is a list of characters: 
type  String  =  [Char]


**> Lists**

type  [Bool]  =  [] | (cons Bool [Bool])
Lists are an algebraic data type. 
The first constructor is the null list, and the second is “cons” - the first arg is inserted at the beginning of the list. 


**> Tuples**

Tuple type is a collection of non-homogeneous elements.
We will add more later.

## Demo program (a small application that will be written in the target language. All of the provided below are valid programs except the last one):
```
succ succ succ succ succ 0 ;

fun Int sum (Int arg1, Int arg2) 
  {return arg1 + arg2 } ;

fun Int min (Int arg1, Int arg2) 
  {if arg1 < arg2 then return arg1
  else return arg2} ;

my_type my_int :: Int
fun Int min (my_int arg1, Int arg2) 
  {if arg1 < arg2 then return arg1
  else return arg2}
(fun Bool odd? (Int arg) {return (if (equal? (mod arg 2) 0) then False else True)})

# raises an exception
(try (if (length `[1, 3, 2, 5, 6]) then False else True) with false)
# Not a valid program:
(my_type invalid_type :: Int bool)
(fun some_unvalid_funct (arg) 
  {return (if 0 1 
    then (False + True) 
    else `[`[2, 3, “a”], 13, 25, `[]])})
```

