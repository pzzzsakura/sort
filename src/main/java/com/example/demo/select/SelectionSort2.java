package com.example.demo.select;

import com.example.demo.util.SortTestHelper;

/**
 * @author: Ma.li.ran
 * @datetime: 2018/08/29 21:42
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class SelectionSort2 {

  // 我们的算法类不允许产生任何实例
  private SelectionSort2(){}

  public static void sort(Comparable[] arr){

    int left = 0, right = arr.length - 1;
    while(left < right){
      int minIndex = left;
      int maxIndex = right;

      // 在每一轮查找时, 要保证arr[minIndex] <= arr[maxIndex]
      if(arr[minIndex].compareTo(arr[maxIndex]) > 0)
        swap(arr, minIndex, maxIndex);

      for(int i = left + 1 ; i < right; i ++)
        if(arr[i].compareTo(arr[minIndex]) < 0)
          minIndex = i;
        else if(arr[i].compareTo(arr[maxIndex]) > 0)
          maxIndex = i;

      swap(arr, left, minIndex);
      swap(arr, right, maxIndex);

      left ++;
      right --;
    }
  }

  private static void swap(Object[] arr, int i, int j) {
    Object t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }

  // 测试SelectionSort2
  public static void main(String[] args) {

    int N = 20000;
    Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
    SortTestHelper.testSort("com.example.demo.select.SelectionSort2", arr);

    return;
  }


}
