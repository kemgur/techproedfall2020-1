package projectvendingmachinedt;

public class Products {
	private int productNum;
	private double price;
	private double snicker=2.5;
	private double chipsAhoy=2.2;
	private double pringles=12.99;
	private double milano=14.3;
	private double reeses=3.9;
	private double cocaCola=2.2;
	private double fanta=2.0;
	private double water=1.0;
	private double arizona=1.5;
	private double skittles=1.99;
	
	public int getProductNum() {
		return productNum;
	}
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getSnicker() {
		return snicker;
	}
	public double getChipsAhoy() {
		return chipsAhoy;
	}
	public double getPringles() {
		return pringles;
	}
	public double getMilano() {
		return milano;
	}
	public double getReeses() {
		return reeses;
	}
	public double getCocaCola() {
		return cocaCola;
	}
	public double getFanta() {
		return fanta;
	}
	public double getWater() {
		return water;
	}
	public double getArizona() {
		return arizona;
	}
	public double getSkittles() {
		return skittles;
	}
	@Override
	public String toString() {
		return "Products:\n1.snicker=$" + snicker + ",\n2.chipsAhoy=$"
				+ chipsAhoy + ",\n3.pringles=$" + pringles + ",\n4.milano=$" + milano + ",\n5.reeses=$" + reeses + ",\n6.cocaCola=$"
				+ cocaCola + ",\n7.fanta=$" + fanta + ",\n8.water=$" + water + ",\n9.arizona=$" + arizona + ",\n10.skittles=$" + skittles;
	}
}