package com.princeton.wangyue;

import com.princeton.wangyue.algorithm.MergeSort;
import com.princeton.wangyue.algorithm.Recursive;
import com.princeton.wangyue.algorithm.SortUtil;
import java.util.Arrays;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/13 22:17
 **/
public class RootTest {

  public static void main(String[] args){

    int[] arr = new int[]{5,2,3,1};
//    SortUtil.selectSort(arr);
//    SortUtil.bunbleSort(arr);
//    SortUtil.insetSort(arr);
//    MergeSort.mergeSort(arr);
    System.out.println(Arrays.toString(MergeSort.mergeSort(arr)));

//    Recursive.recursive(10);
//    System.out.println("result ============ "+ result);
  }




}
