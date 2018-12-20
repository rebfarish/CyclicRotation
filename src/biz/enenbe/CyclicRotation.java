package biz.enenbe;

import java.util.Arrays;

/**
 * An array A consisting of N integers is given. Rotation of the array means that each element is
 * shifted right by one index, and the last element of the array is moved to the first place. For
 * example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right
 * by one index and 6 is moved to the first place).
 *
 * The goal is to rotate array A K times; that is, each element of A will be shifted to the right K
 * times.
 *
 * Write a function:
 *
 * class Solution { public int[] solution(int[] A, int K); }
 *
 * that, given an array A consisting of N integers and an integer K, returns the array A rotated K
 * times.
 *
 * For example, given A = [3, 8, 9, 7, 6] K = 3
 *
 * the function should return [9, 7, 6, 3, 8]. Three rotations were made: [3, 8, 9, 7, 6] -> [6, 3,
 * 8, 9, 7] [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9] [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
 *
 * Assume that:
 *
 * N and K are integers within the range [0..100]; each element of array A is an integer within the
 * range [−1,000..1,000].
 */
public class CyclicRotation {

  public static void main(String[] args) {
    System.out.println(Arrays.toString(sol(new int[]{3, 8, 9, 7, 6}, 3)));
    System.out.println(Arrays.toString(anotherSol(new int[]{3, 8, 9, 7, 6}, 3)));
  }

  public static int[] sol(int[] A, int K) {

      int[] newArray = new int[A.length];
      System.arraycopy(A, A.length - 1, newArray, 0, 1);
      System.arraycopy(A, 0, newArray, 1, A.length - 1);
      return newArray;
  }

public static int[] anotherSol(int[] A, int K){
  int[] newArray = new int[A.length];
      for (int i = 1; i < (A.length); i++) {
        newArray[i] = A[i - 1];
      }
      newArray[0] = A[A.length - 1];
      return newArray;
    }
}



