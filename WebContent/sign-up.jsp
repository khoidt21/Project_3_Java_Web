<%@ include file="header.jsp" %>
<!-- Contact Section -->
	<section class="page-section" id="contact">
		<div class="container">
			
			<!-- Contact Section Form -->
			<div class="row">
				<div class="col-lg-8 mx-auto" style="margin-top: 20px">
					<!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
					<form name="form1" id="form1" action="CourseValidation" method="POST">
						<div class="control-group">
							<h5 style="color: red;font-weight: bold;">REGISTER ACCOUNT</h5>
						</div>
						<div class="control-group">
							<label>Name</label>
						</div>
						<div class="control-group">
							<div
								class="form-group floating-label-form-group controls mb-0 pb-2"
							>
								<input class="form-control" id="name" type="text"
									name="name">
							</div>
						</div>
						<div class="control-group">
							<label>Password</label>
						</div>
						<div class="control-group">
							<div class="form-group floating-label-form-group controls mb-0 pb-2" style="border-bottom: 0">
								<input class="form-control" id="password" type="password" name="password">								
							</div>
						</div>
						
						
						
						<div id="success"></div>
						<div class="form-group">
							<button type="submit" class="btn btn-primary btn-sm"
								id="sendMessageButton"
							>Submit</button>
							<button type="button" class="btn btn-danger btn-sm" onClick="javascript:window.location='welcomepage.jsp'">Cancel</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</section>
	<%@ include file="footer.jsp"%>
</body>
<style>
.floating-label-form-group label {
	opacity: 1 !important;
}
.bg-secondary{
	background-color: #000 !important;
}
.copyright{
	background-color: #000 !important;
} 
.footer{
	background-color: rgba(5,42,62,1) !important;

}
</style>
<script>
$(document).ready(function(){
			$('#form1').submit(function(e) {
								var name = $('#name').val();
								var password = $('#password').val();
								
								var valid = true;
								$(".error").remove();
								if (name.length <= 6) {
									$('#name').after('<span class="error" style="color:red">The name must be 6 characters long</span>');
									valid = false;
								}else {
									var regEx =  /^[A-Za-z0-9\s]+$/;
									var validName = regEx.test(name);
									if (!validName) {
										$('#name').after('<span class="error" style="color:red">The name has no special characters $#@%^&*</span>');
										valid = false;
									}
								}
								if(password.length <= 8){
									$('#password').after('<span class="error" style="color:red">The password must be 8 characters long</span>');
									valid = false;
								}
								return valid;
							});
		});
</script>
</html>
