package com.adt.mplus.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Rankings {

    private Rank overall;
    private Rank tank;
    private Rank healer;
    private Rank dps;
    private Rank classSpec;

    public Rank getOverall() {
        return overall;
    }

    public void setOverall(Rank overall) {
        this.overall = overall;
    }

    public Rank getTank() {
        return tank;
    }

    public void setTank(Rank tank) {
        this.tank = tank;
    }

    public Rank getHealer() {
        return healer;
    }

    public void setHealer(Rank healer) {
        this.healer = healer;
    }

    public Rank getDps() {
        return dps;
    }

    public void setDps(Rank dps) {
        this.dps = dps;
    }

    @JsonProperty("class")
    public Rank getClassSpec() {
        return classSpec;
    }

    @JsonProperty("class")
    public void setClassSpec(Rank classSpec) {
        this.classSpec = classSpec;
    }
}
