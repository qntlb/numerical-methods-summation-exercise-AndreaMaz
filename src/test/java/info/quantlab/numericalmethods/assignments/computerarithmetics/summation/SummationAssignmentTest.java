package info.quantlab.numericalmethods.assignments.computerarithmetics.summation;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import info.quantlab.numericalmethods.assignments.computerarithmetics.check.DoubleVectorImplemenationChecker;
import info.quantlab.numericalmethods.lecture.computerarithmetics.summation.DoubleVectorFactory;

public class SummationAssignmentTest {

	@Test
	void testBasicFunctionality() {
		DoubleVectorFactory solution = new SummationAssignmentSolution();
		
		System.out.println("Testing basic functionality of " + solution.getClass().getCanonicalName());
		
		boolean success = DoubleVectorImplemenationChecker.check(solution, "basic");

		if(!success) {
			System.out.println("Sorry, the test failed.");
		}
		else {
			System.out.println("Congratulation! You solved the basic part of the exercise.");
		}

		System.out.println("_".repeat(79));

		if(!success) fail();
	}

	@Test
	void testAccuracy() {
		DoubleVectorFactory solution = new SummationAssignmentSolution();
		
		System.out.println("Testing accuracy of " + solution.getClass().getCanonicalName());
		
		boolean success = DoubleVectorImplemenationChecker.check(solution, "accuracy");

		if(!success) {
			System.out.println("Sorry, the test failed.");
		}
		else {
			System.out.println("Congratulation! You solved the accuracy part of the exercise.");
		}

		System.out.println("_".repeat(79));

		if(!success) fail();
	}
}
