<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="images/icon.png">


    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- Required CSS files -->
    <link href="libs/bootstrap-player/bootstrap-player.css" rel="stylesheet">
    <link href="css/article.css" rel="stylesheet">

    <!-- Custom styles -->
    <link href="css/regular_page_styles.css" rel="stylesheet">
    <link href="./css/buttons.css" rel="stylesheet">
</head>

<!-- Navigation bar -->
<body>
<nav class="navbar navbar-inverse navbar-static-top">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse"
                    data-target="#navbar">

                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#">MuseumGuide</a>
        </div>

        <!-- Collect the nav links, forms, and other content for toggling -->
        <div class="navbar-collapse collapse" id="navbar">
            <ul class="nav navbar-nav">
                <li><a href="article_page.jsp">Search</a></li>
                <li><a href="#1">About</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
                <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
            </ul>
        </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>

<div class="container">

    <!-- Article -->
    <div class="article title" id="articleTitle" >
        <p text="Test title." />
    </div>
    <hr>
    <div class="article text" id="articleText" >
        <p text="Test text." ></p>
    </div>
    <!-- Article -->

    <!-- G+ comments -->
    <script src="https://apis.google.com/js/plusone.js"></script>
    <div id="comments"></div>
    <script>
        gapi.comments.render('comments', {
            href: window.location,
            width: '960',
            first_party_property: 'BLOGGER',
            view_type: 'FILTERED_POSTMOD'
        });
    </script>
    <!-- Required Javascript files -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/js/bootstrap.min.js"></script>
    <script src="libs/bootstrap-player/bootstrap-player.js"></script>
</div>