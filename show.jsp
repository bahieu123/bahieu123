<%-- 
    Document   : show
    Created on : Jun 14, 2022, 6:04:00 PM
    Author     : Nhat Anh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form>
            Reason: <input type="text" name="reason"/>
            From: <input type="date" name="from"/>
            To: <input type="date" name="to"/>
            Created by: <select name="create">
                <option></option>
            </select>
            Reviewed by: <select name="create">
                <option></option>
            </select>
            <input type="submit" name="save"/>

            
        </form>
    </body>
</html>
