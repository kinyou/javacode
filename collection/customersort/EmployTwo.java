package collection.customersort;

/**
 * Created by maogou on 2017/5/6.
 */
public class EmployTwo {
    private String name;
    private int age;
    private MyDate birthday;

    public EmployTwo(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EmployTwo employTwo = (EmployTwo) o;

        if (age != employTwo.age) return false;
        if (name != null ? !name.equals(employTwo.name) : employTwo.name != null) return false;
        return birthday != null ? birthday.equals(employTwo.birthday) : employTwo.birthday == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + (birthday != null ? birthday.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "EmployTwo{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
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

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }
}
