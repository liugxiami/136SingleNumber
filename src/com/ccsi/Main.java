package com.ccsi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,2,1,3};
        System.out.println(singleNumber1(nums));
    }
    //single number
    public static int singleNumber(int[] nums){
        if(nums==null||nums.length==0)return -1;
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(!set.add(nums[i])){
                set.remove(nums[i]);
            }
        }
        Iterator<Integer> it=set.iterator();
        return it.next();
    }

    public static int singleNumber1(int[] nums){
        if(nums==null||nums.length==0)return -1;
        int res=0;
        for(int i:nums){
            res^=i;
        }
        return res;
    }
}



