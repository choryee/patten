여기 폴더 경로
C:\myprojects\pattens\patten\src

html이렇게 쳐 나가면, 자동 완성 보이고, html 코드 나온다.


ex07-Js_opentutorial

28강.첨
<input id="night_day" type="button" value="night" onclick="
   this.xxx;
    ">
-이처럼 this는 onclick이벤트가 있는 태그를 가리킨다.

하지만, 이렇게 함수로 만들어진 후에, this는 태그 안에서가 아니라, 전역 객체(브라우저)를
가리키게 된다.
<input id="night_day" type="button" value="night" onclick="
    nightDayHandler(this);
    ">

32강. -객체에 함수도 올 수 있다.
 var workers={
        "programer":"egoing",
        "chef":"back",
        "pilot":"John"
    }
workers.showAll=function(){ //이것은 익명함수형태이고, 그것을 왼쪽 변수에 넣은 꼴.
    for(var key in workers){ //32강. 현재 이 함수의 workers와 위 객체workers는 같은 것. 이때, this 사용 가능. 32강 03;31
        document.write(key+' : '+workers[key]+'<br>')
    }
}
workers.showAll();

-----
BoardVo.java에서 setName()
public class BoardVo{
  private String name;
  
public void setName(String name){
    this.name=name;
}
}