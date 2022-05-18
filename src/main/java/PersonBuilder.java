public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age = -1;
    protected String address;

    public PersonBuilder(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public PersonBuilder() {
    }

    public PersonBuilder(String surname, int age, String city) {
        this.name = null;
        this.surname = surname;
        this.age = age;
        this.address = city;
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



    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }
    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }
    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }
    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("значение возраст должно быть больше чем \"0\"");
        } else {
            this.age = age;
            return this;
        }
    }

    
    public Person build() {
        if (name == null) {
            throw new IllegalStateException("Не введено обязательное поле \"имя\"");
        } else if (surname == null) {
            throw new IllegalStateException("Не введено обязательное поле \"фамилия\"");
        } else return new Person(this);
    }

    @Override
    public String toString() {
        return surname + " " + name;
    }
}
