# SHORTKATHON
## Welcome to For-Rapo Application 👑

> **Post CRUD** This is a simple CRUD application for managing Post.

<hr>

### 🚀 기능 소개(with Swagger)

### 0. ERD 소개
<p>
<img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/hw4/src/main/java/com/example/hw4/img/add_user.png" width = 80%><br>
</p>

### 1. Add User

- **설명:** 게시판을 추가하기 앞서 User 사용자의 이름, password, nickname을 등록합니다.<br>
- **사용법:** 사용자의 이름, password, nickname 입력합니다. <br>
- **결과 화면:<br>**
<p>
<img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/hw4/src/main/java/com/example/hw4/img/add_user.png" width = 80%><br>
</p>
<hr>

### 2. Create Contents (Game or Program)

- **설명:** 게임이나 프로그램 create 기능<br>
- **사용법:** 라포형성 및 화합을 위한 프로그램의 간단한 설명 및 제목, 시간, 인원수 등을 기입합니다. <br>
- **결과 화면:<br>**
<p>
<img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/hw4/src/main/java/com/example/hw4/img/create_post_userId.png" width = 80%><br>
</p>
<hr>

### 3. Read By User Id

- **설명:** 저장된 게시판을 User ID 정보에 구분하여 조회합니다.<br>
- **사용법:** UserId를 입력하여 해당 User가 작성한 게시판의 정보를 조회합니다.<br>
- **결과 화면:**<br>
  <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/hw4/src/main/java/com/example/hw4/img/read_by_userId.png" width = 80%><br>
<hr>


### 4. Delete By Post Id (DELETE POST)

- **설명:** 특정 ID를 가진 게시판을 삭제합니다.
- **사용법:** 삭제할 게시판의 postId를 입력하여 해당 게시판을 삭제합니다.
    - **결과 화면:**<br>
      <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/hw4/src/main/java/com/example/hw4/img/delete_post.png" width = 80%>
<hr>

### 5. Get User
- **설명:** userId를 사용하여 해당 User을 읽어옵니다.
- **결과 화면:**<br>
  <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/hw4/src/main/java/com/example/hw4/img/get_user.png" width = 80%>
  <br><hr>
-

### 6. 좋아요 기능
- **설명:** 게시판은 좋아요의 개수 정보, User는 좋아요를 누른 게시판에 대한 정보를 알고 있어야합니다.
- **사용법:** 좋아요를 누를 게시판과 나 자신이 누구인지 User정보를 선택한 후 like toggle 함수를 실행시킵니다. 한번 더 실행할 경우 개수가 늘어나지 않고 좋아요가 취소됩니다.
- **결과 화면:**<br>
  <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/hw4/src/main/java/com/example/hw4/img/like_post.png" width = 80%>
  <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/hw4/src/main/java/com/example/hw4/img/like_status.png" width = 80%><br>
  <br><hr>
