<%--
  Created by IntelliJ IDEA.
  User: askar
  Date: 11/13/21
  Time: 3:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First Project</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
<div class="row">
        <div class="col-sm-4">
            <form action="/home" method="get">
                <div class="form-groupx">
                    <label>
                        NAME:
                    </label>
                    <input type="text" name="user_name" placeholder="Insert name">
                </div>
                <div class="form-group">
                    <label>
                        SURNAME:
                    </label>
                    <input type="text" name="user_surname" placeholder="Insert surname">
                </div>
                <div class="form-group">
                    <label>
                        FOOD:
                    </label>

                    <select name="user_food">
                        <option>SUSHI - 3000 KZT</option>
                        <option>BURGER - 600 KZT</option>
                        <option>SALAM BRO - 1000 KZT</option>
                        <option>DONER - 1200 KZT</option>
                    </select>
                </div>
                <div class="input-group">
                    <button type="submit" class="btn-primary">ORDER FOOD</button>
                </div>
            </form>
        </div>
<br>
        <div class="col-sm-4">
            <form action="/gender" method="get">
                <div class="form-group">
                    <label>
                        FUll NAME:
                    </label>
                    <input type="text" name="user_fullname" placeholder="Insert full name">
                </div>
                <div class="form-group">
                    <label>
                        AGE:
                    </label>
                    <input type="text" name="age" placeholder="Insert age">
                </div>
                <div class="form-group">
                    <label>
                        GENDER:
                    </label>

                    <label class="radio-inline">
                        <input type="radio" name="gender" value="male">Male
                    </label>
                    <label class="radio-inline">
                        <input type="radio" name="gender" value="female">Female
                    </label>
                </div>
                <div class="input-group">
                    <button type="submit" class="btn-primary">SUBMIT</button>
                </div>
            </form>
        </div>
        <div class="col-md-4">
            <form action="/add" method="post">
                <div class="form-group">
                    <label>
                        NAME:
                    </label>
                    <input type="text" name="f_name" placeholder="Insert name">
                </div>
                <div class="form-group">
                    <label>
                        SURNAME:
                    </label>
                    <input type="text" name="f_surname" placeholder="Insert surname">
                </div>
                <div class="form-group">
                    <label>
                        CLUB:
                    </label>

                    <select name="club">
                        <option>Real Madrid</option>
                        <option>Barcelona</option>
                        <option>Milan</option>
                        <option>Juventus</option>
                    </select>
                </div>
                <div class="form-group">
                <label>
                    SALARY:
                </label>
                <input type="text" name="salary" placeholder="Insert salary">
                </div>
                <div class="form-group">
                    <label>
                        TRANSFER PRICE:
                    </label>
                    <input type="text" name="price" placeholder="Insert transfer price">
                </div>

                <div class="input-group">
                    <button type="submit" class="btn-primary">ADD FOOTBALLER</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
</html>
