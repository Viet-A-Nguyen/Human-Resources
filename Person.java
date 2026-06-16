public class Person
{
    private String name;
    private double height;
    private double weight;

    public Person(String name, double height, double weight)
    {
        this.name   = name;
        this.height = height;
        this.weight = weight;
    }

    public String getName()   { return name;   }
    public double getHeight() { return height; }
    public double getWeight() { return weight; }

    public void setHeight(double height) { this.height = height; }
    public void setWeight(double weight) { this.weight = weight; }

    @Override
    public String toString()
    {
        return name + "\t" + height + "\t\t\t\t" + weight;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null) return false;
        if (o == this) return true;
        if (!(o instanceof Person)) return false;

        Person p = (Person) o;

        if (p.name.equals(this.name)
                && p.height == this.height
                && p.weight == this.weight)
            return true;

        return false;
    }
}
