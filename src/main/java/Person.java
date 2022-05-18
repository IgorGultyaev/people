public class Person{
    protected final String name;
    protected final String surname;
    protected int age;
    protected final String address;

    public Person(String name, String surname, int age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = city;
    }

    public Person(PersonBuilder personBuilder){
        this.name = personBuilder.getName();
        this.surname = personBuilder.getSurname();
        this.age = personBuilder.getAge();
        this.address = personBuilder.getAddress();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void happyBirthday(){
        if (hasAge()) {age++;}
    }

    public boolean hasAge(){
        return age >= 0;
    }

    public PersonBuilder newChildBuilder(){
        return new PersonBuilder(this.surname,this.age,this.address);
    }

    @Override
    public String toString() {
        return  name + " " +surname;
    }
}



