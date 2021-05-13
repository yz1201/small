package cn.dbdj1201.common;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2021/5/13 11:39
 */
public class TestStream {

    public static void main(String[] args) {
//        List<String> testArray = Arrays.asList("a1", "a2", "a3", "a4", "a5", "b1", "b2", "b3", "b4", "b5");
//        List<String> reqArray = Arrays.asList("a3", "b4");
//        //求原始数组下标
//
////        testArray.stream().filter(reqArray::contains).forEach(System.out::println);
//        System.out.println(testArray.stream().filter(reqArray::contains).collect(Collectors.toList()));
        test();
    }


   static void test() {
        List<Map<String, Object>> test1 = buildData(100);
        List<String> target = Arrays.asList("VALUE100-1","VALUE100-3","VALUE100-5");
        System.out.println(test1.stream().filter(map-> target.contains(map.get("KEY100"))).collect(Collectors.toList()));
    }

   static List<Map<String, Object>> buildData(int dataLen) {
        List<Map<String, Object>> result = new ArrayList<>();
       for (int i = 0; i < dataLen; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("KEY100", "VALUE100-" + i);
            map.put("KEY101", "VALUE101-" + i);
            result.add(map);
        }
        return result;
    }

}
