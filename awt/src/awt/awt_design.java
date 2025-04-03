package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

//awt3_1 Frame Design 파트
public class awt_design {
	Frame fr = new Frame();
	Button btn = null;      //로그인 버튼
	TextField mid = null;   //아이디를 받는 오브젝트
	TextField mpass = null; //패스워드를 받는 오브젝트
	Label msg = null;       //메세지를 출력하는 오브젝트
	Label text1 = new Label("아이디");
	Label text2 = new Label("패스워드");
		
	public void design(int x, int y, int width, int height) {
		this.fr.setBounds(x, y, width, height);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.btn = new Button("로그인");
		this.mid = new TextField();
		this.mpass = new TextField();
		this.msg = new Label();
		
		//해당 오브젝트 위치 선정 및 타이틀 적용
		this.fr.setTitle("회원 로그인");
		//아이디
		this.text1.setBounds(20, 40, 100, 30);
		this.mid.setBounds(150, 40, 200, 30);
		//패스워드
		this.text2.setBounds(20, 70, 100, 30);
		this.mpass.setBounds(150, 70, 200, 30);
		this.mpass.setEchoChar('*');
		this.btn.setBounds(360, 40, 80, 60);
		this.msg.setBounds(20, 120, 400, 30);
		this.msg.setBackground(Color.yellow);
		this.msg.setForeground(Color.red);  //안내 메세지는 붉은색으로 표시
		
		fr.setVisible(true);
		fr.setLayout(null);
		
		this.fr.add(this.text1);
		this.fr.add(this.text2);
		this.fr.add(this.mid);
		this.fr.add(this.mpass);
		this.fr.add(this.btn);
		this.fr.add(this.msg);
		this.clicks();
		System.out.println();
	}
	
	public void clicks() { //버튼 핸들링만 처리하는 메서드
		
		//버튼 클릭시 해당 메소드
		this.btn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); //Swing API용
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String mid2 = mid.getText();
				String mpass2 = mpass.getText();
				
				if(mid2.equals("") || mpass2.equals("")) {
					//msg.setText("아이디 및 패스워드를 입력하세요!");
					alert.showMessageDialog(null, "아이디 및 패스워드를 입력하세요");
				}
				else if(mid2.equals("hong") && mpass2.equals("a1234")){
					msg.setText("로그인 되셨습니다.");
				}
				else {
					msg.setText("아이디 및 패스워드를 확인하세요.");
				}
			}
		});
	}
	
}
