package Homework;

import java.util.DuplicateFormatFlagsException;
import java.util.HashSet;
import java.util.Set;

public class Q3 {

    
    public boolean haveDupli(int[] arr) {
        Set<Integer> seen = new HashSet<>();// set remove the duplicates
        for (int num : arr) {// this for loop is to put array into Hashset
            if (seen.contains(num)) {//checking hashset ,array  both are equal
                return true; //if no duplicates returns true
            }
            seen.add(num);
        }
        return false; // if duplicates returns false
    }

   
    public void exceptionTest(int[] arr) throws DuplicateFormatFlagsException {
        if (!haveDupli(arr)) { // if no duplicates falls in this if statement
            for (int num : arr) {
                System.out.println(num);
            }
        } else {// if duplicates are there then this custom exception will print 
            throw new DuplicateFormatFlagsException("Duplicates are present");
        }
    }

    public static void main(String[] args) {
        Q3 obj = new Q3();

        int[] arr = {1, 2, 3, 4, 5}; // 1st array     
        int[] arr1 = {1, 1, 2, 3, 4};  // 2nd array   

        try {
            obj.exceptionTest(arr);   
            obj.exceptionTest(arr1);  
        } catch (DuplicateFormatFlagsException e) {// catching exception
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
