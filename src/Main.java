public class Main {

    public static void main(String[] args) {

        Printer epson = new Printer("Epson", true);
        epson.printPages(10);
        epson.fillToner(11);
        epson.fillToner(10);
        epson.fillToner(1);
        System.out.println(epson.getTonerLevel());
        epson.printPages(5);

        Printer dell = new Printer("Dell", false);
        dell.printPages(3);

    }
}
