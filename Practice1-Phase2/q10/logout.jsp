<!DOCTYPE html>
<html>
<head>
    <title>Welcome Page</title>
</head>
<body>
    <h1>Welcome, <%= session.getAttribute("username") %>!</h1>
    <form action="question10b" method="post">
        <button type="submit">Logout</button>
    </form>
</body>
</html>
