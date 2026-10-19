package bubt.cse.edu.bd;

public class Engine {
    private int noOfStocks;

    public Engine() {

    }

    public Engine(int noOfStocks) {
        this.noOfStocks = noOfStocks;
    }

    public int getNoOfStockss() {
        return this.noOfStocks;
    }

    public void setNoOfStocks(int noOfStocks) {
        this.noOfStocks = noOfStocks;
    }

    public void showDetails(){
        System.out.println("----------------------------------");
        System.out.println("|           Engine Info:         |");
        System.out.println("|--------------------------------|");
        System.out.println("| # of Stocks: " + this.noOfStocks);
        System.out.println("----------------------------------");
    }

    public void operate(){
        System.out.println("The engine with " + this.noOfStocks +
                " stocks is operating...");

    }
}
