package com.princeton.wangyue.algorithm;

/**
 * 递归
 * @Author wangyue8
 * @CreatTime 2021/1/16 13:13
 **/
public class Recursive {

  /**
   * 1+2+3+...+n
   * 用递归可以表示，从n+(n-1)+(n-2)+...+1
   *
   * 三步：
   * 1 - 明确递归的终止条件
   * 2 - 递：一层一层往里递，直到终止条件
   * 3 - 归：递进结束后，从最底层开始向外层一层一层归来。
   *        因为只有把最底层的计算了，才能得出倒数第二层的值，然后才能得出倒数第三层的值，
   *        然后一次类推，得出最终的值。就算没有return值，也照样层层归来，只不过没有返回值而已。
   * */
  public static void recursive(int n){
    System.out.println("n="+n);
    if(n == 1){
      return ;
    }
    recursive(n-1);
    System.out.println("end");
  }

}
