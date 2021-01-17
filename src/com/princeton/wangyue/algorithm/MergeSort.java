package com.princeton.wangyue.algorithm;

import java.util.Arrays;

/**
 * 归并排序
 *
 * @Author wangyue8
 * @CreatTime 2021/1/16 12:22
 **/
public class MergeSort {


  /**
   * 分治思想：将大问题分解为小问题。 分治法基本就是下面的三步 分(divide)：无法有效解决的划分更小的问题 治(conquer)：递归求每一个子问题的解（主要是用递归实现）
   * 合(combine)：合并解得出原问题解
   *
   * leetcode用时7ms
   */
  public static int[] mergeSort(int[] arr) {
    int length = arr.length;
    return sort(arr, 0, length - 1);
  }

  public static int[] sort(int[] arr, int start, int end) {
    if (start >= end) {
      return arr;
    }

    int mid = (start + end) / 2;
    sort(arr, start, mid);
    sort(arr, mid + 1, end);
    return  mergeChild(arr, start, mid, end);
  }

  public static int[] mergeChild(int[] arr, int start, int mid, int end) {
    //定义各个变量
    int startLeftVar = start;
    int startRightVar = mid + 1;
    int startTemp = 0;

    int[] tempArr = new int[end - start + 1];
    //从两个区间的第一个值开始对比，把小的放进临时数组
    while (startLeftVar <= mid && startRightVar <= end) {
      if (arr[startLeftVar] < arr[startRightVar]) {
        tempArr[startTemp] = arr[startLeftVar];
        startLeftVar++;
      } else {
        tempArr[startTemp] = arr[startRightVar];
        startRightVar++;
      }
      startTemp++;
    }

    //如果还有剩余的元素，全部复制到临时数组
    while (startLeftVar <= mid) {
      tempArr[startTemp] = arr[startLeftVar];
      startLeftVar++;
      startTemp++;
    }

    //如果还有剩余的元素，全部复制到临时数组
    while (startRightVar <= end) {
      tempArr[startTemp] = arr[startRightVar];
      startTemp++;
      startRightVar++;
    }

    //将排序好的数组重新赋值给原有数组
    int length = end - start + 1;
    for (int n = 0; n < length; n++) {
      arr[start + n] = tempArr[n];
    }
    return  arr;
  }


}
