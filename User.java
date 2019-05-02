public class User {
    private String name;
    private long id;

    public User(String name, long id){
        this.name = name;
        this.id = id;

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }
}
