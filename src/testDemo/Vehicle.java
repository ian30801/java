package testDemo;

public interface Vehicle {
	// 發動方式 
	public void launch(String launch); 
	
	// 移動里程
	public void move(int move); 
	
	// 停止
	public void stop(); 

	// 補充能源
	public void addEnergy(); 
}
