import java.util.ArrayList;
public class Basics {
	public static void main(String[] args) {
		// print 1 to 255
		for(int i=1; i<=255; i++) {
			System.out.println(i);
		}

		// print odds from 1 to 255
		for(int i=1; i<=255; i+=2) {
			System.out.println(i);
		}

		// print sum
		int sum = 0;
		for(int i=1; i<=255; i++) {
			sum +=i;
		}
		System.out.println(sum);

		// print all elements within given array
		int[] x = {1, 3, 5, 7, 9, 13};
		for(int i=0; i<x.length; i++) {
			System.out.println(x[i]);
		}

		// print Max of array
		int[] maxOfArray = {-3, 4, -87, 77, 5};
		int max = maxOfArray[0];
		for(int i=0; i<maxOfArray.length; i++) {
			if(maxOfArray[i] > max) {
				max = maxOfArray[i];
			}
		}
		System.out.println(max);

		// prints Average of values within array
		int[] average = {2, 5, -7, 20};
		int sum2 = 0;
		for(int i=0; i<average.length; i++) {
			sum2 += average[i];
		}
		int mean = sum2/average.length;
		System.out.println(mean);

		// creates array with odd numbers between 1 and 255
		ArrayList<Integer> y2 = new ArrayList<Integer>();
		y2.add(1);
		for(int i=3; i<=255; i+=2) {
			y2.add(i);
		}
		System.out.println(y2);

		// prints number of values greater than y3
		int counter = 0;
		int[] greaterThan = {1, 3, 5, 7, 9, 11, 13};
		int y3 = 6;
		for(int i=0; i<greaterThan.length; i++) {
			if(greaterThan[i] > y3) {
				counter++;
			}
		}
		System.out.println(counter);

		// squares the values within an array
		int[] x2 = {4, 1, 7, -4, 2};
		for(int i=0; i<x2.length; i++) {
			x2[i] = x2[i]*x2[i];
		}
		System.out.println(x2);

		// replaces negative numbers in array with 0
		int[] replaceNeg = {4, 3, -7, 12, -43};
		for(int i=0; i<replaceNeg.length; i++) {
			if(replaceNeg[i] < 0) {
				replaceNeg[i] = 0;
			}
		}
		System.out.println(replaceNeg);

		// prints Max, Min, and Average of an array
		int[] z = {4, 13, -51, 67, 21};
		ArrayList<Integer> maxMinAvg = new ArrayList<Integer>();
		int sum1 = 0;
		int max1 = z[0];
		int min1 = z[0];
		for(int i=0; i<z.length; i++) {
			sum1 += z[i];
			if(z[i] > max1) {
				max1 = z[i];
			}
			if(z[i] < min1) {
				min1 = z[i];
			}
		}
		maxMinAvg.add(max1);
		maxMinAvg.add(min1);
		maxMinAvg.add(sum1/z.length);
		System.out.println(maxMinAvg);

		// shifts values within array forward by index of 1
		int[] xy = {21, 32, 1, -13, 1, -90};
		ArrayList<Integer> shiftForward = new ArrayList<Integer>();
		for(int i=0; i<xy.length-1; i++) {
			shiftForward.add(xy[i+1]);
		}
		shiftForward.add(0);
		System.out.println(shiftForward);
	}
}