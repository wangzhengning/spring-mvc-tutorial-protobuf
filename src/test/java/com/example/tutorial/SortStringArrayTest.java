package com.example.tutorial;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: zn.wang
 * @Date: 2018/12/29 08:47:21
 * @Description: 实现一个数组（例如：12、23、6、78、7、98）按照最大的字符串返回
 */
public class SortStringArrayTest {

    //"12" , "23" , "6", "78" , "76" ,"7" ,"98","1","99"
    public static void main(String[] args) {
        String [] array = new String[]{"12" , "23" , "6", "78" , "76" ,"7" ,"98","1","99"};
        sortArray(array);
        System.out.println("array string:{}" + Arrays.toString(array));
    }

    /**
     * N个数字要排序完成，总共进行N-1趟排序，每i趟的排序次数为(N-i)次，所以可以用双重循环语句，外层控制循环多少趟，内层控制每一趟的循环次数，即
     * for(int i=1;i<arr.length;i++){
     *    for(int j=1;j<=arr.length-i;j++){
     *    //交换位置
     * }
     * @param array
     * @return
     */
    public static String [] sortArray(String [] array){
           for(int i = 1; i <array.length ;i++){
               for(int j = 0 ; j < array.length - i; j++){
                   int lengthArrayJ_1 = array[j].length();
                   char arrayJFirstChar = array[j].charAt(0);
                   char arrayJLastChar = array[j].charAt(lengthArrayJ_1 - 1);
                   char arrayJ1FirstChar = array[j+1].charAt(0);
//                   if(Integer.parseInt(array[j]) < Integer.parseInt(array[j+1]) ){
//                       String temp = array[j];
//                       array[j] = array[j+1];
//                       array[j+1] = temp;
//                   }
                   if(arrayJFirstChar < arrayJ1FirstChar || arrayJLastChar < arrayJ1FirstChar ){
                       String temp = array[j];
                       array[j] = array[j+1];
                       array[j+1] = temp;
                   }
               }
           }
           return array;
    }
}
