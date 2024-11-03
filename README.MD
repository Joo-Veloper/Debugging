### AOP @Around 어드바이스 역할
AOP는 비지니스 로직과는 별개의 관심사를 분리하여 코드를 구조화하는 기법이며 [DemoAspect](src/main/java/io/debugging/trace/aspects/DemoAspect.java)는 특정 메서드 실행에 개입해 인자를 바꾸는 것이 관심사에 해당합니다.
[DemoAspect](src/main/java/io/debugging/trace/aspects/DemoAspect.java) 클래스에서 @Aspect를 사용해 관점을 정의하고 @Around 어드바이스를 사용해 ProductService.saveProduct 메서드의 실행 전후에 개입하도록 설정됩니다.

[DemoAspect](src/main/java/io/debugging/trace/aspects/DemoAspect.java) 클래스의 동작
[DemoAspect](src/main/java/io/debugging/trace/aspects/DemoAspect.java) 클래스의 changeProduct 메서드는 @Around 어드바이스로 설정되어 있으며 ProductService 클래스의 saveProduct 메서드가 호출 될때 실행 흐름을 가로채는 역할을 합니다.

1. Pointcut 설정 : @Around("execution(* io.debugging.trace.services.ProductService.saveProduct(..))")는 ProductService 클래스의 saveProduct 메서드를 대상으로 지정하며 excution 구문은 특정 메서드 패턴을 지정할 수 있습니다.
2. ProceedingJoinPoint : AOP에서 메서드 호출을 직접 실행하는 객체이며 p.proceed() 메서드를 호출하면 원래 메서드가 원래 인수로 실행됩니다.
3. 인수 변경 : p.proceed(new Object[] {"Chocolate"})처럼 proceed()에 새로운 인수를 전달하여, saveProduct 메서드가 "Beer" 대신 "Chocolate"이라는 인수를 받도록 조작할 수 있습니다.