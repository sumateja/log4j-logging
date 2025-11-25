//package org.example;
//
//import org.apache.logging.log4j.ThreadContext;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.slf4j.MDC;
//
//@Aspect
//public class MDCAspect {
//
//    @Before("execution(* org.example.MessageProcessor+.process(..))")
//    public void setMDCValues(JoinPoint joinPoint) {
//        Object[] args = joinPoint.getArgs();
//        System.out.println("Hello there from Aspect class");
//        if (args != null && args.length > 0 && args[0] != null) {
//            MDC.put("inputType", args[0].getClass().getSimpleName());
//            MDC.put("environment","DEV");
//            if( args[0] instanceof EventMessage){
//                MDC.put("messageId",((EventMessage) args[0]).messageId);
//                MDC.put("eventName",((EventMessage) args[0]).eventName);
//                MDC.put("eventTitle",((EventMessage) args[0]).eventTitle);
//                ThreadContext.put("eventTitle","Sumateja");
//
//            } else if (args[0] instanceof ResortMessage) {
//                MDC.put("messageId",((ResortMessage) args[0]).messageId);
//                MDC.put("resortName",((ResortMessage) args[0]).resortName);
//                MDC.put("resortTitle",((ResortMessage) args[0]).resortTitle);
//               ThreadContext.put("eventTitle","ResortSumateja");
//
//            }
//            else if (args[0] instanceof MovieMessage) {
//                MDC.put("messageId",((MovieMessage) args[0]).messageId);
//                MDC.put("movieName",((MovieMessage) args[0]).movieName);
//                MDC.put("title",((MovieMessage) args[0]).title);
//                ThreadContext.put("eventTitle","MovueSumateja");
//
//            }
//        }
//    }
//
//    @After("execution(* org.example.MessageProcessor+.process(..))")
//    public void clearMDCValues() {
//        MDC.clear();
//    }
//}
