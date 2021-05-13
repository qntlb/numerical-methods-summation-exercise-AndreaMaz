# numerical-methods-summation-exercise

This exercise is related to computer arithmetic:

## Computer Arithmetic / Machine Precision (2): Summation

1) Implement a class that implements the interface `DoubleVector` of the package `info.quantlab.numericalmethods.lecture.computerarithmetics.summation`.

*Important*: The interface you have to implement is not part of this project. It is imported
from another project that is referenced by this project. To have a look at this interface,
you can select "Open Declaration" in your IDE (right-click on the interface name) or look here:
https://github.com/qntlb/numerical-methods-lecture/blob/master/src/main/java/info/quantlab/numericalmethods/lecture/computerarithmetics/summation/DoubleVector.java

The class implementing `DoubleVector` should allow to calculate the sum of the elements of the vector in a *numerically stable way*.

*Note*: As your task is to implement the interface, read the JavaDoc of that interface for a specification of what to do.

2) When done with 1) implement the method `createDoubleVector` of the class `SummationAssignmentSolution`,
such that it allows to create an object of the class you have implemented in 1).

A class like `SummationAssignmentSolution` is called a *Factory*, because it allows to create objects. It basically allows us to create an object of *your* class, without knowing the name of your class. We will use this method to test your implementation.

*Hint*: This is a trivial task. If your class in 1) is named `DoubleVectorFromArray` and if
it has a constructor `DoubleVectorFromArray(double[] values)`, then the body of the implementation of the factory class
is just

```
  public DoubleVector createDoubleVector(double[] values) {
    return new DoubleVectorFromArray(values);
  }
```

You can test your implementation by running the unit test in `src/test/java`.

## Main Task

The main task of this exercise is to provide a *numerically stable* summation to the method `getSum`.

For large vectors or values with different sizes, naive summation may result in the accumulation of
rounding errors. Your code should avoid this.


