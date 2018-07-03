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
	});
</script>
</head>
<body>
	${em.result }
	<form name="auto_submit_form" method="post"
		action="https://apipcs.dccnet.com.cn/api/mall/b2C/order/payment/query/V1?charset=UTF-8&format=json&sign=gb48pAVIZxXYC2MdUg%2FjzlM7FAMonJ98ENjEYMv%2FVigQdkZ03III%2Fc0e94OEyJfhfxYhy8AHzL0lYbbSfF5LUAbgf%2BPPaCA0yWXd2r0Gr%2Bf%2FNE3oQJFvm4lI89be8IwRerWsQczpLsnpGY4n4tH27x8Kp%2BnEuB5LyeaGQhLIfqSPoa2M3N60PVXjDsbhUKLQWwtvbV4kJ%2BcmVamkdsT58kVoqaP8%2BjVKzmkWzHXrAZXhmeE6440bkzgtOqB6dO4tX60ERPO%2F%2BFFEmoI6OaH7hUSSWJR3tzasel0258GlWOJOC%2F%2BkXQqYGernVECDrN%2BjH4z%2FtmR5lgTFj8QACXehtw%3D%3D&msg_id=9903a9a2baa145fc9db3a38e0bcb037d&app_id=10000000000000051504&sign_type=RSA&timestamp=2018-06-26+10%3A15%3A47">
		<input type="hidden" name="biz_content"
			value="{&quot;appId&quot;:&quot;10000000000000051504&quot;,&quot;orderId&quot;:&quot;0180620IM902677406&quot;,&quot;thirdOrderId&quot;:&quot;020201031IM9003836&quot;,&quot;userId&quot;:&quot;19002718&quot;}">
			<input type="submit" value="立刻提交" style="display: none">
	</form>
</body>
</html>
