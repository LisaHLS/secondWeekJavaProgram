package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> sameElementsCollection = new ArrayList<>(collection1);
        sameElementsCollection.retainAll(collection2);

        return sameElementsCollection;

    }
}
