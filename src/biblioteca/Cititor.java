package biblioteca;
import java.util.*;

public class Cititor extends Persoana {
    private boolean hasPermit;
    private int nrCartiCitite;
    private List<Carte> cartiCitite;



    public Cititor()
    {
        super();
        hasPermit = false;
        nrCartiCitite = 0;
        cartiCitite = new ArrayList<Carte>();
    }
    public Cititor(String _nume, int _varsta)
    {
        super(_nume,_varsta);
        hasPermit = false;
        nrCartiCitite = 0;
        cartiCitite = new ArrayList<Carte>();
    }
    public Cititor(String _nume, int _varsta, boolean _hasPermit, int _nrCartiCitite, List<Carte> _cartiCitite)
    {
        super(_nume, _varsta);
        hasPermit = _hasPermit;
        nrCartiCitite = _nrCartiCitite;
        cartiCitite = new ArrayList<Carte>();
        cartiCitite.addAll(_cartiCitite);
    }
    public Cititor(String _nume, int _varsta, boolean _hasPermit)
    {
        super(_nume, _varsta);
        hasPermit = _hasPermit;
    }


    public void setnrCartiCitite(int nrCartiCitite) {
        this.nrCartiCitite = nrCartiCitite;
    }
    public void setHasPermit(boolean hasPermit) {
        this.hasPermit = hasPermit;
    }

    public void setCartiCitite(List<Carte> cartiCitite) {
        this.cartiCitite.addAll(cartiCitite);
    }

    public int getnrCartiCitite() {
        return nrCartiCitite;
    }
    public boolean getHasPermit() {
        return hasPermit;
    }
    public List<Carte> getCartiCitite()
    {
        List<Carte> aux = new ArrayList<Carte>();
        aux.addAll(cartiCitite);
        return aux;
    }

    public List<Carte> getRefCartiCitite()
    {
        return cartiCitite;
    }

    @Override
    public String toString() {
        return "Cititor{" + getNume() + " === " + getVarsta() +
                " hasPermit=" + hasPermit +
                ", nrCartiCitite=" + nrCartiCitite +
                ", cartiCitite=" + cartiCitite +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cititor cititor = (Cititor) o;
        return hasPermit == cititor.hasPermit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hasPermit, nrCartiCitite, cartiCitite);
    }

    public void insertBook(Carte carteCitita)
    {
        cartiCitite.add(carteCitita);
        nrCartiCitite++;
    }





}


