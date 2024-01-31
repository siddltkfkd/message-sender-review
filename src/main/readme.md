main에 sendMessage를 계속 만들면 기능이 추가 될 때 마다 메소드를 만들고 다시 컴파일 해 줘야 한다.  
MessageSender를 만들자.(리팩터링)

open closed 원칙, dependency inversion principle 을 따르게 되었다.  
상위 클래스는 서비스, 하위 클래스는 sms/email sender
