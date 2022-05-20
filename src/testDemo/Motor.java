package testDemo;

abstract class Motor  implements Vehicle {
	protected String brand; // 品牌
	protected String model; // 型號
	protected double launchVolume; // 排氣量
	protected String launch; // 發動方式
	protected String chargeType; // 補充能源方式
	protected String wheelNum; // 輪子數量
	protected String velocity; // 速度
	protected double kilometer; // 行駛里程數
	protected double fullEnergy; // 能源滿載量
	protected double lowElectricity; // 能源剩餘量
	protected double energy; // 能源(%)

	public void show() {
		System.out.println("品牌:" + brand);
		System.out.println("型號:" + model);
		System.out.println("排氣量:" + launchVolume + "cc");
//		System.out.println("發動方式:" + launch);
		System.out.println("補充能源方式:" + chargeType);
		System.out.println("輪子數量:" + wheelNum);
		System.out.println("速度:" + velocity);
		System.out.println("行駛里程數:" + kilometer + "km");
		System.out.println("能源滿載量:" + fullEnergy);

	}

}
