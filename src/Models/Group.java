package Models;

import java.util.List;

/**
 * Created by _red_ on 08.06.17.
 */
public class Group {
    private List<Student> listGroup;
    private Long groupID;

    public Group() {
        this.groupID = System.currentTimeMillis() * 21 + System.currentTimeMillis() * 42;
    }

    public Long getGroupID() {
        return groupID;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Group group = (Group) o;

        return groupID.equals(group.groupID);
    }

    @Override
    public int hashCode() {
        return groupID.hashCode();
    }
}
