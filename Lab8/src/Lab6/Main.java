package Lab6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ButelkaPoMleku butelka_po_mleku_1 = new ButelkaPoMleku("Łaciate", 0.5, false, true, 2.5);
        ButelkaPoMleku butelka_po_mleku_2 = new ButelkaPoMleku("Od krowy", 1.0, true, true, 1.5);
        ButelkaPoMleku butelka_po_mleku_3 = new ButelkaPoMleku("Nie od krowy", 1.0, false);

        PuszkaPoMaku puszka_po_maku_1 = new PuszkaPoMaku("Mak z pola", 0.5, Metal.Przewodnictwo.PRZEWODNIK, 14, 10);
        PuszkaPoMaku puszka_po_maku_2 = new PuszkaPoMaku("Mak z lasu", 0.5, Metal.Przewodnictwo.DIELEKTRYK, 24, 30);
        PuszkaPoMaku puszka_po_maku_3 = new PuszkaPoMaku("Z maku mozna zrobic rozne ciekawe rzeczy", 1.5, Metal.Przewodnictwo.POLPRZEWODNIK, 18, 20);

        KartonowaButelka kartonowa_butelka_1 = new KartonowaButelka("Butelka znaleziona pod dywanem", 20, Papier.Kolor.ZOLTY, 9.5, 6.5, 7.5);
        KartonowaButelka kartonowa_butelka_2 = new KartonowaButelka("Zgnieciona butelka", 10, Papier.Kolor.BIALY, 4.5, 4.5, 8.5);
        KartonowaButelka kartonowa_butelka_3 = new KartonowaButelka("Butelka z dziwnego kartonu", 15, Papier.Kolor.INNY, 5.5, 5.5, 9.5);

        KartonPoCiastkach karton_po_ciastkach_1 = new KartonPoCiastkach("Karton po pysznych czekoladowych ciastkach", 3, Papier.Kolor.BIALY, 10, 10, 10);
        KartonPoCiastkach karton_po_ciastkach_2 = new KartonPoCiastkach("Chyba po ciastkach", 6, Papier.Kolor.BIALY, 23, 10, 10);

        WorekPoSzyszkach worek_po_szyszkach_1 = new WorekPoSzyszkach("Zawiazany worek po szyszkach", 1, Plastik.Rodzaj.PET, true);
        WorekPoSzyszkach worek_po_szyszkach_2 = new WorekPoSzyszkach("Przedziwny worek", 4, Plastik.Rodzaj.PP, false);

        Sortownia sortownia = new Sortownia();

        sortownia.dodajSmiecia(butelka_po_mleku_1);
        sortownia.dodajSmiecia(butelka_po_mleku_2);
        sortownia.dodajSmiecia(butelka_po_mleku_3);
        sortownia.dodajSmiecia(puszka_po_maku_1);
        sortownia.dodajSmiecia(puszka_po_maku_2);
        sortownia.dodajSmiecia(puszka_po_maku_3);
        sortownia.dodajSmiecia(kartonowa_butelka_1);
        sortownia.dodajSmiecia(kartonowa_butelka_2);
        sortownia.dodajSmiecia(kartonowa_butelka_3);
        sortownia.dodajSmiecia(karton_po_ciastkach_1);
        sortownia.dodajSmiecia(karton_po_ciastkach_2);
        sortownia.dodajSmiecia(worek_po_szyszkach_1);
        sortownia.dodajSmiecia(worek_po_szyszkach_2);

        sortownia.wyswietlKategorie(Plastik.class);
        System.out.println();
        sortownia.wyswietlKategorie(Szklo.class);
        System.out.println();
        sortownia.wyswietlKategorie(Metal.class);
        System.out.println();
        sortownia.wyswietlKategorie(Papier.class);

        NowaSortownia nowa_sortownia = new NowaSortownia();
        nowa_sortownia.dodajSmiecia(butelka_po_mleku_1);
        nowa_sortownia.dodajSmiecia(butelka_po_mleku_2);
        nowa_sortownia.dodajSmiecia(butelka_po_mleku_3);
        nowa_sortownia.dodajSmiecia(puszka_po_maku_1);
        nowa_sortownia.dodajSmiecia(puszka_po_maku_2);
        nowa_sortownia.dodajSmiecia(puszka_po_maku_3);
        nowa_sortownia.dodajSmiecia(kartonowa_butelka_1);
        nowa_sortownia.dodajSmiecia(kartonowa_butelka_2);
        nowa_sortownia.dodajSmiecia(kartonowa_butelka_3);
        nowa_sortownia.dodajSmiecia(karton_po_ciastkach_1);
        nowa_sortownia.dodajSmiecia(karton_po_ciastkach_2);
        nowa_sortownia.dodajSmiecia(worek_po_szyszkach_1);
        nowa_sortownia.dodajSmiecia(worek_po_szyszkach_2);

        nowa_sortownia.rozdzielPapiery();

        nowa_sortownia.wyswietlKategorie(Plastik.class);
        System.out.println();
        nowa_sortownia.wyswietlKategorie(Szklo.class);
        System.out.println();
        nowa_sortownia.wyswietlKategorie(Metal.class);
        System.out.println();
        nowa_sortownia.wyswietlKategorie(Papier.class);
        System.out.println();
        nowa_sortownia.wyswietlKategorie(KartonMetalizowany.class);

    }




}

