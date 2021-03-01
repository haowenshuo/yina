/**
 * Created by yb on 2015/1/1.
 */
$(function(){

    $(".s-nav li").on('mouseenter', function () {
        $(this).find('span').stop().animate({'left': '0', 'width': '100%'}, 200)
    })
    $(".s-nav li").on('mouseleave', function () {
        $(this).find('span').stop().animate({'left': '50%', 'width': '0%'}, 200)
    });

    $(".where").on("click", function () {
        $(this).find(".icont").toggleClass("act");
        $(this).siblings('.where-content').stop().slideToggle(400);
    });

}) ;