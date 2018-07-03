<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/index.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<title>登录页</title>
<script>
	function MM_swapImage(srcObj,image_src){
		srcObj.src=image_src;
	}
	$(function(){
		$("#login_ok").click(function(){
			$("form:first").submit();
		});
		$("#selectUrl").change(function(){
			debugger;
			var selectUrl=$("#selectUrl").val();
			if(selectUrl=="https://apipcs.dccnet.com.cn/ui/mall/b2C/page/order/create/V1"){
				$("#selectDataType").val("2");
			}else{
				$("#selectDataType").val("1");
			}
			 });
	});
</script>
</head>
<body>
	<s:actionerror />
				<s:form action="api_login" method="post">
					<table width="100%" border="0" cellpadding="0" cellspacing="0">
						<tr>
							<td width="19%" height="28">APP_ID：</td>
							<td colspan="2">
								<input name="em.appId" size="75" value="10000000000000051504"/>
							</td>
						</tr>
						<tr>
							<td width="19%" height="28">APIGW_PUBLIC_KEY：</td>
							<td colspan="2">
							<textarea name="em.apigwPublicKey"  rows='5' cols='75'>MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCwFgHD4kzEVPdOj03ctKM7KV+16bWZ5BMNgvEeuEQwfQYkRVwI9HFOGkwNTMn5hiJXHnlXYCX+zp5r6R52MY0O7BsTCLT7aHaxsANsvI9ABGx3OaTVlPB59M6GPbJh0uXvio0m1r/lTW3Z60RU6Q3oid/rNhP3CiNgg0W6O3AGqwIDAQAB</textarea>
							</td>
						</tr>
						<tr>
							<td height="31">MY_PRIVATE_KEY：</td>
							<td colspan="2">
								<textarea name="em.myPrivateKey"  rows='5' cols='75'>MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCRVgmyC7tV4L4dC5B/Hx/EIJFQwdFN6aB8Ia3AxhGgC/hAKfMohR7qDk0ZusNw1Af0ov7APl3tpz0U25+4aLGvy03Bu/eZHFK1feFxakZJtpGER6wm2EAd83cLoq15diIaIzOo8zgFuTbQu2TlIc4tDtr5ZffEe18eTD8asirZ8rtgqYmHq51cDmvBrHoWKHewkrU0fVjFdjiPglu0xg4PT4SHNYe29vWEkDnKg07YKF+t5u3EOyL3GrCQEFjJx87cWUVmGNehRtyT7qjNyyNiFXx4yngL7/WFc1ieMnPVzzOeHlLcRl99q22diO/Lv+i+E8oTzlzg+A233kV+jZtjAgMBAAECggEAT9xjP37K1gnE7djo8bF8lxz+PM4D4Tg7g3pOK9uq27M4Gqnyf5WGwz5Qh47kzh70sCzQp3qdynVXTxrPzVlaKisg8xACohO6LxiYxOWM8fxsQa/QnRe/Q7YA+FfP0ypi2tH1FSVw51Q7Fr+iVXYaARBkqx6o40KXpeJn2peEjHXM5SlZE0JKdeShfzvFzJVBClYLhGU7Zmtka8kFmBNCM3CdReH0lwyuSxcxfn4xq3wUqI6+0PU1qKrBsbRrYd3RIDvCrQ1kFQHiwwGgQ6I557KgIM1N+d6KvQQSDGlw36Q2JBqcbGJDGOUsIbfQaGKVqayttUXffLApcvnnjeAt4QKBgQDJ1ZEjJzr9DFjdqwVAvbRZFpxjEsONhUxQZFteJFGloLMqKPKDMzsQyruWBTPx+f0y/da0oBGCq1Uy6Fzbfdonq9WiZHoUy2mSMmNJdfNqN/fTM6uSAnP+FYy+EQ2hTIBEX4EY51cAQhcYuC4i3QL66QXcitKmBFiyTheK8SMzTwKBgQC4Vu38yxqgbH3pggO+ebqu/0EI5PR07K/t3IT1T3JCVqYEDOLrFio9cdKd32pf9JAeH9+3tRhuzkj1FCMWxbTut6GAT1UbQEhSR5SedbXKGRukwL7pK7dc5W5UmQ/MwaFa1xsE2O+aaXFvQ1UnwJ+npyTLQdBCoUC1166ZDr1hrQKBgQCcWzhOdUu7UN9fCefN2ahnA58vGRApCESwWq51Zclid/WUCZiljwCI56UeePVe1X0TDZZQ41ftVHFyOJQG7Z4c8X9UiGYSyeoE+cf01s01UhpIoVSejgvxoBwh+fAHLs6HKT1HX6AEcS6XVcdX9sMiQXbq/RhmyCM2Lk0Ks/fC/QKBgQCfvfUOE5NHYbzbFWfZL/OuolPhOUb96/2oymgNjIMfKadD60bZIaQJCxHQ7UJpVK1u7YAY2j4KB4kBmCmwGjPoigjR/+1oaBRD+PO5PZgDQi7KXp0RwmhrgAZUGS+v6DvDVJR9ZuB7ltRN7rNkd2/jANzJpoaqtsI00mrjB/rlIQKBgCp3oFsq4n6i91B0m5zhq6wBSQEoHq0MFh2p1F+UJgRdwUcmaesTOTJqIMHm/ASLIgHPsPzZldw4qNTOFxYFbp5ARqeIIgS5Bq4xn0vN+2cKssI2lmAZ3ksg6Aw/OPvnxKCobt9LsaiJY0Fz5mcoUsmZfPb8v5+2Mgkt8sFTDu8D</textarea>
								</td>	
						</tr>
						<tr>
							<td width="19%" height="28">接口类型：</td>
							<td colspan="2">
								<%-- <s:textfield name="em.AES" size="18" value="AES"/> --%>
							<select name="em.dataType"    id="selectDataType">
			       			<option value="1">数据接口</option>
			       			<option value="2">页面接口</option>
			       		</select> 
							</td>
						</tr>
						<tr>
							<td width="19%" height="28">加密类型：</td>
							<td colspan="2">
								<%-- <s:textfield name="em.AES" size="18" value="AES"/> --%>
							<select name="em.AES"  readonly="readonly" >
			       			<option value="AES">AES</option>
			       		</select> 
							</td>
						</tr>
						<tr>
							<td width="19%" height="28">aesKey：</td>
							<td colspan="2">
								<input name="em.aesKey" size="75" />
							</td>
						</tr>
						<tr>
							<tr>
							<td width="19%" height="28">URL：</td>
							<td colspan="2">
							<select name="em.URL"   id="selectUrl">
			       			<option value="https://apipcs.dccnet.com.cn/api/mall/b2C/order/payment/query/V1">支付查询接口---https://apipcs.dccnet.com.cn/api/mall/b2C/order/payment/query/V1</option>
							<option value="https://apipcs.dccnet.com.cn/api/mall/b2C/order/cancel/V1">订单取消接口---https://apipcs.dccnet.com.cn/api/mall/b2C/order/cancel/V1</option>
							<option value="https://apipcs.dccnet.com.cn/ui/mall/b2C/page/order/create/V1">线上订单生成接口---https://apipcs.dccnet.com.cn/ui/mall/b2C/page/order/create/V1</option>
							<option value="https://apipcs.dccnet.com.cn/api/mall/b2C/order/custmer/info/V1">客户信息查询接口---https://apipcs.dccnet.com.cn/api/mall/b2C/order/custmer/info/V1</option>
							<option value="https://apipcs.dccnet.com.cn/api/mall/b2C/order/refund/query/V1">退款结果查询接口---://apipcs.dccnet.com.cn/api/mall/b2C/order/refund/query/V1</option>
							<option value="https://apipcs.dccnet.com.cn/api/mall/b2C/order/refund/V1">退款接口---https://apipcs.dccnet.com.cn/api/mall/b2C/order/refund/V1</option>
							<option value="https://apipcs.dccnet.com.cn/api/mall/b2C/order/offline/create/V1">线下订单接口---https://apipcs.dccnet.com.cn/api/mall/b2C/order/offline/create/V1</option>
			       		</select>
			       			</td>
						</tr>
						</tr>
						<tr>
							<td width="19%" height="28">bizContent：</td>
							<td colspan="2">
								<textarea name="em.bizContent"  rows='5' cols='75'>${em.bizContent }</textarea>
							</td>
						</tr>
						<tr>
							<td width="19%" height="28">result：</td>
							<td colspan="2">
						<textarea name="em.result"  rows='5' cols='75'>${em.result }</textarea>
							</td>
						</tr>
						<tr>
							<td height="30">&nbsp;</td>
							<td colspan="2">
							<input type="button" value="提交" id="login_ok"/>
							</td>
						</tr>
					</table>
				</s:form>
</body>
</html>
