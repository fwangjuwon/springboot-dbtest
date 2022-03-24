#데이터 아키텍쳐 설계 - 시험

###순서
- 스프링부트 프로젝트 세팅
- 테이블 생성 boardTbl(id,title,content,createDate)
- 더미데이터만들기(10건)
- mustache로 메인페이지(부트스트랩 테이블, 검색바)
- JPA에 제공하지 않기 때문에 native Query 생성
```sql
SELECT * FROM boardTbl WHERE title like %:keyword%;
```
- mustache에서 form 태그로 요청 or fetch로 요청

###팁
- get요청은 a태그, form태그
- get요청을 fetch를 하는 경우: 어떤 경우??