package java_3.lambda_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Numbers {

    // Changed nums to be equal to new ArrayList instead of just Arrays.asList since latter makes it fixed length
    private static final List<Integer> nums = new ArrayList<>(Arrays.asList(10,100,1000,5,50,500,3,30,300,7,70,700,1,10,100,25,250,2500));

    static List<Integer> getNums() {
        return nums;
    }

    static int getNum(int i) {
        return nums.get(i);
    }


    static boolean isOdd(int i) {
        //determine if the value at the index i is odd.  return true if yes, return false if  no.
        try {
            return nums.get(i) % 2 != 0;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }

    }


    static boolean isEven(int i) {
        //determine if the value at the index i is even.  return true if yes, return false if  no.
        try {
            return nums.get(i) % 2 == 0;
        }
        catch (Exception e)
        {
            System.out.println(e);
            return false;
        }
    }

    static boolean isPrime(int i) {
         //determine if the value at the index i is a prime number.  return true if yes, return false if no.
        // Return false if less than or equal to 1 since its impossible to be prime. Check from 2 to n-1 if remainder is 0
        if (i < 0 || i > nums.size())
        {
            System.out.println("Put valid index in. Max size of nums list is " + nums.size());
            return false;
        }
        if (nums.get(i) <= 1) {
            return false;
        }
        else {
            for (int n = 2; n < nums.get(i); n++)
            {
                if (nums.get(i) % n == 0)
                {
                    return false;
                }
            }
        }
        return true;
    }

    static int added() {
        //add all the elements in the list.  return the sum.
        int sum = 0;
        for (int i : nums)
        {
            sum+=i;
        }
        return sum;
    }

    static int subtracted() {
        //subtract all the elements in the list. return the remainder.
        int subtract = 2 * nums.get(0);
        for (int i : nums)
        {
            subtract-=i;
        }
        return subtract;
    }

    static int multipled() {
        //multiply all the elements in the list. and return the product.
        // Making this var to long since the list multiplied overflows int. Since the return is int and I will cast from long to int. If it overflows then return int max value
        long multiplied = 1;
        for (int i : nums)
        {
            multiplied*=i;
        }
        if ((int) multiplied < 0) // Int overflowed
        {
            return Integer.MAX_VALUE;
        }
        return (int) multiplied;
    }

    static int divided() {
        //divide all the elements in the list. and return the product.
        int division = nums.get(0); // get from 1st num and divide rest. Check nums from index 1 to size
        for (int i : nums.subList(1, nums.size()))
        {
            division/=i;
        }
        // Returns 0 since dividing everything gives a very small number. Int will go to nearest whole number which is 0
        return division;
    }

    static int findMax() {
         //return the maximum value in the list.
        int max = 0;
        for (int i : nums)
        {
            if (i > max)
            {
                max = i;
            }
        }
        return max;
    }

    static int findMin() {
        //return the minimum value in the list.
        int min = nums.get(0);
        for (int i : nums)
        {
            if (i < min)
            {
                min = i;
            }
        }
        return min;
    }

    static int compare(int i, int j) {
        //compare the values stored in the array at index position i and j.  
        //if the value at i is greater, return 1.  if the value at j is greater, return -1.  if the two values are equal, return 0.
        if (nums.get(i) > nums.get(j))
        {
            return 1;
        }
        else if (nums.get(j) > nums.get(i)) {
            return -1;
        }
        else // They are equal
        {
            return 0;
        }
    }

    static int append(int n) {
        //add a new value to the values list. return that value after adding it to the list.
        nums.add(n);
        return n;
    }

    // Takes 1 parameter. Return Object since int or boolean is expected to return
    @FunctionalInterface
    public interface lambdaCompute {
        public Object lambdaCompute(int n);
    }

    // Takes 0 parameters
    @FunctionalInterface
    public interface lambdaComputeZero {
        public int lambdaCompute();
    }

    // Takes 2 parameters
    @FunctionalInterface
    public interface lambdaComputeTwo {
        public int lambdaCompute(int n, int i);
    }

}
