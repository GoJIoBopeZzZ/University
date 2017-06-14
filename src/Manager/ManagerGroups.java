package Manager;

import Manager.Interfaces.ManagerInterface;
import Models.Group;

import java.util.*;

/**
 * Created by _red_ on 14.06.17.
 */
public class ManagerGroups implements ManagerInterface {
    private List<Group> groups;

    public static final ManagerGroups INSTACE = new ManagerGroups();

    @Override
    public void add (Object obj) {
        if (!groups.contains(obj))
            groups.add((Group)obj);
        else System.out.println("This group is already exists!!!");
    }

    @Override
    public boolean findObject (Object obj) {
        if (groups.contains(obj)) return true;
        else return false;
    }

    public List<Group> getGroups () {
        return groups;
    }

    public void setGroups (List<Group> groups) {
        this.groups = groups;
    }
}
