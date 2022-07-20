<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="utf-8"%>

<form class="login__input" action="/auth/signin" method="POST">
    <input type="text" name="username" placeholder="유저네임" required="required" />
    <input type="text" name="password" placeholder="비밀번호" required="required" />
    <button>로그인</button>
</form>