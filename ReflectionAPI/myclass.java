package ReflectionAPI;
public class myclass{
  private String name;
  private int age;
  private String city;
  public myclass(String name, int age, String city) {
    this.name = name;
    this.age = age;
    this.city = city;
  }

    public int getAge() {
        return age;
    }
    public String getCity() {
        return city;
    }
    public String getName() {
        return name;
    }

}