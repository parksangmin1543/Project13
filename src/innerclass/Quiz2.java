package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz2 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);		
		TextArea area = new TextArea("텍스트상자", 10, 50);
		frame.add(area);
		frame.setVisible(true);
		
		area.addFocusListener(new FocusListener() {

			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("포거스가 되었습니다.");
			}

			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("포거스가 벗어났습니다.");
			}
			
		});
		
		area.addFocusListener(new NewFocusListener());
	}
}

class NewFocusListener implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("포거스가 되었습니다.");
	}

	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("포거스가 벗어났습니다.");
	}
	
}