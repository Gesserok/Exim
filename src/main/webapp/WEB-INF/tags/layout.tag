<%@tag pageEncoding="UTF-8" description="Base layout" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@attribute name="title" type="java.lang.String" required="true"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <base href="https://cib-online.com.ua/uk/" />
    <meta name="author" content="Super User" />
    <meta name="generator" content="J!Blank.pro Joomla Template" />
    <%--<title>Home</title>--%>
    <link href="https://cib-online.com.ua/uk/" rel="alternate" hreflang="uk-UA" />
    <link href="https://cib-online.com.ua/ru/" rel="alternate" hreflang="ru-RU" />
    <link href="/templates/jblank/favicon.ico" rel="shortcut icon" type="image/vnd.microsoft.icon" />
    <link href="https://cib-online.com.ua/cache/jblank/styles-template-lessgpeasy.css?643" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/100_bootstrap.min.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/100_iconselect.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/100_palette-color-picker.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/200_bootstrap-datepicker.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/200_dvdev.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/400_iconselect.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/500_main.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/900_custom_dvbank.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/910jquery.mCustomScrollbar.min.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/cache/jblank/styles-billers-scssleafo.css?643" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/cache/jblank/styles-buttons-scssleafo.css?643" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/error.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/frontUV_dvbank.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/frontUV_ibank.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/frontU_dvbank.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/frontU_ibank.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/maps.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/panels.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/cache/jblank/styles-remittance-scssleafo.css?643" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/sidebar.css" rel="stylesheet" media="all" />
    <link href="https://cib-online.com.ua/templates/jblank/css/styles.css" rel="stylesheet" media="all" />
    <%--<link href="/media/mod_languages/css/template.css" rel="stylesheet" />--%>
    <%--<link href="/media/jui/css/chosen.css?07d03085592ff1254bb6cb184ef50551" rel="stylesheet" />--%>
    <%--<script src="/media/jui/js/jquery.min.js?07d03085592ff1254bb6cb184ef50551"></script>--%>
    <%--<script src="/media/jui/js/jquery-noconflict.js?07d03085592ff1254bb6cb184ef50551"></script>--%>
    <%--<script src="/media/jui/js/jquery-migrate.min.js?07d03085592ff1254bb6cb184ef50551"></script>--%>
    <%--<script src="/media/system/js/caption.js?07d03085592ff1254bb6cb184ef50551"></script>--%>
    <%--<script src="/media/tpl_jblank/js/jquery.mask.js"></script>--%>
    <%--<script src="/media/tpl_jblank/js/jquery.creditCardValidator.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_bootstrap-datepicker.min.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_bootstrap-datepicker.ru.min.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_bootstrap-datepicker.uk.min.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_bootstrap.min.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_hamburger.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_iconselect.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_iscroll.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_jquery.mask.min.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_jquery.maskMoney.min.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_palette-color-picker.min.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/100_touch_smartphones.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/common.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/custom_dvbank.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/frontU_dvbank.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/jquery.mCustomScrollbar.concat.min.js"></script>--%>
    <%--<script src="https://cib-online.com.ua/templates/jblank/js/main.js"></script>--%>
    <%--<script src="/media/jui/js/chosen.jquery.min.js?07d03085592ff1254bb6cb184ef50551"></script>--%>
    <script>
        jQuery(window).on('load',  function() {
            new JCaption('img.caption');
        });
        jQuery(function ($) {
            initChosen();
            $("body").on("subform-row-add", initChosen);

            function initChosen(event, container)
            {
                container = container || document;
                $(container).find(".advancedSelect").chosen({"disable_search_threshold":10,"search_contains":true,"allow_single_deselect":true,"placeholder_text_multiple":"\u0412\u0432\u0435\u0434\u0456\u0442\u044c \u0430\u0431\u043e \u043e\u0431\u0435\u0440\u0456\u0442\u044c \u0434\u0435\u044f\u043a\u0456 \u043e\u043f\u0446\u0456\u0457","placeholder_text_single":"\u041e\u0431\u0435\u0440\u0456\u0442\u044c \u043f\u0430\u0440\u0430\u043c\u0435\u0442\u0440","no_results_text":"\u0420\u0435\u0437\u0443\u043b\u044c\u0442\u0430\u0442\u0438 \u043d\u0435 \u0437\u043d\u0430\u0439\u0434\u0435\u043d\u043e"});
            }
        });

    </script>
    <link href="https://cib-online.com.ua/uk/" rel="alternate" hreflang="x-default" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta name="google" content="notranslate">
    <link rel="apple-touch-icon-precomposed" href="https://cib-online.com.ua/templates/jblank/images/icons/apple-touch-iphone.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="https://cib-online.com.ua/templates/jblank/images/icons/apple-touch-ipad.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="https://cib-online.com.ua/templates/jblank/images/icons/apple-touch-iphone4.png">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="https://cib-online.com.ua/templates/jblank/images/icons/apple-touch-ipad-retina.png">
    <meta name="google-site-verification" content="... google verification hash ..." />
    <meta name="yandex-verification" content="... yandex verification hash ..." />

    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&amp;subset=cyrillic" rel="stylesheet">
    <title><c:out value="${title}"/></title>
</head>
<body>

<header class="navbar navbar-default">
    <div class="container">
        <input type="hidden" id="service_information"
               data-pageid="12"
               data-pageurl="https://cib-online.com.ua/uk/uncategorised/home-ua"
               data-lang="uk"
               data-scroll="0"
        />
        <script>
            jQuery("body").on("click", ".authorization_website", function (e) {
                var action = jQuery(this).attr("href");
                var auth = false;
                if (auth) {
                    e.preventDefault();
                    jQuery("#authorization_website input[name='redirect_url']").val(action);
                    jQuery("#authorization_website").submit();
                }
            });
        </script>

        <form id="authorization_website" action="https://cib.com.ua" method="POST">
            <input type="hidden" name="auth_token" value=""/>
            <input type="hidden" name="redirect_url" value="https://cib.com.ua"/>
        </form>

        <header class="fixed-header">
            <nav class="fixed-header-navigation">
                <ul class="fixed-header__nav left">
                    <li>
                        <a style="border-radius: 0px 25px 25px 0px;" href="https://cib.com.ua" class="header__button header__button_with-image btn-frame authorization_website fixed-header__nav left ">
                            <div class="icons">
                                <img src="https://cib-online.com.ua/templates/jblank/img/content/dvbank/back-to.png">
                            </div>
                            <span class="text">Повернутися на сайт</span>
                        </a>
                    </li>
                    <li>
                        <div class="info-center">
                            <span>Інформаційний центр</span>
                            <a href="tel:0 800 501 200">0 800 501 200</a>
                        </div>
                    </li>
                </ul>

                <div class="fixed-header__logo">
                    <a href="/uk/cabinet/products">

                        <img src="https://cib-online.com.ua/templates/jblank/img/content/comin_logo.png">
                    </a>
                </div>
                <ul class="fixed-header__nav right">

                    <li class="exit-enter">
                        <a href="/cabinet/auth" class="header__button btn-frame">
                            <span class="text">Вхід</span>
                        </a>
                    </li>
                </ul>
                <ul class="fixed-header__nav right">

                    <!--                <li>-->
                    <!--                    <div class="header__button header__button_white header__button_icon-only share">-->
                    <!--                        <div class="icons">-->
                    <!--                            <img src="/--><? //= $tpl->pathTemplate ?><!--/img/content/dvbank/share.png">-->
                    <!--                        </div>-->
                    <!---->
                    <!--                        <div class="social-list">-->
                    <!--                            <a href="/--><? //= $IB->CONFIG->get('URL_FACEBOOK') ?><!--" target="_blank">-->
                    <!--                                <img src="/--><? //= $tpl->pathTemplate ?><!--/img/content/dvbank/facebook.svg" title="Facebook" alt="Facebook">-->
                    <!--                            </a>-->
                    <!--                        </div>-->
                    <!--                    </div>-->
                    <!--                </li>-->
                    <li>
                        <div class="header__button header__button_white header__button_icon-only search-button">

                            <div class="search-popup">
                                <form method="get" action="https://cib-online.com.ua" id="search-form">
                                    <input type="text" name="q" placeholder="Пошук" value="">
                                    <button type="submit"></button>
                                </form>
                            </div>
                        </div>

                    </li>

                    <li>
                        <div class="langs">
                            <div class="mod-languages top__container__lang">

                                <form id="lang-form" name="lang" method="post" action="https://cib-online.com.ua/uk/">
                                    <select id="lang-select" class="inputbox advancedSelect" >

                                        <option dir="ltr" value="/uk/?" selected="selected">
                                            UA</option>

                                        <option dir="ltr" value="/ru/?" >
                                            RU</option>
                                    </select>
                                </form>
                                <script type="text/javascript">

                                    jQuery(document).ready(function () {
                                        (function($) {
                                            $('#lang-select').on('change', function () {
                                                $('#lang-form').attr('action', $(this).val());
                                                $('#lang-form').submit();
                                            });
                                        })(jQuery);
                                    });
                                </script>

                            </div>

                        </div>
                    </li>
                </ul>

            </nav>

        </header>

        <script>
            (function ($) {
                // let searchButton = $('.search-button');

                searchButton.click(function () {
                    $('.search-popup').addClass('open');
                });
                $(document).mouseup(function (e) {

                    if ($('.search-popup').has(e.target).length === 0) {
                        $('.search-popup').removeClass('open');
                    }
                });


                $('#search-form').submit(function (e) {
                    var auth = false;
                    if (auth) {
                        var searchquery = $(this).serialize();
                        e.preventDefault();
                        jQuery("#authorization_website input[name='redirect_url']").val('https://cib.com.ua/search?' + searchquery);
                        jQuery("#authorization_website").submit();
                    }
                });

            }(jQuery));
        </script>

        <!-- вывести публикации на страницах категории -->
        <div class="cabinet-auth">
            <section class="login-sec cf">
                <div class="container">
                    <div class="login-sec__form">
                        <div class="overview overview_login">
                            <div class="overview__inner">



                                <div class="sub-services">
                                    <form class="form-auth validate" action="" method="post" onsubmit='jQuery("#phone_hidden").val(jQuery("#phone").val().replace(/[^0-9+]/g, ""))'>
                                        <input type="hidden" name="method" value="authenticate"/>
                                        <div class="sub-services__acts">
                                            <div class="client-input">
                                                <div class="client-input__data phone">
                                                    <label for="phone">Введіть номер вашого мобільного телефону:</label>
                                                    <input id="phone_hidden" type="hidden" name="args[0]"/>
                                                    <input id="phone" class="required" data-mask='phone' value="" type="tel" placeholder="+38 (___) ___ __ __">
                                                </div>
                                                <div class="client-input__data password">
                                                    <label for="password">Введіть ваш пароль:</label>
                                                    <input name="args[1]" id="password" class="required" value="" type="password" placeholder="">
                                                    <div class="restore">
                                                        <div class="regTitleLogin">
                                                            <a class="text_block_authorization" href="/uk/cabinet/reg"><span>Реєстрація</span></a>
                                                        </div>
                                                        <div class="passTitleLogin">
                                                            <a class="text_block_authorization" href="#" data-toggle="modal" data-target="#password_recovery" onclick="jQuery('#password_recovery_form').removeClass('hidden');jQuery('#password_reset_form').addClass('hidden');jQuery('#password_reset_success').addClass('hidden');"><span>Відновлення паролю</span></a>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                            <button class="btn-press">УВІЙТИ</button>
                                        </div>
                                    </form>

                                    <div class="load-apps">
                                        <span class="text_block_authorization">Завантажити додаток</span>
                                        <span>
                                    <a href="https://play.google.com/store/apps/details?id=ua.cominbank.android.cominbank" target="_blank">
                                        <i class="icons icons_android"></i>
                                    </a>
                                    <a href="https://itunes.apple.com/us/app/cib-online/id1413210102?l=ru&ls=1&mt=8" target="_blank">
                                        <i class="icons icons_apple"></i>
                                    </a>
                            </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div id="password_recovery" class="modal fade" role="dialog">
                    <div class="modal-dialog">
                        <!-- Modal content-->
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal">&times;</button>
                                <h4 class="modal-title">Відновлення паролю</h4>
                            </div>
                            <div class="modal-body preloader_block preloader_complete">
                                <div class="cabinet_remittance_error hidden"></div>
                                <div class="preloader_content">


                                    <form id="password_recovery_form" class="form-auth validate" action="" method="post">
                                        <div class="sub-services__acts">
                                            <div class="client-input">
                                                <div class="client-input__data">
                                                    <label for="card-number">Введіть номер картки:</label>
                                                    <input type="text" name="data[card_number]" class="form-control" placeholder="Номер карти" id="card-number" required="required">
                                                    <span class="help-block"></span>
                                                </div>
                                            </div>
                                            <div class="login-buttons">
                                                <button type="button" class="btn-press btn-press_recov" onclick="password_recovery_send()"><span class="recovery-btn">Відновлення паролю</span></button>
                                                <button type="button" class="btn-press cancel" data-dismiss="modal"><span>Закрити</span></button>
                                            </div>
                                        </div>
                                    </form>


                                    <form id="password_reset_form" class="form-auth hidden" action="" method="post">
                                        <input type="hidden" name="token" value=""/>
                                        <div class="sub-services__acts">
                                            <div class="client-input">
                                                <div class="client-input__data">
                                                    <label for="password">Код з СМС:</label>
                                                    <input name="data[otp]" class="required" value="" type="text" placeholder="">
                                                </div>

                                                <div class="client-input__data">
                                                    <label for="password">Новий пароль:</label>
                                                    <input class="required" name="data[password]" value="" type="password"/>
                                                </div>

                                                <div class="client-input__data">
                                                    <%--<label for="confirm">Підтвердження паролю:</label>--%>
                                                    <input class="required" name="data[confirm]" value="" type="password"/>
                                                </div>
                                            </div>

                                            <button type="button" class="btn-press" onclick="password_reset_send()">Відновлення паролю</button>
                                        </div>
                                    </form>

                                    <div id="password_reset_success">
                                        <div class="password_reset_success__content">Пароль успішно змінений</div>
                                        <button type="button" class="btn-press" data-dismiss="modal">Ok</button>
                                    </div>

                                </div>
                                <img class="preloader" src="https://cib-online.com.ua/templates/jblank/images/preloader.gif"/>
                            </div>
                        </div>
                    </div>
                </div>
            </section>


            <script>


                (function ($) {
                    jQuery('#card-number').off('input.jccv keyup.jccv');
                })(jQuery);

                function password_recovery_send() {

                    var modal = jQuery("#password_recovery");
                    modal.find(".cabinet_remittance_error").addClass("hidden");
                    modal.find(".cabinet_remittance_error").html("");

                    var cardNumber = jQuery('#card-number');

                    cardNumber.validateCreditCard(function (result) {
                        if (result.valid) {

                            modal.find(".preloader_block").removeClass("preloader_complete");
                            jQuery.ajax({
                                url: '/index.php?AJAX&TEMPLATE=login_form&method=recovery',
                                method: "post",
                                dataType: "json",
                                data: jQuery("#password_recovery_form").serialize(),
                                success: function (r) {
                                    if (r.request !== undefined) {
                                        setTimeout(function () {
                                            modal.find(".preloader_block").addClass("preloader_complete");
                                            modal.find("input[name='otp']").focus();
                                        }, 1000);

                                        if (r.request == "success") {
                                            jQuery("#password_recovery_form").addClass("hidden");
                                            jQuery("#password_reset_form").removeClass("hidden");
                                            initPasswordsInputs();
                                            jQuery("#password_reset_form input[name='token']").val(r.response.token);
                                        } else if ((r.request == "error") && (r.EXCEPTION !== undefined)) {
                                            modal.find(".cabinet_remittance_error").removeClass("hidden");
                                            modal.find(".cabinet_remittance_error").html(r.EXCEPTION)
                                        } else oops();
                                    } else oops();
                                }
                            });

                        } else {
                            cardNumber.next('span.help-block').html('Банківська картка недійсна');
                            cardNumber.closest('div.form-group').addClass('has-error');
                        }
                    });

                    cardNumber.off('input.jccv keyup.jccv');

                    return false;
                }

                function password_reset_send() {
                    var modal = jQuery("#password_recovery");
                    modal.find(".cabinet_remittance_error").addClass("hidden");
                    modal.find(".cabinet_remittance_error").html("");

                    if (validation({target: password_reset_form})) {
                        modal.find(".preloader_block").removeClass("preloader_complete");

                        jQuery.ajax({
                            url: '/index.php?AJAX&TEMPLATE=login_form&method=reset',
                            method: "post",
                            dataType: "json",
                            data: jQuery("#password_reset_form").serialize(),
                            success: function (r) {
                                if (r.request !== undefined) {
                                    setTimeout(function () {
                                        modal.find(".preloader_block").addClass("preloader_complete");
                                    }, 1000);

                                    if (r.request == "success") {
                                        jQuery("#password_recovery_form").addClass("hidden");
                                        jQuery("#password_reset_form").addClass("hidden");
                                        jQuery("#password_reset_success").removeClass("hidden");
                                    } else if ((r.request == "error") && (r.EXCEPTION !== undefined)) {
                                        modal.find(".cabinet_remittance_error").removeClass("hidden");
                                        modal.find(".cabinet_remittance_error").html(r.EXCEPTION)
                                    } else oops();
                                } else oops();
                            }
                        });
                    }
                    return false;
                }
            </script>
            <!--<video class="video-bg" id="bgvid" playsinline autoplay muted loop>-->
            <!--    <source src="/../../../../dev_--><?//=TEMPLATE?><!--/static/img/content/video/video.webm" type="video/webm">-->
            <!--    <source src="/../../../../dev_--><?//=TEMPLATE?><!--/static/img/content/video/video.mp4" type="video/mp4">-->
            <!--</video>-->
            <img class="video-bg" src="https://cib-online.com.ua/templates/jblank/images/_background.jpg" />
        </div>
    </div>
</header>

<div class="container">
    <jsp:doBody/>
</div>


<footer class="panel-footer">
    <div class="container">
        <div class="left-side">
            <div class="left-side_logo">
                <a href="/">
                    <img style="width: 100%;" src="https://cib-online.com.ua/templates/jblank/img/content/comiFooterLogo.png">
                </a>
            </div>
            <div class="info-center">
                <a href="mailto:info@cib.com.ua">info@cib.com.ua</a>
            </div>
            <div class="Nbu">
                CominBank 2018. Ліцензія НБУ №186 від 11.11.2011            </div>
        </div>
        <div class="right-side">
            <ul class="nav menu">
                <li class="item-199"><a href="https://cib.com.ua/uk/about/" class="authorization_website">Про банк</a></li> <li class="item-245"><a href="/uk/locations" >Локації</a></li> <li class="item-202"><a href="https://cib.com.ua/uk/atms" class="authorization_website">Відділення та банкомати</a></li> <li class="item-239"><a href="/uk/news-ua" >Новини</a></li> <li class="item-200"><a href="https://cib.com.ua/uk/about/guarantee" class="authorization_website">Гарантування вкладів фізичних осіб</a></li> </ul>

        </div>
        <div class="bottom-side">
            <div class="payforce">
                Розробка банкінгу <a href=http://payforce.ua/ target=_blank>Pay Force</a>            </div>
        </div>
    </div>
</footer>

</body>
<script src="<c:url value="/assets/js/jquery-3.3.1.min.js" />"></script>
<script src="<c:url value="/assets/js/bootstrap.min.js" />"></script>
</html>
