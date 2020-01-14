package com.huanyupiaoling.codehome.aop;

/**
 * @author lyb
 * @Description :
 * @date Created in 2020/1/13 14:58
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAdvice {

/*	@DeclareParents(value="com.ctc.ServiceImpl.*+",
			defaultImpl=Adult.class)
	public static AgeGroup ageGroup;*/

    //所有的通知都可以使用这种方式，直接把Pointcut跟Advice连接起来，但是为了更好的理解前文的概念以及图片,这边分开定义。
    @Before("execution(* com.huanyupiaoling.codehome.controller.*.*(..))")
    public void before(ProceedingJoinPoint joinPoint){
        System.out.println("LogAdvice before advice ");
    }

/*	@AfterReturning("com.ctc.AspectJ.UserAspect.addLog()")
	public void AfterReturning(){
		System.out.println("LogAdvice after returning advice ");
	}

	@AfterThrowing("com.ctc.AspectJ.UserAspect.addLog()")
	public void AfterThrowing(){
		System.out.println("LogAdvice after throwing advice ");
	}

	@After("com.ctc.AspectJ.UserAspect.addLog()")
	public void After(){
		System.out.println("LogAdvice after advice ");
	}

        //除了可以通过名字来指向对应的切入点表达式,还可以可以使用'&&', '||' 和 '!'来合并。
        //切入点表达式的 args(user,..) 表示某个与切入表达式匹配的连接点它把User对象作为第一个参数,通过这个语法我们可以在通知中访问到这个User对象。
        @Around("com.ctc.AspectJ.UserAspect.addLog()&&" +"args(user,..)")
	public void around(ProceedingJoinPoint  joinPoint,User user) throws Throwable{
		System.out.println("log begin!");
		System.out.println("log end");
	}*/

}