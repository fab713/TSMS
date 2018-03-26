<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<base href="<%=basePath%>"/>  

<!-- 导航页面 -->

<div class="col-md-3 left_col">
	<div class="left_col scroll-view">
		<div class="navbar nav_title" style="border: 0;">
			<a href="/" class="site_title"><i class="fa fa-paw"></i><span>小熊乐园 V0.1</span></a>
		</div>

		<div class="clearfix"></div>

		<!-- 登录人员信息 -->
		<div class="profile">
			<div class="profile_pic">
				<img src="images/img.jpg" alt="..." class="img-circle profile_img">
			</div>
			<div class="profile_info">
				<span>欢迎您：</span>
				<h2><shiro:principal property="account"/></h2>
			</div>
		</div>

		<br />

		<!-- 系统功能菜单 -->
		<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
			<div class="menu_section">
				<h3><shiro:principal property="roleDesc"/></h3>
				<ul class="nav side-menu">
					<shiro:hasPermission name="love:menu">
						<li>
							<a><i class="fa fa-male"></i>完美生活<span class="fa fa-chevron-down"></span></a>
							<ul class="nav child_menu">
								<shiro:hasPermission name="love:list">
									<li><a href="/loveList">爱的告白</a></li>
									<li><a href="/feeling">心情印记</a></li>
								</shiro:hasPermission>
							</ul>
					</shiro:hasPermission>
					
					<shiro:hasPermission name="ad:menu">
						<li>
							<a><i class="fa fa-bullhorn"></i>浅浅人生<span class="fa fa-chevron-down"></span></a>
							<ul class="nav child_menu">
								<shiro:hasPermission name="adFlow:list">
									<li><a href="/adLife">默默心语</a></li>
								</shiro:hasPermission>
							</ul>
						</li>
					</shiro:hasPermission>
					
					<shiro:hasPermission name="system:menu">
						<li>
							<a><i class="fa fa-cog"></i>系统管理<span class="fa fa-chevron-down"></span></a>
							<ul class="nav child_menu">
								
								<shiro:hasPermission name="systemAuth:menu">
									<li><a>系统权限<span class="fa fa-chevron-down"></span></a>
										<ul class="nav child_menu">
											<shiro:hasPermission name="systemAuthRes:list">
												<li class="sub_menu"><a href="/systemAuthRes">权限资源</a></li>
											</shiro:hasPermission>
											
											<shiro:hasPermission name="systemAuthRole:list">
												<li class="sub_menu"><a href="/systemAuthRole">权限角色</a></li>
											</shiro:hasPermission>
										</ul>
									</li>
								</shiro:hasPermission>
								
								<shiro:hasPermission name="systemAdmin:list">
									<li><a href="/systemAdmin">管理人员</a></li>
								</shiro:hasPermission>
							</ul>
						</li>
					</shiro:hasPermission>
					
				</ul>
			</div>
		</div>

		<!-- /menu footer buttons -->
		<div class="sidebar-footer hidden-small">			
			<!-- /logout ：退出功能访问路径是在spring-shiro.xml中配置的，由shiro执行 ，不走controller -->
			<a data-toggle="tooltip" data-placement="top" title="退出" href="/logout">
				<span class="glyphicon glyphicon-off" aria-hidden="true"></span>
			</a>
		</div>
		<!-- /menu footer buttons -->
	</div>
</div>

<!-- jQuery -->
<script charset="utf-8" src="js/jquery.min.js"></script>
<span style="white-space:pre;">	</span>省略...
<script type="text/javascript">
</script>