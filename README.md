# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 3단계 - 자동차 경주
1. 자동차 대수, 시도할 횟수를 사용자가 입력 할 수 있다.
    - 입력 및 출력을 담당하는 부분(UI)과 로직을 분리한다.
2. 0~9 사이의 난수를 생성한다.
3. 입력받은 수가 4이상이면, 자동차는의 이동거리를 1증가 시킨다.
4. 사용자가 입력한 자동차 대수 만큼의 Car 배열을 생성한다.
5. 자동차들간의 race를 시작한다.(각 자동차별 이동거리 증가) 
6. 각 자동차별 이동거리를 출력한다.
7. MainSimulator를 통해 Racing을 실행한다. 

## 4단계 - 자동차 경주(우승자)
1. 각 자동차에 부여할 이름을 사용자가 입력할 수 있다.
2. 사용자가 입력한 자동차의 이름을 가진 Car 배열을 생성한다.
    - 자동차의 이름은 5자를 초과할 수 없다.
3. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
4. 자동차 경주 게임을 완료한 후 누가 우승했는지 알려준다.
    - 우승자는 한명이상일 수 있다.
