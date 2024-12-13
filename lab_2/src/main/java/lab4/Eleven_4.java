// Updated Eleven_4.java
package lab4;

import java.util.*;

public class Eleven_4 {

    private Set<Integer> integerSet;

    public Eleven_4() {
        this.integerSet = new HashSet<>();
        while (integerSet.size() < 10) {
            int randomNum = new Random().nextInt(100); // Range [0, 99]
            integerSet.add(randomNum);
        }
    }

    public Set<Integer> viewElements() {
        return new HashSet<>(integerSet);
    }

    public boolean addElement(int element) {
        return integerSet.add(element);
    }

    public boolean removeElement(int element) {
        return integerSet.remove(element);
    }

    public List<Integer> getSortedElements() {
        List<Integer> sortedList = new ArrayList<>(integerSet);
        Collections.sort(sortedList);
        return sortedList;
    }
}
