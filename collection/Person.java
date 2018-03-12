package collection;

/**
 * Created by maogou on 2017/5/6.
 */
public class Person implements Comparable{
    private int age;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int age,String name){
        this.age = age;
        this.name = name;
    }

    /*自定义排序规则*/
    @Override
    public int compareTo(Object o) {
        if (o instanceof Person){
            Person p = (Person)o;
            int i = this.age - p.age;
            //如果age比较相同了, 在用name进行比较
            if (i == 0) {
                return this.name.compareTo(p.name);
            }
            return i;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
