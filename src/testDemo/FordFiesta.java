package testDemo;

public class FordFiesta extends Car implements Vehicle {

	public void show() {
		super.brand = "Ford";
		super.model = "Ford Fiesta";
		super.launchVolume = 998;
//		super.launch = "PUSH START";
		super.chargeType = "油";
		super.wheelNum = "4輪";
		super.velocity = "0~146km";
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
		energy = (45 - (kilometer / 20.43)) / 45 * 100; // 剩餘油量%數
		// 油箱45公升 20.43 公里/公升 95油價:$31.8
		if (kilometer > 827.415) {
			System.out.println("油車剩餘油量" + (Math.round(energy * 100) / 100.0) + "% ");

		} else {
			System.out.println("油量充足");
		}
	};

}
