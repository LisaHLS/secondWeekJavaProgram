package cn.school.thoughtworks.section3;

import java.util.*;

public class PracticeD {

    private static final int SPECIAL_NUMBER = 3;

    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> collection3 = new HashMap<>();

        Set<String> uniqueSet = new HashSet<>(collectionA);
        for (String setElement: uniqueSet) {

            int showFrequency = Collections.frequency(collectionA, setElement);

            if (setElement.indexOf("-") != -1) {

                int  showTimes = Integer.parseInt(setElement.substring(setElement.indexOf("-")+1, setElement.length()));
                String key = setElement.substring(0, setElement.indexOf("-"));

                if (showTimes > 0) {

                    if(collection3.containsKey(key)){
                        collection3.put(key, showTimes*showFrequency + collection3.get(key));

                    } else {
                        collection3.put(key, showTimes*showFrequency);
                    }
                }

            } else {

                if (collection3.containsKey(setElement)) {
                    collection3.put(setElement, showFrequency + collection3.get(setElement));

                } else {

                    if(showFrequency > 1) {
                        collection3.put(setElement, showFrequency);
                    }
                }
            }
        }

        List<String> objectValue = object.get("value");
        for (int i = 0; i < objectValue.size(); i++) {

            if(collection3.containsKey(objectValue.get(i))) {

                if (collection3.get(objectValue.get(i)) >= SPECIAL_NUMBER) {
                    collection3.put(objectValue.get(i), collection3.get(objectValue.get(i))-collection3.get(objectValue.get(i))/SPECIAL_NUMBER);
                }
            }
        }

        return collection3;
    }
}
