package com.adt.mplus.domain;

public class NameRealmPair {

    private String name;
    private String realm;

    public NameRealmPair() {}

    public NameRealmPair(String name, String realm) {
        this.name = name;
        this.realm = realm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealm() {
        return realm;
    }

    public void setRealm(String realm) {
        this.realm = realm;
    }
}
