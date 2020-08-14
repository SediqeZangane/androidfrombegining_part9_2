package android;

import java.io.Serializable;

public class person implements Serializable {
    public String name;
    public String family;
    public String type;

    public person(String _name, String _family, String _type) {
        name = name;
        family = family;
        type = type;
    }

    public String getName() {
        try {
            return name;
        } catch (Exception ex) {
            return "ex";
        }
    }
}
