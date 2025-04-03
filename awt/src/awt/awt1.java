package awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * GUI : Window, 웹 브라우져, 아이콘, 버튼, AWT, SWing
 * CLI : CMD, Scanner, Linux, Database 
 * VUI : 음성 인터페이스 -> 네이케이션 형태
 * NUI(Natural User Interface) : 사용자 인터페이스 => 음성, 제스처, 시선, 생체인식
 * AUI : 소리 사용자 인터페이스
 */
public class awt1 {

	public static void main(String[] args) {
		new awt_box().window();
	}

}

//AWT : Frame > Bound > Object
class awt_box{
	public void window() {
		Frame fr = new Frame(); //Window 부분
		fr.setTitle("AWT 기초화면");  //타이틀 제목
		fr.setVisible(true);  //화면을 출력
		fr.setLayout(null);  //제작자가 원하는 위치를 설정
		//화면형태 (화면 X축, 화면 Y축, 가로크기, 세로크기)
		fr.setBounds(150,150,500,500);
		
		//화면에 Object를 생성하는 코드
		Button btn = new Button("클릭");
		btn.setBounds(40,40,100,30);
		
		Button btn2 = new Button("닫기");
		btn2.setBounds(40,90,100,30);
		
		//사용자가 입력하는 오브젝트
		TextField mid = new TextField(5);
		mid.setBounds(40,200,100,30);
		
		TextField mpass = new TextField(5);
		mpass.setBounds(150,200,100,30);
		mpass.setEchoChar('*');  //setEchoChar : 입력한 문자를 다른 무나로 출력하는 역할
				
		Label msg = new Label("고객명이 출력!!");
		msg.setBounds(170,40,100,30);
		msg.setBackground(Color.pink);  //배경색상
		msg.setForeground(Color.blue);  //폰트색상
		
		fr.add(mpass);
		fr.add(mid);
		fr.add(btn2);
		fr.add(msg);
		fr.add(btn);
		
		//addActionListener = ES (addEventListner)
		btn2.addActionListener(new ActionListener() {
			//actionPerformed : 작동방시을 핸들링 하는 메소드
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		
		//클릭이라는 버튼을 클릭시 작동하는 메소드
		btn.addActionListener(new ActionListener() {
			String a = "홍길동";
			
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText(a);	
			}
		});
	}
}