package Queue;

import model.Transport;

import java.util.Comparator;

public class TransportComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
            return o1.getJenis().compareTo(o2.getJenis());
    }
}
