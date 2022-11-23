<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Demo</title>
</head>
<body>
${health}
</body>

<script>

    setInterval(myMethod, 1000);

    function myMethod( )
    {
        location.reload();
    }

</script>
</html>