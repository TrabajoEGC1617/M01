package domain;

public class Car {

	private String type;
	private String nDoors;
	private Double height;
	private Double weight;
	private Double price;
	private String brand;
	private Power power;
	private String model;
	private Integer year;
	private Double cv;
	private Double consumption;
	
	public Double getConsumption() {
		return consumption;
	}

	public void setConsumption(Double consumption) {
		this.consumption = consumption;
	}

	public Double getCv() {
		return cv;
	}

	public void setCv(Double cv) {
		this.cv = cv;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Car(){
		super();
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getnDoors() {
		return nDoors;
	}

	public void setnDoors(String nDoors) {
		this.nDoors = nDoors;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Power getPower() {
		return power;
	}

	public void setPower(Power power) {
		this.power = power;
	}
	
	
}
