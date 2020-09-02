package dto;

public class Tehsil {
	private int tehsilId;
	private String tehsilName;
	private int districtId;

	public Tehsil() {
	}

	public int getTehsilId() {
		return tehsilId;
	}

	public void setTehsilId(int tehsilId) {
		this.tehsilId = tehsilId;
	}

	public String getTehsilName() {
		return tehsilName;
	}

	public void setTehsilName(String tehsilName) {
		this.tehsilName = tehsilName;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}
	
}
