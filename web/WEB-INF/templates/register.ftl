<!doctype html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <script src="https://code.jquery.com/jquery-3.4.1.js"></script>
    <script src="https://cdn.bootcss.com/semantic-ui/2.4.1/components/accordion.js"></script>
    <link rel="stylesheet" href="https://cdn.bootcss.com/semantic-ui/2.4.1/components/accordion.css">
    <title>注册</title>
</head>
<body>
<form action="/doregister" method="post" class="ui form segment">
    <label for="username">用户名</label>
    <input type="text" name="username" autocapitalize="off" placeholder="请输入用户名" required="required"><br>

    <label for="password">密码</label>
    <input type="password" name="password" autocapitalize="off" placeholder="请输入密码"><br>

    <label for="nickname">昵称</label>
    <input type="text" name="nickname" autocapitalize="off" placeholder="请输入昵称"><br>

    <label for="gender">性别</label>
    <select name="gender" id="gender">
        <option>男</option>
        <option>女</option>
    </select>
    <br>

    <label for="email">电子邮件</label>
    <input type="email" name="email" id="email" autocapitalize="off"><br>

    <button type="submit">注册</button>
</form>

</body>
</html>