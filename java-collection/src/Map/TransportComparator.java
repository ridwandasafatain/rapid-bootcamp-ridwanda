package Map;

import model.Transport;

import java.util.Comparator;

public class TransportComparator implements Comparator<Transport> {
    @Override
    public int compare(Transport t1, Transport t2){
        return t1.getJenis().compareTo(t2.getJenis());
    }
}
