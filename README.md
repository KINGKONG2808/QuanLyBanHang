# QuanLySinhVien
Chương trình quản lý sinh viên sử dụng SQL Server để lưu trữ dữ liệu, mọi thao tác đều được thực hiện trên database. Để chạy được chương trình bạn cần làm theo những bước sau:

- Bước 1: Bạn cần sử dụng trình IDE IntelliJ IDEA để có thể import và chạy được project này.

- Bước 2: Điều cần làm sau khi import được project trong intelliJ đó là import lại thư viện kết nối database.

import thư viện kết nối như sau: Trong intelliJ File -> Project Structure -> Modules -> click vào dấu "+" rồi theo đường dẫn: "thư mục bạn clone project này về"/backup_data/sqljdbc42.jar

Tiếp theo bạn cần tích vào ô vuông đầu mục của thư viện sau khi thêm và để nó ở chế độ complie.
click Apply và OK và bạn đã import thư viện kết nối thành công.

- Bước 3: Bạn cần phải có phần mềm SQL Server để có thể import được database.
Đăng nhập vào localhost với tài khoản: 

+Tên đăng nhập: "sa"
+Mật khẩu: "Dockersql123" - (cái mật khẩu này là vì mình dùng máy ảo docker trên mac.)

Sau khi đăng nhập thành công bạn cần tạo 1 database với tên: "QuanLySinhVien" (nhớ ghi đúng tên nha, không vào code sẽ không truy cập được database đâu :) )
Tiếp theo là chạy lần lượt 2 query mình có để sẵn trong thư mục backup_data là Create_Table.sql và Insert_Data.sql

- Bước 4: OK, well done!!! Truy cập lại project bằng intellJ và test ngay nhé...

=> Thanks for reading !!! ❤
