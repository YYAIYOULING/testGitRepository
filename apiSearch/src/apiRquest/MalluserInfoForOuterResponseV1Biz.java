package apiRquest;

import com.icbc.api.IcbcResponse;
import com.icbc.api.internal.util.fastjson.annotation.JSONField;

public class MalluserInfoForOuterResponseV1Biz extends IcbcResponse {
	@JSONField(name="response_biz_content")
	private String responseBizContent;
	@JSONField(name="success")
	private String success;
	private int return_code;
	
	private String return_msg;
	
	private String user_id;
	
	private String thirdOrder_id;
	
	private String pay_amt;
	
	private String pay_status;
	
	private String parent_order_id;
	
	private String order_id;
	
	private String pay_time;
	private String abc;
	
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	public String getResponseBizContent() {
		return responseBizContent;
	}
	public void setResponseBizContent(String responseBizContent) {
		this.responseBizContent = responseBizContent;
	}
	public String getSuccess() {
		return success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}
	public int getReturn_code() {
		return return_code;
	}
	public void setReturn_code(int return_code) {
		this.return_code = return_code;
	}
	public String getReturn_msg() {
		return return_msg;
	}
	public void setReturn_msg(String return_msg) {
		this.return_msg = return_msg;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getThirdOrder_id() {
		return thirdOrder_id;
	}
	public void setThirdOrder_id(String thirdOrder_id) {
		this.thirdOrder_id = thirdOrder_id;
	}
	public String getPay_amt() {
		return pay_amt;
	}
	public void setPay_amt(String pay_amt) {
		this.pay_amt = pay_amt;
	}
	public String getPay_status() {
		return pay_status;
	}
	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}
	public String getParent_order_id() {
		return parent_order_id;
	}
	public void setParent_order_id(String parent_order_id) {
		this.parent_order_id = parent_order_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public String getPay_time() {
		return pay_time;
	}
	public void setPay_time(String pay_time) {
		this.pay_time = pay_time;
	}

	
}
