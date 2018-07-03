package apiRquest;
/*模型类，实体类，实体模型类*/
public class requestModel {
	
	
	//主键uuid
	private String appId;
	private String RSA;
	private String aesKey;
	private String myPrivateKey;
	private String apigwPublicKey;
	private String AES;
	private String URL;
	private String result;
	private String bizContent;
	private String dataType;
	public String getAesKey() {
		return aesKey;
	}
	public void setAesKey(String aesKey) {
		this.aesKey = aesKey;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getRSA() {
		return RSA;
	}
	public void setRSA(String rSA) {
		RSA = rSA;
	}
	public String getMyPrivateKey() {
		return myPrivateKey;
	}
	public void setMyPrivateKey(String myPrivateKey) {
		this.myPrivateKey = myPrivateKey;
	}
	public String getApigwPublicKey() {
		return apigwPublicKey;
	}
	public void setApigwPublicKey(String apigwPublicKey) {
		this.apigwPublicKey = apigwPublicKey;
	}
	public String getAES() {
		return AES;
	}
	public void setAES(String aES) {
		AES = aES;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getBizContent() {
		return bizContent;
	}
	public void setBizContent(String bizContent) {
		this.bizContent = bizContent;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	
}
