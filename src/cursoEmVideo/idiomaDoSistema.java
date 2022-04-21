package cursoEmVideo;

import java.util.Locale;

public class idiomaDoSistema {

    public static void main(String[] args) {

        Locale loc = Locale.getDefault();
        System.out.println("O idioma do sistema é:");
        System.out.println(loc.getDisplayLanguage());
        System.out.println(loc.getLanguage());
    }
}
