package apirick;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("que personaje deseas ver (elige un numero entre el 1-826)");
        Scanner sc = new Scanner(System.in);
        int sv = sc.nextByte();
        Character[] characters = new Character[10];
        Character character = ApiUtil.getCharacterById(sv);

        System.out.println("Nombre: " + character.name);
        System.out.println("Estado: " + character.status);
        System.out.println("episodio " + character.episode.size());
        System.out.println("episodio " + character.url);
        System.out.println("creado en: " + character.created);
        System.out.println("se localiza en " + character.location);
        System.out.println("su diseño es " + character.image);

        // Imprimir más datos según sea necesario

    }
}
