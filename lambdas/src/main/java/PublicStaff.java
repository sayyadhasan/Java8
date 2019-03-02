public class PublicStaff {
    private String name;
    private Integer age;
    private String extra;

    public PublicStaff(String name, Integer age, String extra) {
        this.name = name;
        this.age = age;
        this.extra = extra;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSalary() {
        return extra;
    }

    public void setSalary(String salary) {
        this.extra = salary;
    }

    @Override
    public String toString() {
        return "PublicStaff{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", extra='" + extra + '\'' +
                '}';
    }
}
