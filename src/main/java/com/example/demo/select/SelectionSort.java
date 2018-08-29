package com.example.demo.select;

import com.example.demo.util.SortTestHelper;

/**
 * @author: Ma.li.ran
 * @datetime: 2018/08/23 22:29
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
//选择排序
public class SelectionSort {


  //声明空构造器，不允许产生任何实例
  public SelectionSort() {
  }
  //  当需要排序的集合或数组不是单纯的数字型时，通常可以使用Comparator或Comparable，以简单的方式实现对象排序或自定义排序。
//  如下：
//  Date d1 = new Date();
//  Date d2 = new Date();
//d1.compareTo(d2);
//  如果你写的类没有实现Comparable接口，就会报错


  public static void sort(Comparable[] arr) {
    int arrlength = arr.length;
    for (int i = 0; i < arrlength; i++) {
      int index = i;//从前到后把值索引取出来，以便和之后找到的最值替换
      for (int j = i + 1; j < arrlength; j++) { //总是 第i 个 之后的所有数据中去最值
        if (arr[i].compareTo(arr[j]) > 0) {//比较如果大或者小  交换位置
          index = j;
          swap(arr, i, index); //交换
        }
      }
    }
  }

  private static void swap(Object[] arr, int i, int index) {
    Object temp = arr[i];
    arr[i] = arr[index];
    arr[index] = temp;
  }

  public static void main(String[] args) {

//    Integer[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};//Integer implements Comparable<Integer> 而 int 不行
//    SelectionSort.selectionsort(arr);
//    for (int i = 0; i < arr.length; i++) {
//      System.out.print(arr[i]);
//      System.out.print(' ');
//    }
//    System.out.println();
//
//    // 测试Double
//    Double[] b = {4.4, 3.3, 2.2, 1.1};
//    SelectionSort.selectionsort(b);
//    for (int i = 0; i < b.length; i++) {
//      System.out.print(b[i]);
//      System.out.print(' ');
//    }
//    System.out.println();
//
//    // 测试String
//    String[] c = {"D", "C", "B", "A"};
//    SelectionSort.selectionsort(c);
//    for (int i = 0; i < c.length; i++) {
//      System.out.print(c[i]);
//      System.out.print(' ');
//    }
//    System.out.println();
//
//    // 测试自定义的类 Student
//    Student[] d = new Student[4];
//    d[0] = new Student("D", 90);
//    d[1] = new Student("C", 100);
//    d[2] = new Student("B", 95);
//    d[3] = new Student("A", 95);
//    SelectionSort.selectionsort(d);
//    for (int i = 0; i < d.length; i++)
//      System.out.println(d[i]);
//  }

    // 测试排序算法辅助函数
    int N = 20000;
    Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
    SortTestHelper.testSort("com.example.demo.select.SelectionSort", arr);

    return;
  }
}
