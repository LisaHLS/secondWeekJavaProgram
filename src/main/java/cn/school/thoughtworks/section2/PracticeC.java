package cn.school.thoughtworks.section2;

import java.util.*;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String, Integer> result = new HashMap<>();

        Set<String> uniqueSet = new HashSet<>(collection1);
        for (String setElement: uniqueSet) {

            int showFrequency = Collections.frequency(collection1,setElement);

            if (setElement.indexOf("-") != -1) {
                countSpecialStringShowTimes("-", setElement, result,showFrequency);

            }else if (setElement.indexOf(":") != -1) {
                countSpecialStringShowTimes(":", setElement, result,showFrequency);

            } else if(setElement.indexOf("[") != -1){
                countSpecialStringShowTimes("[", setElement.substring(0, setElement.length()-1), result,showFrequency);

            } else {

                if (result.containsKey(setElement)) {
                    result.put(setElement, showFrequency + result.get(setElement));

                } else {
                    if(showFrequency > 1) {
                        result.put(setElement, showFrequency);
                    }
                }
            }
        }
        return result;
    }

    Map<String, Integer> countSpecialStringShowTimes(String spiltSymbol, String setElement, Map<String, Integer> result, int showFrequency) {

        int  showTimes = Integer.parseInt(setElement.substring(setElement.indexOf(spiltSymbol)+1, setElement.length()));
        String key = setElement.substring(0, setElement.indexOf(spiltSymbol));

        if (showTimes > 0) {

            if(result.containsKey(key)){
                result.put(key, showTimes*showFrequency + result.get(key));

            } else {
                result.put(key, showTimes*showFrequency);
            }
        }
        return result;
    }
}
