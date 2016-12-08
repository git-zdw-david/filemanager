<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta charset="UTF-8">
	<title>注册</title>
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/user/regist.css">
	<script src="../js/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/user/regist.js"></script>
</head>

<body>
	<div id="fullBg">
		<div class="container">
		  <form class="form-signin" action="regist.act">       
		      <h1 class="form-signin-heading">账号注册</h1>
		      <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus="" />
		      <input type="text" class="form-control" name="nickname" placeholder="Nickname" required="" autofocus="" />
		      <input type="password" class="form-control" name="password" placeholder="Password" required=""/>     
		      
		      <button class="btn btn-lg btn-primary btn-block" type="submit">提&nbsp;&nbsp;&nbsp;&nbsp;交</button>   
		  </form>
		  <p class="text-center sign-up"><a href="initLogin.act"><strong>登录</strong>已有账号</a></p>
		</div>
	</div>
</body>
</html>
