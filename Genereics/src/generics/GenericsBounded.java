/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generics;

/**
 *
 * @author Adil
 */
public class GenericsBounded<T extends Number> {
    T[] nums;

    public GenericsBounded(T[] nums) {
        this.nums = nums;
    }

    
    void average()
    {
        double sum = 0.0;
        for(T num : nums)
        {
            sum += num.doubleValue();
        }
        System.out.println("Average is : "+sum/nums.length);
    }

    public static void main(String[] args) {
        
        Integer[] arrayA = {12,9,10,11,15};
        Double[] arrayB =  {12.1,10.0,1.1,17.2,5.1};
        //GenericsBounded<Double> s = new GenericsBounded<Double>(new Double[]{12.1,10.0,1.1,17.2,5.1});
        GenericsBounded<Double> s = new GenericsBounded<Double>(arrayB);
        GenericsBounded<Integer> ss = new GenericsBounded<Integer>(arrayA);
        s.average();
        ss.average();
    }
    
}
