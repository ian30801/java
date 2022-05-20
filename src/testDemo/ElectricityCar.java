package testDemo;

public class ElectricityCar extends Car {

	double hour = 0;
	double energy = 100;
//	double currentKm = 0;
	final double perKilometer = 7;
	// 耗電量
	double cost = (super.kilometer / 7);
	// 單次耗電量是否超過7.5
//	boolean consumePer = (currentKm >= 7.5);
	// 累積耗電量是否超過7.5
//	boolean consumeAcc = super.kilometer > 472.5;

	@Override
	public void addEnergy() {
		// 一度電跑七公里,充飽75度電,總共525公里,一小時7.5度電
		energy = 100 - (super.kilometer / 525 * 100);
		if (super.kilometer > 472.5) {
			System.out.println("電動車能源剩餘量" + (Math.round(energy * 100) / 100.0) + "% ");
			// 耗電量(度)
			System.out.println(super.kilometer / 7);
			System.out.println((Math.round(super.kilometer / 7* 100) / 100.0) + "度");
			while (super.kilometer > 472.5) {
				// 電量小於100%
				energy += 10; // 每小時充10%
				hour++;
				cost -= 7.5;
			}
			if (!(super.kilometer > 472.5)) {
				hour += cost / 7.5;
			}
			System.out.println("電量已經充滿,總共充了" + (Math.round(hour * 100) / 100.0) + "小時");
			this.kilometer = 0;
//		} else if (super.kilometer > 472.5) {
//			System.out.println("電動車能源剩餘量" + (Math.round(energy * 100) / 100.0) + "% ");
//			// 耗電量(度)
//			System.out.println((Math.round(cost * 100) / 100.0) + "度");
//			while (super.kilometer > 472.5) {
//				energy += 10; // 每小時充10%
//				hour++;
//				cost -= 7.5;
//			}
//
//			if (!(super.kilometer > 472.5)) {
//				hour += cost / 7.5;
//			}
//			System.out.println("電量已經充滿,總共充了" + (Math.round(hour * 100) / 100.0) + "小時");
//			kilometer = 0;
		} else {
			System.out.println("電量充足");
		}
	}

	@Override
	public void stop() {
		if (super.kilometer > 472.5) {
			System.out.println("電量不足,引擎無法發動");
//		} else if (consumeAcc) {
//			System.out.println("電量不足,引擎無法發動");
		} else {
			System.out.println("電量充足,引擎已發動");
		}
		
	};
}
