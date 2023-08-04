public class Students {
    private String id;
    private String name;
    private String dob;
    private String classlist;

    public Students(String id, String name, String dob, String classlist) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.classlist = classlist;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", classlist='" + classlist + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getClasslist() {
        return classlist;
    }

    public void setClasslist(String classlist) {
        this.classlist = classlist;
    }
}
