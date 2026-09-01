package org.example;

public class MezcladorCanciones {

    public static void main(String[] args) {

        Cancion[] canciones = {
                new Cancion("Bohemian Rhapsody", "Queen", 5.55),
                new Cancion("Billie Jean", "Michael Jackson", 4.54),
                new Cancion("Shape of You", "Ed Sheeran", 3.53),
                new Cancion("Blinding Lights", "The Weeknd", 3.20),
                new Cancion("Smells Like Teen Spirit", "Nirvana", 5.01),
                new Cancion("Hotel California", "Eagles", 6.30),
                new Cancion("Rolling in the Deep", "Adele", 3.48),
                new Cancion("Sweet Child O' Mine", "Guns N' Roses", 5.56),
                new Cancion("Someone Like You", "Adele", 4.45),
                new Cancion("Thriller", "Michael Jackson", 5.57)
        };

        System.out.println("LISTA DE CANCIONES:");
        System.out.println();

        for (int i = 0; i < canciones.length; i++) {
            System.out.println((i + 1) + ". " + canciones[i]);
        }
    }
}

