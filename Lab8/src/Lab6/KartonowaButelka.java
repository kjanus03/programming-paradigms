package Lab6;

public class KartonowaButelka extends KartonMetalizowany {
    protected double dlugosc;
    protected double szerokosc;
    protected double wysokosc;
    protected double pojemnosc;

    public KartonowaButelka(String nazwa, double waga, Kolor kolor, double dlugosc, double szerokosc, double wysokosc) {
        super(nazwa, waga, kolor);
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.pojemnosc = dlugosc * szerokosc * wysokosc;
    }

    @Override
    public String toString() {
        return "Kartonowa Butelka o wymiarach " + dlugosc + "x" + szerokosc + "x" + wysokosc + "cm i pojemnosci " + pojemnosc + "cm^3";
    }
}
