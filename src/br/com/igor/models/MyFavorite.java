package br.com.igor.models;

public class MyFavorite {
    public void included(Audio audio){
        if (audio.getRating()>=8){
            System.out.format("\n%s é Considerado Sucesso absoluto é preferido por todos!",audio.getName());
        }else {
            System.out.format("\n%s também é um dos que todo mundo está preferindo!");
        }
    }
}
