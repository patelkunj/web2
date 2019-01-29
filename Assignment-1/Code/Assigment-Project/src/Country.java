import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Country extends JFrame implements Comparable<Country> {

	private JPanel contentPane;
	
	private JTextField txt_country;
	private JTextField txt_year;
	JTextArea txt_dataset =  new JTextArea();

    static ArrayList<Country> Alist = new ArrayList<Country>();
    
    

	/**
	 * Launch the application.
	 */
	
	private String name;
	long y2013;
	long y2014;
	long y2015;
	long y2016;
	long y2017;
	
	
	/**
	 * Constructor.
	 * 
	 * @param Name contain value of country name
	 * @param y2013 to y2017 contain country population of each year
	 */
	public Country(String name,long y2013,long y2014,long y2015,long y2016,long y2017){
		this.name= name;
		this.y2013 =y2013;
		this.y2014 =y2014;
		this.y2015 =y2015;
		this.y2016 =y2016;
		this.y2017=y2017;
	}
	
	/** Return name of country */
	public String getName() {
		return name;
	}

	/** Set country name in object */
	public void setName(String name) {
		this.name = name;
	}

	/** Return population of country in year 2013*/
	public long getY2013() {
		return y2013;
	}

	/** Set country population in year 2013 */
	public void setY2013(long y2013) {
		this.y2013 = y2013;
	}

	/** Return population of country in year 2014*/
	public long getY2014() {
		return y2014;
	}

	/** Set country population in year 2014 */
	public void setY2014(long y2014) {
		this.y2014 = y2014;
	}

	/** Return population of country in year 2015*/
	public long getY2015() {
		return y2015;
	}

	/** Set country population in year 2015 */
	public void setY2015(long y2015) {
		this.y2015 = y2015;
	}

	/** Return population of country in year 2016*/
	public long getY2016() {
		return y2016;
	}

	/** Set country population in year 2016 */
	public void setY2016(long y2016) {
		this.y2016 = y2016;
	}

	/** Return population of country in year 2017*/
	public long getY2017() {
		return y2017;
	}

	/** Set country population in year 2017 */
	public void setY2017(long y2017) {
		this.y2017 = y2017;
	}
	
	/** 
	 * FindIt - Method use for searching
	 * 
	 * @param Alist contain an ArrayList that hold all the information(Object).
	 * @param C contain country name that you want to search in ArrayList.
	 * 
	 * Return country detail with its population data.
	 * */
	public String FindIt(ArrayList<Country> Alist, String c) {
		String str="";
		for (int i=0; i<Alist.size(); i++){
			String cb = Alist.get(i).getName();
			if(cb.equals(c)) {
				str = Alist.get(i).getSearchResult();				
			}
		}
		return str;
	}
	
	/** 
	 * FindMin - Method use for searching less populated of country 
	 * 
	 * @param Alist contain an ArrayList that hold all the information(Object).
	 * @param y contain year.
	 * 
	 * Return country name that had lowest population among the list for particular year.
	 * */
	public String FindMin(ArrayList<Country> Blist, String y) {		
		long min=0,cb=1;
		int index=0;
		for (int i=0; i<Blist.size(); i++){
			
			if(y.equals("2013"))
				cb = Blist.get(i).getY2013();
			else if(y.equals("2014"))
				cb = Blist.get(i).getY2014();
			else if(y.equals("2015"))
				cb = Blist.get(i).getY2015();
			else if(y.equals("2016"))
				cb = Blist.get(i).getY2016();
			else
				cb = Blist.get(i).getY2017();
			
			if(min == 0) {
				min = cb;				
			}else if(cb < min) {
				min = cb;
				index =i;
			}
		}
		return "Lowest Poplution in "+ y + "\n of "+ Blist.get(index).getName();
	}
	
	
	/** 
	 * FindMax - Method use for searching highest populated of country 
	 * 
	 * @param Alist contain an ArrayList that hold all the information(Object).
	 * @param y contain year.
	 * 
	 * Return country name that had highest population among the list for particular year.
	 * */
	public String FindMax(ArrayList<Country> Blist, String y) {		
		long max=0,cb=1;
		int index=0;
		for (int i=0; i<Blist.size(); i++){
			
			if(y.equals("2013"))
				cb = Blist.get(i).getY2013();
			else if(y.equals("2014"))
				cb = Blist.get(i).getY2014();
			else if(y.equals("2015"))
				cb = Blist.get(i).getY2015();
			else if(y.equals("2016"))
				cb = Blist.get(i).getY2016();
			else
				cb = Blist.get(i).getY2017();
			
			if(max == 0) {
				max = cb;				
			}else if(cb > max) {
				max = cb;
				index =i;
			}
		}
		return "Highest Poplution in "+ y + "\n of "+ Blist.get(index).getName();
	}
	
	public String FindAvg(ArrayList<Country> Blist, String y) {	
		long totalpop=0;
		int index=0;
		for (int i=0; i<Blist.size(); i++){
			
			if(y.equals("2013")) {
				totalpop += Blist.get(i).getY2013();
				index++;
			}
			else if(y.equals("2014")) {
				totalpop += Blist.get(i).getY2014();
				index++;
			}
			else if(y.equals("2015")) {
				totalpop += Blist.get(i).getY2015();
				index++;
			}
			else if(y.equals("2016")) {
				totalpop += Blist.get(i).getY2016();
				index++;
			}
			else {
				totalpop += Blist.get(i).getY2017();
				index++;
			}
		}
		return "Average world Poplution in "+ y + "\n is "+ (totalpop/index);
	}
	
	
	public static Comparator<Country> COMPARE_BY_NAME = new Comparator<Country>() {
        public int compare(Country one, Country other) {
            return one.name.compareTo(other.name);
        }
    };
	
	
	public int compareTo(Country c) {
	   
		if (this.name==c.name)
			return 1;
		else
			return 0;
	  }
	
	/** 
	 * getData - Method use for extract data from country object
	 * 
	 * Return country detail with its name and population in year 2013 to year 2017.
	 * */
	public String getData(){
		
		String str = this.name+","+this.y2013+","+this.y2014+","+this.y2015+","+this.y2016+","+this.y2017;
		return str;
	}
	
	/** 
	 * getSearchReult - Method use for extract data from country object
	 * 
	 * Return country detail with its name and population in year 2013 to year 2017.
	 * */
	public String getSearchResult(){
		
		String str = "Country Name: "+this.name+"\n 2013: "+this.y2013+"\n 2014: "+this.y2014+"\n 2015: "+this.y2015+"\n 2016: "+this.y2016+"\n 2017: "+this.y2017;
		return str;
	}
	
	
	/** 
	 * populateDate - Method use for populate data into text area.
	 * 
	 * */
	public void populateDate(ArrayList<Country> Alist) {
		for(int j=0;j< Alist.size();j++){		
			String cb = Alist.get(j).getData();
			String[] l = cb.split(",");
			for(int k=0; k< l.length; k++) {
				txt_dataset.append(l[k] + "\t");
			}
			txt_dataset.append("\n");
		}
		
		
	}

	/**
	 * Create the frame.
	 */
	public Country() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 414, 239);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Population", null, panel, null);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 26, 389, 174);
		panel.add(scrollPane);
		
		
		scrollPane.setViewportView(txt_dataset);
		
		JButton btn_sort = new JButton("Sort Data");
		btn_sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Collections.sort(Alist,Country.COMPARE_BY_NAME );
				System.out.println("-------------after sort-------------------");
				txt_dataset.setText("");
				for (Country country : Alist) {
		            System.out.println(country.getData());
		    			String cb = country.getData();
		    			String[] l = cb.split(",");
		    			for(int k=0; k< l.length; k++) {
		    				txt_dataset.append(l[k] + "\t");
		    			}
		    			txt_dataset.append("\n");
		    		}
		            
		        }
		});
		btn_sort.setBounds(310, 11, 89, 15);
		panel.add(btn_sort);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Operation", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblOperation = new JLabel("Operation");
		lblOperation.setBounds(20, 21, 59, 14);
		panel_1.add(lblOperation);
		
		JComboBox dw_opt = new JComboBox();
		dw_opt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String value = dw_opt.getSelectedItem().toString();
				if(value=="Search") {
					txt_year.setEditable(false);
					txt_country.setEditable(true);
				}else {
					txt_year.setEditable(true);
					txt_country.setEditable(false);
				}
				
				
			}
		});
		dw_opt.setModel(new DefaultComboBoxModel(new String[] {"Search", "Minimum", "Maximum","Average"}));
		dw_opt.setBounds(95, 18, 93, 20);
		panel_1.add(dw_opt);
		
		JLabel lblCountry = new JLabel("Country");
		lblCountry.setBounds(20, 52, 46, 14);
		panel_1.add(lblCountry);
		
		txt_country = new JTextField();
		txt_country.setBounds(95, 49, 93, 20);
		panel_1.add(txt_country);
		txt_country.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Year");
		lblNewLabel.setBounds(20, 83, 46, 14);
		panel_1.add(lblNewLabel);
		
		txt_year = new JTextField();
		txt_year.setBounds(95, 80, 93, 20);
		panel_1.add(txt_year);
		txt_year.setColumns(10);
		txt_year.setEditable(false);
		
		
		JTextArea txtarea_result = new JTextArea();
		txtarea_result.setBounds(209, 33, 190, 125);
		panel_1.add(txtarea_result);
		
		JLabel lblNewLabel_1 = new JLabel("Result:");
		lblNewLabel_1.setBounds(209, 18, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		
		JButton btn_go = new JButton("Go");
		btn_go.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String value = dw_opt.getSelectedItem().toString();
				if(value=="Search") {
					txtarea_result.setText(FindIt(Alist,txt_country.getText()));
				}else if(value=="Minimum"){
					txtarea_result.setText(FindMin(Alist,txt_year.getText()));
				}else if(value=="Maximum"){
					txtarea_result.setText(FindMax(Alist,txt_year.getText()));
				}else {
					txtarea_result.setText(FindAvg(Alist,txt_year.getText()));
				}
			}
		});
		btn_go.setBounds(43, 135, 89, 23);
		panel_1.add(btn_go);
		
		
		populateDate(Alist);

	}
	
public static void main(String[] args) {
		
		BufferedReader InputReader;
		
		
		try{
			InputReader = new BufferedReader(new FileReader("data/data.csv"));
		
			System.out.println("The file has been read!!");			
				
			String line,n;
			long y13,y14,y15,y16,y17;
			
			while((line = InputReader.readLine()) != null){
			    System.out.println(line);
			    
			    String[] l = line.split(",");
	            n = l[0];
			    y13= Long.parseLong(l[1]);
			    y14= Long.parseLong(l[2]); 
			    y15= Long.parseLong(l[3]);
			    y16= Long.parseLong(l[4]);
			    y17= Long.parseLong(l[5]);
			    
			    Alist.add(new Country(n,y13,y14,y15,y16,y17));
			}
			InputReader.close();
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Country frame = new Country();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
