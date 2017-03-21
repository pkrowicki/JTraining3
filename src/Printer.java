/**
 * Created by Pawel Krowicki on 21.03.2017.
 */
public class Printer {

    private String name;
    private int tonerLevel=100;
    private int pgsPrntOnCurrLoad;
    private int pgsPrinted;
    private boolean isDuplex;

    public Printer(String name, boolean isDuplex) {
        this.name = name;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int tonerAmount){
        if(this.tonerLevel<100&&(tonerAmount+this.tonerLevel)<=100) {
            this.tonerLevel = this.tonerLevel + tonerAmount;
            this.pgsPrntOnCurrLoad = 0;
            System.out.println("Reffiled!");
        }else if(this.tonerLevel==100){
            System.out.println("Toner is full! Do not refill!");
        } else if((tonerAmount+this.tonerLevel)>100){
            System.out.println("Overall amount of toner is too high!");
        } else{
            System.out.println("Unknown error. Can not proceed.");
        }
    }

    public void printPages(int amount){
        if(this.isDuplex){
            amount/=2;
        }
        for(int i=1;i<=amount;i++) {
            String duplex;
            if (this.isDuplex) {
                duplex = " Printer is duplex. ";
            } else {
                duplex = " Printer is not duplex. ";
            }
            if (this.tonerLevel > 0) {
                System.out.println("Page printed!" + duplex + "Number of pages printed on current toner: " + ++pgsPrntOnCurrLoad + ".\nOverall: " + ++pgsPrinted + "\nToner level: " + --tonerLevel + "\n***");
            } else {
                System.out.println("Toner level: " + tonerLevel + ".\nPlease, change toner and try again.");
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPgsPrntOnCurrLoad() {
        return pgsPrntOnCurrLoad;
    }

    public int getPgsPrinted() {
        return pgsPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
