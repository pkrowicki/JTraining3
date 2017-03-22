class Movie{

    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "Shark eats a lot of people";
    }

}

class IndependenceDay extends Movie {

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot(){
        return "Aliens attempt to take over planet earth";
    }
}

class Zootopia extends Movie {

    public Zootopia(){
        super("Zootopia");
    }

    @Override
    public String plot(){
        return "Rabbit want to become a policeman";
    }
}

class Rambo extends Movie{
    public Rambo(){
        super("Rambo");
    }

    @Override
    public String plot(){
        return"Ex-commando fights lots of enemies";
    }
}

class TheBig8 extends Movie{
    public TheBig8(){
        super("The Big 8");
    }

//        NO PLOT METHOD HERE

}

public class Main {

    public static void main(String[] args) {

//        Printer epson = new Printer("Epson", true);
//        epson.printPages(10);
//        epson.fillToner(11);
//        epson.fillToner(10);
//        epson.fillToner(1);
//        System.out.println(epson.getTonerLevel());
//        epson.printPages(5);
//
//        Printer dell = new Printer("Dell", false);
//        dell.printPages(3);

        for(int i=0;i<11;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #: " + i + " : " + movie.getName() + "\n"
                                + "Plot: " + movie.plot() + "\n");
        }

    }

    public static Movie randomMovie(){
        int rndmNbr = (int)(Math.random()*5)+1;
        System.out.println("Random number generated: " + rndmNbr);
        switch(rndmNbr){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new Zootopia();
            case 4:
                return new Rambo();
            case 5:
                return new TheBig8();
            default:
                return null;
        }
    }
}
