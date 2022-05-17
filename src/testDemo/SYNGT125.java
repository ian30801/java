package testDemo;

public class SYNGT125 extends Motor implements Vehicle {

	public void show() {
		super.brand = "SYN";
		super.model = "SYNGT125";
		super.launchVolume = 124.6;
//		super.launch = "電動";
		super.chargeType = "加油";
		super.wheelNum = "2輪";
		super.velocity = "0~98km";
		super.show();
	}

	@Override
	public void launch(String s) {
		System.out.println("發動方式:" + s);
	}

	@Override
	public void move(int m) {
		System.out.println("當前里程數:" + m + "km");
		kilometer += m;
		System.out.println("總里程數=" + kilometer + "km");
		energy = (5.5 - (kilometer / 30)) / 5.5 * 100; // 剩餘油量
		// 油箱5.5公升,30公里/1公升,95油價:$31.8

		if (kilometer > 148.5) {
			System.out.println("剩餘油量僅剩 10% ,該加油了");
		} else {
			System.out.println("油量充足");
		}

	};

}
