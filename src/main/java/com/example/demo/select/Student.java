package com.example.demo.select;

/**
 * @author: Ma.li.ran
 * @datetime: 2018/08/24 21:18
 * @desc:
 * @environment: jdk1.8.0_121/IDEA 2017.2.6/Tomcat8.0.47/mysql5.7
 */
public class Student implements Comparable<Student> {

  private String name;
  private int score;

  public Student(String name, int score) {
    this.name = name;
    this.score = score;
  }

  // 定义Student的compareTo函数
  // 如果分数相等，则按照名字的字母序排序
  // 如果分数不等，则分数高的靠前
  @Override
  public int compareTo(Student that) {

    if (this.score < that.score)
      return -1;
    else if (this.score > that.score)
      return 1;
    else // this.score == that.score
      return this.name.compareTo(that.name);
  }

  // 定义Student实例的打印输出方式
  @Override
  public String toString() {
    return "Student: " + this.name + " " + Integer.toString(this.score);
  }
}