public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String speak()
    {
        int random = (int)(Math.random()*3)+1;
        if (random == 1)
        {
            return "woof!";
        }
        else if (random == 2)
        {
            return "meow!";
        }
        else
        {
            return "BOW DOWN!";
        }
    }

    public void introduce()
    {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}