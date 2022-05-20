package testDemo;

abstract class Car implements Vehicle {
	private String brand; // 品牌
	private String model; // 型號
	private int launchVolume; // 排氣量
	private String launch; // 發動方式
	private String chargeType; // 補充能源方式
	final int wheelNum = 4; // 輪子數量
	private String velocity; // 速度
	protected double kilometer; // 行駛里程數
	private int fullEnergy; // 能源滿載量
	private double lowElectricity; // 能源剩餘量
	private double energy; // 能源(%)

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getLaunchVolume() {
		return launchVolume;
	}

	public void setLaunchVolume(int launchVolume) {
		this.launchVolume = launchVolume;
	}

	public String getLaunch() {
		return launch;
	}

	public void setLaunch(String launch) {
		this.launch = launch;
	}

	public String getChargeType() {
		return chargeType;
	}

	public void setChargeType(String chargeType) {
		this.chargeType = chargeType;
	}

	public String getVelocity() {
		return velocity;
	}

	public void setVelocity(String velocity) {
		this.velocity = velocity;
	}

	public double getKilometer() {
		return kilometer;
	}

	public void setKilometer(double kilometer) {
		this.kilometer = kilometer;
	}

	public int getFullEnergy() {
		return fullEnergy;
	}

	public void setFullEnergy(int fullEnergy) {
		this.fullEnergy = fullEnergy;
	}

	public double getLowElectricity() {
		return lowElectricity;
	}

	public void setLowElectricity(double lowElectricity) {
		this.lowElectricity = lowElectricity;
	}

	public double getEnergy() {
		return energy;
	}

	public void setEnergy(double energy) {
		this.energy = energy;
	}

	@Override
	public void launch(String s) {
		System.out.println("發動方式:" + s);
	}

	@Override
	public void move(int move) {
		this.kilometer+=move;
//		System.out.println("當前里程數:" + move + "km");
//		kilometer += move;
		System.out.println("總里程數=" + this.kilometer + "km");
	};
}
