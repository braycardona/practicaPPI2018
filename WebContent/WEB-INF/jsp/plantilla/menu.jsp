<div class="header-container">
	<header class="header fixed clearfix">
		<div class="container">
			<div class="row">
				<div class="col-xs-6 col-md-2">
					<div class="header-left clearfix">
						<div id="logo" class="logo">
							<a href="${pageContext.request.contextPath}"> 
								<img id="logo_img" src="${pageContext.request.contextPath}/resources/menu.PNG" alt="colsevi">
							</a>
						</div>
					</div>
				</div>
				<div class="col-xs-6 col-md-10">
					<div class="header-right clearfix">
						<div class="main-navigation animated with-dropdown-buttons">

							<nav class="navbar navbar-default" role="navigation">
								<div class="container-fluid">
									<div class="navbar-header">
										<button type="button" class="navbar-toggle"
											data-toggle="collapse" data-target="#navbar-collapse-1">
											<span class="sr-only">Toggle navigation</span> <span
												class="icon-bar"></span> <span class="icon-bar"></span> <span
												class="icon-bar"></span>
										</button>
									</div>
									<div class="collapse navbar-collapse" id="navbar-collapse-1">
										<ul class="nav navbar-nav">${col.menu}
										</ul>
									</div>
								</div>
							</nav>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
</div>