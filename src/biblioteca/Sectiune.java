package biblioteca;

import java.util.Objects;

public class Sectiune {
    private String nume;


    public Sectiune(){
        nume = "";
    }
    public Sectiune(String _nume)
    {
        nume = _nume;
    }





    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }


    @Override
    public String toString() {
        return "Sectiune{" +
                "nume='" + nume + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sectiune sectiune = (Sectiune) o;
        return nume.equals(sectiune.nume);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nume);
    }
}
