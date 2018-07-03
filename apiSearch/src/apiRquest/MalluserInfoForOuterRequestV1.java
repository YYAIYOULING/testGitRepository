package apiRquest;



import com.icbc.api.AbstractIcbcRequest;
import com.icbc.api.BizContent;


@SuppressWarnings("rawtypes")
public class MalluserInfoForOuterRequestV1 extends AbstractIcbcRequest {
	
// 如于封装页面传递的参数值
	public static class MalluserInfoForOuterRequestV1Biz implements BizContent {
		private String appId;//APP的编号
		
		private String thirdOrderId;//第三方子订单号 
		
		private String userId;//商户id
		
		private String orderId;//融e购子订单号
		
		private String refundId;//融e购退款单号	
		private String bakMark;//备用字段	
		private String remark;//备用字段	
		private String refundAmt;//退款金额	
		private String key;//用户信息key值	
		private String refundUrl;//退款完成后返回第三方的url
		private String thirdRrefundId;//被三方退款单号	
		private String outuserId;//外应用用户编码：查询用户信息时的外应用用户ID  

		private String msg_id        ;//用于确定一笔签名的唯一性,不能重复
		private String return_code   ;//0-成功；负-疑帐；正-失败；
		private String return_msg    ;//返回信息描述
		private String refund_id     ;//退款单号
		private String refund_status ;//退款状态
		private String Suborder_id   ;//融e购子订单号
		private String refund_time   ;//退款时间
		private String orgorder_id   ;//外部子订单号
		private String user_id   ;//融e购用户编号
		private String pay_amt   ;//支付金额
		private String pay_status   ;//支付状态 0支付成功1支付失败
		private String Order_id   ;//融e购订单号
		private String Pay_time   ;//支付时间
		private String temp1;
		
		private String temp2;
		
		private String temp3;
		
		public String getAppId() {
			return appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getThirdOrderId() {
			return thirdOrderId;
		}

		public void setThirdOrderId(String thirdOrderId) {
			this.thirdOrderId = thirdOrderId;
		}

		public String getUserId() {
			return userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getOrderId() {
			return orderId;
		}

		public void setOrderId(String orderId) {
			this.orderId = orderId;
		}

		public String getRefundId() {
			return refundId;
		}

		public void setRefundId(String refundId) {
			this.refundId = refundId;
		}

		public String getBakMark() {
			return bakMark;
		}

		public void setBakMark(String bakMark) {
			this.bakMark = bakMark;
		}

		public String getRemark() {
			return remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}

		public String getRefundAmt() {
			return refundAmt;
		}

		public void setRefundAmt(String refundAmt) {
			this.refundAmt = refundAmt;
		}

		public String getKey() {
			return key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getMsg_id() {
			return msg_id;
		}

		public void setMsg_id(String msg_id) {
			this.msg_id = msg_id;
		}

		public String getReturn_code() {
			return return_code;
		}

		public void setReturn_code(String return_code) {
			this.return_code = return_code;
		}

		public String getReturn_msg() {
			return return_msg;
		}

		public void setReturn_msg(String return_msg) {
			this.return_msg = return_msg;
		}

		public String getRefund_id() {
			return refund_id;
		}

		public void setRefund_id(String refund_id) {
			this.refund_id = refund_id;
		}

		public String getRefund_status() {
			return refund_status;
		}

		public void setRefund_status(String refund_status) {
			this.refund_status = refund_status;
		}

		public String getSuborder_id() {
			return Suborder_id;
		}

		public void setSuborder_id(String suborder_id) {
			Suborder_id = suborder_id;
		}

		public String getRefund_time() {
			return refund_time;
		}

		public void setRefund_time(String refund_time) {
			this.refund_time = refund_time;
		}

		public String getOrgorder_id() {
			return orgorder_id;
		}

		public void setOrgorder_id(String orgorder_id) {
			this.orgorder_id = orgorder_id;
		}

		public String getUser_id() {
			return user_id;
		}

		public void setUser_id(String user_id) {
			this.user_id = user_id;
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

		public String getOrder_id() {
			return Order_id;
		}

		public void setOrder_id(String order_id) {
			Order_id = order_id;
		}

		public String getPay_time() {
			return Pay_time;
		}

		public void setPay_time(String pay_time) {
			Pay_time = pay_time;
		}

		public String getRefundUrl() {
			return refundUrl;
		}

		public void setRefundUrl(String refundUrl) {
			this.refundUrl = refundUrl;
		}

		public String getThirdRrefundId() {
			return thirdRrefundId;
		}

		public void setThirdRrefundId(String thirdRrefundId) {
			this.thirdRrefundId = thirdRrefundId;
		}

		public String getOutuserId() {
			return outuserId;
		}

		public void setOutuserId(String outuserId) {
			this.outuserId = outuserId;
		}    
 
		public String getTemp1() {
			return temp1;
		}

		public void setTemp1(String temp1) {
			this.temp1 = temp1;
		}

		public String getTemp2() {
			return temp2;
		}

		public void setTemp2(String temp2) {
			this.temp2 = temp2;
		}

		public String getTemp3() {
			return temp3;
		}

		public void setTemp3(String temp3) {
			this.temp3 = temp3;
		}

	
	}

	@Override
	public Class getResponseClass() {
		return MalluserInfoForOuterResponseV1Biz.class;
	}
	

	@Override
	public boolean isNeedEncrypt() {
		return false;
	}

	@Override
	public Class getBizContentClass() {
		return MalluserInfoForOuterRequestV1Biz.class;
	}

	@Override
	public String getMethod() {
		return "POST";
	}


	
}
