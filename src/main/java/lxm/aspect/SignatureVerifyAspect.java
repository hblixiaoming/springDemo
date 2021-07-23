package lxm.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class SignatureVerifyAspect {

    @Pointcut("@annotation(lxm.annoation.SignatureVerify)")
    public void signatureVerifyAspect(){

    }

    @Before("signatureVerifyAspect()")
    public void before(JoinPoint joinPoint) {
        System.out.println("Logging before " + joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        System.out.println(args[0]);
    }
}
