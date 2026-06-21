package JCF.lec_25;

import java.util.Comparator;

public class ReverseComp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return -Integer.compare(o1, o2);
    }
}
