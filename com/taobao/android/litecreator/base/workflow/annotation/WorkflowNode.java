package com.taobao.android.litecreator.base.workflow.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes5.dex */
public @interface WorkflowNode {
    boolean bothWay() default false;

    String bothWayJudge() default "";

    String checkerClassName() default "";
}
