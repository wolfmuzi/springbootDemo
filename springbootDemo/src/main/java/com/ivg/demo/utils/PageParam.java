package com.ivg.demo.utils;

public class PageParam {
    private static int DEFAULT_PAGE_SIZE = 20;

    private int limit = DEFAULT_PAGE_SIZE;

    private int start = 0;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

}
