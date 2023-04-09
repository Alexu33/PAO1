package biblioteca;

import java.util.*;

public class Autor extends Persoana{
    private int nrCartiScrise;


    public Autor(){
        super();
        nrCartiScrise = 0;
    }
    public Autor(String _nume, int _varsta)
    {
        super(_nume,_varsta);
        nrCartiScrise = 0;
    }
    public Autor(String _nume, int _varsta, int _nrCartiScrise)
    {
        super(_nume, _varsta);
        nrCartiScrise = _nrCartiScrise;
    }



    public void setNrCartiScrise(int nrCartiScrise) {
        this.nrCartiScrise = nrCartiScrise;
    }
    public int getNrCartiScrise() {
        return nrCartiScrise;
    }




    @Override
    public String toString() {
        return "Autor{" + getNume() + " --- " + getVarsta() +
                " nrCartiScrise=" + nrCartiScrise +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), nrCartiScrise);
    }




}
