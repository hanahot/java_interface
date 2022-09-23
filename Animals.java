public class Animals {

    private String name;
    private int age;

    public Animals(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sound(){
        System.out.println("Aw aw aw")
    }
    public void color(){
        System.out.println("white")
    }

}
