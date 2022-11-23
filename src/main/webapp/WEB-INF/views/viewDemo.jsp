<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@ page session="false" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>칵테일</title>
    <link rel="shortcut icon" href="/images/favicon_A.png" type="image/x-icon">
    <link rel="stylesheet" href="/uikit/css/uikit.min.css"/>
    <link rel="stylesheet" href="/css/index.css">
    <title>${health}</title>

</head>

<body>


<!-- header -->
<div class="header">
    <div class="uk-container uk-container-expand">
        <nav class="uk-navbar">
            <div class="uk-navbar-left">
                <h1><img src="/images/logo.png"/></h1>
            </div>
            <div class="uk-navbar-left">
                <button type="button" class="uk-button uk-flex uk-flex-between uk-flex-middle btn-platform-select">플랫폼관리<i
                        class="cocktail-icon"></i></button>
                <div class="dropdown-platform-select" uk-dropdown="mode: click">
                    <a href="#;" class="uk-flex uk-flex-middle">Option1</a>
                    <a href="#;" class="uk-flex uk-flex-middle">Option2</a>
                </div>
            </div>
            <div class="uk-navbar-right">
                <h2><img src="/images/logo-sub.png"/></h2>
                <ul class="uk-navbar-nav user">
                    <li>
                        <button type="button" class="uk-flex uk-flex-middle"><img
                                src="/images/user.svg"/>관리자
                        </button>
                        <div class="user-detail-drop" uk-dropdown>
                            <ul class="uk-nav uk-dropdown-nav">
                                <li class="uk-flex uk-flex-middle">
                                    <i class="cocktail-icon icon-20">&#xa035;</i> ID :
                                    <span>hach@acornsoft.io</span>
                                </li>
                                <li>
                                    <ul class="user-select-setting" uk-accordion>
                                        <li>
                                            <button type="button" class="uk-accordion-title uk-flex-middle">
                                                <i class="cocktail-icon icon-20">&#xa034;</i> 사용자 언어 선택
                                            </button>
                                            <div class="uk-accordion-content select-lang">
                                                <button type="button">English</button>
                                                <button type="button">Japanese</button>
                                                <button type="button" class="active">Korean</button>
                                                <button type="button">Chinese</button>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <ul class="user-select-setting" uk-accordion>
                                        <li>
                                            <button type="button" class="uk-accordion-title uk-flex-middle">
                                                <i class="cocktail-icon icon-20">&#xa033;</i> 사용자 타임존 선택
                                            </button>
                                            <div class="uk-accordion-content select-lang">
                                                <button type="button">English</button>
                                                <button type="button">Japanese</button>
                                                <button type="button" class="active">Korean</button>
                                                <button type="button">English</button>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <ul class="user-select-setting" uk-accordion>
                                        <li>
                                            <button type="button" class="uk-accordion-title uk-flex-middle">
                                                <i class="cocktail-icon icon-20">&#xa032;</i> 테마
                                            </button>
                                            <div class="uk-accordion-content select-lang">
                                                <button type="button">English</button>
                                                <button type="button">Japanese</button>
                                                <button type="button" class="active">Korean</button>
                                                <button type="button">English</button>
                                            </div>
                                        </li>
                                    </ul>
                                </li>
                                <li>
                                    <a href="#;"><i class="cocktail-icon icon-20">&#xa031;</i>비밀번호 변경</a>
                                </li>
                                <li>
                                    <a href="#;"><i class="cocktail-icon icon-20">&#xa030;</i>도움말</a>
                                </li>
                                <li class="uk-nav-divider"></li>
                                <li>
                                    <a href="#;"><i class="cocktail-icon icon-20">&#xa029;</i>로그아웃</a>
                                </li>
                            </ul>
                        </div>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
</div>
<!-- //header -->
<!-- header-nav -->
<nav class="header-nav uk-container uk-container-expand" uk-navbar>
    <div class="uk-navbar-left">
        <ul class="uk-navbar-nav">
            <li>
                <a href="#"><i class="cocktail-icon">&#xa008;</i> 대시보드</a>
            </li>
            <li>
                <a href="#" class="uk-active"><i class="cocktail-icon">&#xa001;</i>워크스페이스</a>
            </li>
            <li>
                <a href="#"><i class="cocktail-icon">&#xa002;</i>클러스터</a>
            </li>
            <li>
                <a href="#"><i class="cocktail-icon">&#xa003;</i>서비스맵</a>
            </li>
            <li>
                <a href="#"><i class="cocktail-icon">&#xa004;</i>이미지/빌드</a>
            </li>
            <li>
                <a href="#"><i class="cocktail-icon">&#xa005;</i>카탈로그</a>
            </li>
            <li>
                <a href="#"><i class="cocktail-icon">&#xa006;</i>사용자 계정</a>
            </li>
            <li>
                <a href="#"><i class="cocktail-icon">&#xa007;</i>플랫폼설정</a>
            </li>
            <li>
                <a href="#"><i class="cocktail-icon">&#xa028;</i>청구서</a>
            </li>
        </ul>
    </div>
</nav>
<!-- //header-nav -->


<main class="container uk-container uk-container-expand">
    <!-- top-title-wrap -->
    <div class="top-title-wrap">
        <div class="title-wrap">
            <div class="uk-width-expand">
                <h4>워크스페이스 목록</h4>
            </div>
            <div class="uk-width-auto">
                <!--
                <button class="uk-button uk-button-success"><i class="cocktail-icon">&#xe009;</i>생성</button>
                <button class="uk-button uk-button-primary"><i class="cocktail-icon">&#xe008;</i>새로고침</button>
                -->
            </div>
        </div>
    </div>
    <!-- //top-title-wrap -->

    <div class="uk-grid uk-form-row">
        <div class="uk-width-1-1">
            <fieldset class="pc-field-box">
                <legend></legend>
                <div class="table-box">
                    <table class="uk-table uk-table-builds" summary=" ">
                        <caption></caption>
                        <colgroup>
                            <col width="12%">
                            <col width="15%">
                            <col width="12%">
                            <col width="*">
                            <col width="12%">
                            <col width="8%">
                        </colgroup>
                        <thead>
                        <tr>
                            <th class="tl">그룹코드
                                <button class="uk-button uk-button-hidden" type="button"><i
                                        class="cocktail-icon">&#xe004;</i></button>
                            </th>
                            <th class="tc">코드ID
                                <button class="uk-button uk-button-hidden" type="button"><i
                                        class="cocktail-icon">&#xe004;</i></button>
                            </th>
                            <th class="tc">코드명
                                <button class="uk-button uk-button-hidden" type="button"><i
                                        class="cocktail-icon">&#xe004;</i></button>
                            </th>
                            <th class="tc">코드설명
                                <button class="uk-button uk-button-hidden" type="button"><i
                                        class="cocktail-icon">&#xe004;</i></button>
                            </th>
                            <th class="tc">정렬순서
                                <button class="uk-button uk-button-hidden" type="button"><i
                                        class="cocktail-icon">&#xe004;</i></button>
                            </th>
                            <th class="tc">사용유무</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach var="item" items="${codes}" varStatus="status">
                            <tr>
                                <td class="tl"><i class="cocktail-icon coral-color">&#xa009;</i>${item.fileId}</td>
                                <td class="tc">${item.fileType}</td>
                                <td class="tc">${item.fileNm}</td>
                                <td class="tc">${item.filePath}</td>
                                <td class="tc">${item.resv5}</td>
                                <td class="tc">${item.resv4}</td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>

                    <ul class="uk-pagination uk-flex-center" uk-margin>
                        <li>
                            <button class="uk-button uk-button-hidden"><i
                                    class="cocktail-icon">&#xe007;</i></button>
                        </li>
                        <li><a href="#">1</a></li>
                        <li class="uk-disabled"><span>...</span></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">6</a></li>
                        <li class="uk-active"><span>7</span></li>
                        <li><a href="#">8</a></li>
                        <li><a href="#">9</a></li>
                        <li><a href="#">10</a></li>
                        <li class="uk-disabled"><span>...</span></li>
                        <li><a href="#">20</a></li>
                        <li>
                            <button class="uk-button uk-button-hidden"><i
                                    class="cocktail-icon">&#xe006;</i></button>
                        </li>
                    </ul>
                </div>
            </fieldset>
        </div>
    </div>


</main class="uk-container">
<script src="/jquery/jquery.min.js "></script>
<script src="/uikit/js/uikit.min.js "></script>
<!-- 임시 스크립트 -->
<script>
    $(function () {
        $('.user-select-setting .uk-accordion-content button').on('click', function () {
            if (!$(this).hasClass('active')) {
                $(this).siblings('button').removeClass('active');
                $(this).addClass('active');
            }
        })
    })
</script>
</body>

</html>