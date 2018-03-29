package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeC {

    private static final int SPECIAL_NUMBER = 3;

    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();

        Set<String> uniqueSet = new HashSet<>(collectionA);
        for (String setElement: uniqueSet) {

            int count = Collections.frequency(collectionA,setElement);
            if(count > 1) {
                collection3.put(setElement, count);

            }
        }

        List<String> objectValue = object.get("value");
        for (int i = 0; i < objectValue.size(); i++) {

            if(collection3.containsKey(objectValue.get(i)) == true) {

                if (collection3.get(objectValue.get(i)) >= SPECIAL_NUMBER) {
                    collection3.put(objectValue.get(i), collection3.get(objectValue.get(i))-collection3.get(objectValue.get(i))/ SPECIAL_NUMBER);
                }

            }
        }

        return collection3;
    }
}
