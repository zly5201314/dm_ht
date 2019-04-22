$(document).ready(function() {
    "use strict";
    $('#home_form').on('submit',
    function(e) {
        var postdata = $(this).serializeArray();
        var formurl = $(this).attr("action");
        $.ajax({
            url: formurl,
            type: "POST",
            data: postdata,
            success: function(data) {
                var foo = $(".succ_mess");
                foo.attr("style", "display: block;");
                $("#home_form").closest('form').find("input[type=text],input[type=tel],input[type=number],input[type=email], textarea").val("");
            }
        });
        e.preventDefault();
        e.unbind();
    });
    $('#home_enquiry').on('submit',
    function(e) {
        var postdata = $(this).serializeArray();
        var formurl = $(this).attr("action");
        $.ajax({
            url: formurl,
            type: "POST",
            data: postdata,
            success: function(data) {
                var foo = $(".succ_mess_qe");
                foo.attr("style", "display: block;");
                $("#home_enquiry").closest('form').find("input[type=text],input[type=tel],input[type=number],input[type=email], textarea").val("");
            }
        });
        e.preventDefault();
        e.unbind();
    });
    $('#tbook_form').on('submit',
    function(e) {
        var postdata = $(this).serializeArray();
        var formurl = $(this).attr("action");
        $.ajax({
            url: formurl,
            type: "POST",
            data: postdata,
            success: function(data) {
                var foo = $(".succ_mess");
                foo.attr("style", "display: block;");
                $("#tbook_form").closest('form').find("input[type=text],input[type=tel],input[type=number],input[type=email], textarea").val("");
            }
        });
        e.preventDefault();
        e.unbind();
    });
    $('#hbook_form').on('submit',
    function(e) {
        var postdata = $(this).serializeArray();
        var formurl = $(this).attr("action");
        $.ajax({
            url: formurl,
            type: "POST",
            data: postdata,
            success: function(data) {
                var foo = $(".succ_mess");
                foo.attr("style", "display: block;");
                $("#hbook_form").closest('form').find("input[type=text],input[type=tel],input[type=number],input[type=email], textarea").val("");
            }
        });
        e.preventDefault();
        e.unbind();
    });
    $('.map-container').on('click',
    function() {
        $(this).find('iframe').addClass('clicked')
    }).on('mouseleave',
    function() {
        $(this).find('iframe').removeClass('clicked')
    });
    $('#status').fadeOut();
    $('#preloader').delay(350).fadeOut('slow');
    $('body').delay(350).css({
        'overflow': 'visible'
    });
});
function myFunction() {
    var input, filter, table, tr, td, i;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    table = document.getElementById("myTable");
    tr = table.getElementsByTagName("tr");
    for (i = 0; i < tr.length; i++) {
        td = tr[i].getElementsByTagName("td")[1];
        if (td) {
            if (td.innerHTML.toUpperCase().indexOf(filter) > -1) {
                tr[i].style.display = "";
            } else {
                tr[i].style.display = "none";
            }
        }
    }
}
 