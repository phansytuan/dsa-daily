# dsa-daily

Repo luyện tập hằng ngày: bài tập cấu trúc dữ liệu & giải thuật (LeetCode) và Java core.

## Cấu trúc

```
test/                        # unit test JUnit 5, cùng cấu trúc package với src/
src/
├── _<số>_<TênBài>.java      # lời giải LeetCode, ví dụ _88_MergeSortedArray.java
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
- Test đặt trong `test/`, tên `<TênClass>Test.java`, cùng package với class được test.

## Chạy thử

Project dùng `src/` làm source root:

```bash
javac -d out src/LeapYear.java
java -cp out LeapYear
```

## Test & coverage

Maven chỉ dùng để chạy test (`src/` vẫn là source root, `test/` là test root):

```bash
mvn test                 # chạy toàn bộ unit test
mvn test -Dtest=LeapYearTest
```

JaCoCo tự chạy cùng `mvn test`; báo cáo coverage nằm ở
`target/site/jacoco/index.html` (và `jacoco.csv`).

Các class chỉ có `main()` để demo (DesignPattern, java_core Collection/Lambda/Thread demo, ...)
chưa có test — coverage thấp ở đó là do phần code demo in ra console.
