package st.com.restfulwebservice.Model;

public class StatusObject {
	private String status = "Success";
	private String detail = "";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "StatusObject [status=" + status + ", detail=" + detail + "]";
	}

}
