package com.boast.buyer;

import java.util.Comparator;

public class BuyerAddressComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        String address1 = ((Buyer) o1).getAddress();
        String address2 = ((Buyer) o2).getAddress();
        return address1.compareTo(address2);
    }
}
