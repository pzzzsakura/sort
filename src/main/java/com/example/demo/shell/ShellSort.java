package com.example.demo.shell;

/**
 * @author: Ma.li.ran
 * @datetime: 2018/08/29 21:47
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class ShellSort {

  // 我们的算法类不允许产生任何实例
  private ShellSort(){}

  public static void sort(Comparable[] arr){

    int n = arr.length;

    // 计算 increment sequence: 1, 4, 13, 40, 121, 364, 1093...
    int h = 1;
    while (h < n/3) h = 3*h + 1;

    while (h >= 1) {

      // h-sort the array
      for (int i = h; i < n; i++) {

        // 对 arr[i], arr[i-h], arr[i-2*h], arr[i-3*h]... 使用插入排序
        Comparable e = arr[i];
        int j = i;
        for ( ; j >= h && e.compareTo(arr[j-h]) < 0 ; j -= h)
          arr[j] = arr[j-h];
        arr[j] = e;
      }

      h /= 3;
    }
  }
}
