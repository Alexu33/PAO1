package Utilities;

import biblioteca.Autor;
import biblioteca.Carte;
import biblioteca.Cititor;
import biblioteca.Sectiune;

import java.util.*;

public class Service {
    private Functions functions;
    private Sortings sortings;

    private List<Autor> autors;
    private List<Cititor> cititors;
    private List<Carte> cartes;
    private List<Sectiune> sectiunes;

    private Map<Sectiune,List<Carte>> sectiunecarte;
    private Map<Autor,List<Carte>> autorcarte;

    public Service()
    {
        functions = new Functions();
        sortings = new Sortings();
        autors = new ArrayList<Autor>();
        cititors = new ArrayList<Cititor>();
        cartes = new ArrayList<Carte>();
        sectiunes = new ArrayList<Sectiune>();
        sectiunecarte = new HashMap<>();
        autorcarte = new HashMap<>();
    }

    public void start()
    {
        boolean ok = true;
        Scanner scanner = new Scanner(System.in);
        int optiune;
        while(ok)
        {
            ShowOptions();
            optiune = scanner.nextInt();
            switch (optiune)
            {
                case 0:
                    ok = false;
                    System.out.println("Iesire din service");
                    break;

                case 1:
                    Sectiune sectiuneaux = functions.ReadSectiune();
                    if(!sectiunes.contains(sectiuneaux))
                    {
                        sectiunes.add(sectiuneaux);
                        sectiunecarte.putIfAbsent(sectiuneaux, new ArrayList<Carte>());
                    }
                    else
                        System.out.println("Operatie esuata! Deja exista un obiect identic");
                    break;
                case 2:
                    Carte carteaux = functions.ReadCarte();
                    if (!cartes.contains(carteaux))
                        cartes.add(carteaux);
                    else
                        System.out.println("Operatie esuata! Deja exista un obiect identic");
                    break;

                case 201:
                    Carte carte201 = functions.ReadCarte();
                    if(!cartes.contains(carte201))
                    {
                        System.out.println("Operatie esuata! Nu exista cartea respectiva");
                        break;
                    }
                    Sectiune sectiune201 = functions.ReadSectiune();
                    if(!sectiunes.contains(sectiune201))
                    {
                        System.out.println("Operatie esuata! Nu exista sectiunea respectiva");
                        break;
                    }
                    sectiunecarte.get(sectiune201).add(carte201);
                    System.out.println("Operatie cu succes! adaugat carte la sectiune");
                    break;

                case 202:
                    Carte carte202 = functions.ReadCarte();
                    if(!cartes.contains(carte202))
                    {
                        System.out.println("Operatie esuata! Nu exista cartea respectiva");
                        break;
                    }
                    Autor autor202 = functions.ReadAutorData();
                    if(!autors.contains(autor202))
                    {
                        System.out.println("Operatie esuata! Nu exista autorul respectiv");
                        break;
                    }
                    Set<Autor> autorSet202 = autorcarte.keySet();
                    Autor refautor202 = new Autor();
                    for(Autor aux202 : autorSet202)
                        if(aux202.equals(autor202))
                        {
                            refautor202 = aux202;
                        }
                    List<Carte> lista202 = autorcarte.get(refautor202);
                    lista202.add(carte202);
                    System.out.println("asd: " + lista202);
                    System.out.println("autor debug " + refautor202.toString());
                    // refautor202.setNrCartiScrise(refautor202.getNrCartiScrise() + 1);
                    System.out.println("asd: " + lista202);
                    autorcarte.replace(refautor202, lista202);
                    System.out.println("debug: " + autorcarte.get(refautor202));

                    System.out.println("Operatie cu succes! adaugat carte la autor");
                    break;

                case 203:
                    Carte carte203 = functions.ReadCarte();
                    if(!cartes.contains(carte203))
                    {
                        System.out.println("Operatie esuata! Nu exista cartea respectiva");
                        break;
                    }
                    Cititor cititor203 = functions.ReadCititorData();
                    if(!cititors.contains(cititor203))
                    {
                        System.out.println("Operatie esuata! Nu exista cititorul respectiv");
                        break;
                    }
                    Cititor refcititor203 = new Cititor();
                    for(Cititor cititoraux203 : cititors)
                        if(cititoraux203.equals(cititor203))
                            refcititor203 = cititoraux203;

                    if(refcititor203.getCartiCitite().contains(carte203))
                    {
                        System.out.println("Operatie esuata! Cititorul respectiv a citit deja cartea");
                        break;
                    }
                    refcititor203.insertBook(carte203);
                    System.out.println("Operatie cu succes! adaugat carte la cititor");
                    break;


                case 3:
                    Cititor cititoraux = functions.ReadCititor();
                    if(!cititors.contains(cititoraux))
                        cititors.add(cititoraux);
                    else
                        System.out.println("Operatie esuata! Deja exista un obiect identic");
                    break;
                case 4:
                    Autor autoraux = functions.ReadAutor();
                    if(!autors.contains(autoraux))
                    {
                        autors.add(autoraux);
                        autorcarte.putIfAbsent(autoraux,new ArrayList<Carte>());
                    }
                    else
                        System.out.println("Operatie esuata! Deja exista un obiect identic");
                    break;


                case 5:

                    Set<Sectiune> sectiuneSet5 = sectiunecarte.keySet();
                    for(Sectiune sectiunekey : sectiuneSet5)
                    {
                        System.out.println(sectiunekey.toString());
                        System.out.println(sectiunecarte.get(sectiunekey).toString());
                    }
                    break;
                case 6:
                    for(Carte carte6 : cartes)
                        System.out.println(carte6.toString());
                    break;
                case 7:
                    for(Cititor cititor7 : cititors)
                        System.out.println(cititor7.toString());
                    break;
                case 8:
                    Set<Autor> autorSet8 = autorcarte.keySet();
                    for(Autor autorkey : autorSet8)
                    {
                        System.out.println(autorkey.toString());
                        System.out.println(autorcarte.get(autorkey));
                    }
                    break;

                case 9:
                    Sectiune sectiune9 = functions.ReadSectiune();
                    if(sectiunes.contains(sectiune9))
                    {
                        sectiunes.remove(sectiune9);
                        sectiunecarte.remove(sectiune9);
                    }
                    else
                        System.out.println("Operatie esuata! Nu exista seciunea respectiva");
                    break;

                case 10:
                    Carte carte10 = functions.ReadCarte();
                    if(!cartes.contains(carte10))
                    {
                        System.out.println("Operatie esuata! Nu exista cartea respectiva");
                        break;
                    }
                    Set<Autor> autorkeys10 = autorcarte.keySet();
                    for(Autor autorkey10 : autorkeys10)
                        if(autorcarte.get(autorkey10).contains(carte10))
                            autorcarte.get(autorkey10).remove(carte10);

                    Set<Sectiune> sectiunekeys10 = sectiunecarte.keySet();
                    for(Sectiune sectiunekey10 : sectiunekeys10)
                        if(sectiunecarte.get(sectiunekey10).contains(carte10))
                            sectiunecarte.get(sectiunekey10).remove(carte10);

                    for(Cititor cititor10 : cititors)
                        if(cititor10.getRefCartiCitite().contains(carte10))
                        {
                            cititor10.getRefCartiCitite().remove(carte10);
                            cititor10.setnrCartiCitite(cititor10.getnrCartiCitite() - 1);
                        }


                    cartes.remove(carte10);
                    System.out.println("Operatie cu success!");
                    break;

                case 11:
                    Cititor cititor11 = functions.ReadCititorData();
                    if(!cititors.contains(cititor11))
                    {
                        System.out.println("Operatie esuata! nu exista cititorul respectiv");
                        break;
                    }
                    Cititor refcititor = new Cititor();
                    for(Cititor aux11 : cititors)
                        if(aux11.equals(cititor11))
                            refcititor = aux11;
                    cititors.remove(refcititor);
                    System.out.println("Operatie cu succes!");
                    break;

                case 12:
                    Autor autor11 = functions.ReadAutorData();
                    if(!autors.contains(autor11))
                    {
                        System.out.println("Operatie esuata");
                        break;
                    }
                    Autor refautor = new Autor();
                    for(Autor aux12 : autors)
                        if(aux12.equals(autor11))
                            refautor = aux12;
                    autors.remove(refautor);
                    autorcarte.remove(refautor);
                    System.out.println("Operatie cu success!");
                    break;

                case 131:
                    Collections.sort(sectiunes, sortings.getSortSectionsByName());
                    break;


                case 141:
                    Collections.sort(cartes, sortings.getSortBooksByName());
                    break;
                case 142:
                    Collections.sort(cartes,sortings.getSortBooksByNrPages());
                    break;
                case 143:
                    Collections.sort(cartes, sortings.getSortBooksByYear());
                    break;


                case 151:
                    Collections.sort(cititors, sortings.getSortPeopleByName());
                    break;
                case 152:
                    Collections.sort(cititors, sortings.getSortPeopleByAge());
                    break;
                case 153:
                    Collections.sort(cititors, sortings.getSortReadersByPermit());
                    break;
                case 154:
                    Collections.sort(cititors, sortings.getSortReadersByNrBooksRead());
                    break;



                case 161:
                    Collections.sort(autors, sortings.getSortPeopleByName());
                    break;
                case 162:
                    Collections.sort(autors, sortings.getSortPeopleByAge());
                    break;
                case 163:
                    Collections.sort(autors, sortings.getSortAuthorsByNrWrittenBooks());
                    break;

                
            }
        }
    }
    
    private void ShowOptions()
    {
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Optiuni posibile");
        System.out.println("0. Exit");
        System.out.println("1. Adaugare sectiune");
        System.out.println("2. Adaugare carte");
        System.out.println("201. Mutare carte in sectiune");
        System.out.println("202. Mutare carte la autor");
        System.out.println("203. Mutare carte la cititor");
        System.out.println("3. Adaugare cititor");
        System.out.println("4. Adaugare autor");

        System.out.println("5. Afisare sectiuni");
        System.out.println("6. Afisare carti");
        System.out.println("7. Afisare cititori");
        System.out.println("8. Afisare autor");

        System.out.println("9. Eliminare sectiune");
        System.out.println("10. Eliminare carte");
        System.out.println("11. Eliminare cititor");
        System.out.println("12. Eliminare autor");

        System.out.println("131. Sortare sectiuni dupa nume");


        System.out.println("141. Sortare carti dupa nume");
        System.out.println("142. Sortare carti dupa nrpagini");
        System.out.println("143. Sortare carti dupa anaparitie");


        System.out.println("151. Sortare cititori dupa nume");
        System.out.println("152. Sortare cititori dupa varsta");
        System.out.println("153. Sortare cititori dupa permis");
        System.out.println("154. Sortare cititori dupa nrcarticitite");

        System.out.println("161. Sortare autori dupa nume");
        System.out.println("162. Sortare autori dupa varsta");
        System.out.println("163. Sortare autori dupa nrcartiscrise");

        System.out.println("------------------------------------------------------------------------");
    }


}
