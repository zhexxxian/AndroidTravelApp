package com.sutd.zhangzhexian.travelapp.database;

/**
 * Created by zhanghao on 7/11/15.
 */
public class SolutionSet {
    public static String[] route;
    public static String[] method;
    public static double cost;
    public static double time;


    public static void  clear(){
        route=null;
        method=null;
        cost=0;
        time=0;
    }

}
