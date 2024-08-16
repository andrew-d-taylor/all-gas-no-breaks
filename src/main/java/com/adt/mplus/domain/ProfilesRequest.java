package com.adt.mplus.domain;

import java.util.List;

public class ProfilesRequest {

    private List<NameRealmPair> profiles;

    public List<NameRealmPair> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<NameRealmPair> profiles) {
        this.profiles = profiles;
    }
}
