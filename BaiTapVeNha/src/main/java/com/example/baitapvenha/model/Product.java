package com.example.baitapvenha.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

//        Mô tả:
//        Hãy thiết kế một trang web bán hàng đơn giản cho một cửa hàng trực tuyến.
//        Trang web này sẽ cung cấp cho khách hàng một giao diện dễ sử dụng
//        để duyệt qua các sản phẩm và thực hiện mua hàng.
//        Yêu cầu:
//
//        Trang chủ: Thiết kế trang chủ với các mục tiêu sau:
//
//        Header: Hiển thị tên của cửa hàng và logo.
//        Menu: Cung cấp các liên kết đến các trang con như "Sản phẩm", "Giới thiệu", "Liên hệ",...
//        Sản phẩm nổi bật: Hiển thị danh sách các sản phẩm nổi bật, bao gồm ảnh, tên và giá cả.
//        Chức năng tìm kiếm: Cho phép khách hàng tìm kiếm sản phẩm theo từ khóa.
//        Footer: Hiển thị thông tin liên hệ, liên kết đến các trang mạng xã hội, chính sách, v.v.
//        Trang danh mục sản phẩm:
//
//        Hiển thị danh sách các danh mục sản phẩm.
//        Cho phép khách hàng lựa chọn danh mục để xem các sản phẩm trong danh mục đó.
//        1.Trang chi tiết sản phẩm:
//
//        Hiển thị thông tin chi tiết về sản phẩm, bao gồm ảnh, mô tả, giá cả, v.v.
//        Cho phép khách hàng thêm sản phẩm vào giỏ hàng.
//        2. Trang giỏ hàng:
//
//        Hiển thị các sản phẩm đã được thêm vào giỏ hàng cùng với số lượng và giá cả.
//        Cung cấp tính năng tính tổng giá trị đơn hàng.
//        Trang thanh toán:
//
//        Yêu cầu khách hàng cung cấp thông cá nhân và lưu vào CSDL.
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nameProduct;
    private float priceProduct;
    private String image;

    public Product() {
    }

    public Product(int id, String nameProduct, float priceProduct, String image) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.priceProduct = priceProduct;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public float getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(float priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
