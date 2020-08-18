
    
public class Currency {
    
    private String iso;
    private String currencyName;
    private double buyRate; 
    private double sellRate;
    
    public Currency(String iso, String currencyName, double buyRate, double sellRate) {
        this.iso = iso;
        this.currencyName = currencyName;
        this.buyRate = buyRate;
        this.sellRate = sellRate;
    }


    public String getIso() {
        return iso;
    }


    public String getCurrencyName() {
        return currencyName;
    }


    public double getBuyRate() {
        return buyRate;
    }


    public double getSellRate() {
        return sellRate;
    }


    public String toString() {
        String output = String.format("-10s %-30s %-20f  %-20f", iso, currencyName, buyRate,sellRate);
        return output;
    }
}
 







