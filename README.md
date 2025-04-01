# 💜 Scentify : 스마트 디퓨저 프로젝트 💜

![소개사진](exec/소개사진.png)

## 📌 프로젝트 소개

### Scentify는 AI 기반 자동화 및 예약 모드를 제공하는 사용자 맞춤형 스마트 디퓨저입니다.

<br>

1. **주변 환경 또는 사용자 행동 기반 자동화 모드를 제공합니다.**

   - 탈취모드는 악취 감지 센서를 통해 악취 감지 시 분사하는 모드입니다.
   - 동작모드는 카메라 센서를 통해 인식된 사용자 행동을 분석하여 운동, 휴식 각각 도움이 되는 향을 분사하는 모드입니다.
   - 탐지모드는 카메라 센서에 사용자 감지 시 일정 간격으로 분사하는 모드입니다.

2. **예약 시간을 설정할 수 있는 스케줄 모드를 제공합니다.**

   - 사용자가 시간, 요일, 분사 주기, 향 조합을 설정하면 해당 시간에 분사합니다.

3. **찜한 향기 조합 페이지 저장 및 공유 기능을 제공합니다.**

   - 찜한 향기 조합에 대한 AI이미지 카드를 저장 가능합니다.
   - 또한 향기 조합을 링크로 공유 및 링크를 받은 사용자가 향기 조합을 등록할 수 있습니다.

- [Scentify 이용 매뉴얼](./exec/Scentify%20이용%20매뉴얼.pdf)
  <br>
  <br>

### 1️⃣ 프로젝트 기간

2025.01.08 ~ 2025.02.27

### 2️⃣ 팀원 소개

| 이름   | 역할  | 구현 기능                                                   |
| ------ | ----- | ----------------------------------------------------------- |
| 안태현 | EM    | 하드웨어 설계, AI 모델 학습, MQTT 통신                      |
| 어선정 | BE    | ERD 설계, API 명세서 작성, BE 개발, DB 관리, WebSocket 통신 |
|        | Infra | 배포 환경 구축                                              |
| 이가영 | FE    | Flowchart 작성, UI 디자인, Home 탭                          |
|        | Infra | FE 배포 환경 구축                                           |
| 이가희 | FE    | Wireframe 작성, My 탭, Scent 탭 공유하기 기능               |
| 주현호 | FE    | Wireframe 작성, Control 탭, Scent 탭 찜하기 기능            |
|        | EM    | WebSocket 초기 설정                                         |

### 3️⃣ 기술 스택

| 분야  | 기술 스택                                    |
| ----- | -------------------------------------------- |
| FE    | React 18.2.0, TypeScript, HTML, Tailwind CSS |
| BE    | Java 17, Spring Boot 3.4.1                   |
| DB    | MySQL 8.0.4, Redis                           |
| EM    | Python 3.8, Torch 2.1.0, Yolo v8, SlowFast   |
| Infra | AWS EC2, Jenkins, NginX, S3                  |

<br>

## 📌 기획서 및 요구사항 분석

### 1️⃣ 기획서

![image](exec/기획서/기획서-1.png)
![image](exec/기획서/기획서-2.png)
![image](exec/기획서/기획서-3.png)

- [1차 기획서](./exec/기획서/1차%20기획서.pdf)
- [2차 기획서](./exec/기획서/2차%20기획서.pptx)

### 2️⃣ 요구사항 분석

### **[기능 명세서]**

![image](exec/기능명세서-1.png)
![image](exec/기능명세서-2.png)

### **[비기능 명세서]**

<img src="exec/비기능명세서.png" width="60%" height="60%">

<br>

## 📌 플로우 차트

![플로우 차트](exec/시퀀스%20다이어그램.png)

<br>

## 📌 기기 구조

![기기 구조](exec/기기구조.png)

<br>

## 📌 아키텍처 다이어그램

![아키텍처1](exec/아키텍처다이어그램/아키텍처1.png)
![아키텍처2](exec/아키텍처다이어그램/아키텍처2.png)
![아키텍처3](exec/아키텍처다이어그램/아키텍처3.png)

<br>

## 📌 와이어프레임

![와이어프레임](exec/와이어프레임/와이어프레임.png)

<br>

## 📌 ERD 다이어그램

![ERD](exec/ERD.png)

<br>

## 📌 API 명세서

- [[BE] API 명세서](<./exec/API명세서/API%20명세서(BE).pdf>)
- [[EM] API 명세서](<./exec/API명세서/API%20명세서(EM).pdf>)

## 📌 주요 기능

### 1.회원가입
<img src="https://github.com/user-attachments/assets/9cc555ad-96ea-4080-b379-5ce36a3bacef" width="350px">

### 2.로그인
<img src="https://github.com/user-attachments/assets/8877c638-48e0-4ce6-b563-285ed7f91c24" width="350px">

### 3.기기등록
<img src="https://github.com/user-attachments/assets/6f456784-e127-4d25-acd7-56a8c4294aff" width="350px">

### 4.즉시분사
<img src="https://github.com/user-attachments/assets/932efe62-ed97-42cc-a05b-9ad3913a97ae" width="350px">

### 5.예약모드
<img src="https://github.com/user-attachments/assets/23b8cc2b-adec-4d37-ae46-6322b5a691b0" width="350px">

### 6.자동화모드
<img src="https://github.com/user-attachments/assets/168fcbaa-c16e-4333-bfb5-648536f1d847" width="350px">

### 7.찜하기
<img src="https://github.com/user-attachments/assets/8f06ef47-eb74-493b-807e-f92c98e5c042" width="350px">

### 8.공유하기
<img src="https://github.com/user-attachments/assets/890b84dc-586b-412b-acad-cbdc818d095e" width="350px">

### 9.그룹관리
<img src="https://github.com/user-attachments/assets/bccf5136-fe90-42f1-927b-7ceef157714a" width="300px">
<img src="https://github.com/user-attachments/assets/543eb85a-ec95-40af-90c8-f5f8f0abb348" width="300px">
<img src="https://github.com/user-attachments/assets/85172d52-63e3-434d-aacf-e07f03c2328d" width="300px">


## 📌 유저 테스트

- 삼성 임직원 유저 테스트 참여(2025.02.18)

- 테스트 결과 반영(2025.02.19)
- [유저 테스트 문서](./exec/유저테스트.md)

## 📌 배포

- 서비스 URL: http://my-scentify.shop/
- 배포 기간: 2025.02.07 ~ 2025.03.06
- [Scentify 포팅 매뉴얼](./exec/Scentify%20포팅%20매뉴얼.pdf)
