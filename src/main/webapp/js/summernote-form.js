$(function() {
    $('.summernote').summernote({
        height: 200
    });
    $('form').on('submit', function (e) {
        e.preventDefault();
        alert($('.summernote').summernote('code'));
        alert($('.summernote').val());
    });
});