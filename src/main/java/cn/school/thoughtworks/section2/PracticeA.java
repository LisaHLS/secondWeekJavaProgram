package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();

        Set<String> uniqueSet = new HashSet<>(collection1);
        for (String setElement: uniqueSet) {

            int count = Collections.frequency(collection1,setElement);
            if(count > 1) {
                result.put(setElement, count);
            }

        }
        return result;
    }
}
