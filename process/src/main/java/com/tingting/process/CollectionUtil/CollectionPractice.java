
package com.tingting.process.CollectionUtil;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 集合操作的工具类
 * @author: zhangting
 * @date: 2021/7/23 11:44 上午
 **/

public class CollectionPractice {

    // 验证一： CollectionUtils.isEmpty()可以用来判断集合或者map的空值
    public static void main(String[] args) {
        List<String> list = null;
        Map<String,String> map = null;
        System.out.println("map null is true:"+ CollectionUtils.isEmpty(map));
        map = new HashMap<>();
        System.out.println("map empty is true:"+ CollectionUtils.isEmpty(map) +",map.size:" +map.size());

        System.out.println("null is true:"+ CollectionUtils.isEmpty(list));
        List<String> list1 = new ArrayList<>();
        System.out.println("empty list  is true:"+ CollectionUtils.isEmpty(list1) +"list1.size:"+list1.size());
    }
}
