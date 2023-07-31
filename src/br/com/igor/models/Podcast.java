package br.com.igor.models;

public class Podcast extends Audio{
    private String presenter;
    private String description;

    public String getPresenter() {
        return presenter;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public String getDescription() {
        return description;
    }

    public void setRating(String description) {
        this.description = description;
    }

    @Override
    public int getRating(){
        if(this.getLike()>500){
            return 10;
        }else {
            return 8;
        }
    }
}
