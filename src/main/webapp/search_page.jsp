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
                                       title="Write the exhibit title.">
                            </span>
                        </div>
                        <button class="btn-search btn-item-info" type="search_button">Start search</button>
                    </div>
                </div>
            </div>
        </div>
        <div class="item">
            <div class="item bg bg2">
                <div class="container">
                    <div class="carousel-caption">
                        <h1 class="cover-heading">Search by QR code</h1>
                        <button class="btn-search btn-item-info" type="search_button">Start search</button>
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
</script>