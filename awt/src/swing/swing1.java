package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

//SWING => AWT 발전된 GUI
/*
 * JFrame => JPanel => JObject
 */
public class swing1 {
	public static void main(String[] args) {
		new swing1_box();
	}
}

class swing1_box extends JFrame{
	JPanel contentPane = null;
	JTextField mid = null;
	
	public swing1_box() {
		setBounds(100, 100, 450, 300); //해당 JFrame 위치 및 크기
		
		this.contentPane = new JPanel();  //오브젝트를 생성할 수 있도록 클래스를 로드
		//화면의 위치에 따른 외곽선
		this.contentPane.setBorder(new EmptyBorder(5,5,5,5)); //여백->top,left,bottom,right
		//this.contentPane.setBounds(5,5,200,200);
		//this.contentPane.setBackground(Color.red);
		JButton btn = new JButton("클릭!!");
		btn.setFont(new Font("돋움체", Font.PLAIN,12));
		btn.setBackground(Color.black);
		btn.setForeground(Color.white);
		btn.setBounds(10,10,100,30);
		
		this.mid = new JTextField();
		this.mid.setBounds(10,40,200,30);
		
		
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);
		
		setVisible(true);  //JFrame 보여주는 true, false 보이지 않ㄷ록 설정
		setTitle("SWING 연습1");  //JFrame 타이틀 제목
		
		this.contentPane.add(btn);
		this.contentPane.add(this.mid);
		
		btn.addActionListener(new ActionListener() {	
			JOptionPane alert = new JOptionPane();
			String userid = mid.getText();
			
			@SuppressWarnings("static-access")
			@Override
			public void actionPerformed(ActionEvent e) {
				if(userid.equals("")) {
					alert.showMessageDialog(null, "아이디를 입력하세요!");
				}
				//System.exit(0);			
			}
		});
	}
}
