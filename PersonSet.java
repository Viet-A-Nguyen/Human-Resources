import java.util.ArrayList;

public class PersonSet implements PersonList
{
    protected ArrayList<Person> people;

    public PersonSet()
    {
        people = new ArrayList<Person>();
    }

    @Override
    public void add(Person p)
    {
        if (!people.contains(p))
        {
            people.add(p);
        }
    }

    @Override
    public Person get(int index)
    {
        return people.get(index);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        for (Person p : people)
        {
            sb.append(p.toString()).append("\n");
        }
        return sb.toString();
    }
}
