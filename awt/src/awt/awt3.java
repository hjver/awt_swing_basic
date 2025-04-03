package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awt3 {
	public static void main(String[] args) {
		new aws3_box().mycode();
	}
}

class aws3_box {
	public void mycode() {
		Frame f = new Frame();
		f.setTitle("로그인 화면");
		f.setBounds(1200, 100, 500, 500);
		
		Label text_id = new Label("아이디");
		text_id.setBounds(50, 50, 50, 30);
		
		TextField id = new TextField();
		id.setBounds(110, 50, 100, 30);
		
		Label text_pw = new Label("패스워드");
		text_pw.setBounds(50, 85, 50, 30);		
		
		TextField pw = new TextField();
		pw.setBounds(110, 85, 100, 30);
		pw.setEchoChar('*');
		
		Button btn = new Button("로그인");
		btn.setBounds(220, 50, 60, 65);
		btn.setBackground(Color.gray);
		
		Label msg = new Label("메세지가 출력되는 곳");
		msg.setBounds(50, 120, 230, 30);
		msg.setBackground(Color.yellow);
		
		f.setVisible(true);
		f.setLayout(null);
		
		f.add(text_id);
		f.add(id);
		f.add(text_pw);
		f.add(pw);
		f.add(btn);
		f.add(msg);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		btn.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String userid = id.getText();
				String userpw = pw.getText();
				
				if(userid.equals("hong") && userpw.equals("a1234")) {
					msg.setText("로그인 하셨습니다.");
				}
				else if(userid.equals("")) {
					msg.setText("아이디를 입력하세요.");
				}
				else if(userpw.equals("")) {
					msg.setText("패스워드를 입력하세요.");
				}
				else {
					msg.setText("아이디 및 패스워드를 확인하세요.");
				}
				
			}
		});
	}
}
