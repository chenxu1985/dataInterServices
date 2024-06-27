package cn.ac.big.bigd.webservice.model.ncbi;

import java.util.TreeMap;

public class SampleMonthCountsNcbi {
    private TreeMap<String,Integer> monthCounts;

    public TreeMap<String, Integer> getMonthCounts() {
        return monthCounts;
    }

    public void setMonthCounts(TreeMap<String, Integer> monthCounts) {
        this.monthCounts = monthCounts;
    }
}
