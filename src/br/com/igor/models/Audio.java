package br.com.igor.models;

public class Audio {
    private String name;
    private int totalStreaming;
    private int like;
    private int rating;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalStreaming() {
        return totalStreaming;
    }

    public int getLike() {
        return like;
    }

    public int getRating() {
        return rating;
    }

    public void like(){
        this.like++;
    }

    public void reproduce(){
        this.totalStreaming++;
    }
}
