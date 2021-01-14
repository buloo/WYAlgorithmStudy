package com.princeton.wangyue;

import com.princeton.wangyue.algorithm.SortUtil;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/13 22:17
 **/
public class RootTest {

  public static void main(String[] args){

    System.out.println("Hello World");

    int[] arr = new int[]{23,2,5,6,4,7,9,3,5,2,14};
//    SortUtil.selectSort(arr);
//    SortUtil.bunbleSort(arr);
    SortUtil.insetSort(arr);
  }




}
