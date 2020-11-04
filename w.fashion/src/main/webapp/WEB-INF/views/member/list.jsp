<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!--**********************************
            Header start
***********************************-->
<div class="header">    
    <div class="header-content clearfix">
        
        <div class="nav-control">
            <div class="hamburger">
                <span class="toggle-icon"><i class="icon-menu"></i></span>
            </div>
        </div>
        <div class="header-left">
            <div class="input-group icons">
                <div class="input-group-prepend">
                    <span class="input-group-text bg-transparent border-0 pr-2 pr-sm-3" id="basic-addon1">회원 목록</span>
                </div>
            </div>
        </div>
    </div>
</div>
<!--**********************************
    Header end ti-comment-alt
***********************************-->
        
<!--**********************************
            Content body start
***********************************-->
<div class="content-body">
	<div class="container-fluid mt-3">
	
		<div class="row">
			<div class="col-lg-12">
				<div class="card">
					<div class="card-body">
						<div class="active-member">
							<div class="table-responsive">
								<table class="table table-xs mb-0">
									<thead>
										<tr>
											<th>No.</th>
											<th>아이디</th>
											<th>이름</th>
											<th>이메일</th>
											<th>가입일자</th>
											<th>권한</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach var="member" items="${memberList}" varStatus="status">
											<tr>
												<td>${status.count}</td>
												<td><c:out value="${member.userid}"></c:out></td>
												<td><c:out value="${member.username}"></c:out></td>
												<td><c:out value="${member.email}"></c:out></td>
												<td><c:out value="${member.regdate}"></c:out></td>
												<td><c:out value="${member.auth}"></c:out></td>
											</tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- #/ container -->
</div>
<!--**********************************
            Content body end
***********************************-->
