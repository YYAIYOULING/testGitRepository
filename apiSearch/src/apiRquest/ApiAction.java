package apiRquest;

import com.icbc.api.BizContent;
import com.icbc.api.DefaultIcbcClient;
import com.icbc.api.IcbcConstants;
import com.icbc.api.IcbcRequest;
import com.icbc.api.UiIcbcClient;
import com.icbc.api.internal.util.internal.util.fastjson.JSON;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import apiRquest.OrderManagerForOuterRequestV1.OrderManagerForOuterRequestV1Biz;

import org.apache.commons.lang3.StringUtils;

@SuppressWarnings("serial")
public class ApiAction extends ActionSupport {
	// 属性驱动,字段启动
	public requestModel em = new requestModel();

	// 获取页面提取信息
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public String login() {
		ValueStack stack = ActionContext.getContext().getValueStack();
		DefaultIcbcClient client = null;
		IcbcRequest request = null;
		UiIcbcClient icbcClient = null;
		try {
			request = getIcbcRequest();
			if (StringUtils.isNotBlank(em.getDataType()) && "2".endsWith(em.getDataType())) {
				icbcClient = new UiIcbcClient(em.getAppId(), em.getMyPrivateKey(), IcbcConstants.CHARSET_UTF8);
				String buildPostForm = icbcClient.buildPostForm(request);
				em.setResult(buildPostForm);
				stack.push(em);
				return "loginIcbcSuccess";
			}
			client = getDefaultIcbcClient();
			MalluserInfoForOuterResponseV1Biz response = (MalluserInfoForOuterResponseV1Biz) client.execute(request,
					System.currentTimeMillis() + "", true);
			String responseBizContent = response.getResponseBizContent();
			em.setResult(responseBizContent);
			stack.push(em);
		} catch (Exception e) {
			e.printStackTrace();
			em.setResult(e.getMessage());
			stack.push(em);
			return "error";
		}
		return "loginSuccess";

	}

	// 获取连接DefaultIcbcClient的客户端
	public DefaultIcbcClient getDefaultIcbcClient() {
		String appId = em.getAppId();// appid
		String myPrivateKey = em.getMyPrivateKey();// 应用私钥
		String apigwPublicKey = em.getApigwPublicKey();// 网关公钥
		DefaultIcbcClient client = new DefaultIcbcClient(appId, IcbcConstants.SIGN_TYPE_RSA, myPrivateKey,
				IcbcConstants.CHARSET_UTF8, IcbcConstants.FORMAT_JSON, apigwPublicKey, IcbcConstants.ENCRYPT_TYPE_AES,
				"", "", "");

		return client;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public IcbcRequest getIcbcRequest() throws Exception {
		// 获取页面的公共数据
		String bizContentPage = em.getBizContent();
		String url = em.getURL();
		Class<? extends IcbcRequest> clazzReq =  (Class<? extends IcbcRequest>) Class.forName("apiRquest.MalluserInfoForOuterRequestV1");
		IcbcRequest request=null;
		BizContent bizContent=null;
		// 用于存放的请求数据
		//线下订单接口
		if (url.contains("/api/mall/b2C/order/offline/create/V1")) {
			clazzReq = (Class<? extends IcbcRequest>) Class.forName("apiRquest.OrderManagerForOuterRequestV1");
			request = clazzReq.newInstance();
			bizContent = new OrderManagerForOuterRequestV1.OrderManagerForOuterRequestV1Biz();
			((OrderManagerForOuterRequestV1Biz) bizContent).setRequestOrdersStr(bizContentPage);
			request.setBizContent(bizContent);
			request.setServiceUrl(url);
			return request;
		}
		//页面数据--线上订单接口
		if (url.contains("/ui/mall/b2C/page/order/create/V1")) {
			clazzReq = (Class<? extends IcbcRequest>) Class.forName("apiRquest.SubmitOrderRequestV1");
		}
		request = clazzReq.newInstance();
		bizContent = (BizContent) JSON.parseObject(bizContentPage, request.getBizContentClass());
		request.setBizContent(bizContent);
		request.setServiceUrl(url);
		return request;
		/*根据参数创建内存类
		 * Object parse = JSON.parse(bizContentPage); Map<String,String> map =
		 * (Map)parse; Map<String, Class<?>> propertyMap=new HashMap<>(); for (
		 * String name : map.keySet()) { propertyMap.put(name,
		 * Class.forName("java.lang.String")); } CglibBean bean = new
		 * CglibBean(propertyMap); for ( String name : map.keySet()) {
		 * bean.setValue(name, map.get(name)); } Object object =
		 * bean.getObject();
		 */
	}
}
