package Utilities;

import biblioteca.*;

import java.awt.desktop.SystemEventListener;
import java.util.*;

public class Functions {


    public Persoana ReadPersoana()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Citire persoana");
        System.out.println("nume = "); String _nume = scanner.nextLine();
        System.out.println("varsta = "); int _varsta = scanner.nextInt();
        Persoana a = new Persoana(_nume,_varsta);
        return a;
    }

    public Carte ReadCarte()
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("tip de carte: ");
        System.out.println("1 sau orice int diferit de optiuni. General");
        System.out.println("2. Desenat");
        System.out.println("3. Povesti");
        System.out.println("4. Manual");
        int tip = scanner.nextInt();
        scanner.nextLine();
        System.out.println("citire carte");
        System.out.println("nume = "); String _nume = scanner.nextLine();
        System.out.println("nrPagini = "); int _nrPagini = scanner.nextInt();
        System.out.println("anAparitie = "); int _anAparitie = scanner.nextInt();

        Carte a;
        a = new Carte(_nume, _nrPagini, _anAparitie);
        if(tip == 2)
        {
            System.out.println("nr desene: "); int _nrDesene = scanner.nextInt();
            a = new CarteDesenat(_nume, _nrPagini, _anAparitie, _nrDesene);
        }
        if(tip == 3)
        {
            System.out.println("nr povesti: "); int _nrPovesti = scanner.nextInt();
            a = new CartePovesti(_nume, _nrPagini, _anAparitie, _nrPovesti);
        }
       if(tip == 4)
        {
            System.out.println("nr capitole: "); int _nrCapitole = scanner.nextInt();
            a = new Manual(_nume, _nrPagini, _anAparitie, _nrCapitole);
        }

        return a;

    }

    public Sectiune ReadSectiune()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("citire sectiune");
        System.out.println("nume = "); String _nume = scanner.nextLine();
        Sectiune a = new Sectiune(_nume);
        return a;

    }

    public Autor ReadAutor()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Citire autor");
        System.out.println("nume = "); String _nume = scanner.nextLine();
        System.out.println("varsta = "); int _varsta = scanner.nextInt();
        System.out.println("nrCartiScrise = "); int _nrCartiScrise = scanner.nextInt();
        Autor a = new Autor(_nume, _varsta, _nrCartiScrise);
        return a;

    }

    public Autor ReadAutorData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Citire autor");
        System.out.println("nume = "); String _nume = scanner.nextLine();
        System.out.println("varsta = "); int _varsta = scanner.nextInt();
        Autor a = new Autor(_nume, _varsta);
        return a;
    }

    public Cititor ReadCititor()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Citire cititor");
        System.out.println("nume = "); String _nume = scanner.nextLine();
        System.out.println("varsta = "); int _varsta = scanner.nextInt();
        System.out.println("hasPermit = "); boolean _hasPermit = scanner.nextBoolean();
        System.out.println("nrCartiCitite = "); int _nrCartiCitite = scanner.nextInt();
        int i;
        List<Carte> lista = new ArrayList<Carte>();
        for(i = 1; i<= _nrCartiCitite; i++)
        {
            Carte aux = ReadCarte();
            lista.add(aux);
        }
        Cititor a = new Cititor(_nume, _varsta, _hasPermit, _nrCartiCitite, lista);
        return a;
    }
    public Cititor ReadCititorData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Citire cititor");
        System.out.println("nume = "); String _nume = scanner.nextLine();
        System.out.println("varsta = "); int _varsta = scanner.nextInt();
        System.out.println("hasPermit = "); boolean _hasPermit = scanner.nextBoolean();

        Cititor a = new Cititor(_nume, _varsta, _hasPermit);
        return a;
    }





}




