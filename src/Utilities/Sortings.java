package Utilities;

import biblioteca.*;

import java.util.Comparator;

public class Sortings
{
    public SortBooksByName getSortBooksByName(){return new SortBooksByName();}
    public SortBooksByNrPages getSortBooksByNrPages(){return new SortBooksByNrPages();}
    public SortBooksByYear getSortBooksByYear(){return new SortBooksByYear();}


    public SortPeopleByName getSortPeopleByName(){return new SortPeopleByName();}
    public SortPeopleByAge getSortPeopleByAge(){return new SortPeopleByAge();}


    public SortReadersByPermit getSortReadersByPermit(){return new SortReadersByPermit();}
    public SortReadersByNrBooksRead getSortReadersByNrBooksRead(){return new SortReadersByNrBooksRead();}


    public SortAuthorsByNrWrittenBooks getSortAuthorsByNrWrittenBooks(){return new SortAuthorsByNrWrittenBooks();}

    public SortSectionsByName getSortSectionsByName() {return new SortSectionsByName();}
}

class SortBooksByName implements Comparator<Carte>
{
    public int compare(Carte a, Carte b)
    {
        return a.getNume().compareTo(b.getNume());
    }
}

class SortBooksByNrPages implements Comparator<Carte>
{

    public int compare(Carte a, Carte b) {
        return a.getNrPagini() - b.getNrPagini();
    }
}

class SortBooksByYear implements Comparator<Carte>
{
    public int compare(Carte a,Carte b) {return a.getAnAparitie() - b.getAnAparitie();}
}


class SortPeopleByName implements Comparator<Persoana>
{
    public int compare(Persoana a, Persoana b)
    {
        return a.getNume().compareTo(b.getNume());
    }
}
class SortPeopleByAge implements Comparator<Persoana>
{
    public int compare(Persoana a,Persoana b)
    {
        return a.getVarsta() - b.getVarsta();
    }
}




class SortReadersByPermit implements Comparator<Cititor>
{
    public int compare(Cititor a, Cititor b)
    {
        return Boolean.compare(a.getHasPermit(),b.getHasPermit());
    }
}
class SortReadersByNrBooksRead implements Comparator<Cititor>
{
    public int compare(Cititor a,Cititor b)
    {
        return a.getnrCartiCitite() - b.getnrCartiCitite();
    }
}



class SortAuthorsByNrWrittenBooks implements Comparator<Autor>
{
    public int compare(Autor a, Autor b)
    {
        return a.getNrCartiScrise() - b.getNrCartiScrise();
    }
}





class SortSectionsByName implements Comparator<Sectiune>
{
    public int compare(Sectiune a, Sectiune b)
    {
        return a.getNume().compareTo(b.getNume());
    }


}