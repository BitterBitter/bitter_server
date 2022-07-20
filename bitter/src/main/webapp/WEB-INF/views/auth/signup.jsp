<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8"%>

<form class="login__input" action="/auth/signup" method="POST">
    <input type="text" name="username" placeholder="유저네임" required="required" />
    <input type="text" name="password" placeholder="비밀번호" required="required" />
    <br>
    <input type="text" name="name" placeholder="이름" required="required" />
    <br>
    <input type="text" name="age" placeholder="나이" required="required" />
    <br>
    <input type="text" name="gender" placeholder="성별" required="required" />
    <br>
    <input type="text" name="helm" placeholder="키" required="required" />
    <br>
    <input type="text" name="Weight" placeholder="몸무게" required="required" />
    <button>회원가입</button>
</form>