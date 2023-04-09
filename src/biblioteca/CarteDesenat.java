package biblioteca;

import java.util.Objects;

public class CarteDesenat extends Carte{

    private int nrDesene;


    public CarteDesenat()
    {
        super();
        nrDesene = 0;
    }

    public CarteDesenat(String _nume, int _nrPagini, int _anApartie, int _nrDesene)
    {
        super(_nume, _nrPagini, _anApartie);
        nrDesene = _nrDesene;
    }


    public void setNrDesene(int nrDesene) {
        this.nrDesene = nrDesene;
    }

    public int getNrDesene() {
        return nrDesene;
    }


    @Override
    public String toString() {
        return "CarteDesenat{" + getNume() + " --- " + getAnAparitie() + " pagini: " + getNrPagini() +
                " nrDesene=" + nrDesene +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CarteDesenat that = (CarteDesenat) o;
        return nrDesene == that.nrDesene;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nrDesene);
    }
}
