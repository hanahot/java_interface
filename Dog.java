public class Dog extends Animals{
    int age;

    public Dog(String name, int age){
        super(name);
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
