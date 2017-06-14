package Manager;

import Manager.Interfaces.ManagerInterface;
import Models.Journal;

import java.util.List;

/**
 * Created by _red_ on 13.06.17.
 */
public class ManagerJournals implements ManagerInterface{
    private List<Journal> journals;

    public static final ManagerJournals INSTANCE = new ManagerJournals();

    @Override
    public void add (Object obj) {
        if (!journals.contains(obj))
            journals.add((Journal) obj);
        else System.out.println("This journal is already exists!!!");
    }

    @Override
    public boolean findObject (Object obj) {
        if (journals.contains(obj)) return true;
        else return false;
    }

    public List<Journal> getJournals () {
        return journals;
    }

    public void setJournals (List<Journal> journals) {
        this.journals = journals;
    }
}
