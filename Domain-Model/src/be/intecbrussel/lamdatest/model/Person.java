package be.intecbrussel.lamdatest.model;

public class Person
{
    private String firstName;
    private String lastName;

    public Person(String myFirstName, String myLastName)
    {
        this.firstName = myFirstName;
        this.lastName = myLastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
}
