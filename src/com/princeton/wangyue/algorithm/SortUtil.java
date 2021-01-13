package com.princeton.wangyue.algorithm;

import com.sun.tools.javac.util.ArrayUtils;
import java.util.Arrays;

/**
 * @Author wangyue8
 * @CreatTime 2021/1/13 22:21
 **/
public class SortUtil {


  /**
   * 冒泡排序
   * 定义：冒泡排序只会操作相邻的两个数据。每次冒泡操作都会对相邻的两个元素进行比较，
   * 看是否满足大小关系要求。如果不满足就让它俩互换。一次冒泡会让至少一个元素移动到它应该在的位置，
   * 重复 n 次，就完成了 n 个数据的排序工作。
   *
   * 自己理解：循环对比相邻的两个值，如果不同，进行交换，大的放右边。
   *
   * 外层循环控制已排序元素，
   * 内层循环控制未排序元素
   * */
  public static void bunbleSort(int[] arr){
    int length = arr.length;
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length - i - 1; j++) {
        if(arr[j] > arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }

    System.out.println(Arrays.toString(arr));
  }

  /**
   * 插入排序
   * 定义：我们将数组中的数据分为两个区间，已排序区间和未排序区间。初始已排序区间只有一个元素，
   * 就是数组的第一个元素。插入算法的核心思想是取未排序区间中的元素，在已排序区间中找到合适的
   * 插入位置将其插入，并保证已排序区间数据一直有序。重复这个过程，直到未排序区间中元素为空，算法结束。
   *
   * 自己理解：分成左右两部分，左边已排序，右边未排序。循环将未排序的元素插入到已排序中。
   *
   * 外层循环控制已排序
   * 内层循环控制未排序
   * */
  public static void insetSort(int[] arr){

    int length = arr.length;
    for (int i = 0; i < length; i++) {
      int value = arr[i];
      int insertIndex = i-1;
      for (; insertIndex > 0; insertIndex--) {
        if(value < arr[insertIndex]){
          arr[insertIndex+1] = arr[insertIndex];//移动数据
        }else{
          break;
        }
      }
      arr[insertIndex+1] = value;//插入数据
    }
    System.out.println(Arrays.toString(arr));

  }

  /**
   * 选择排序
   * 定义：选择排序算法的实现思路有点类似插入排序，也分已排序区间和未排序区间。
   * 但是选择排序每次会从未排序区间中找到最小的元素，将其放到已排序区间的末尾。

   * 自己理解：每次选出一个最小值，和未排序的第一个值交换。直到所有数据全部排序完。
   * 1. 不稳定排序
   * 2. 是原地排序 空间复杂度O(1)
   * 3. 时间复杂度O(n^2)
   *
   * 外层循环控制已排序元素，
   * 内层循环控制未排序元素
   * */
  public static void selectSort(int[] arr){
    int length = arr.length;
    for (int i = 0; i < length; i++) {
      int min = arr[i];
      int minIndex = i;
      for (int j = i+1; j < length; j++) {
        int child = arr[j];
        if(min > child){
          min = child;
          minIndex = j;
        }
      }
      arr[minIndex] = arr[i];
      arr[i] = min;
    }
    System.out.println(Arrays.toString(arr));
  }

}
