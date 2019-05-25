package html.dekorator;

import java.util.Scanner;

public class HTMLDekorator {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String a;
        int wybor;
        boolean istrue = true;

        System.out.println("Podaj ciag, do objecia znacznikiem HTML");
        a = in.nextLine();
        AbstractText tekst = new PlainText(a);

        while (istrue) {
            System.out.printf("Wybierz znaczniki:\n1) p\n2) strong\n3) em\n4) mark\n\n");
            wybor = in.nextInt();
            switch (wybor) {
                case 1:
                    tekst = new PTag(tekst);
                    break;
                case 2:
                    tekst = new StrongTag(tekst);
                    break;
                case 3:
                    tekst = new EmTag(tekst);
                    break;
                case 4:
                    tekst = new MarkTag(tekst);
                    break;

                default:
                    istrue = false;
                    tekst.show();
                    break;

            }

        }
    }
}
