import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.lang.*;

public class Calculator extends JFrame implements ActionListener
{
	JTextField tf;
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,point,plus,minus,mult,div,eq,backSpace,ac,off;
	JPanel panel;
	double ans=0,ans2;
	int i=0,f=0;
	int k=0;
	char c='0';
	String s[]=new String [100];
	String a="";
	
	public Calculator()
	{
		super("Calculator");
		this.setSize(600,800);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel=new JPanel();
		panel.setLayout(null);
		
		tf=new JTextField("0");
		tf.setBounds(90,60,400,35);
		tf.setFont(new Font("Cambrige",Font.BOLD,30));
		tf.setForeground(new Color(0,255,255));
		tf.setBackground(Color.gray);
		tf.setEditable(false);
		tf.setEnabled(true);
		
		panel.add(tf);
		
		backSpace=new JButton("<-");
		backSpace.setBounds(90,110,70,35);
		backSpace.setFont(new Font("Cambrige",Font.BOLD,30));
		backSpace.setForeground(Color.black);
		backSpace.setBackground(Color.white);
		backSpace.addActionListener(this);
		panel.add(backSpace);
		
		ac=new JButton("AC");
		ac.setBounds(190,110,80,35);
		ac.setFont(new Font("Cambrige",Font.BOLD,30));
		ac.setForeground(Color.black);
		ac.setBackground(Color.white);
		ac.addActionListener(this);
		panel.add(ac);
		
		off=new JButton("Off");
		off.setBounds(290,110,100,35);
		off.setFont(new Font("Cambrige",Font.BOLD,30));
		off.setForeground(Color.black);
		off.setBackground(Color.white);
		off.addActionListener(this);
		panel.add(off);
		
		b7=new JButton("7");
		b7.setBounds(90,170,60,30);
		b7.setFont(new Font("Cambrige",Font.BOLD,30));
		b7.setForeground(Color.black);
		b7.setBackground(Color.white);
		b7.addActionListener(this);
		panel.add(b7);
		
		b8=new JButton("8");
		b8.setBounds(180,170,60,30);
		b8.setFont(new Font("Cambrige",Font.BOLD,30));
		b8.setForeground(Color.black);
		b8.setBackground(Color.white);
		b8.addActionListener(this);
		panel.add(b8);
		
		b9=new JButton("9");
		b9.setBounds(270,170,60,30);
		b9.setFont(new Font("Cambrige",Font.BOLD,30));
		b9.setForeground(Color.black);
		b9.setBackground(Color.white);
		b9.addActionListener(this);
		panel.add(b9);
		
		div=new JButton("/");
		div.setBounds(350,170,60,30);
		div.setFont(new Font("Cambrige",Font.BOLD,30));
		div.setForeground(Color.black);
		div.setBackground(Color.white);
		div.addActionListener(this);
		panel.add(div);
		
		b4=new JButton("4");
		b4.setBounds(90,230,60,30);
		b4.setFont(new Font("Cambrige",Font.BOLD,30));
		b4.setForeground(Color.black);
		b4.setBackground(Color.white);
		b4.addActionListener(this);
		panel.add(b4);
		
		b5=new JButton("5");
		b5.setBounds(180,230,60,30);
		b5.setFont(new Font("Cambrige",Font.BOLD,30));
		b5.setForeground(Color.black);
		b5.setBackground(Color.white);
		b5.addActionListener(this);
		panel.add(b5);
		
		b6=new JButton("6");
		b6.setBounds(270,230,60,30);
		b6.setFont(new Font("Cambrige",Font.BOLD,30));
		b6.setForeground(Color.black);
		b6.setBackground(Color.white);
		b6.addActionListener(this);
		panel.add(b6);
		
		mult=new JButton("*");
		mult.setBounds(350,230,60,30);
		mult.setFont(new Font("Cambrige",Font.BOLD,30));
		mult.setForeground(Color.black);
		mult.setBackground(Color.white);
		mult.addActionListener(this);
		panel.add(mult);
		
		b1=new JButton("1");
		b1.setBounds(90,290,60,30);
		b1.setFont(new Font("Cambrige",Font.BOLD,30));
		b1.setForeground(Color.black);
		b1.setBackground(Color.white);
		b1.addActionListener(this);
		panel.add(b1);
		
		b2=new JButton("2");
		b2.setBounds(180,290,60,30);
		b2.setFont(new Font("Cambrige",Font.BOLD,30));
		b2.setForeground(Color.black);
		b2.setBackground(Color.white);
		b2.addActionListener(this);
		panel.add(b2);
		
		b3=new JButton("3");
		b3.setBounds(270,290,60,30);
		b3.setFont(new Font("Cambrige",Font.BOLD,30));
		b3.setForeground(Color.black);
		b3.setBackground(Color.white);
		b3.addActionListener(this);
		panel.add(b3);
		
		minus=new JButton("-");
		minus.setBounds(350,290,60,30);
		minus.setFont(new Font("Cambrige",Font.BOLD,30));
		minus.setForeground(Color.black);
		minus.setBackground(Color.white);
		minus.addActionListener(this);
		panel.add(minus);
		
		b0=new JButton("0");
		b0.setBounds(90,350,60,30);
		b0.setFont(new Font("Cambrige",Font.BOLD,30));
		b0.setForeground(Color.black);
		b0.setBackground(Color.white);
		b0.addActionListener(this);
		panel.add(b0);
		
		point=new JButton(".");
		point.setBounds(180,350,60,30);
		point.setFont(new Font("Cambrige",Font.BOLD,30));
		point.setForeground(Color.black);
		point.setBackground(Color.white);
		point.addActionListener(this);
		panel.add(point);
		
		eq=new JButton("=");
		eq.setBounds(270,350,60,30);
		eq.setFont(new Font("Cambrige",Font.BOLD,30));
		eq.setForeground(Color.black);
		eq.setBackground(Color.white);
		eq.addActionListener(this);
		panel.add(eq);
		
		plus=new JButton("+");
		plus.setBounds(350,350,60,30);
		plus.setFont(new Font("Cambrige",Font.BOLD,30));
		plus.setForeground(Color.black);
		plus.setBackground(Color.white);
		plus.addActionListener(this);
		panel.add(plus);
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==plus)
		{
			c='+';
			if(f==1)
			{
				a="";
				a=Double.toString(ans2);
				ans2=0;
			}
			f=0;
			if(a.length()>0)
			{
				if(k==1)a+="0";
				s[i]=a;
				a="";
				i++;
				s[i]="+";
				i++;
			}
			else if(i==0)
			{
				s[i]="+";
				i++;
			}
			else 
			{
				s[i-1]="+";
			}
			k=0;
			tf.setText("0");
		}
		else if(ae.getSource()==minus)
		{
			c='-';
			if(f==1)
			{
				a="";
				a=Double.toString(ans2);
				ans2=0;
			}
			f=0;
			if(a.length()>0)
			{
				if(k==1)a+="0";
				s[i]=a;
				a="";
				i++;
				s[i]="-";
				i++;
			}
			else if(i==0)
			{
				s[i]="-";
				i++;
			}
			else 
			{
				s[i-1]="-";
			}
			k=0;
			tf.setText("0");
		}
		else if(ae.getSource()==mult)
		{
			c='*';
			if(f==1)
			{
				a="";
				a=Double.toString(ans2);
				ans2=0;
			}
			f=0;
			if(a.length()>0)
			{
				if(k==1)a+="0";
				s[i]=a;
				a="";
				i++;
				s[i]="*";
				i++;
			}
			else if(i==0)
			{
				s[i]="*";
				i++;
			}
			else 
			{
				s[i-1]="*";
			}
			k=0;
			tf.setText("0");
		}
		else if(ae.getSource()==div)
		{
			c='/';
			if(f==1)
			{
				a="";
				a=Double.toString(ans2);
				ans2=0;
			}
			f=0;
			
			if(a.length()>0)
			{
				if(k==1)a+="0";
				s[i]=a;
				a="";
				i++;
				s[i]="/";
				i++;
			}
			else if(i==0)
			{
				s[i]="/";
				i++;
			}
			else 
			{
				s[i-1]="/";
			}
			k=0;
			tf.setText("0");
		}
		else if(ae.getSource()==point)
		{
			if(f==1)
			{
				a="";
			}
			f=0;
			
			if(k==0)
			{
				if(a.length()==0)a+="0.";
				else a+=".";
				k=1;
			}
			tf.setText(a);
		}
		else if(ae.getSource()==backSpace)
		{
			if(f==1)a="";
			int sz=a.length();
			if(sz>0)
			{
				a=a.substring(0,sz-1);
			}
			
			if(sz>1)tf.setText(a);
			else tf.setText("0");
			f=0;
		}
		else if(ae.getSource()==ac)
		{
			for(int j=0;j<=i;j++)s[i]="";
			k=0;i=0;ans=0;a="";ans2=0;
			tf.setText("0");
			f=0;
			ennable();
		}
		else if(ae.getSource()==off)
		{
			for(int j=0;j<=i;j++)s[i]="";
			k=0;i=0;ans=0;a="";
			tf.setText("");
			f=0;
			dissable();
		}
		else if(ae.getSource()==eq)
		{
			if(k==1)a+="0";
			k=0;
			ans=0;
			if(a.length()==0)
			{
				for(int j=0;j<i;j++)
				{
					if(s[j]=="+")
					{
						if(j+1==i)
						{
							a=Double.toString(ans);
							ans+=ans;
						}
						else
						{
							ans+=Double.parseDouble(s[j+1]);
						}
					}
					else if(s[j]=="-")
					{
						if(j+1==i)
						{
							a=Double.toString(ans);
							ans-=ans;
						}
						else
						{
							ans-=Double.parseDouble(s[j+1]);
						}
					}
					else if(s[j]=="*")
					{
						if(j+1==i)
						{
							a=Double.toString(ans);
							ans*=ans;
						}
						else
						{
							ans*=Double.parseDouble(s[j+1]);
						}
					}
					else if(s[j]=="/")
					{
						if(j+1==i)
						{
							a=Double.toString(ans);
							if(ans==0)
							{
								tf.setText("Cannot divide by zero");
								k=-1;break;
							}
							else ans/=ans;
						}
						else
						{
							double x=Double.parseDouble(s[j+1]);
							if(x==0)
							{
								a=Double.toString(x);
								tf.setText("Cannot divide by zero");
								k=-1;break;
							}
							else ans/=x;
						}
					}
					else if(j==0)
						ans=Double.parseDouble(s[j]);
				}
			}
			else
			{
				if(a.length()>0 && f==0)
				{
					if(k==1)a+="0";
					s[i]=a;
					k=0;
					i++;
				}
				tf.setText(s[0]+s[1]+s[2]);
				for(int j=0;j<i;j++)
				{
					if(s[j]=="+")
					{
						ans+=Double.parseDouble(s[j+1]);
					}
					else if(s[j]=="-")
					{
						ans-=Double.parseDouble(s[j+1]);
					}
					else if(s[j]=="*")
					{
						ans*=Double.parseDouble(s[j+1]);
					}
					else if(s[j]=="/")
					{
						double x=Double.parseDouble(s[j+1]);
						if(x==0)
						{
							a=Double.toString(x);
							tf.setText("Cannot divide by zero");
							k=-1;break;
						}
						else ans/=x;
					}
					else if(j==0)
						ans=Double.parseDouble(s[j]);
					
				}
			}
			
			
			if(k!=-1 && f==0)
			{
				i=0;
				String aa=String.format("%.2f",ans);
				tf.setText(aa);
				ans2=ans;
			}
			
			ans=0;
			if(f==1 && k!=-1)
			{
				if(c=='+')ans=ans2+Double.parseDouble(a);
				if(c=='-')ans=ans2-Double.parseDouble(a);
				if(c=='*')ans=ans2*Double.parseDouble(a);
				if(c=='/')ans=ans2/Double.parseDouble(a);
				String aa=String.format("%.2f",ans);
				ans2=ans;
				tf.setText(aa);
			}
			else if(k==-1)
			{
				i=0;k=0;ans=0;
				dissable();
			}
			f=1;
		}
		else
		{
			if(f==1)a="";
			a+=((JButton)ae.getSource()).getText();
			tf.setText(a);f=0;
		}
	}
	public void dissable()
	{
		b0.setEnabled(false);
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);
		plus.setEnabled(false);
		minus.setEnabled(false);
		mult.setEnabled(false);
		div.setEnabled(false);
		point.setEnabled(false);
		eq.setEnabled(false);
		backSpace.setEnabled(false);
		off.setEnabled(false);
	}
	public void ennable()
	{
		tf.setEnabled(true);
		b0.setEnabled(true);
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		plus.setEnabled(true);
		minus.setEnabled(true);
		mult.setEnabled(true);
		div.setEnabled(true);
		point.setEnabled(true);
		eq.setEnabled(true);
		backSpace.setEnabled(true);
		off.setEnabled(true);
	}
}