// Danh sách các sản phẩm có trong giỏ hàng
let products = [
    {
        name: "Iphone 13 Pro Max", // Tên sản phẩm
        price: 3000000, // Giá mỗi sản phẩm
        brand: "Apple", // Thương hiệu
        count: 2, // Số lượng sản phẩm trong giỏ hàng
    },
    {
        name: "Samsung Galaxy Z Fold3",
        price: 41000000,
        brand: "Samsung",
        count: 1,
    },
    {
        name: "IPhone 11",
        price: 15500000,
        brand: "Apple",
        count: 1,
    },
    {
        name: "OPPO Find X3 Pro",
        price: 19500000,
        brand: "OPPO",
        count: 3,
    },
]

// 1. In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
// Tên - Giá - Thương Hiệu - Số lượng
// Ví dụ : OPPO Find X3 Pro - 19500000 - OPPO - 3

// 2. Tính tổng tiền tất cả sản phẩm trong giỏ hàng
// Tổng tiền mỗi sản phẩm = price * count

// 3. Tìm các sản phẩm của thuơng hiệu "Apple"

// 4. Tìm các sản phẩm có giá > 20000000

// 5. Tìm các sản phẩm có chữ "pro" trong tên (Không phân biệt hoa thường)

// 6. Thêm 1 sản phẩm bất kỳ vào trong mảng product

// 7. Xóa tất cả sản phẩm của thương hiệu "Samsung" trong giỏ hàng

// 8. Sắp xếp giỏ hàng theo price tăng dần

// 9. Sắp xếp giỏ hàng theo count giảm dần

// 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng

// 1. In ra thông tin các sản phẩm trong giỏ hàng theo cấu trúc sau
// Tên - Giá - Thương Hiệu - Số lượng
console.log("1. Thông tin các sản phẩm trong giỏ hàng:");
products.forEach(product => {
    console.log(`${product.name} - ${product.price} - ${product.brand} - ${product.count}`);
});

// 2. Tính tổng tiền tất cả sản phẩm trong giỏ hàng
let totalPrice = products.reduce((acc, product) => acc + (product.price * product.count), 0);
console.log("\n2. Tổng tiền tất cả sản phẩm trong giỏ hàng:", totalPrice);

// 3. Tìm các sản phẩm của thương hiệu "Apple"
let appleProducts = products.filter(product => product.brand.toLowerCase() === 'apple');
console.log("\n3. Các sản phẩm của thương hiệu Apple:", appleProducts);

// 4. Tìm các sản phẩm có giá > 20000000
let expensiveProducts = products.filter(product => product.price > 20000000);
console.log("\n4. Các sản phẩm có giá trên 20 triệu:", expensiveProducts);

// 5. Tìm các sản phẩm có chữ "pro" trong tên (Không phân biệt hoa thường)
let proProducts = products.filter(product => product.name.toLowerCase().includes('pro'));
console.log("\n5. Các sản phẩm có chữ 'pro' trong tên:", proProducts);

// 6. Thêm 1 sản phẩm bất kỳ vào trong mảng product
let newProduct = {
    name: "Sony Xperia 1 III",
    price: 25000000,
    brand: "Sony",
    count: 2,
};
products.push(newProduct);
console.log("\n6. Sản phẩm mới đã được thêm vào giỏ hàng:", products);

// 7. Xóa tất cả sản phẩm của thương hiệu "Samsung" trong giỏ hàng
products = products.filter(product => product.brand.toLowerCase() !== 'samsung');
console.log("\n7. Giỏ hàng sau khi xóa tất cả sản phẩm của thương hiệu Samsung:", products);

// 8. Sắp xếp giỏ hàng theo price tăng dần
products.sort((a, b) => a.price - b.price);
console.log("\n8. Giỏ hàng sau khi sắp xếp theo giá tăng dần:", products);

// 9. Sắp xếp giỏ hàng theo count giảm dần
products.sort((a, b) => b.count - a.count);
console.log("\n9. Giỏ hàng sau khi sắp xếp theo số lượng giảm dần:", products);

// 10. Lấy ra 2 sản phẩm bất kỳ trong giỏ hàng
let randomProducts = products.slice(0, 2);
console.log("\n10. 2 sản phẩm bất kỳ trong giỏ hàng:", randomProducts);