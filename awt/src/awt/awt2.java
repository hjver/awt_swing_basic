package awt;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//아이디 패스워드를 확인하는 AWT
public class awt2 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setTitle("각종 오브젝트 핸들링");
		f.setSize(500, 500);  //Frame 사이즈 (위치 조정 X)
		//f.setBounds(null);  //Frame 화면 위치 + 사이즈
		Checkbox ck = new Checkbox("동의함"); //체크 오브젝트 ("체크내용")
		ck.setBounds(30,40,150,30); //체크박스 + 텍스트내용이 포함된 크기
		Choice cc = new Choice(); //select박스이며, option은 add로 추가
		cc.setBounds(30,80,150,30);
		cc.add("SKT");
		cc.add("KT");
		cc.add("LGT");
		cc.add("알뜰폰");
		
		//CheckboxGroup : radio 오브젝트 처럼 사용가능
		CheckboxGroup radio = new CheckboxGroup();
		//false : 메체크, true : 체크
		Checkbox c1 = new Checkbox("동의함", false, radio);
		Checkbox c2 = new Checkbox("동의안함", true, radio);
		c1.setBounds(30,150,150,30);
		c2.setBounds(200,150,150,30);
		
		//TextArea : 긴 내용의 글을 입력할 때 사용
		TextArea ta = new TextArea("게시글 내용 입력!!");
		ta.setBounds(30, 250, 350, 150);
		
		TextField id = new TextField(); //아이디 입력
		id.setBounds(30,450,100,30);
		
		Button btn = new Button("아이디 줄복체크");
		btn.setBounds(150,450,200,30);
		
		Label msg = new Label();
		msg.setBounds(370,450,100,30);
		msg.setBackground(Color.pink);
		
		f.setVisible(true);
		f.setLayout(null);
		f.add(ck);
		f.add(cc);
		f.add(c1);
		f.add(c2);
		f.add(ta);
		f.add(id);
		f.add(btn);
		f.add(msg);
		f.addWindowListener(new event());  //종료
		
		//버튼에 관련된 메소드 집합
		btn.addActionListener(new ActionListener() {
			//set(setter 값을 입력), get(gettr 값을 가져오는 역할
			@Override
			public void actionPerformed(ActionEvent e) {
				String userid = id.getText();  //사용자가 입력한 값
				if(userid.equals("")) {
					msg.setText("아이디를 입력하세요");
				}
				else if(userid.equals("admin")) {
					msg.setText("이미 가입자 사용자 입니다.");
				}
				else {
					msg.setText("사용가능한 아이디 입니다.");
				}
			}
		});
	}

}

//Frame에 창닫기 버튼을 활성화
class event extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {  //화면에 X 클리시 활성화
		System.exit(0);
	}
}
