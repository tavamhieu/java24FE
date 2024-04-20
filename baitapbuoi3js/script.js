document.addEventListener("DOMContentLoaded", function() {
    // Đặt màu chữ và kích thước phông chữ cho thẻ p
    var paragraph = document.getElementById("text");
    paragraph.style.color = "#000";
    paragraph.style.fontSize = "2rem";
    paragraph.innerHTML = "Tôi có thể làm <em>bất cứ điều gì</em> tôi muốn với JavaScript.";

    // Đặt màu chữ cho tất cả các mục trong danh sách ul
    var listItems = document.querySelectorAll("#list li");
    for (var i = 0; i < listItems.length; i++) {
        listItems[i].style.color = "blue";
    }
});
