package tt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface ITestTT {

	static final String TEST_TTID = "testID1234567890";
	static final String TEST_ttStyle = "Default"; 
	static final String TEST_ttEmail = "test1.iskatel@gmail.com";
	static final String TEST_ttPassword = null; 
	static final String TEST_ttName = "Test TT";
	static final String TEST_ttTimeZone = "Test TimeZone";
	static final String TEST_ttTimeSlot = "UTF"; 
	static final String TEST_startWorkeTime = "08:00"; 
	static final String TEST_endWorkeTime = "18:00";
	static final Integer[] WEEK_DAYS = {0,1,2,3,4,5,6}; 
	static final List<Integer> TEST_workeDays = new ArrayList<Integer>();
	static final Integer TEST_countClientsSelectedOneSlot = 1;
	static final HashMap<String, TTEvent> TEST_ttEvents = new HashMap<String, TTEvent>();
	
	static final TTData TEST_TTDATA = new TTData(
			TEST_TTID, 
			TEST_ttStyle, 
			TEST_ttEmail, 
			TEST_ttPassword, 
			TEST_ttName, 
			TEST_ttTimeZone, 
			TEST_ttTimeSlot, 
			TEST_startWorkeTime, 
			TEST_endWorkeTime, 
			TEST_workeDays, 
			TEST_countClientsSelectedOneSlot, 
			TEST_ttEvents);
	
}
