import java.awt.*;
import java.lang.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;
class MyCaculator extends JFrame
{
	public void start()
   {		
// graphic interface
    	JFrame f= new JFrame("caculator");
    	TextField tf = new TextField("0",40);
    	JPanel p1=new JPanel();
    	JPanel p2=new JPanel();
    	JPanel p3=new JPanel();
    	p1.add(tf);
    	f.add(p1,BorderLayout.NORTH);
    	JButton data0 = new JButton("0");
        JButton data1 = new JButton("1");
        JButton data2 = new JButton("2");
        JButton data3 = new JButton("3");
        JButton data4 = new JButton("4");
        JButton data5 = new JButton("5");
        JButton data6 = new JButton("6");
        JButton data7 = new JButton("7");
        JButton data8 = new JButton("8");
        JButton data9 = new JButton("9");
        JButton point = new JButton(".");
        JButton equ = new JButton("=");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton mtp = new JButton("*");
        JButton dvd = new JButton("/");
        JButton bks = new JButton("Backspace");
        JButton c = new JButton("C");
    	GridLayout g1= new GridLayout(1,2);
        p2.setLayout(g1);
        p2.add(bks);
        p2.add(c);
        f.add(p2,BorderLayout.CENTER);
        GridLayout g2= new GridLayout(4,4);
        p3.setLayout(g2);
        p3.add(data0);
        p3.add(data1);
        p3.add(data2);
        p3.add(data3);
        p3.add(data4);
        p3.add(data5);
        p3.add(data6);
        p3.add(data7);
        p3.add(data8);
        p3.add(data9);
        p3.add(point);
        p3.add(plus);
        p3.add(minus);
        p3.add(mtp);
        p3.add(dvd);
        p3.add(equ);
        f.add(p3,BorderLayout.SOUTH);
        f.setSize(400,300);
        f.setResizable(false);
        f.pack();
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter()
        {
        	public void windowClosing(WindowEvent arg0)
        	{
        		System.exit(1);
        	}
        });
// ActionListener
	data0.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"0");
			}
		}
	}); 

	data1.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("1");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"1");
			}
		}
	
	});  
		data2.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("2");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"2");
			}
		}
	
	}); 
		data3.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("3");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"3");
			}
		}
	
	});
		data4.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("4");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"4");
			}
		}
	
	});
		data5.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("1");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"1");
			}
		}
	
	}); 
		data6.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("6");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"6");
			}
		}
	
	});  
		data7.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("7");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"7");
			}
		}
	
	});  
		data8.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("8");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"8");
			}
		}
	
	}); 
		data9.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("9");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"9");
			}
		}
	
	}); 
		plus.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("+");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"+");
			}
		}
	
	});  
		minus.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("-");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"-");
			}
		}
	
	}); 
		mtp.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("*");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"*");
			}
		}
	
	}); 
		dvd.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			if (tf.getText().equals("0"))
			{
				tf.setText("");
				tf.setText("/");
				tf.requestFocus();
			}
			else
			{
				String str=tf.getText();
				tf.setText(str+"/");
			}
		}
	
	});  
		bks.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent arg0)
		{
			String text=tf.getText();
			int i=text.length();
			if(text.length()>0)
			{
				text=text.substring(0,i-1);
				tf.setText(text);
			}
			else
			{
				tf.setText("0");
			}

		}
	}); 
	c.addActionListener(new ActionListener()
	{
        public void actionPerformed(ActionEvent e)
         {
            tf.setText("0");
    	 }

    });
    point.addActionListener(new ActionListener()
    {    
        public void actionPerformed(ActionEvent arg0)
        {
            if(tf.getText().equals("0"))
            {
                tf.setText("");
                tf.setText(".");
                tf.requestFocus();
            }
            else
            {
                String str = tf.getText();
                tf.setText(str+".");
            }
        }
    });
    equ.addActionListener(new ActionListener()
    {
    	public void actionPerformed(ActionEvent arg0)
    	{
    		//PLUS 
    		if(tf.getText().indexOf("+")!=-1)
    		{
    			String [] s=tf.getText().split("\\+");
    			Double d1 = Double.parseDouble(s[0]);
                Double d2 = Double.parseDouble(s[1]);
                double result=d1+d2;
                String re=String.valueOf(result);
                tf.setText(re);

    		}
    		else if (tf.getText().indexOf("-")!=-1)
    		{
    			String [] s=tf.getText().split("-");
    			Double d1 = Double.parseDouble(s[0]);
                Double d2 = Double.parseDouble(s[1]);
                double result=d1-d2;
                String re=String.valueOf(result);
                tf.setText(re);

    		}
    		else if (tf.getText().indexOf("*")!=-1)
    		{
    			String [] s=tf.getText().split("\\*");
    			Double d1 = Double.parseDouble(s[0]);
                Double d2 = Double.parseDouble(s[1]);
                double result=d1*d2;
                String re=String.valueOf(result);
                tf.setText(re);

    		}
    		else if (tf.getText().indexOf("/")!=-1)
    		{
    			String [] s=tf.getText().split("/");
    			Double d1 = Double.parseDouble(s[0]);
                Double d2 = Double.parseDouble(s[1]);
                double result=d1/d2;
                String re=String.valueOf(result);
                tf.setText(re);

    		}
    		else 
    		{
    			tf.setText("do the caculation:");
    		}

    	}

    });




    }
}

   





public class AwtPractice
{
	public static void main(String[]args)
	{
		MyCaculator my=new MyCaculator();
		my.start();
	}
}

	

	
	

