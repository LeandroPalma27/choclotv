<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
        <!DOCTYPE html>
        <html lang="es">

        <head> </head>

        <body>
            <!-- preloader -->
            <div id="preloader">
                <div id="loading-center">
                    <div id="loading-center-absolute">
                        <img src="img/preloader.svg" alt="" />
                    </div>
                </div>
            </div>
            <!-- preloader-end -->

            <!-- Scroll-top -->
            <button class="scroll-top scroll-to-target" data-target="html">
                <i class="fas fa-angle-up"></i>
            </button>
            <!-- Scroll-top-end-->

            <!-- header-area -->
            <header class="header-style-two">
                <div class="header-top-wrap">
                    <div class="container custom-container">
                        <div class="row align-items-center">
                            <div class="col-md-6 d-none d-md-block"></div>
                            <div class="col-md-6">
                                <div class="header-top-link">
                                    <ul class="quick-link">
                                        <li><a href="#">About Us</a></li>
                                        <li><a href="#">FAQS</a></li>
                                    </ul>
                                    <ul class="header-social">
                                        <li>
                                            <a href="#"><i class="fab fa-facebook-f"></i></a>
                                        </li>
                                        <li>
                                            <a href="#"><i class="fab fa-twitter"></i></a>
                                        </li>
                                        <li>
                                            <a href="#"><i class="fab fa-vimeo-v"></i></a>
                                        </li>
                                        <li>
                                            <a href="#"><i class="fab fa-dribbble"></i></a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="sticky-header" class="menu-area">
                    <div class="container custom-container">
                        <div class="row">
                            <div class="col-12">
                                <div class="mobile-nav-toggler"><i class="fas fa-bars"></i></div>
                                <div class="menu-wrap">
                                    <nav class="menu-nav show">
                                        <div class="logo">
                                            <a href="#">
                                                <h3>Choclo <span>TV</span></h3>
                                            </a>
                                        </div>
                                        <div class="navbar-wrap main-menu d-none d-lg-flex">
                                            <ul class="navigation">
                                                <li class="active menu-item-has-children">
                                                    <a href="#">Inicio</a>
                                                </li>
                                                <li class="menu-item-has-children">
                                                    <a href="#">Peliculas</a>
                                                </li>
                                                <li><a href="tv-show.html">Series</a></li>
                                                <li><a href="pricing.html">Planes</a></li>
                                            </ul>
                                        </div>
                                        <div class="header-action d-none d-md-block">
                                            <ul>
                                                <li class="d-none d-xl-block">
                                                    <div class="footer-search">
                                                        <form action="#">
                                                            <input type="text" placeholder="" />
                                                            <button><i class="fas fa-search"></i></button>
                                                        </form>
                                                    </div>
                                                </li>
                                                <li class="header-lang">
                                                    <form action="#">
                                                        <div class="icon"><i class="flaticon-globe"></i></div>
                                                        <select id="lang-dropdown">
                                                            <option value="">ES</option>
                                                            <option value="">EN</option>
                                                        </select>
                                                    </form>
                                                </li>
                                                <li class="header-btn">
                                                    <a href="#" class="btn">Iniciar sesion</a>
                                                </li>
                                            </ul>
                                        </div>
                                    </nav>
                                </div>

                                <!-- Mobile Menu  -->
                                <div class="mobile-menu">
                                    <div class="close-btn"><i class="fas fa-times"></i></div>

                                    <nav class="menu-box">
                                        <div class="nav-logo">
                                            <a href="index.html"><img src="img/logo/logo.png" alt="" title="" /></a>
                                        </div>
                                        <div class="menu-outer">
                                            <!--Here Menu Will Come Automatically Via Javascript / Same Menu as in Header-->
                                        </div>
                                        <div class="social-links">
                                            <ul class="clearfix">
                                                <li>
                                                    <a href="#"><span class="fab fa-twitter"></span></a>
                                                </li>
                                                <li>
                                                    <a href="#"><span class="fab fa-facebook-square"></span></a>
                                                </li>
                                                <li>
                                                    <a href="#"><span class="fab fa-pinterest-p"></span></a>
                                                </li>
                                                <li>
                                                    <a href="#"><span class="fab fa-instagram"></span></a>
                                                </li>
                                                <li>
                                                    <a href="#"><span class="fab fa-youtube"></span></a>
                                                </li>
                                            </ul>
                                        </div>
                                    </nav>
                                </div>
                                <div class="menu-backdrop"></div>
                                <!-- End Mobile Menu -->
                            </div>
                        </div>
                    </div>
                </div>
            </header>
            <!-- header-area-end -->

            <!-- main-area -->
            <main>
                <div hidden id="logoUrls">
                    <c:forEach var="url" items="${titulos}">
                        <span hidden>${url.logo.urlLogo}</span>
                    </c:forEach>
                </div>

                <!-- slider-area -->
                <section class="slider-area slider-bg" data-background="img/banner/s_slider_bg.jpg">
                    <div class="slider-active">
                        <c:forEach var="titulo" items="${titulos}">
                            <div class="slider-item">
                                <div class="container">
                                    <div class="row align-items-center">
                                        <div class="col-lg-6 order-0 order-lg-2">
                                            <div class="slider-img text-center text-lg-right" data-animation="fadeInRight"
                                                data-delay="1s">
                                                <p>${titulo.descripcion}</p>
                                            </div>
                                        </div>
                                        <div class="col-lg-6">
                                            <div class="banner-content">
                                                <img src="" alt="">
                                                <div style="display: flex; flex-direction: column; justify-content: center; align-items: center;" class="banner-meta" data-animation="fadeInUp" data-delay=".6s">
                                                    <div style="display: flex; width: 100%; height: 250px; background-size: contain; margin-bottom: 20px;">
                                                        <img style="display: flex; width: 100%; height: 100%; object-fit: contain;" src="<c:url value="${titulo.logo.urlLogo}"/>"/>
                                                    </div>
                                                    <ul style="justify-content: center; align-items: center; margin-bottom: 25px;">
                                                        <li style="margin: 10px 15px;" class="quality">
                                                            <span>${titulo.calificacionMadurez.clasificacion}<span></span> <span>${titulo.calificacionMadurez.edadMinima}</span></span>
                                                            <span>${titulo.calidadVideo.calidad}</span>
                                                        </li>
                                                        <li style="margin: 10px 15px;" class="release-time">
                                                            <span><i class="far fa-calendar-alt"></i>${titulo.anio}</span>
                                                        </li>
                                                    </ul>
                                                    <a href="https://www.youtube.com/watch?v=R2gbPxeNk2E"
                                                        class="banner-btn btn popup-video" data-animation="fadeInUp"
                                                        data-delay=".8s"><i class="fas fa-play"></i> Ver ahora</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:forEach>
                    </div>
                </section>
                <!-- slider-area-end -->

            <spring:url value="/resources/css/bootstrap.min.css" var="bootstrapCss" />
            <spring:url value="/resources/css/animate.min.css" var="animateMin" />
            <spring:url value="/resources/css/magnific-popup.css" var="magnificPopup" />
            <spring:url value="/resources/css/fontawesome-all.min.css" var="fontawesomeAll" />
            <spring:url value="/resources/css/owl.carousel.min.css" var="owlCarousel" />
            <spring:url value="/resources/css/flaticon.css" var="flaticon" />
            <spring:url value="/resources/css/odometer.css" var="odometer" />
            <spring:url value="/resources/css/aos.css" var="aos" />
            <spring:url value="/resources/css/slick.css" var="slick" />
            <spring:url value="/resources/css/default.css" var="invalid" />
            <spring:url value="/resources/css/style.css" var="style" />
            <spring:url value="/resources/css/responsive.css" var="responsive" />
            <spring:url value="/resources/js/vendor/jquery-3.6.0.min.js" var="jqueryJs" />
            <spring:url value="/resources/js/popper.min.js" var="poperJs" />
            <spring:url value="/resources/js/bootstrap.min.js" var="bootstrapJs" />
            <spring:url value="/resources/js/isotope.pkgd.min.js" var="isotopeJs" />
            <spring:url value="/resources/js/imagesloaded.pkgd.min.js" var="imagesloadedJs" />
            <spring:url value="/resources/js/jquery.magnific-popup.min.js" var="jqueryJs2" />
            <spring:url value="/resources/js/owl.carousel.min.js" var="owlJs" />
            <spring:url value="/resources/js/slick.min.js" var="slickJs" />
            <spring:url value="/resources/js/wow.min.js" var="wowJs" />
            <spring:url value="/resources/js/aos.js" var="aosJs" />
            <spring:url value="/resources/js/plugins.js" var="pluginsJs" />
            <spring:url value="/resources/js/main.js" var="mainJs" />

            <link href="${bootstrapCss}" rel="stylesheet" />
            <link href="${animateMin}" rel="stylesheet" />
            <link href="${magnificPopup}" rel="stylesheet" />
            <link href="${fontawesomeAll}" rel="stylesheet" />
            <link href="${owlCarousel}" rel="stylesheet" />
            <link href="${flaticon}" rel="stylesheet" />
            <link href="${odometer}" rel="stylesheet" />
            <link href="${aos}" rel="stylesheet" />
            <link href="${slick}" rel="stylesheet" />
            <link href="${invalid}" rel="stylesheet" />
            <link href="${style}" rel="stylesheet" />
            <link href="${responsive}" rel="stylesheet" />

            <script src="${jqueryJs}"></script>
            <script src="${poperJs}"></script>
            <script src="${bootstrapJs}"></script>
            <script src="${isotopeJs}"></script>
            <script src="${imagesloadedJs}"></script>
            <script src="${jqueryJs2}"></script>
            <script src="${owlJs}"></script>
            <script src="${slickJs}"></script>
            <script src="${wowJs}"></script>
            <script src="${aosJs}"></script>
            <script src="${pluginsJs}"></script>
            <script src="${mainJs}"></script>
        </body>

        </html>