package com.adt.mplus.util;

import com.adt.mplus.domain.NameRealmPair;

import java.util.ArrayList;
import java.util.List;

public class AGNBUtils {

    public static List<NameRealmPair> coreCrew() {
        List<NameRealmPair> list = new ArrayList<>();
        list.add(new NameRealmPair("Veggietutt", "Stormrage"));
        list.add(new NameRealmPair("Addos", "Stormrage"));
        list.add(new NameRealmPair("Blackk", "Bonechewer"));
        list.add(new NameRealmPair("Themrtpally", "Stormrage"));
        list.add(new NameRealmPair("Oszhunt", "Stormrage"));
        return list;
    }

}
