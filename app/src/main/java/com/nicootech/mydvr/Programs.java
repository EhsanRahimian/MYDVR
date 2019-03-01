package com.nicootech.mydvr;

public class Programs {
    private String name;
    private String url;
    private String start;
    private String duration;

    public Programs(){}

    public Programs(String name, String url, String start, String duration) {
        this.name = name;
        this.url = url;
        this.start = start;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getUrl() {
        return url;
    }

    public String getStart() {
        return start;
    }

    public String getDuration() {
        return duration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
