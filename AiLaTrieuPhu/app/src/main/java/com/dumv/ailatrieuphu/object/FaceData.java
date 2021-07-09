package com.dumv.ailatrieuphu.object;

import android.content.Context;

import com.dumv.ailatrieuphu.sql.DBManager;

import java.util.ArrayList;
import java.util.Random;

public class FaceData {
    public FaceData(Context ct) {
        layCauHoiSQLite(ct);
        //taoCauHoi1();
    }

    public void layCauHoiSQLite(Context ct) {
        DBManager d = new DBManager(ct);
        d.open();
        arrCauHoi = new ArrayList<>(d.getcauhoi());
        d.close();
    }

    public CauHoi taoCauHoi(int capDo) {
        Random r = new Random();
        ArrayList<CauHoi> arr = arrCauHoi.get(capDo - 1);
        return arr.get(r.nextInt(arr.size()));
    }

    ArrayList<ArrayList<CauHoi>> arrCauHoi = new ArrayList<>();

//tạo câu hỏi
//    public void taoCauHoi1() {
//        ArrayList<CauHoi> arrCauSo1 = new ArrayList<>();
//        arrCauSo1.add(taoCauHoi("Điền từ còn thiếu vào câu ca dao: \"Gần mực thì đen, gần đèn thì...\"gì?", "Sáng", "Chói&Lóa&Tối"));
//        arrCauSo1.add(taoCauHoi("Mưa ngâu là vào khoảng tháng mấy trong năm?", "7", "1&4&6"));
//        arrCauSo1.add(taoCauHoi("Điền từ còn thiếu vào chỗ trống: \"Đỏ-Cam-Vàng-...-Lam-Chàm-Tím\" ", "Lục", "Trắng&Xanh&Biếc"));
//        // arrCauSo1.add(taoCauHoi("","",""));
//        arrCauHoi.add(arrCauSo1);
//
//        ///cau so 2
//
//        ArrayList<CauHoi> arrCauSo2 = new ArrayList<>();
//        arrCauSo2.add(taoCauHoi("Từ nào sau đây khác nghĩa với 3 từ còn lại?", "Sinh viên", "Sinh nở&Sinh sôi&Sinh đẻ"));
//        arrCauSo2.add(taoCauHoi("Pha màu đỏ với màu xanh lam, ta được màu nào sau đây?", "Tím", "Vàng&Xanh&Nâu"));
//        arrCauHoi.add(arrCauSo2);
//        ///cau so 2
//
//        ArrayList<CauHoi> a3 = new ArrayList<>();
//        a3.add(taoCauHoi("Đâu là một loại hình chợ tạm tự phát thường xuất hiện trong các khu dân cư?",
//                "Cóc",
//                "Ếch" + "&" +
//                "Thằn lằn" + "&"+
//                "Nhái"));
//
//        a3.add(taoCauHoi("Đâu là tên một loại chợ?",
//                "Cóc",
//                "Ếch" + "&" +
//                        "Thằn lằn" + "&"+
//                        "Nhái"));
//        arrCauHoi.add(a3);
//        ArrayList<CauHoi> a4 = new ArrayList<>();
//        a4.add(taoCauHoi("Bánh chưng gói bằng loại lá nào?",
//                "Lá giong",
//                "Lá chuối" + "&" +
//                        "Lá riềng" + "&"+
//                        "Lá cải"));
//        arrCauHoi.add(a4);
//        ArrayList<CauHoi> a5 = new ArrayList<>();
//        a5.add(taoCauHoi("Đâu là tên một bãi biển ở Quảng Bình?",
//                "Đá Nhảy",
//                "Đá Bò" + "&" +
//                "Đá Chạy" + "&"+
//                " Đá Lăn"));
//        arrCauHoi.add(a5);
//        ArrayList<CauHoi> a6 = new ArrayList<>();
//        a6.add(taoCauHoi("Haiku là thể thơ truyền thống của nước nào?",
//                "Nhật Bản",
//                "Mông Cổ" + "&" +
//                        "Hàn Quốc" + "&"+
//                        "Trung Quốc"));
//
//        a6.add(taoCauHoi("Nalaikh là thành phố của quốc gia nào?",
//                "Mông Cổ",
//                "Hàn Quốc" + "&" +
//                        "Nhật Bản" + "&"+
//                        "Trung Quốc"));
//        arrCauHoi.add(a6);
//        ArrayList<CauHoi> a7 = new ArrayList<>();
//        a7.add(taoCauHoi("Việt Nam bắt đầu thời kỳ đổi mới vào năm nào?",
//                "1986",
//                "1985" + "&" +
//                        "1987" + "&"+
//                        "1984"));
//        arrCauHoi.add(a7);
//        ArrayList<CauHoi> a8 = new ArrayList<>();
//        a8.add(taoCauHoi("C.Ronaldo được bao nhiêu quả bóng vàng cho đến thời điểm hiện tại ?",
//                "4",
//                "1" + "&" +
//                        "3" + "&"+
//                        "2"));
//        a8.add(taoCauHoi("Quốc kỳ nào giống hệt quốc kỳ Indonexia nhưng ngược chiều",
//                "Ba Lan",
//                "Áo" + "&" +
//                        "Pháp" + "&"+
//                        "Đức"));
//        a8.add(taoCauHoi("L.Messi hiện tại chơi cho đội bóng nào?",
//                "Barcelona",
//                "Real Madrid" + "&" +
//                        "Juventus" + "&"+
//                        "AC Milan"));
//        arrCauHoi.add(a8);
//        ArrayList<CauHoi> a9 = new ArrayList<>();
//        a9.add(taoCauHoi("Châu Âu gồm bao nhiêu quốc gia?",
//                "47",
//                "48" + "&" +
//                        "49" + "&"+
//                        "50"));
//        arrCauHoi.add(a9);
//        ArrayList<CauHoi> a10 = new ArrayList<>();
//        a10.add(taoCauHoi("Novruz là lễ hội truyền thống của quốc gia nào?",
//                "Azerbaijan",
//                "Ả-Rập-Xê-Út" + "&" +
//                        "Nam Phi" + "&"+
//                        "Áo"));
//        arrCauHoi.add(a10);
//        ArrayList<CauHoi> a11 = new ArrayList<>();
//        a11.add(taoCauHoi("Lần đầu tiên nước ta dùng bộc phá 1000 kg thuốc nổ đánh giặc là ở đâu?",
//                "Điện Biên Phủ",
//                "Sơn Trà" + "&" +
//                        "Pác Bó" + "&"+
//                        "Long Biên"));
//        arrCauHoi.add(a11);
//        ArrayList<CauHoi> a12 = new ArrayList<>();
//        a12.add(taoCauHoi("Lần đầu tiên nước ta dùng bộc phá 1000 kg thuốc nổ đánh giặc là ở đâu?",
//                "Điện Biên Phủ",
//                "Sơn Trà" + "&" +
//                        "Pác Bó" + "&"+
//                        "Long Biên"));
//        arrCauHoi.add(a12);
//        ArrayList<CauHoi> a13 = new ArrayList<>();
//        a13.add(taoCauHoi("Lần đầu tiên nước ta dùng bộc phá 1000 kg thuốc nổ đánh giặc là ở đâu?",
//                "Điện Biên Phủ",
//                "Sơn Trà" + "&" +
//                        "Pác Bó" + "&"+
//                        "Long Biên"));
//        arrCauHoi.add(a13);
//        ArrayList<CauHoi> a14 = new ArrayList<>();
//        a14.add(taoCauHoi("Lần đầu tiên nước ta dùng bộc phá 1000 kg thuốc nổ đánh giặc là ở đâu?",
//                "Điện Biên Phủ",
//                "Sơn Trà" + "&" +
//                        "Pác Bó" + "&"+
//                        "Long Biên"));
//        arrCauHoi.add(a14);
//        ArrayList<CauHoi> a15 = new ArrayList<>();
//        a15.add(taoCauHoi("Phim hoạt hình đầu tiên được công chiếu vào thời gian nào? ",
//                "28-10-1892",
//                "29-11-1892" + "&" +
//                        "24-12-1892" + "&"+
//                        "27-10-1892"));
//        arrCauHoi.add(a15);
//
//    }

    private CauHoi taoCauHoi(String s1, String s2, String s3) {
        CauHoi c1 = new CauHoi();
        c1.setNoiDung(s1);
        c1.setDapAnDung(s2);
        c1.setArrDapAnSai(s3);
        return c1;
    }
}
