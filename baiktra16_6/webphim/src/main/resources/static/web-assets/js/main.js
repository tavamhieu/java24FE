// Xử lý validate form cập nhật thông tin cá nhân
$('#formUpdateProfile').validate({
    rules: {
        name: {
            required: true
        },
        email: {
            required: true,
            email: true,
        }
    },
    messages: {
        name: {
            required: "Tên user không được để trống"
        },
        email: {
            required: "Email không được để trống",
            email: "Email không đúng định dạng"
        }
    },
    errorElement: 'span',
    errorPlacement: function (error, element) {
        error.addClass('invalid-feedback');
        element.closest('.form-group').append(error);
    },
    highlight: function (element, errorClass, validClass) {
        $(element).addClass('is-invalid');
    },
    unhighlight: function (element, errorClass, validClass) {
        $(element).removeClass('is-invalid');
    }
});

// Xử lý submit form cập nhật thông tin cá nhân
$('#formUpdateProfile').submit(function (event) {
    event.preventDefault();
    if (!$(this).valid()) return;

    const name = $('#name').val();
    axios.put("/api/user/update-profile", { name })
        .then(function (response) {
            // Xử lý thành công
            console.log("Profile updated successfully:", response.data);
            toastr.success("Thông tin cá nhân được cập nhật thành công.");
        })
        .catch(function (error) {
            // Xử lý lỗi
            console.error("Error updating profile:", error);
            toastr.error("Đã xảy ra lỗi khi cập nhật thông tin cá nhân.");
        });
});

// Xử lý validate form thay đổi mật khẩu
$('#formUpdatePassword').validate({
    rules: {
        oldPassword: {
            required: true,
        },
        newPassword: {
            required: true,
            minlength: 6,
        },
        newPasswordAgain: {
            required: true,
            equalTo: "#newPassword"
        }
    },
    messages: {
        oldPassword: {
            required: "Mật khẩu cũ không được để trống",
        },
        newPassword: {
            required: "Mật khẩu mới không được để trống",
            minlength: "Mật khẩu mới phải có ít nhất 6 ký tự",
        },
        newPasswordAgain: {
            required: "Xác nhận mật khẩu mới không được để trống",
            equalTo: "Xác nhận mật khẩu mới không khớp"
        }
    },
    errorElement: 'span',
    errorPlacement: function (error, element) {
        error.addClass('invalid-feedback');
        element.closest('.form-group').append(error);
    },
    highlight: function (element, errorClass, validClass) {
        $(element).addClass('is-invalid');
    },
    unhighlight: function (element, errorClass, validClass) {
        $(element).removeClass('is-invalid');
    }
});

// Xử lý submit form thay đổi mật khẩu
$('#formUpdatePassword').submit(function (event) {
    event.preventDefault();
    if (!$(this).valid()) return;

    const oldPassword = $('#oldPassword').val();
    const newPassword = $('#newPassword').val();
    const newPasswordAgain = $('#newPasswordAgain').val();

    axios.put("/api/user/update-password", { oldPassword, newPassword, confirmPassword: newPasswordAgain })
        .then(function (response) {
            // Xử lý thành công
            console.log("Password updated successfully:", response.data);
            toastr.success("Mật khẩu được thay đổi thành công.");
        })
        .catch(function (error) {
            // Xử lý lỗi
            console.error("Error updating password:", error);
            toastr.error("Đã xảy ra lỗi khi thay đổi mật khẩu.");
        });
});
