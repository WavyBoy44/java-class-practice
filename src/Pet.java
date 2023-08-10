public class Pet {
    private int age;
    private String name, location, type;

    public Pet() {
        this.age = 0;
        this.name = "";
        this.location = "";
        this.type = "";
    }

    public Pet(int age, String name, String location, String type) {
        this.age = age;
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
