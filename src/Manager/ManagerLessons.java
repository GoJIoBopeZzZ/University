package Manager;

import Manager.Interfaces.ManagerInterface;
import Models.Lesson;

import java.util.List;

/**
 * Created by _red_ on 13.06.17.
 */
public class ManagerLessons implements ManagerInterface {
    private List<Lesson> lessons;

    @Override
    public void add (Object obj) {
        if (!lessons.contains(obj))
            lessons.add((Lesson) obj);
        else System.out.println("This lesson is already exists!!!");
    }

    @Override
    public boolean findObject (Object obj) {
        if (lessons.contains(obj)) return true;
        else return false;
    }
}
