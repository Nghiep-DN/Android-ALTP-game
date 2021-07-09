package com.dumv.ailatrieuphu.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//kiểm tra sqlite


    public class DBHelper extends SQLiteOpenHelper {
        public   static  final  String DATA_NAME ="data.sqlite";
        public   static  final  int DATA_VERSION =1;

        String createTableCauHoi ="CREATE TABLE " +"CauHoi"
                +"("
                +"id " + "INTEGER " +"PRIMARY KEY" +" autoincrement,"
                +"capdo "+" INTEGER,"
                +"noidung "+" TEXT,"
                +"dapan "+" TEXT,"
                +"dapansai "+" TEXT"
                + ")";
        public  DBHelper(Context context){
            super(context,DATA_NAME,null,DATA_VERSION);

        }
        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(createTableCauHoi);
            fakedata(db);
        }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    private  void  fakedata(SQLiteDatabase d){
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,1,\""+"Tập hợp các số thực được ký hiệu bằng chữ cái nào?"+"\",\""+"R"+"\",\""+"N&Z&Q"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,1,\""+"Loại lá nào sau đây được dùng để gói bánh chưng?"+"\",\""+"Lá giong"+"\",\""+"Lá chuối&Lá ngô&Lá riềng"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,1,\""+"Đâu là tên một loại chợ?"+"\",\""+"Cóc"+"\",\""+"Ếch&Nhái&Rắn"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,2,\""+"Từ nào sau đây khác nghĩa với 3 từ còn lại?"+"\",\""+"Sinh viên"+"\",\""+"Sinh nở&Sinh sản&Sinh sôi"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,2,\""+"Pha màu đỏ với màu xanh lam, ta được màu nào sau đây?"+"\",\""+"Tím"+"\",\""+"Vàng&Xanh&Nâu"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,2,\""+"Điền từ còn thiếu vào chỗ trống: Gần mực thì đen, gần đèn thì..."+"\",\""+"Sáng"+"\",\""+"Cháy&Chói&Tốt"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,3,\""+"Seoul là thủ đô của quốc gia nào?"+"\",\""+"Hàn Quốc"+"\",\""+"Nhật Bản&Singapo&Trung Quốc"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,3,\""+"Hokkaido là thành phố của quốc gia nào?"+"\",\""+"Nhật Bản"+"\",\""+"Hàn Quốc&Trung Quốc&Mông Cổ"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,3,\""+"Đất nước xứ vạn đảo là nói đến quốc gia nào"+"\",\""+"Indonexia"+"\",\""+"Thái Lan&Brunei&Philippin"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,4,\""+"DakLak thuộc vùng miền nào của nước ta?"+"\",\""+"Tây Nguyên"+"\",\""+"Đông Nam Bộ&Tây Nam Bộ&Nam Trung Bộ"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,4,\""+"Nam Định thuộc vùng miền nào của nước ta?"+"\",\""+"Đông Bắc Bộ"+"\",\""+"Tây Bắc Bộ&Bắc Trung Bộ&Nam Trung Bộ"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,4,\""+"Tòa nhà cao nhất Việt Nam nằm tại đâu?"+"\",\""+"Sài Gòn"+"\",\""+"Hà Nội&Hải Phòng&Đà Nẵng"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,5,\""+"Chủ tịch nước CHXHCN Việt Nam hiện tại là ai ?"+"\",\""+"Nguyễn Phú Trọng"+"\",\""+"Nguyễn Xuân Phúc&Trần Quốc Vượng&Nguyễn Thị Kim Ngân"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,5,\""+"Chủ tịch quốc hội nước CHXHCN Việt Nam hiện tại là ai ?"+"\",\""+"Nguyễn Thị Kim Ngân"+"\",\""+"Nguyễn Phú Trọng&Nguyễn Xuân Phúc&Nguyễn Sinh Hùng"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,5,\""+"Thủ tướng nước CHXHCN Việt Nam hiện tại là ai ?"+"\",\""+"Nguyễn Xuân Phúc"+"\",\""+"Nguyễn Tấn Dũng&Nguyễn Phú Trọng&Vũ Đức Đam"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,5,\""+"Đâu là một thành phố trực thuộc TW của nước ta?"+"\",\""+"Hải Phòng"+"\",\""+"Nam Định&Thái Bình&Thanh Hóa"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,6,\""+"Novruz là lễ hội truyền thống của quốc gia nào?"+"\",\""+"Azerbaijan"+"\",\""+"Indonexia&Ấn Độ&Áo"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,6,\""+"Việt Nam bắt đầu thời kỳ đổi mới vào năm nào?"+"\",\""+"1986"+"\",\""+"1987&1985&1988"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,6,\""+"Haiku là thể thơ truyền thống của nước nào?"+"\",\""+"Nhật Bản"+"\",\""+"Hàn Quốc&Mông Cổ&Trung Quốc"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,6,\""+"Tổ chức thương mại thế giới có trụ sở đặt tại quốc gia nào ?"+"\",\""+"Thụy Sỹ"+"\",\""+"Bỉ&Đức&Pháp"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,7,\""+"Martin Cooper là người đầu tiên phát minh ra?"+"\",\""+"Điện thoại di động"+"\",\""+"Bàn là hơi nước&Điện mặt trời&Tivi"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,8,\""+"Lạc đà dự trữ nước ở đâu trong cơ thể ?"+"\",\""+"Máu"+"\",\""+"Bướu&Dạ dày&Mỡ"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,9,\""+"Tay vợt nào thuận tay trái ?"+"\",\""+"Rafael Nadal"+"\",\""+"Roger Federer&Novak Djokovic&Dominic Thiem"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,10,\""+"Loài vật nào đã trở thành mối đe dọa an ninh lương thực của các quốc gia Châu Phi năm 2020 ?"+"\",\""+"Châu chấu"+"\",\""+"Chuột &Dơi&Rệp"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,11,\""+"Vôn là đơn vị đo hiệu điện thế được lấy theo tên gọi của nhà khoa học thuộc quốc gia nào ?"+"\",\""+"Ý"+"\",\""+"Mỹ&Anh&Đức"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,7,\""+"Theo ước tính của Liên hợp quốc đến năm 2050 lượng gì dưới đại dương sẽ nhiều hơn lượng cá ?"+"\",\""+"Chất thải nhựa"+"\",\""+"San hô&Dầu thô&Vàng"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,13,\""+"Hình ảnh nào xuất hiện trên tờ tiền giấy 1$ của Mỹ ?"+"\",\""+"Kim tự tháp"+"\",\""+"Cố tổng thống Thomas Jefferson&Bức họa tuyên ngôn độc lập&Benjamin Fanklin"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,7,\""+"Đâu là đồ vật không thể thiếu trong lễ hội Hina của người Nhật Bản ?"+"\",\""+"Búp bê"+"\",\""+"Tranh khắc gỗ&Lá cây phong&Diều cá chép"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,9,\""+"Theo triết học của tôn giáo phương Đông, màu nào dưới đây biểu hiện của Thủy trong ngũ hành" +"\",\""+"Đen"+"\",\""+"Đỏ&Vàng&Trắng"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,10,\""+" Đường hoa Nguyễn Huệ- con đường hoa được tố chức thường niên- năm 2011 có chủ đề là gì?"+"\",\""+"Tầm cao mới"+"\",\""+"Xuân bình minh&Vững tin&Vượt sóng"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,15,\""+"Loại vacxin 5 trong 1 DPT-VGB-Hib không có tác dụng phòng chống bệnh nào?"+"\",\""+"Lao"+"\",\""+"Bạch hầu&Ho gà&Uốn ván"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,11,\""+"Nhìn ra biển cả là bộ phim về quãng đời tuổi trẻ của Chủ tịch Hồ Chí Minh do Hãng phim nào sản xuất?"+"\",\""+"Hãng phim Hội điện ảnh"+"\",\""+"Hãng phim Hội nhà văn&Hãng phim Giải phóng&Hãng phim Bình minh"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,12,\""+"Đền nào vừa là Thăng Long tứ trấn vừa là Thăng Long tứ quán?"+"\",\""+"Đền Quán Thánh"+"\",\""+"Chùa Huyền Thuyên&Chùa Kim Cổ &Chùa Vua"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,12,\""+"Ai không phải là “Gia Định tam gia”?"+"\",\""+"Võ Trường Toản"+"\",\""+"Lê Quang Định&Lê Quang Định&Trịnh Hoài Đức"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,13,\""+"Nhà thơ Tố Hữu tả vẻ đẹp của đất nước nào qua câu thơ Đường bạch dương sương trắng nắng tràn?"+"\",\""+"Ba Lan"+"\",\""+"Áo&Séc&Bungari"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,11,\""+"Loại thuốc nào là kháng sinh hàng đầu trong điều trị lao?"+"\",\""+"Steptomycine"+"\",\""+"Isoniazid&Ethambutol&Rifampicin"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,8,\""+"Nam ca sĩ nào đạt giải thưởng Ca sĩ của năm tại Lễ trao giải Làn Sóng Xanh 2010?"+"\",\""+"Đàm Vĩnh Hưng "+"\",\""+"Đan Trường&Khắc Việt&Tuấn Hưng"+"\");");
    d.execSQL("INSERT INTO Cauhoi(id,capdo,noidung,dapan,dapansai) VALUES(null,14,\""+"Nhà bác học Anders Celsius mà tên của ông đặt cho đơn vị đo nhiệt độ bách phân (độ C) làm việc trong ngành khoa học nào ? "+"\",\""+"Thiên văn học"+"\",\""+"Sinh học&Vật lý học&Hóa học"+"\");");
    }
}
