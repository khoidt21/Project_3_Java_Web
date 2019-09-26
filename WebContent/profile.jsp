<%@ include file="header.jsp" %>
<!-- Contact Section -->
	 <!-- About Section -->
  <section class="page-section bg-primary text-white mb-0" id="about">
    <div class="container">

      <!-- About Section Heading -->
      <h2 class="page-section-heading text-center text-uppercase text-white" style="margin-top: 40px">PROFILE ACCOUNT</h2>
      
      <!-- About Section Content -->
      <div class="row">
        <div class="col-lg-2 ml-auto">
          <p class="lead">Account Name:</p>
        </div>
        <div class="col-lg-6 mr-auto">
          <p class="lead"><%=username%></p>
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
.bg-primary{
	background-color: #dd3d31 !important;
}
</style>
</html>
