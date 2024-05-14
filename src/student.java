public class student {
    String _name, _surname, _address;
    int age, id;

    void modules()
    {
        System.out.println("Maths");
        System.out.println("Stats");
        System.out.println("Physics");
    }
    public void set_name(String name)
    {
        _name = name;

    }
    public String get_name()
    {
        return _name;
    }
    public  void set_surname(String surname)
    {
        _surname = surname;
    }
    public String get_surname()
    {
        return _surname;
    }
    public  void set_address(String address)
    {
        _address = address;
    }
    public String get_address()
    {
        return _address;
    }
    public  void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }

}
