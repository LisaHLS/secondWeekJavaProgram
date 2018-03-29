package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {

    private static final int SPECIAL_NUMBER = 3;

    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> objectValue = object.get("value");
        for (int i = 0; i < objectValue.size(); i++) {

            if(collectionA.containsKey(objectValue.get(i)) == true) {

                if (collectionA.get(objectValue.get(i)) >= SPECIAL_NUMBER) {
                    collectionA.put(objectValue.get(i), collectionA.get(objectValue.get(i))-collectionA.get(objectValue.get(i))/ SPECIAL_NUMBER);
                }
            }
        }

        return collectionA;
    }
}
