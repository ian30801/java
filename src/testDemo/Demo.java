package testDemo;

public class Demo {
	public static void main(String[] args) {
		Telsa t = new Telsa();
		t.show();
		t.launch("PUSH START");
		t.stop("發動");
		t.move(200);
		t.move(300);
		t.stop("發動");
		t.addEnergy("充電");
		
//		Gogoros g = new Gogoro();
//		g.show();
//		g.launch("PUSH START");
//		g.move(140);
//
//		FordFiesta f = new FordFiesta();
//		f.show();
//		f.launch("PUSH START");
//		f.move(140);
//
//		SYNGT125 s = new SYNGT125();
//		s.show();
//		s.launch("KEY");
//		s.move(140);
	}
}