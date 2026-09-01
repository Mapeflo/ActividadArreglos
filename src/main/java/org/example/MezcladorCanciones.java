package org.example;

import java.util.Random;

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

        System.out.println("LISTA COMPLETA DE CANCIONES:");
        mostrarCanciones(canciones);

        System.out.println("\nPLAYLIST ALEATORIA:");
        mostrarCanciones(crearPlaylistAleatoria(canciones, 5));

        System.out.println("\nFILTRO POR ARTISTA: Adele");
        mostrarCanciones(filtrarPorArtista(canciones, "Adele"));

        System.out.println("\nFILTRO POR DURACIÓN: más de 5 minutos");
        mostrarCanciones(filtrarPorDuracion(canciones, 5.0));
    }

    public static void mostrarCanciones(Cancion[] lista) {
        if (lista.length == 0) {
            System.out.println("No se encontraron canciones.");
            return;
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println((i + 1) + ". " + lista[i]);
        }
    }

    public static Cancion[] crearPlaylistAleatoria(Cancion[] canciones, int cantidad) {
        if (cantidad > canciones.length) cantidad = canciones.length;

        Cancion[] playlist = new Cancion[cantidad];
        boolean[] usadas = new boolean[canciones.length];
        Random random = new Random();
        int agregadas = 0;

        while (agregadas < cantidad) {
            int indice = random.nextInt(canciones.length);
            if (!usadas[indice]) {
                playlist[agregadas] = canciones[indice];
                usadas[indice] = true;
                agregadas++;
            }
        }
        return playlist;
    }

    public static Cancion[] filtrarPorArtista(Cancion[] canciones, String artista) {

        int total = 0;
        for (Cancion c : canciones) {
            if (c.getArtista().equalsIgnoreCase(artista)) total++;
        }

        Cancion[] resultado = new Cancion[total];
        int i = 0;
        for (Cancion c : canciones) {
            if (c.getArtista().equalsIgnoreCase(artista)) {
                resultado[i] = c;
                i++;
            }
        }
        return resultado;
    }

    public static Cancion[] filtrarPorDuracion(Cancion[] canciones, double duracionMinima) {
        int total = 0;
        for (Cancion c : canciones) {
            if (c.getDuracion() > duracionMinima) total++;
        }

        Cancion[] resultado = new Cancion[total];
        int i = 0;
        for (Cancion c : canciones) {
            if (c.getDuracion() > duracionMinima) {
                resultado[i] = c;
                i++;
            }
        }
        return resultado;
    }
}