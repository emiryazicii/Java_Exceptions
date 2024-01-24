package exceptions_in_Java;

public class Person {

    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if(gender == 'M' || gender == 'F'){ // If the gender is valid set it
            this.gender = gender;
        }else {
            throw new IllegalArgumentException("Gender must be 'M' or 'F' ."); // if the gender is invalid crush the program
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age == 0){
            throw new RuntimeException("Age has not been set");
        }
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 150){ // if the given age invalid
            if(age < 0){
                throw new IllegalArgumentException("Age should be greater than 0.");
            }else{
                throw new IllegalArgumentException("Age should be lees than 150");
            }
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
