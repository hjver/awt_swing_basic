package awt;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//awt
public class awt3_1 {
	public static void main(String[] args) {
		new awt3_login();
	}
}

class awt3_login extends awt_design{
	public awt3_login() {
		this.design(40, 40, 450, 200);
		this.fr.addWindowListener(new closeFrame());
	}
}

class closeFrame extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}