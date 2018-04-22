package memo;

import java.awt.EventQueue;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.concurrent.TimeUnit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.awt.Color;

public class Interface {

	private JFrame frame;
	 int  CartePrecedente=-1,CarteActuelle=-1,Score;
	 boolean cache0=true,cache1=true,cache2=true,cache3=true,cache4=true,cache5=true,cache6=true,cache7=true,cache8=true,cache9=true,cache10=true,cache11=true;
	 boolean gagnant0=false,gagnant1=false,gagnant2=false,gagnant3=false,gagnant4=false,gagnant5=false,gagnant6=false,gagnant7=false,gagnant8=false,gagnant9=false,gagnant10=false,gagnant11=false;
	 JLabel lblNewLabel,lblNewLabel_1,lblNewLabel_4,lblNewLabel_2,lblNewLabel_3,lblNewLabel_5,lblNewLabel1,lblNewLabel_41,lblNewLabel_21,lblNewLabel_31,lblNewLabel_51,lblNewLabel_11;
		ArrayList<ImageIcon> Tab_carte ;
		ArrayList<Boolean> Cache ;
		ArrayList<Boolean> gagnant ;
		ImageIcon doscarte;


	 /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the application.
	 */
	public Interface() {
	
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1108, 1069);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new MigLayout("", "[][][grow]", "[grow][]"));
		
		ImageIcon biblizar=new ImageIcon("bilbizar.jpg");
		ImageIcon pikatchu=new ImageIcon("pikatchu.png");
		ImageIcon dracofeu=new ImageIcon("dracofeu.jpg");
		ImageIcon rondoudou=new ImageIcon("rondoudou.png");
		ImageIcon ronflex=new ImageIcon("ronflex.jpg");
		ImageIcon tortank=new ImageIcon("tortank.png");
		 doscarte=new ImageIcon("dos.jpg");
		 gagnant =new ArrayList<Boolean>();
		 Tab_carte  =new ArrayList<ImageIcon>();
		 Cache =new ArrayList<Boolean>();
		
		gagnant.add(gagnant0);
		gagnant.add(gagnant1);
		gagnant.add(gagnant2);
		gagnant.add(gagnant3);
		gagnant.add(gagnant4);
		gagnant.add(gagnant5);
		gagnant.add(gagnant6);
		gagnant.add(gagnant7);
		gagnant.add(gagnant8);
		gagnant.add(gagnant9);
		gagnant.add(gagnant10);
		gagnant.add(gagnant11); 
		 
		Cache.add(cache0);
		Cache.add(cache1);
		Cache.add(cache2);
		Cache.add(cache3);
		Cache.add(cache4);
		Cache.add(cache5);
		Cache.add(cache6);
		Cache.add(cache7);
		Cache.add(cache8);
		Cache.add(cache9);
		Cache.add(cache10);
		Cache.add(cache11);
		
		Tab_carte.add(biblizar);
		Tab_carte.add(pikatchu);
		Tab_carte.add(dracofeu);
		Tab_carte.add(rondoudou);
		Tab_carte.add(ronflex);
		Tab_carte.add(tortank);
		Tab_carte.add(biblizar);
		Tab_carte.add(pikatchu);
		Tab_carte.add(dracofeu);
		Tab_carte.add(rondoudou);
		Tab_carte.add(ronflex);
		Tab_carte.add(tortank);
		Collections.shuffle(Tab_carte);
		
		initialize();
	}
 private void handle_hidden_card()
 {
		if (Cache.get(0)==true && gagnant.get(0)==false )
			lblNewLabel.setIcon(doscarte);
		else
			lblNewLabel.setIcon(Tab_carte.get(0));
		
		if (Cache.get(1)==true && gagnant.get(1)==false )
			lblNewLabel_1.setIcon(doscarte);
		else
			lblNewLabel_1.setIcon(Tab_carte.get(1));
		
		if (Cache.get(2)==true && gagnant.get(2)==false )
			lblNewLabel_4.setIcon(doscarte);
		else
			lblNewLabel_4.setIcon(Tab_carte.get(2));
		
		if (Cache.get(3)==true && gagnant.get(3)==false )
			lblNewLabel_2.setIcon(doscarte);
		else
			lblNewLabel_2.setIcon(Tab_carte.get(3));
		
		if (Cache.get(4)==true && gagnant.get(4)==false )
			lblNewLabel_3.setIcon(doscarte);
		else
			lblNewLabel_3.setIcon(Tab_carte.get(4));
		
		if (Cache.get(5)==true && gagnant.get(5)==false )
			lblNewLabel_5.setIcon(doscarte);
		else
			lblNewLabel_5.setIcon(Tab_carte.get(5));
		
		if (Cache.get(6)==true && gagnant.get(6)==false )
			lblNewLabel1.setIcon(doscarte);
		else
			lblNewLabel1.setIcon(Tab_carte.get(6));

		if (Cache.get(7)==true && gagnant.get(7)==false )
			lblNewLabel_11.setIcon(doscarte);
		else
			lblNewLabel_11.setIcon(Tab_carte.get(7));

		if (Cache.get(8)==true && gagnant.get(8)==false )
			lblNewLabel_41.setIcon(doscarte);
		else
			lblNewLabel_41.setIcon(Tab_carte.get(8));
		
		if (Cache.get(9)==true && gagnant.get(9)==false )
			lblNewLabel_21.setIcon(doscarte);
		else
			lblNewLabel_21.setIcon(Tab_carte.get(9));
		
		if (Cache.get(10)==true && gagnant.get(10)==false )
			lblNewLabel_31.setIcon(doscarte);
		else
			lblNewLabel_31.setIcon(Tab_carte.get(10));
		
		if (Cache.get(11)==true && gagnant.get(11)==false )
			lblNewLabel_51.setIcon(doscarte);
		else
			lblNewLabel_51.setIcon(Tab_carte.get(11));
 }
 
 private void upadate_layout()
 {
		lblNewLabel.updateUI();
		lblNewLabel_1.updateUI();
		lblNewLabel_4.updateUI();
		lblNewLabel_2.updateUI();
		lblNewLabel_3.updateUI();
		lblNewLabel_5.updateUI();
		lblNewLabel1.updateUI();
		lblNewLabel_11.updateUI();
		lblNewLabel_41.updateUI();
		lblNewLabel_31.updateUI();
		lblNewLabel_21.updateUI();
		lblNewLabel_51.updateUI();
 }
	/**
	 * Initialize the contents of the frame.
	 */
	private void function_rules(int ActualCarte)
	{
		Cache.set(ActualCarte, false);
		if(CartePrecedente!=ActualCarte)
		{
		if (CartePrecedente!=-1)
		{
			Cache.set(CartePrecedente, false);
			handle_hidden_card();
			upadate_layout();
			if (Tab_carte.get(ActualCarte).equals(Tab_carte.get(CartePrecedente)))
			{
				
				Cache.set(CartePrecedente, false);
				Cache.set(ActualCarte, false);
				gagnant.set(CartePrecedente, true);
				gagnant.set(ActualCarte, true);
				handle_hidden_card();
				upadate_layout();
				CartePrecedente=-1;
			}
			else
			{

				Cache.set(CartePrecedente, false);
				Cache.set(ActualCarte, false);
				handle_hidden_card();
				upadate_layout();

				Cache.set(CartePrecedente, true);
				Cache.set(ActualCarte, true);
				//handle_hidden_card();
				//upadate_layout();
				CartePrecedente=-1;
				//CartePrecedente=ActualCarte;
			}
		}
		else
		{
			handle_hidden_card();
			upadate_layout();
			CartePrecedente=ActualCarte;
		}
		
		}
		

		
	}
	private void initialize() {
		

		lblNewLabel = new JLabel(doscarte);
		lblNewLabel_1 = new JLabel(doscarte);
		lblNewLabel_4 = new JLabel(doscarte);
		lblNewLabel_2 = new JLabel(doscarte);
		lblNewLabel_3 = new JLabel(doscarte);
		lblNewLabel_5 = new JLabel(doscarte);
		lblNewLabel1 = new JLabel(doscarte);
		lblNewLabel_11 = new JLabel(doscarte);
	    lblNewLabel_41 = new JLabel(doscarte);
	    lblNewLabel_21 = new JLabel(doscarte);
	    lblNewLabel_31 = new JLabel(doscarte);
	    lblNewLabel_51 = new JLabel(doscarte);
	    
		frame.getContentPane().add(lblNewLabel, "cell 0 0");
		frame.getContentPane().add(lblNewLabel_1, "cell 1 0");
		frame.getContentPane().add(lblNewLabel_4, "cell 2 0");
		frame.getContentPane().add(lblNewLabel_2, "cell 0 1");
		frame.getContentPane().add(lblNewLabel_3, "cell 1 1");
		frame.getContentPane().add(lblNewLabel_5, "cell 2 1");
		frame.getContentPane().add(lblNewLabel1, "cell 3 0");
		frame.getContentPane().add(lblNewLabel_11, "cell 3 1");
		frame.getContentPane().add(lblNewLabel_41, "cell 4 0");
		frame.getContentPane().add(lblNewLabel_21, "cell 4 1");
		frame.getContentPane().add(lblNewLabel_31, "cell 5 0");
		frame.getContentPane().add(lblNewLabel_51, "cell 5 1");
		
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(0);
				
				
			}
			
		});
		
		 
		
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(1);
			}
		});
		
		
		
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(2);
			}
				

				
				
			}
		);
		
	 
		
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(3);
				
			}
		});
		
		
	
		
		lblNewLabel_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(4);
				
			}
		});
		

		
		lblNewLabel_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(5);
				
			}
		});
		
		

		
		lblNewLabel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(6);
				
			}
		});
		
	
		
		lblNewLabel_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(7);
				
			}
		});
		
		
		
		lblNewLabel_41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(8);
				
			}
		});
		

		
		lblNewLabel_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(9);
				
			}
		});
		
	
		
		lblNewLabel_31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(10);
				
			}
		});
		

		lblNewLabel_51.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				function_rules(11);
				
			}
		});
	}
	


}
