package apirick;

public class filtro {
    public static void main(String[] args) {
        int contador = 0;
        char pj;
        Character p1 = new Character();
        p1.name = "Jose Cervantes";
        Character p2 = new Character();
        p2.name = "Mario Suarez";
        Character p3 = new Character();
        p3.name = "Mariana Navarro";
        Character p4 = new Character();
        p4.name = "Pedro garcia";
        Character p5 = new Character();
        p5.name = "Ricardo Lopez";

        Character[] pjCharacters = { p1, p2, p3, p4, p5 };
        for (int i = 0; i < pjCharacters.length; i++) {
            System.out.println(pjCharacters[i].name);
            System.out.println(pjCharacters[i].name.length());
            for (int y = 0; y < pjCharacters[i].name.length(); y++) {
                char nombre = pjCharacters[i].name.charAt(y);
                if (nombre == 'a' ||
                        nombre == 'e' ||
                        nombre == 'i' ||
                        nombre == 'o' ||
                        nombre == 'u') {
                    contador++;
                }

            }

        }
    }
}
