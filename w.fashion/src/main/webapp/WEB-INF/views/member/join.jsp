<%@ page language="java" contentType="text/html; charset=UTF-8" %>

<main>
	<div class="join-container">
		<form method="post" action="/member/register">
			<div class="form-title">
				<h2>회원가입</h2>
				<h3>(<span class="must">*</span>)는 필수입력입니다.</h3>
			</div>
			<div class="form-row">
				<label for="userid">아이디<span class="must">*</span></label>
				<input type="text" id="userid" name="userid" class="form-control" maxlength="45">
				<p class="msg" id="useridMsg"></p>
			</div>
			<div class="form-row">
				<label for="userpw">비밀번호<span class="must">*</span></label>
				<input type="password" id="userpw" name="userpw" class="form-control" maxlength="45">
				<p class="msg" id="userpwMsg"></p>
			</div>
			<div class="form-row">
				<label for="userpwchk">비밀번호확인<span class="must">*</span></label>
				<input type="password" id="userpwchk" name="userpwchk" class="form-control" maxlength="45">
				<p class="msg" id="userpwchkMsg"></p>
			</div>
			<div class="form-row">
				<label for="username">이름<span class="must">*</span></label>
				<input type="text" id="username" name="username" class="form-control" maxlength="45">
				<p class="msg" id="usernameMsg"></p>
			</div>
			<div class="form-row">
				<label for="email">이메일</label>
				<input type="text" id="email" name="email" class="form-control" maxlength="45">
			</div>
			<div class="form-row">
				<label for="phone">휴대전화</label>
				<input type="text" id="phone" name="phone" class="form-control" maxlength="45">
			</div>
			<div class="form-row">
				<label>주소</label>
				<div class="form-row form-row-flex">
					<input type="text" id="zip" name="zip" class="form-control" readonly="readonly" placeholder="우편번호">
					<button type="button" id="zip-btn" class="zip-btn btn-white">우편검색</button>
				</div>
				<div class="form-row">
					<input type="text" id="address1" name="address1" class="form-control" readonly="readonly" placeholder="기본 주소">
				</div>
				<div class="form-row">
					<input type="text" id="address2" name="address2" class="form-control" placeholder="나머지 주소">
				</div>
			</div>
			<div class="form-row">
				<button class="form-btn btn-pink">회원가입</button>
			</div>
		</form>
	</div>
</main>
