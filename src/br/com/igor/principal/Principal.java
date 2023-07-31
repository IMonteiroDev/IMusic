package br.com.igor.principal;

import br.com.igor.models.Music;
import br.com.igor.models.MyFavorite;
import br.com.igor.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Music myMusic = new Music();
        myMusic.setName("Goosebumps");
        myMusic.setArtist("Travis Scott");
        myMusic.setAlbum("AstroWorld");

        for(int i=0; i<1000; i++){
            myMusic.reproduce();
        }

        for(int i=0; i<50; i++);{
            myMusic.like();
        }

        Podcast pd = new Podcast();
        pd.setName("Balela");
        pd.setPresenter("ZeRoBadass e Calango");

        for(int i=0; i<1000; i++){
            pd.reproduce();
        }

        for(int i=0; i<50; i++);{
            pd.like();
        }

        MyFavorite favorite = new MyFavorite();
        favorite.included(pd);
        favorite.included(myMusic);
    }
}