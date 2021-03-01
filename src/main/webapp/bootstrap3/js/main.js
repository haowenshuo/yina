/**
 * Created by yb on 2014/12/24.
 */
$(function() {
    $('.dingwei .btn').on('click', function() {
        $(".work").ScrollTo({
            duration: 1000,
            easing: 'linear'
        });
    });

    var $lBox=$(".linkBox");
    $lBox.on("mouseenter", function() {
        $(this).addClass("aa", "overlay");
    });
    $lBox.on("mouseleave", function() {
        $(this).removeClass("aa", "overlay");
    });



    $('.taocan-a:not(:first)').hide();

    $(".btn-jing").on('click', function() {

        if($('.right-btn .dis-wai').length==0){

            var index = $(this).closest('.taoxiA').index();
            $('.taoxiA').eq(index).addClass('xiaojiantou').siblings().removeClass('xiaojiantou');
            $('.taocan-a').eq(index).show().siblings().hide();

        }

    });

//    }else if(taocanLen==1){
//        $('.right-btn .btn-jing').eq(1).addClass('dis-wai');
//    }


    $(".duigou").on('click', function() {
        var $gou = $(".gougou").css("opacity");
        if ($gou == 0) {
            $(".gougou").css("opacity", 1);
        } else {
            $(".gougou").css("opacity", 0);
        }
    });



    var $input = $(".box3").find(".named,.Contact");

    $input.on("focus", function() {

        if ($(this).val() == this.defaultValue) {
            $(this).val("");
        }
    });
    $input.on("blur", function() {
        if ($(this).val() == "") {
            $(this).val(this.defaultValue);
        }
    });
});

/*瀹㈡埛寮曞椤甸潰閿氱偣鏁堟灉*/
$(function(){
    if ($(".m-guid-nav-1-qyb").length > 0) {
        var $guidbtn = $(".u-guid-btn");
        var oldImgArr = [];
        for(var i = 0; i < $guidbtn.length; i++){
            oldImgArr.push($guidbtn.eq(i).find("img").attr("src"));
        }
        $guidbtn.on("click", function() {
            for(var j=0; j<$guidbtn.length; j++){
                $guidbtn.eq(j).find("img").attr({"src":oldImgArr[j]});
            }
            $(this).find("img").attr({
                "src": "images/hvr-guid-btn-" + ($(this).index() + 1) + "-qyb.png"
            });
        });
    }
});

$(function() {
    var $input = $(".login-content").find(".shuru,.mima");

    $input.on("focus", function() {

        if ($(this).val() == this.defaultValue) {
            $(this).val("");
        }
    });
    $input.on("blur", function() {
        if ($(this).val() == "") {
            $(this).val(this.defaultValue);
        }
    });
});


$(function() {
    if ($(".j-guid-tabBtn").length > 0) {
        var $tabBtn = $(".j-guid-tabBtn");
        var $tabWrap = $(".j-guid-wrap");
        for (var j = 0; j < $tabWrap.length; j++) {
            $tabWrap.eq(i).css({
                "display": "none"
            });
        }
        for (var i = 0; i < $tabBtn.length; i++) {
            $tabBtn.eq(i).on("click", function() {
                for (var j = 0; j < $tabWrap.length; j++) {
                    $tabWrap.eq(j).css({
                        "display": "none"
                    });
                }
                $tabWrap.eq($(this).index()).css({
                    "display": "block"
                });
            });
        }
    }
});

$.fn.focus = function() {
    this.on('focus', function() {
        var txt_value = $(this).val();
        if (txt_value = this.defaultValue) {
            $(this).val('');
        }
    });
    return this;
};
$.fn.blur = function() {
    this.on('blur', function() {
        var txt_value = $(this).val();
        if (txt_value == '') {
            $(this).val(this.defaultValue);
        }
    });
    return this;
};




$('.ohwawa').focus().blur();
$('.bofang').on('click', function() {
    $('.bofang').toggleClass('dayuhao');
    $('.gifpc').toggleClass('bo');
});



$('#sync2').on('click', function() {
    $("#sync2").ScrollTo({
        duration: 1000,
        easing: 'linear'
    });
});



var _hmt = _hmt || [];
(function() {
    var hm = document.createElement("script");
    hm.src = "//hm.baidu.com/hm.js?502d381fa8d8c4c3f2a69d2cf8d485e3";
    var s = document.getElementsByTagName("script")[0];
    s.parentNode.insertBefore(hm, s);
})();



window._pt_sp_2 = [];
_pt_sp_2.push('setAccount,675d8327');
var _protocol = (("https:" == document.location.protocol) ? " https://" : " http://");

(function() {
    var atag = document.createElement('script'); atag.type = 'text/javascript'; atag.async = true;
    atag.src = _protocol + 'js.ptengine.cn/js/pta.js';
    var stag = document.createElement('script'); stag.type = 'text/javascript'; stag.async = true;
    stag.src = _protocol + 'js.ptengine.cn/js/pts.js';
    var s = document.getElementsByTagName('script')[0];
    s.parentNode.insertBefore(atag, s);s.parentNode.insertBefore(stag, s);
})();
