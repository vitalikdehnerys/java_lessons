package homework_05;
public class Coin {
	private Double coinValue;
	
	public Coin() {}
	
	public Coin(Double coinValue) {
	this.coinValue=coinValue;
	}

	public Double getCoinValue() {
		return coinValue;
	}

	public void setCoinValue(Double coinValue) {
		this.coinValue = coinValue;
	}

	public static void main(String[] args) {
		Coin coin = new Coin();
		coin.setCoinValue(Math.random()); 
		System.out.println("CoinValue="+coin.coinValue);
		
		// here, if setCoinValue < 0.5 we understand the eagle fell , else the lash fell
		
		if (coin.coinValue<0.5) {
			System.out.println("The eagle fell");	
		} 
		else {
			System.out.println("The lash fell");
		}
		}

}
