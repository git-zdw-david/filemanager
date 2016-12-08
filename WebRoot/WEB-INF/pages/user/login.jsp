<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<meta charset="UTF-8">
	<title>登录</title>
	<link rel="stylesheet" href="../css/bootstrap.min.css">
	<link rel="stylesheet" href="../css/user/login.css">
	<script src="../js/jquery.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/user/login.js"></script>
</head>

<body>
	<!--	<button id="cbtn" class="btn btn-info">click</button>-->
	<!--	<h1>success : ${success}</h1> -->
	 
	<div id="fullBg">
		<div class="container">
		  <form class="form-signin" action="login.act">       
		      <h1 class="form-signin-heading">账号登录</h1>
		      <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus="" />
		      <input type="password" class="form-control" name="password" placeholder="Password" required=""/>     
		      
		      <button class="btn btn-lg btn-primary btn-block" type="submit">登&nbsp;&nbsp;&nbsp;&nbsp;录</button>   
		  </form>
		  <p class="text-center sign-up"><a href="initRegist.act"><strong>注册</strong> 一个新账号</a></p>
		</div>
	</div>
</body>
</html>