package com.adt.mplus.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MplusProfile {

    private String name;

    private String realm;

    private Rankings rankings;

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

    @JsonProperty("mythic_plus_ranks")
    public Rankings getRankings() {
        return rankings;
    }

    @JsonProperty("mythic_plus_ranks")
    public void setRankings(Rankings rankings) {
        this.rankings = rankings;
    }
}
