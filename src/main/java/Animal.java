public class Animal {
    private String name;
    void setName(String name){

        if (name.equals("Rax") || name.equals("Stormy") )
        {
            this.name=name;
        }
    }

    public String eat(String Food)
    {
        System.out.println(name+" eats "+Food);
        return Food;
    }

    public String sounds() {
        System.out.println("sound");
        return null;

    }
}


