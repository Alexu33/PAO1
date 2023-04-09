package biblioteca;

import java.util.Objects;

public class Manual extends Carte{

    private int nrCapitole;

    public Manual()
    {
        super();
        nrCapitole = 0;
    }

    public Manual(String _nume, int _nrPagini, int _anApartie, int _nrCapitole)
    {
        super(_nume, _nrPagini, _anApartie);
        nrCapitole = _nrCapitole;
    }


    public void setNrCapitole(int nrCapitole) {
        this.nrCapitole = nrCapitole;
    }

    public int getNrCapitole() {
        return nrCapitole;
    }


    @Override
    public String toString() {
        return "Manual{" + getNume() + " ---- " + getAnAparitie() + " pagini: " + getNrPagini() +
                " nrCapitole=" + nrCapitole +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manual manual = (Manual) o;
        return nrCapitole == manual.nrCapitole;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nrCapitole);
    }
}
