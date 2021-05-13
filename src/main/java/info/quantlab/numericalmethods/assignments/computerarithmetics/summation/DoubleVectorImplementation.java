package info.quantlab.numericalmethods.assignments.computerarithmetics.summation;

import info.quantlab.numericalmethods.lecture.computerarithmetics.summation.DoubleVector;

/**
 * This class deals with a numerically stable implementation of a method
 * computing the sum of the elements of an array. In particular, the Kahan
 * summation (also known as compensated summation) is used. In this way, the
 * error bound is independent of the length of the vector.
 *
 * @author Andrea Mazzon
 *
 */
public class DoubleVectorImplementation implements DoubleVector {

	private double[] vector;

	/**
	 * It constructs an object of the class in order to compute the sum of the
	 * elements of a vector of doubles. The vector is stored as an array field of
	 * the class.
	 *
	 * @param vector, the array of doubles
	 */
	public DoubleVectorImplementation(double[] vector) {
		this.vector = vector;
	}

	@Override
	public double sum() {
		double sum = 0.0;
		double error = 0.0;
		for (double element : vector) {
			/*
			 * You compensate the summation with respect to the previous error: you
			 * basically add the opposite of the error
			 */
			double value = element - error;
			double newSum = sum + value;
			error = (newSum - sum) - value;
			sum = newSum;
		}
		return sum;
	}

	@Override
	public long size() {
		return vector.length;
	}

}
