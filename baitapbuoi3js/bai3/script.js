document.addEventListener("DOMContentLoaded", function() {
    // Thêm 3 thẻ <li> mới vào cuối danh sách
    for (var i = 8; i <= 10; i++) {
        var newItem = document.createElement("li");
        newItem.textContent = "Item " + i;
        document.getElementById("list").appendChild(newItem);
    }

    // Sửa nội dung cho thẻ <li> 1 thành màu đỏ
    var li1 = document.getElementById("list").querySelector("li:nth-child(1)");
    li1.style.color = "red";

    // Sửa background cho thẻ <li> 3 thành màu xanh
    var li3 = document.getElementById("list").querySelector("li:nth-child(3)");
    li3.style.backgroundColor = "blue";

    // Remove thẻ <li> 4
    var li4 = document.getElementById("list").querySelector("li:nth-child(4)");
    li4.remove();

    // Thêm thẻ <li> mới thay thế cho thẻ <li> 4 bị xóa
    var newLi = document.createElement("li");
    newLi.textContent = "Item mới";
    document.getElementById("list").appendChild(newLi);
});
