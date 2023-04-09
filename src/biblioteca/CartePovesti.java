package biblioteca;

import java.util.Objects;

public class CartePovesti extends Carte {

    private int nrPovesti;

    public CartePovesti()
    {
        super();
        nrPovesti = 0;
    }

    public CartePovesti(String _nume, int _nrPagini, int _anApartie, int _nrPovesti)
    {
        super(_nume, _nrPagini, _anApartie);
        nrPovesti = _nrPovesti;
    }

    public void setNrPovesti(int nrPovesti) {
        this.nrPovesti = nrPovesti;
    }

    public int getNrPovesti() {
        return nrPovesti;
    }


    @Override
    public String toString() {
        return "CartePovesti{" + getNume() + " --- " + getAnAparitie() + " pagini: " + getNrPagini() +
                " nrPovesti=" + nrPovesti +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CartePovesti that = (CartePovesti) o;
        return nrPovesti == that.nrPovesti;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nrPovesti);
    }
}
