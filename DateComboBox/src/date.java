import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;


public class date {

	private JFrame frame;
	private JComboBox Month;
	private JComboBox Day;
	private JComboBox Year;
	private Date date = new Date();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					date window = new date();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public date() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frame.getContentPane().setLayout(springLayout);
		JLabel lblMth = new JLabel("Month");
		springLayout.putConstraint(SpringLayout.NORTH, lblMth, 27, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblMth, 87, SpringLayout.WEST, frame.getContentPane());
		lblMth.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblMth);
		JLabel lblDay = new JLabel("Day");
		springLayout.putConstraint(SpringLayout.WEST, lblDay, 87, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblMth, -14, SpringLayout.NORTH, lblDay);
		springLayout.putConstraint(SpringLayout.NORTH, lblDay, 68, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblDay, -136, SpringLayout.SOUTH, frame.getContentPane());
		lblDay.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblDay);
		JLabel lblYear = new JLabel("Year");
		springLayout.putConstraint(SpringLayout.WEST, lblYear, 87, SpringLayout.WEST, frame.getContentPane());
		lblYear.setFont(new Font("Tahoma", Font.PLAIN, 15));
		frame.getContentPane().add(lblYear);
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
		Date currentTime = calendar.getTime();
		calendar.setTime(date);		
		String [] months = {"January- 1 ", "February- 2", "March- 3", "April- 4", "May- 5", "June- 6 ", 
				"July- 7", "August- 8", "September- 9", "October- 10", "November- 11", "December- 12"};
		final JComboBox Month = new JComboBox (months);
		springLayout.putConstraint(SpringLayout.EAST, lblMth, -83, SpringLayout.WEST, Month);
		springLayout.putConstraint(SpringLayout.WEST, Month, -198, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, Month, 32, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Month, -80, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(Month);
		int month = calendar.get(Calendar.MONTH);
		Month.setSelectedIndex(month);
		
		final String [] days31 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
				"19","20","21","22","23","24","25","26","27","28","29","30","31"};
		final String [] days30 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
				"19","20","21","22","23","24","25","26","27","28","29","30"};
		final String [] days28 = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18",
				"19","20","21","22","23","24","25","26","27","28"};
		final JComboBox Day = new JComboBox(days31);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		Day.setSelectedItem(Integer.toString(day));
		Day.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
	
			}
		});
		springLayout.putConstraint(SpringLayout.EAST, lblDay, -140, SpringLayout.WEST, Day);
		springLayout.putConstraint(SpringLayout.NORTH, Day, 88, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, Day, 293, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Day, -80, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(Day);	
		String [] years = {"2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019"};
		JComboBox Year = new JComboBox (years);
		springLayout.putConstraint(SpringLayout.NORTH, Year, 154, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, Year, 258, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, Year, -80, SpringLayout.EAST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.NORTH, lblYear, -1, SpringLayout.NORTH, Year);
		springLayout.putConstraint(SpringLayout.EAST, lblYear, -137, SpringLayout.WEST, Year);
		frame.getContentPane().add(Year);
		int year = calendar.get(Calendar.YEAR);
		Year.setSelectedItem(Integer.toString(year));
	}
}