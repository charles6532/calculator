import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.math.BigDecimal;
import java.math.MathContext;

class CalculatorStudy_2 extends JFrame implements ActionListener{
	private JPanel p1,p2,p3;
	private JButton zero, one, two,three, four,five,six,seven,eight,nine,plus,minus,multiply,division,back_space,dot,pl_mi,button_c,button_ce,button_eq;
	private JTextArea ta;
	private JLabel la, lb;
	private JTextField tf;
	private JScrollPane sp;
	private String s0, s1, s2; 
	
	public CalculatorStudy_2 () {
		Font f = new Font ( Font.SANS_SERIF, Font.BOLD, 20 );
		Font f2 = new Font ( Font.SANS_SERIF, Font.ITALIC, 25 );
		s0 = s1 = s2 = ""; 
		
		//하단		
		p1 = new JPanel();
		p1.setLayout ( new GridLayout(0,4));
		zero = new JButton( "0" );
		one = new JButton( "1" );
		two = new JButton( "2" );
		three = new JButton( "3" );
		four = new JButton( "4" );
		five = new JButton( "5" );
		six = new JButton( "6" );
		seven = new JButton( "7" );
		eight = new JButton( "8" );
		nine = new JButton( "9" );
		plus = new JButton( "+" );
		minus = new JButton( "-" );
		multiply = new JButton( "x" );
		division = new JButton( "÷" );
		back_space = new JButton( "<" );
		dot = new JButton( "." );
		pl_mi = new JButton( "±" );
		button_c = new JButton( "C" );
		button_ce = new JButton( "AC" );
		button_eq = new JButton( "=" );		
		zero.setFont( f2 );
		one.setFont( f2 );
		two.setFont( f2 );
		three.setFont( f2 );
		four.setFont( f2 );
		five.setFont( f2 );
		six.setFont( f2 );
		seven.setFont( f2 );
		eight.setFont( f2 );
		nine.setFont( f2 );
		plus.setFont( f2 );
		minus.setFont( f2 );
		multiply.setFont( f2 );
		division.setFont( f2 );
		back_space.setFont( f2 );
		dot.setFont( f2 );
		pl_mi.setFont( f2 );
		button_c.setFont( f2 );
		button_ce.setFont( f2 );
		button_eq.setFont( f2 );
		zero.setBackground ( new Color(210, 221, 229 ));
		one.setBackground ( new Color(210, 221, 229 ));
		two.setBackground ( new Color(210, 221, 229 ));
		three.setBackground ( new Color(210, 221, 229 ));
		four.setBackground ( new Color(210, 221, 229 ));
		five.setBackground ( new Color(210, 221, 229 ));
		six.setBackground ( new Color(210, 221, 229 ));
		seven.setBackground ( new Color(210, 221, 229 ));
		eight.setBackground ( new Color(210, 221, 229 ));
		nine.setBackground ( new Color(210, 221, 229 ));
		plus.setBackground ( new Color(210, 221, 229 ));
		minus.setBackground ( new Color(210, 221, 229 ));
		multiply.setBackground ( new Color(210, 221, 229 ));
		division.setBackground ( new Color(210, 221, 229 ));
		back_space.setBackground ( new Color(210, 221, 229 ));
		dot.setBackground ( new Color(210, 221, 229 ));
		pl_mi.setBackground ( new Color(210, 221, 229 ));
		button_c.setBackground ( new Color(210, 221, 229 ));
		button_ce.setBackground ( new Color(210, 221, 229 ));
		button_eq.setBackground ( new Color(210, 221, 229 ));
		p1.setFont( f );
		p1.add( button_ce );
		p1.add( button_c );
		p1.add( back_space );
		p1.add( division );
		p1.add( seven );
		p1.add( eight );
		p1.add( nine );
		p1.add( multiply );
		p1.add( four );
		p1.add( five );
		p1.add( six );
		p1.add( minus );
		p1.add( one);
		p1.add( two );
		p1.add( three );
		p1.add( plus );
		p1.add( pl_mi );
		p1.add( zero );
		p1.add( dot );
		p1.add( button_eq );
		add(p1,"South");
		
		
		
		//상단
		p2 = new JPanel();
		p2.setLayout ( new BorderLayout(20,20));
		la = new JLabel ("  Input :  ");
		tf = new JTextField();
		tf.setEditable(false);
		la.setFont ( f );
		tf.setFont ( f ) ;
		p2.add(la,"West");
		p2.add(tf,"Center");
		add(p2,"North");
		
		//중단
		p3 = new JPanel();
		p3.setLayout ( new BorderLayout(20,20));
		JPanel p4 = new JPanel();
		lb = new JLabel ("  Result :");
		ta = new JTextArea();
		sp = new JScrollPane( ta );
		lb.setFont ( f );
		ta.setFont ( f );
		p4.setBackground(Color.GREEN);
		ta.setEditable( false );
		p3.add(lb,"West");
		p3.add(sp,"Center");
		p3.add(p4,"East");
		add(p3,"Center");
		
		setResizable( false );
		setBounds(1000,200, 450,750);
		setVisible( true );

		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		//key event
		/*
		tf.addKeyListener(
			new KeyAdapter(){
				public void keyPressed(KeyEvent e ){
					switch( e.getKeyCode() ){
					case KeyEvent.VK_ESCAPE : tf.setText("");break;
					case KeyEvent.VK_0 | KeyEvent.VK_NUMPAD0: ta.append("0"); break;
					case KeyEvent.VK_1 | KeyEvent.VK_NUMPAD1  : ta.append("1"); break;
					case KeyEvent.VK_2 | KeyEvent.VK_NUMPAD2  : ta.append("2"); break;
					case KeyEvent.VK_3 | KeyEvent.VK_NUMPAD3  : ta.append("3"); break;
					case KeyEvent.VK_4 | KeyEvent.VK_NUMPAD4  : ta.append("4"); break;
					case KeyEvent.VK_5 | KeyEvent.VK_NUMPAD5  : ta.append("5"); break;
					case KeyEvent.VK_6 | KeyEvent.VK_NUMPAD6  : ta.append("6"); break;
					case KeyEvent.VK_7 | KeyEvent.VK_NUMPAD7  : ta.append("7"); break;
					case KeyEvent.VK_8 | KeyEvent.VK_NUMPAD8  : ta.append("8"); break;
					case KeyEvent.VK_9 | KeyEvent.VK_NUMPAD9  : ta.append("9"); break;
					case KeyEvent.VK_N : 
						if( e.getModifiers() == KeyEvent.CTRL_MASK ){
							ta.setText("");
							tf.setText("");
							ta.setBackground( getBackground());
							ta.setForeground( getForeground());
							tf.requestFocus();
						}
						break;
					default:
					}
				}
			}	
		);
		*/

		
		zero.addActionListener ( this);
		one.addActionListener ( this);
		two.addActionListener ( this);
		three.addActionListener ( this);
		four.addActionListener ( this);
		five.addActionListener ( this);
		six.addActionListener ( this);
		seven.addActionListener ( this);
		eight.addActionListener ( this);
		nine.addActionListener ( this);
		plus.addActionListener ( this);
		minus.addActionListener ( this);
		multiply.addActionListener ( this);
		division.addActionListener ( this);
		back_space.addActionListener ( this);
		tf.addActionListener ( this);
		dot.addActionListener ( this);
		pl_mi.addActionListener ( this);
		button_c.addActionListener ( this);
		button_ce.addActionListener ( this);
		button_eq.addActionListener ( this);
		
	} // constructor
	
	// ActionEvent
	public void actionPerformed( ActionEvent e ){
		Object source = e.getSource();
		String s = e.getActionCommand();
		
  
        // if the value is a number
		if (source == back_space){
			if ( !tf.getText().equals( "") ){
				StringBuffer sb1 = new StringBuffer(tf.getText());
				tf.setText(sb1.substring(0,sb1.length()-1));
				s0 = sb1.substring(0,sb1.length()-1);
			}
			tf.requestFocus();
		}else{
			
			if ( s.charAt(0) == '.') { 
					
				if(tf.getText().charAt(tf.getText().length()-1) != '.'){
					// if operand is present then add to second no 
					if (!s1.equals("")) 
						s2 = s2 + s; 
					else
						s0 = s0 + s; 
				} else{

				
				}
	  
				// set the value of text 
				tf.setText(s0 + s1 + s2); 
			} 
			else if (s.charAt(0) >= '0' && s.charAt(0) <= '9' ) {
				// if operand is present then add to second no 
				if (!s1.equals("")) 
					s2 = s2 + s; 
				else
					s0 = s0 + s; 

				// set the value of text 
				tf.setText(s0 + s1 + s2);
			}
			else if (s.charAt(0) == 'C') { 
				// clear the one letter 
				s0 = s1 = s2 = ""; 
	  
				// set the value of text 
				tf.setText(s0 + s1 + s2); 
			} 
			else if (s.charAt(0) == 'A') { 
				// clear the one letter 
				s0 = s1 = s2 = ""; 
	  
				// set the value of text 
				tf.setText(s0 + s1 + s2); 
				ta.setText("");
			} else if (s.charAt(0) == '=') { 
				if(s1.equals("")&&s2.equals("")){
					BigDecimal tem = new BigDecimal(0);
					double te; 
					MathContext mc = new MathContext(6);
					
					
					// store the value in 1st 
					if (s1.equals("+")) 
						tem = new BigDecimal(Double.parseDouble(s0)).add(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32)).round(mc).stripTrailingZeros();
					else if (s1.equals("-")) 
						tem = new BigDecimal(Double.parseDouble(s0)).subtract(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32)).round(mc).stripTrailingZeros();
					else if (s1.equals("÷"))
						tem = new BigDecimal(Double.parseDouble(s0)).divide(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32),6,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
					else if (s1.equals("x"))
						tem = new BigDecimal(Double.parseDouble(s0)).multiply(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32)).round(mc).stripTrailingZeros();
				
					
					// set the value of text
					tf.setText(s0 + s1 + s2 + "=" + tem );
					ta.append(s0 + s1 + s2 + "=" + tem+"\n" );
					// convert it to string 
					s0 = tem.toString(); 
					
					s1 = s2 = "";
				} else{
					BigDecimal tem = new BigDecimal(0);
					double te; 
					MathContext mc = new MathContext(6);
					
					// store the value in 1st 
					if (s1.equals("+")) 
						tem = new BigDecimal(Double.parseDouble(s0)).add(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32)).round(mc).stripTrailingZeros();
					else if (s1.equals("-")) 
						tem = new BigDecimal(Double.parseDouble(s0)).subtract(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32)).round(mc).stripTrailingZeros();
					else if (s1.equals("÷"))
						tem = new BigDecimal(Double.parseDouble(s0)).divide(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32),6,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
					else if (s1.equals("x"))
						tem = new BigDecimal(Double.parseDouble(s0)).multiply(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32)).round(mc).stripTrailingZeros();
		  
					
					// set the value of text
					tf.setText(s0 + s1 + s2 + "=" + tem );
					ta.append(s0 + s1 + s2 + "=" + tem+"\n" );
					// convert it to string 
					s0 = tem.toString();
					
					//s1 = s2 = "";
				}
			} 
		
			else { 
				// if there was no operand 
				if (s1.equals("") || s2.equals("")) {
					
					s1 = s; 
				}
				// else evaluate 
				else { 
					double te; 
					// BigDecimal temm; // 이렇게만 하면 초기화가 안될 수 있다
					BigDecimal tem = new BigDecimal(0);
					MathContext mc = new MathContext(6);
					
					// store the value in 1st 
					if (s1.equals("+")) {
						tem = new BigDecimal(Double.parseDouble(s0)).add(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32)).round(mc).stripTrailingZeros();
					}
					else if (s1.equals("-")) {
						tem = new BigDecimal(Double.parseDouble(s0)).subtract(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32)).round(mc).stripTrailingZeros();
					}
					else if (s1.equals("÷")) {
						tem = new BigDecimal(Double.parseDouble(s0)).divide(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32),6,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
					}
					else if (s1.equals("x")){
						tem = new BigDecimal(Double.parseDouble(s0)).multiply(new BigDecimal( Double.parseDouble(s2), MathContext.DECIMAL32)).round(mc).stripTrailingZeros();
					}
					
					
					// s0 = tem.toString();  
					// place the operator 
					s1 = s; 
					// make the operand blank 
					s2 = ""; 
				} 
	  
				// set the value of text 
				tf.setText(s0 + s1 + s2); 
			}
		}
	}//action event
	
	public static void main(String[] args) {
		new CalculatorStudy_2();
	}
}
