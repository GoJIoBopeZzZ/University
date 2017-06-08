package Models;

/**
 * Created by _red_ on 08.06.17.
 */
public class Contact {
    private ContactType type;
    private String value;

    public ContactType getType() {
        return type;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (this.type != ((Contact)o).getType()) return false;
        if (this.type != ((Contact)o).getType()) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
