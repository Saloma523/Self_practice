package day30_InheritanceContinue.cryptoTask;

public class CryptoToken {
    private double price;
    private int quantity, marketCap, volume,  circulatingSupply;
    private boolean isMineable;

    public CryptoToken(double price, int quantity, int marketCap, int volume, int circulatingSupply, boolean isMineable) {
       setPrice(price);
       setQuantity(quantity);
       setMarketCap(marketCap);
       setVolume(volume);
      setCirculatingSupply(circulatingSupply);
      setMineable(isMineable);
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            System.exit(1);
        }
        this.price = price;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        if(price <= 0){
            System.exit(1);
        }
        this.quantity = quantity;
    }

    public int getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(int marketCap) {

        if(price <= 0){
            System.exit(1);
        }
        this.marketCap = marketCap;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getCirculatingSupply() {
        return circulatingSupply;
    }

    public void setCirculatingSupply(int circulatingSupply) {
        this.circulatingSupply = circulatingSupply;
    }

    public boolean isMineable() {
        return isMineable;
    }

    public void setMineable(boolean mineable) {
        isMineable = mineable;
    }

    public double totalPrice(){
        return price * quantity;
    }

    public String toString() {
        return getClass().getSimpleName() + "{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", volume=" + volume +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }
}
/*
cryptoTask
	1. create a class called CryptoToken
			variables:
				price, quantity, marketCap, volume, circulatingSupply, isMineable (boolean)

			Encapsulate all the fields
				Conditions:
					1. price can not be set to zero or negative
					2. quantity can nt set to negative
					3. marketCap can not be zero

			methods:
				toString()
				totalPrice(): returns the total price of the cyrpto totek ( price * quantity)

	2. create 5 sub classes of CryptoToken:
			Bitcoin
			Ethereum
			Cardano
			XRP
			Doge

	3. create a class named MyWallet

		create one object of each CryptoToken

		calculate the total Asset

 */