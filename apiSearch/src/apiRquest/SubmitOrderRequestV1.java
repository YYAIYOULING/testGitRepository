package apiRquest;

import java.util.List;

import com.icbc.api.AbstractIcbcRequest;
import com.icbc.api.BizContent;
import com.icbc.api.IcbcResponse;
/**
 * 线上订单
 * @author kfzx-xuel
 *
 */
public class SubmitOrderRequestV1 extends AbstractIcbcRequest<IcbcResponse>{
	
	
	public static class SubmitOrderRequestV1Biz implements BizContent{
		
		private List<ThirdPartySubmitRequestOrders> thirdPartySubmitRequestOrders;
		

		public List<ThirdPartySubmitRequestOrders> getThirdPartySubmitRequestOrders() {
			return thirdPartySubmitRequestOrders;
		}

		public void setThirdPartySubmitRequestOrders(
				List<ThirdPartySubmitRequestOrders> thirdPartySubmitRequestOrders) {
			this.thirdPartySubmitRequestOrders = thirdPartySubmitRequestOrders;
		}
	
	public static class ThirdPartySubmitRequestOrders {
		
		private String orderProdType;
		
		private String appId;
		
		private String platformId;
		
		private String remark1;
		
		private String remark2;
		
		private String remark3;
		private String orderMerchantMemo;
		private String outUserId;
		private String thirdPartyParentOrderId;
		private String thirdPartyOrderId;
		private String parentOrderPrice;
		private String orderPrice;
		private String orderPayAmout;
		private String orderInvalidTime;
		private String payUse;
		private String noticeUrl;
		private String payBackUrl;
		private String payFailUrl;
		
		private StoreVO storeVO;

		public String getOrderProdType() {
			return orderProdType;
		}

		public void setOrderProdType(String orderProdType) {
			this.orderProdType = orderProdType;
		}

		public String getAppId() {
			return appId;
		}

		public void setAppId(String appId) {
			this.appId = appId;
		}

		public String getPlatformId() {
			return platformId;
		}

		public void setPlatformId(String platformId) {
			this.platformId = platformId;
		}

		public String getRemark1() {
			return remark1;
		}

		public void setRemark1(String remark1) {
			this.remark1 = remark1;
		}

		public String getRemark2() {
			return remark2;
		}

		public void setRemark2(String remark2) {
			this.remark2 = remark2;
		}

		public String getRemark3() {
			return remark3;
		}

		public void setRemark3(String remark3) {
			this.remark3 = remark3;
		}

		

		public String getOutUserId() {
			return outUserId;
		}

		public void setOutUserId(String outUserId) {
			this.outUserId = outUserId;
		}

		public String getThirdPartyParentOrderId() {
			return thirdPartyParentOrderId;
		}

		public void setThirdPartyParentOrderId(String thirdPartyParentOrderId) {
			this.thirdPartyParentOrderId = thirdPartyParentOrderId;
		}

		public String getThirdPartyOrderId() {
			return thirdPartyOrderId;
		}

		public void setThirdPartyOrderId(String thirdPartyOrderId) {
			this.thirdPartyOrderId = thirdPartyOrderId;
		}

		public String getParentOrderPrice() {
			return parentOrderPrice;
		}

		public void setParentOrderPrice(String parentOrderPrice) {
			this.parentOrderPrice = parentOrderPrice;
		}

		public String getOrderPrice() {
			return orderPrice;
		}

		public void setOrderPrice(String orderPrice) {
			this.orderPrice = orderPrice;
		}

		public String getOrderPayAmout() {
			return orderPayAmout;
		}

		public void setOrderPayAmout(String orderPayAmout) {
			this.orderPayAmout = orderPayAmout;
		}

		public String getOrderInvalidTime() {
			return orderInvalidTime;
		}

		public void setOrderInvalidTime(String orderInvalidTime) {
			this.orderInvalidTime = orderInvalidTime;
		}

		public String getPayUse() {
			return payUse;
		}

		public void setPayUse(String payUse) {
			this.payUse = payUse;
		}

		public String getNoticeUrl() {
			return noticeUrl;
		}

		public void setNoticeUrl(String noticeUrl) {
			this.noticeUrl = noticeUrl;
		}


		public StoreVO getStoreVO() {
			return storeVO;
		}

		public void setStoreVO(StoreVO storeVO) {
			this.storeVO = storeVO;
		}

		public String getOrderMerchantMemo() {
			return orderMerchantMemo;
		}

		public void setOrderMerchantMemo(String orderMerchantMemo) {
			this.orderMerchantMemo = orderMerchantMemo;
		}

		public String getPayBackUrl() {
			return payBackUrl;
		}

		public void setPayBackUrl(String payBackUrl) {
			this.payBackUrl = payBackUrl;
		}

		public String getPayFailUrl() {
			return payFailUrl;
		}

		public void setPayFailUrl(String payFailUrl) {
			this.payFailUrl = payFailUrl;
		}
	
	public static class StoreVO{
		private String mercId;
		private String storeId;
		private String storeName;
		private List<Prods>  prods ;
		public String getMercId() {
			return mercId;
		}
		public void setMercId(String mercId) {
			this.mercId = mercId;
		}
		public String getStoreId() {
			return storeId;
		}
		public void setStoreId(String storeId) {
			this.storeId = storeId;
		}
		public String getStoreName() {
			return storeName;
		}
		public void setStoreName(String storeName) {
			this.storeName = storeName;
		}
		
		public List<Prods> getProds() {
			return prods;
		}
		public void setProds(List<Prods> prods) {
			this.prods = prods;
		}
		
		public static class Prods{
			private String prodId;
			
			private String prodName;
			
			private String skuId;
			
			public String getProdId() {
				return prodId;
			}
			
			public void setProdId(String prodId) {
				this.prodId = prodId;
			}
			
			public String getProdName() {
				return prodName;
			}
			
			public void setProdName(String prodName) {
				this.prodName = prodName;
			}
			
			public String getSkuId() {
				return skuId;
			}
			
			public void setSkuId(String skuId) {
				this.skuId = skuId;
			}
		}
	}
	}
	
}
	public Class<? extends BizContent> getBizContentClass() {
		// TODO Auto-generated method stub
		return SubmitOrderRequestV1Biz.class;
	}

	public String getMethod() {
		// TODO Auto-generated method stub
		 return "POST";
	}

	public Class<IcbcResponse> getResponseClass() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isNeedEncrypt() {
		// TODO Auto-generated method stub
		return false;
	}

}
