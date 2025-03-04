package innerclass;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Quiz1 {
	public static void main(String[] args) {
		Frame frame = new Frame();
		frame.setLayout(new FlowLayout());
		frame.setBounds(500, 300, 500, 300);
		frame.setVisible(true);
		
		//키이벤트
		//키보드에서 아무키나 누르면 "키가 눌렸습니다!"출력
//		frame.addKeyListener(new EventHandler2());
		
		frame.addKeyListener(new KeyListener() {
			public void keyPressed(KeyEvent e) {
				System.out.println("키가 눌렸습니다!");
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
	}
}

class EventHandler2 implements KeyListener {

	public void keyPressed(KeyEvent e) {
		System.out.println("키가 눌렸습니다!");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}