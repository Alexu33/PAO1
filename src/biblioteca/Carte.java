package biblioteca;

import java.util.Objects;

public class Carte {
    private String nume;
    private int nrPagini;
    private int anAparitie;

    public Carte(){nume = ""; nrPagini = 0; anAparitie = 0;}
    public Carte(String _nume, int _nrPagini, int _anAparitie){nume = _nume; nrPagini = _nrPagini; anAparitie = _anAparitie;}



    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }
    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }
    public void setNume(String nume) {
        this.nume = nume;
    }


    public int getAnAparitie() {
        return anAparitie;
    }
    public int getNrPagini() {
        return nrPagini;
    }
    public String getNume() {
        return nume;
    }


    @Override
    public String toString() {
        return "Carte{" +
                "nume='" + nume + '\'' +
                ", nrPagini=" + nrPagini +
                ", anAparitie=" + anAparitie +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return nume.equals(carte.nume) && (nrPagini == carte.nrPagini) && (anAparitie == carte.anAparitie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, nrPagini, anAparitie);
    }
}
