package tt;

import java.io.Serializable;
import java.util.Date;

public class TTEvent implements Serializable {

	private static final long serialVersionUID = 1L;

	private String eId = null;
	private Date eStartDate = null;
	private Integer eSize = null; //in minutes
	private String eTag = null;
	private Boolean isEventInfoAvailableForClient = null;
	
	public TTEvent() {}

	public TTEvent(
			String eId, 
			Date eStartDate, 
			Integer eSize, 
			String eTag,
			Boolean isEventInfoAvailableForClient
			) 
	{
		this.eId = eId;
		this.eStartDate = eStartDate;
		this.eSize = eSize;
		this.eTag = eTag;
		this.isEventInfoAvailableForClient = isEventInfoAvailableForClient;
	}

	public String geteId() {
		return eId;
	}

	public void seteId(String eId) {
		this.eId = eId;
	}

	public Date geteStartDate() {
		return eStartDate;
	}

	public void seteStartDate(Date eStartDate) {
		this.eStartDate = eStartDate;
	}

	public Integer geteSize() {
		return eSize;
	}

	public void seteSize(Integer eSize) {
		this.eSize = eSize;
	}

	public String geteTag() {
		return eTag;
	}

	public void seteTag(String eTag) {
		this.eTag = eTag;
	}

	public Boolean getIsEventInfoAvailableForClient() {
		return isEventInfoAvailableForClient;
	}

	public void setIsEventInfoAvailableForClient(
			Boolean isEventInfoAvailableForClient) {
		this.isEventInfoAvailableForClient = isEventInfoAvailableForClient;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eId == null) ? 0 : eId.hashCode());
		result = prime * result + ((eSize == null) ? 0 : eSize.hashCode());
		result = prime * result
				+ ((eStartDate == null) ? 0 : eStartDate.hashCode());
		result = prime * result + ((eTag == null) ? 0 : eTag.hashCode());
		result = prime
				* result
				+ ((isEventInfoAvailableForClient == null) ? 0
						: isEventInfoAvailableForClient.hashCode());
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
		TTEvent other = (TTEvent) obj;
		if (eId == null) {
			if (other.eId != null)
				return false;
		} else if (!eId.equals(other.eId))
			return false;
		if (eSize == null) {
			if (other.eSize != null)
				return false;
		} else if (!eSize.equals(other.eSize))
			return false;
		if (eStartDate == null) {
			if (other.eStartDate != null)
				return false;
		} else if (!eStartDate.equals(other.eStartDate))
			return false;
		if (eTag == null) {
			if (other.eTag != null)
				return false;
		} else if (!eTag.equals(other.eTag))
			return false;
		if (isEventInfoAvailableForClient == null) {
			if (other.isEventInfoAvailableForClient != null)
				return false;
		} else if (!isEventInfoAvailableForClient
				.equals(other.isEventInfoAvailableForClient))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TTEvent [eId=" + eId + ", eStartDate=" + eStartDate
				+ ", eSize=" + eSize + ", eTag=" + eTag
				+ ", isEventInfoAvailableForClient="
				+ isEventInfoAvailableForClient + "]";
	}
	
	
	
}
