package bean;

import java.util.List;

public class User {
    private String name;
    private String number;
    private List<User> chlids;
    private Department college;

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<User> getChlids() {
        return chlids;
    }

    public void setChlids(List<User> chlids) {
        this.chlids = chlids;
    }

    public Department getCollege() {
        return college;
    }

    public void setCollege(Department college) {
        this.college = college;
    }
}
