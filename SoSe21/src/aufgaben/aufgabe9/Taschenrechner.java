package aufgaben.aufgabe9;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Taschenrechner extends JFrame implements ActionListener {

		JTextField tf;

		public Taschenrechner()
		{
			super("Taschenrechner");
			this.setSize(200, 250);
			this.setLocation(500, 250);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			JPanel panel = this.init();
			this.getContentPane().add(panel);
			this.setVisible(true);
		}
		
		JPanel init()
		{
			JPanel panel = new JPanel();
			panel.setLayout(new BorderLayout());
			
			JPanel oben = new JPanel();
			oben.setLayout(new FlowLayout());
			this.tf = new JTextField(8);
			tf.setEditable(false);
			tf.setFont(new Font("Verdana", Font.PLAIN, 24));
			tf.setHorizontalAlignment(JTextField.RIGHT);
			oben.add(tf);
			
			JPanel mitte = new JPanel();
			mitte.setLayout(new GridLayout(6,3,10,10));
			JButton b[]=new JButton[9];
			 for(int i=0;i<9;i++)
		      {
		        b[i]=new JButton(i+1+"");
		        b[i].addActionListener(this);
		        mitte.add(b[i]);
		      }
			
			JButton b0 = new JButton("0");
			b0.addActionListener(this);
			JButton bMal = new JButton("*");
			bMal.addActionListener(this);
			JButton bDurch = new JButton("/");
			bDurch.addActionListener(this);
			JButton bPlus = new JButton("+");
			bPlus.addActionListener(this);
			JButton bMinus = new JButton("-");
			bMinus.addActionListener(this);
			JButton bKlauf = new JButton("(");
			bKlauf.addActionListener(this);
			JButton bKlzu = new JButton(")");
			bKlzu.addActionListener(this);
			JButton bKomma = new JButton(".");
			bKomma.addActionListener(this);
			JButton bC = new JButton("C");
			bC.addActionListener(this);
			JButton bCE = new JButton("CE");
			bCE.addActionListener(this);
			JButton bErg = new JButton("=");
			bErg.addActionListener(this);

			mitte.add(bKlauf);		
			mitte.add(b0);
			mitte.add(bKlzu);		
			mitte.add(bMal);
			mitte.add(bDurch);
			mitte.add(bPlus);
			mitte.add(bMinus);
			mitte.add(bKomma);
			mitte.add(bErg);
			
			JPanel unten = new JPanel();
			unten.add(bC);
			unten.add(bCE);
		
			panel.add(oben, BorderLayout.NORTH);
			panel.add(mitte, BorderLayout.CENTER);
			panel.add(unten, BorderLayout.SOUTH);
			
			return panel;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String command = e.getActionCommand();
			 Object quelle = e.getSource();
		        if(quelle instanceof JButton )
		        {
		            JButton button = (JButton) quelle;
		            if(button.getActionCommand().equals("="))
		            {
		            	String postfix = infixToPostfix(tf.getText());
		            	tf.setText(evaluate(postfix));
		            }
		            else if(button.getActionCommand().equals("C"))
	            	{
		            	tf.setText("");
	            	}
		            else if(button.getActionCommand().equals("CE"))
		            {
		            	String s = tf.getText();
		            	s = s.substring(0, s.length() - 1);
		            	tf.setText(s);
		            }
		            else 
		            {
		            	tf.setText(tf.getText() + command);
		            }
		        }
		}
		
		
		 static String evaluate(String postfix)
		    {
		        //Stack erzeugen
		        Stack<Integer> stack=new Stack<>();
		          
		        // Alle char nacheinander scannen
		        for(int i=0;i<postfix.length();i++)
		        {
		            char c=postfix.charAt(i);
		              
		            // wenn nummer, dann in den Stack pushen 
		            if(Character.isDigit(c)) stack.push(c - '0');
		              
		           
		            else
		            {
		                int val1 = stack.pop();
		                int val2 = stack.pop();
		                  
		                switch(c)
		                {
		                    case '+':
		                    stack.push(val2+val1);
		                    break;
		                      
		                    case '-':
		                    stack.push(val2- val1);
		                    break;
		                      
		                    case '/':
		                    stack.push(val2/val1);
		                    break;
		                      
		                    case '*':
		                    stack.push(val2*val1);
		              }
		            }
		        }
		        return stack.pop()+"";    
		    }
		 
		 static int precedence(char ch)
		    {
		        switch (ch)
		        {
		        case '+':
		        case '-':
		            return 1;
		      
		        case '*':
		        case '/':
		            return 2;
		 
		        }
		        return -1;
		    }
		      
		   
		    static String infixToPostfix(String exp)
		    {
		        String postfix = new String("");
		        Stack<Character> stack = new Stack<>();
		         
		        for (int i = 0; i<exp.length(); ++i)
		        {
		            char c = exp.charAt(i);
		             
		           
		            if (Character.isLetterOrDigit(c))
		                postfix += c;
		              
		            
		            else if (c == '(')
		                stack.push(c);
		             
		           
		            else if (c == ')')
		            {
		                while (!stack.isEmpty() &&
		                        stack.peek() != '(')
		                    postfix += stack.pop();
		                 
		                    stack.pop();
		            }
		            else 
		            {
		                while (!stack.isEmpty() && precedence(c) < precedence(stack.peek()))
		                {
		                    postfix += stack.pop();
		                }
		                stack.push(c);
		            }
		        }
		      
		        
		        while (!stack.isEmpty())
		        {
		            postfix += stack.pop();
		        }
		        return postfix;
		    }
		    
		    //simple rechnungsmethode
		 public static String calculate(String expression) {
		      char[] arr = expression.toCharArray();
		      String operand1 = "";
		      String operand2 = "";
		      String operator = "";
		      double result = 0;

		      for (int i = 0; i < arr.length; i++) {
		         if (arr[i] >= '0' && arr[i] <= '9' || arr[i] == '.') 
		         {
		            if(operator.isEmpty()){
		               operand1 += arr[i];
		            }else{
		               operand2 += arr[i];
		            }
		         }  

		         if(arr[i] == '+' || arr[i] == '-' || arr[i] == '/' || arr[i] == '*') 
		         {
		            operator += arr[i];
		         }
		      }

		      if (operator.equals("+"))
		         result = (Double.parseDouble(operand1) + Double.parseDouble(operand2));
		      else if (operator.equals("-"))
		         result = (Double.parseDouble(operand1) - Double.parseDouble(operand2));
		      else if (operator.equals("/"))
		         result = (Double.parseDouble(operand1) / Double.parseDouble(operand2));
		      else
		         result = (Double.parseDouble(operand1) * Double.parseDouble(operand2));          
		      return ""+result;
		   }    
		
		public static void main(String[] args) 
		{
			new Taschenrechner();
		}

		


}
