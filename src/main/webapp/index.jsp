<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="images/icon.png">

    <title>Museum Guide</title>

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <!-- Custom styles -->
    <link href="css/main_page_styles.css" rel="stylesheet">
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

<div id="content_div" class="contentdiv">
<!-- Carousel -->
<div id="searchCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
    </ol>
    <div class="carousel-inner" role="listbox">
        <div class="item active">
            <div class="item bg bg1">
                <div class="container">
                    <div class="carousel-caption">
                        <h1 class="cover-heading">Search by exhibit title</h1>

                        <div class="input-group">
                            <span class="input-group-btn">
                                <input type="text" class="form-control" placeholder="Writhe the exhibit title..."
                                       data-toggle="tooltip" data-placement="top"
                                       title="Write the exhibit title." id="search_text">
                            </span>
                        </div>
                        <button class="btn-search btn-item-info" type="search_button" id="search_button">Start search</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="item bg bg2">
                <div class="container">
                    <div class="carousel-caption">
                        <h1 class="cover-heading">Search by QR code</h1>
                        <button class="btn-search btn-item-info" type="search_button" id="qrcode_button">Start search</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <a class="left carousel-control" href="#searchCarousel" role="button"
       data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
                                aria-hidden="true"></span> <span class="sr-only">Previous</span>
    </a> <a class="right carousel-control" href="#searchCarousel" role="button"
            data-slide="next"> <span
        class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
</a>
</div>
</div>

<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

<script type="text/javascript">
    /**
     * Pauses the carousel on focus.
     */
    $(function () {
        $('#searchCarousel.slide').carousel({
            interval: 5000,
            pause: "hover"
        });

        $('input').focus(function () {
            $("#searchCarousel").carousel('pause');
        }).blur(function () {
            $("#searchCarousel").carousel('cycle');
        });
    });

    /**
     * Search by article title.
     */
    $('#search_button').click(function () {
        var requestUrl = "articles/search/findByTitle?title=" + $('#search_text').val();
        console.log(requestUrl);
        $.ajax({
            url: requestUrl
        }).then(function(data) {
            console.log(data);
        });
    });
</script>


</body>
</html>
