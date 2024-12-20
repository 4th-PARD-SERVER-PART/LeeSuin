# SHORTKATHON
## Welcome to For-Rapo Application 👑

> **Post CRUD** 이 프로그램은 화합과 하모니를 이루기 위한 레퍼런스를 제공하는 간단한 crud 프로그램입니다.

<hr>

### 🚀 기능 소개(with Swagger)

### 0. ERD 소개
<p>
<img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/shortkathon/ForRapo/src/main/java/com/example/forrapo/Img/Erd.png" width = 80%><br>
</p>

### 1. Add User

- **설명:** 게시판을 추가하기 앞서 User 사용자의 이름, password, nickname을 등록합니다.<br>
- **사용법:** 사용자의 이름, password, nickname 입력합니다. <br>
- **결과 화면:<br>**
<p>
<img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/shortkathon/ForRapo/src/main/java/com/example/forrapo/Img/PostUser.png" width = 80%><br>
</p>
<hr>

### 2. Create Contents (Game or Program)

- **설명:** 게임이나 프로그램 create 기능<br>
- **사용법:** 라포형성 및 화합을 위한 프로그램의 간단한 설명 및 제목, 시간, 인원수 등을 기입합니다. <br>
- **결과 화면:<br>**
<p>
<img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/shortkathon/ForRapo/src/main/java/com/example/forrapo/Img/CreatePost.png" width = 80%><br>
</p>
<hr>

### 3. Read All

- **설명:** 저장된 게시판을 전체 조회합니다.<br>
- **사용법:** 작성한 게시판의 정보를 조회합니다.<br>
- **결과 화면:**<br>
  <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/shortkathon/ForRapo/src/main/java/com/example/forrapo/Img/GetAll.png" width = 80%><br>
<hr>


### 4. Delete By contents Id (DELETE POST)

- **설명:** 특정 ID를 가진 게임 및 프로그램을 삭제합니다.
- **사용법:** 삭제할 contents의 postId를 입력하여 해당 contents를 삭제합니다.
    - **결과 화면:**<br>
      <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/shortkathon/ForRapo/src/main/java/com/example/forrapo/Img/delet.png" width = 80%>
<hr>

### 5. Get User
- **설명:** userId를 사용하여 해당 User을 읽어옵니다.
- **결과 화면:**<br>
  <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/shortkathon/ForRapo/src/main/java/com/example/forrapo/Img/GetUser.png" width = 80%>
  <br><hr>
-

### 6. 좋아요 기능
- **설명:** 게시판은 좋아요의 개수 정보, User는 좋아요를 누른 게시판에 대한 정보를 알고 있어야합니다.
- **사용법:** 좋아요를 누를 게시판과 나 자신이 누구인지 User정보를 선택한 후 like toggle 함수를 실행시킵니다. 한번 더 실행할 경우 개수가 늘어나지 않고 좋아요가 취소됩니다.
- **결과 화면:**<br>
  <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/shortkathon/ForRapo/src/main/java/com/example/forrapo/Img/postLike.png" width = 80%>
  <img src="https://github.com/4th-PARD-SERVER-PART/LeeSuin/blob/main/shortkathon/ForRapo/src/main/java/com/example/forrapo/Img/Like.png" width = 80%><br>
  <br><hr>
