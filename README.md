# dsa-daily

Repo luyện tập hằng ngày: bài tập cấu trúc dữ liệu & giải thuật (LeetCode) và Java core.

## Cấu trúc

```
src/
├── _<số>_<TênBài>.java      # lời giải LeetCode, ví dụ _88_MergeSortedArray.java
├── util/                    # tiện ích dùng chung cho các bài tập
│   ├── ArrayUtils.java          # in mảng, dịch phần tử, tính tổng, đếm giá trị
│   └── StringUtils.java         # đếm tần suất ký tự (mảng ASCII / LinkedHashMap)
├── DesignPattern/           # Singleton, Factory, Builder, Bridge, Decorator, ...
└── java_core/
    ├── Collection/              # List, Map, Set, Queue và Collections util
    ├── Exception_Handling/
    ├── Generic/
    ├── Lambda_Stream/
    ├── Multi_Thread/
    ├── Multithreading_ThreadPool/   # synchronized, deadlock, ExecutorService
    ├── OOP/                         # đóng gói, kế thừa/đa hình, interface/abstract
    └── Variables/
```

## Quy ước

- Bài LeetCode đặt tên `_<số bài>_<TênBài>.java`, hậu tố `2` cho cách giải thay thế
  (ví dụ `_88_MergeSortedArray2.java`).
- Các class nằm trực tiếp trong `src/` không khai báo `package`; code trong thư mục
  con khai báo `package` khớp với đường dẫn.

## Chạy thử

Project dùng `src/` làm source root, không có Maven/Gradle:

```bash
javac -d out src/LeapYear.java
java -cp out LeapYear
```
