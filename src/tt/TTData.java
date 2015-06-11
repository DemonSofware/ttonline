package tt;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class TTData implements Serializable {

	private static final long serialVersionUID = 2L;
	
	protected Long ttId = null;
	protected String ttStyle = null;
	protected String ttEmail = null;
	protected String ttPassword = null;
	protected String ttName = null;
	protected String ttTimeZone = null;
	protected String ttTimeSlot = null;
	protected String startWorkeTime = null;
	protected String endWorkeTime = null;
	protected List<Integer> workeDays = null;
	// 0 - non selected slots, 1 - one client selects one slot, n - n clients select one slot
	protected Integer countClientsSelectedOneSlot = null;
	protected HashMap<String, TTEvent> ttEvents = null;  // почему хеш мап?

	public TTData() {}

	public TTData(
			Long ttId, 
			String ttStyle, 
			String ttEmail,
			String ttPassword, 
			String ttName, 
			String ttTimeZone,
			String ttTimeSlot, 
			String startWorkeTime, 
			String endWorkeTime,
			List<Integer> workeDays, 
			Integer countClientsSelectedOneSlot,
			HashMap<String, TTEvent> ttEvents
			) 
	{
		this.ttId = ttId;
		this.ttStyle = ttStyle;
		this.ttEmail = ttEmail;
		this.ttPassword = ttPassword;
		this.ttName = ttName;
		this.ttTimeZone = ttTimeZone;
		this.ttTimeSlot = ttTimeSlot;
		this.startWorkeTime = startWorkeTime;
		this.endWorkeTime = endWorkeTime;
		this.workeDays = workeDays;
		this.countClientsSelectedOneSlot = countClientsSelectedOneSlot;
		this.ttEvents = ttEvents;
	}

	public Long getTtId() {
		return ttId;
	}

	public void setTtId(Long ttId) {
		this.ttId = ttId;
	}

	public String getTtStyle() {
		return ttStyle;
	}

	public void setTtStyle(String ttStyle) {
		this.ttStyle = ttStyle;
	}

	public String getTtEmail() {
		return ttEmail;
	}

	public void setTtEmail(String ttEmail) {
		this.ttEmail = ttEmail;
	}

	public String getTtPassword() {
		return ttPassword;
	}

	public void setTtPassword(String ttPassword) {
		this.ttPassword = ttPassword;
	}

	public String getTtName() {
		return ttName;
	}

	public void setTtName(String ttName) {
		this.ttName = ttName;
	}

	public String getTtTimeZone() {
		return ttTimeZone;
	}

	public void setTtTimeZone(String ttTimeZone) {
		this.ttTimeZone = ttTimeZone;
	}

	public String getTtTimeSlot() {
		return ttTimeSlot;
	}

	public void setTtTimeSlot(String ttTimeSlot) {
		this.ttTimeSlot = ttTimeSlot;
	}

	public String getStartWorkeTime() {
		return startWorkeTime;
	}

	public void setStartWorkeTime(String startWorkeTime) {
		this.startWorkeTime = startWorkeTime;
	}

	public String getEndWorkeTime() {
		return endWorkeTime;
	}

	public void setEndWorkeTime(String endWorkeTime) {
		this.endWorkeTime = endWorkeTime;
	}

	public List<Integer> getWorkeDays() {
		return workeDays;
	}

	public void setWorkeDays(List<Integer> workeDays) {
		this.workeDays = workeDays;
	}

	public Integer getCountClientsSelectedOneSlot() {
		return countClientsSelectedOneSlot;
	}

	public void setCountClientsSelectedOneSlot(Integer countClientsSelectedOneSlot) {
		this.countClientsSelectedOneSlot = countClientsSelectedOneSlot;
	}

	public HashMap<String, TTEvent> getTtEvents() {
		return ttEvents;
	}

	public void setTtEvents(HashMap<String, TTEvent> ttEvents) {
		this.ttEvents = ttEvents;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((countClientsSelectedOneSlot == null) ? 0
						: countClientsSelectedOneSlot.hashCode());
		result = prime * result
				+ ((endWorkeTime == null) ? 0 : endWorkeTime.hashCode());
		result = prime * result
				+ ((startWorkeTime == null) ? 0 : startWorkeTime.hashCode());
		result = prime * result + ((ttEmail == null) ? 0 : ttEmail.hashCode());
		result = prime * result
				+ ((ttEvents == null) ? 0 : ttEvents.hashCode());
		result = prime * result + ((ttId == null) ? 0 : ttId.hashCode());
		result = prime * result + ((ttName == null) ? 0 : ttName.hashCode());
		result = prime * result
				+ ((ttPassword == null) ? 0 : ttPassword.hashCode());
		result = prime * result + ((ttStyle == null) ? 0 : ttStyle.hashCode());
		result = prime * result
				+ ((ttTimeSlot == null) ? 0 : ttTimeSlot.hashCode());
		result = prime * result
				+ ((ttTimeZone == null) ? 0 : ttTimeZone.hashCode());
		result = prime * result
				+ ((workeDays == null) ? 0 : workeDays.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TTData other = (TTData) obj;
		if (countClientsSelectedOneSlot == null) {
			if (other.countClientsSelectedOneSlot != null)
				return false;
		} else if (!countClientsSelectedOneSlot
				.equals(other.countClientsSelectedOneSlot))
			return false;
		if (endWorkeTime == null) {
			if (other.endWorkeTime != null)
				return false;
		} else if (!endWorkeTime.equals(other.endWorkeTime))
			return false;
		if (startWorkeTime == null) {
			if (other.startWorkeTime != null)
				return false;
		} else if (!startWorkeTime.equals(other.startWorkeTime))
			return false;
		if (ttEmail == null) {
			if (other.ttEmail != null)
				return false;
		} else if (!ttEmail.equals(other.ttEmail))
			return false;
		if (ttEvents == null) {
			if (other.ttEvents != null)
				return false;
		} else if (!ttEvents.equals(other.ttEvents))
			return false;
		if (ttId == null) {
			if (other.ttId != null)
				return false;
		} else if (!ttId.equals(other.ttId))
			return false;
		if (ttName == null) {
			if (other.ttName != null)
				return false;
		} else if (!ttName.equals(other.ttName))
			return false;
		if (ttPassword == null) {
			if (other.ttPassword != null)
				return false;
		} else if (!ttPassword.equals(other.ttPassword))
			return false;
		if (ttStyle == null) {
			if (other.ttStyle != null)
				return false;
		} else if (!ttStyle.equals(other.ttStyle))
			return false;
		if (ttTimeSlot == null) {
			if (other.ttTimeSlot != null)
				return false;
		} else if (!ttTimeSlot.equals(other.ttTimeSlot))
			return false;
		if (ttTimeZone == null) {
			if (other.ttTimeZone != null)
				return false;
		} else if (!ttTimeZone.equals(other.ttTimeZone))
			return false;
		if (workeDays == null) {
			if (other.workeDays != null)
				return false;
		} else if (!workeDays.equals(other.workeDays))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TTData [ttId=" + ttId + ", ttStyle=" + ttStyle + ", ttEmail="
				+ ttEmail + ", ttPassword=" + ttPassword + ", ttName=" + ttName
				+ ", ttTimeZone=" + ttTimeZone + ", ttTimeSlot=" + ttTimeSlot
				+ ", startWorkeTime=" + startWorkeTime + ", endWorkeTime="
				+ endWorkeTime + ", workeDays=" + workeDays
				+ ", countClientsSelectedOneSlot="
				+ countClientsSelectedOneSlot + ", ttEvents=" + ttEvents + "]";
	}

}
