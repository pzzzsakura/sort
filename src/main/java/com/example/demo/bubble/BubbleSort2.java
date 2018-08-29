package com.example.demo.bubble;

/**
 * @author: Ma.li.ran
 * @datetime: 2018/08/29 21:46
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class BubbleSort2 {

  // 我们的算法类不允许产生任何实例
  private BubbleSort2(){}

  public static void sort(Comparable[] arr){

    int n = arr.length;
    int newn; // 使用newn进行优化

    do{
      newn = 0;
      for( int i = 1 ; i < n ; i ++ )
        if( arr[i-1].compareTo(arr[i]) > 0 ){
          swap( arr , i-1 , i );

          // 记录最后一次的交换位置,在此之后的元素在下一轮扫描中均不考虑
          newn = i;
        }
      n = newn;
    }while(newn > 0);
  }

  private static void swap(Object[] arr, int i, int j) {
    Object t = arr[i];
    arr[i] = arr[j];
    arr[j] = t;
  }
}
