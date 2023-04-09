package biblioteca;

import java.util.Objects;

public class Persoana {
    private String nume;
    private int varsta;



    public Persoana(){nume = ""; varsta = 0;}
    public Persoana(String _nume, int _varsta){nume = _nume; varsta = _varsta;}



    public void setNume(String nume) {
        this.nume = nume;
    }
    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }




    public String getNume() {
        return nume;
    }
    public int getVarsta() {
        return varsta;
    }



    @Override
    public String toString() {
        return "Persoana{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana persoana = (Persoana) o;
        return nume.equals(persoana.nume) && (varsta == persoana.varsta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume, varsta);
    }
}
