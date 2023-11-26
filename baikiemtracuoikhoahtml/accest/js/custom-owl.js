$(document).ready(function(){
  $('.owl-carousel').owlCarousel({
    // tao vong lap cho slider
    loop:true,
    // khoang cach gia hai phan tu
    margin:100, 
    // thanh dieu huong true hien thi fals mat mui ten
    nav:true,
    // dau cham
    dots:true,
    // toc do chuyen slide
    autoplay:true,
    autoplayTimeout:2000,

    // hien thi item tren cac khoan man hinh
    responsive:{
        0:{
            items:1
        },
        600:{
            items:1
        },
        1000:{
            items:1
        }
    }
})

  });

