<img src="https://travis-ci.org/jradbayrem/FooBarQix.svg?branch=master" alt="Build Status" />

# Statement

You should implement a function String compute(String) which implements the following rules.

## Step 1

### Rules

- If the number is divisible by 3, write “Foo” instead of the number

- If the number is divisible by 5, add “Bar”

- If the number is divisible by 7, add “Qix”

- For each digit 3, 5, 7, add “Foo”, “Bar”, “Qix” in the digits order.



### Examples

```bash
1  => 1
2  => 2
3  => FooFoo (divisible by 3, contains 3)
4  => 4
5  => BarBar (divisible by 5, contains 5)
6  => Foo (divisible by 3)
7  => QixQix (divisible by 7, contains 7)
8  => 8
9  => Foo
10 => Bar
13 => Foo
15 => FooBarBar (divisible by 3, divisible by 5, contains 5)
21 => FooQix
33 => FooFooFoo (divisible by 3, contains two 3)
51 => FooBar
53 => BarFoo
```

## Step 2
We have a new business request : we must keep a trace of 0 in numbers, each 0 must be replace par char “*“.

### Examples

```bash
### Examples

```bash
1  => 1
2  => 2
3  => FooFoo (divisible by 3, contains 3)
4  => 4
5  => BarBar (divisible by 5, contains 5)
6  => Foo (divisible by 3)
7  => QixQix (divisible by 7, contains 7)
8  => 8
9  => Foo
10 => Bar
13 => Foo
15 => FooBarBar (divisible by 3, divisible by 5, contains 5)
21 => FooQix
33 => FooFooFoo (divisible by 3, contains two 3)
51 => FooBar
53 => BarFoo
```

# Implementation

As technologies we will use:
```
- Java 8: As a development platform
- Git: As version management tool
- Maven: As a building Tool
- Travis: As a build management Tool 
```


## Implementation Reviews

### Review 1

After finishing the Step 2, we made a review and we decided to refactor the code and implement the Strategy Design Pattern by:

- Creating a common Strategy interface that defines a compute method

- Creating a ContainsStrategy and DivideStrategy that implements the common interface and apply the needed filter

- Creating a FooBarQixStrategy that implements the common interface and accept an Array of strategies to execute them

### Review 2

Once finished, we realized that the strategy pattern made our code more complex. And we concluded that it is more oriented to be divided into components rather than strategies. So we implemented the Composite Design Pattern by:

- Creating a base component interface 

- Creating two leaves (Divide and Contains)

- Creating the Computing composite.



# Run

To run the project you need to open the command line.
Navigate to the specified directory in which you want to download the project.

Download the project using the next command:

```bach
git clone https://github.com/jradbayrem/FooBarQix.git
```

Run

```bach
mvn test
```

