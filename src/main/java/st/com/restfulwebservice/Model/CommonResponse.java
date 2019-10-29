package st.com.restfulwebservice.Model;

public class CommonResponse {

	private Object responseData;
	private StatusObject statusObj;

	public Object getResponseData() {
		return responseData;
	}

	public void setResponseData(Object responseData) {
		this.responseData = responseData;
	}

	public StatusObject getStatusObj() {
		return statusObj;
	}

	public void setStatusObj(StatusObject statusObj) {
		this.statusObj = statusObj;
	}

	@Override
	public String toString() {
		return "CommonResponse [responseData=" + responseData + ", statusObj=" + statusObj + "]";
	}

}
