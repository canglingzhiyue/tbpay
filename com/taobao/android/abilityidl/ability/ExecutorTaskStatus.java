package com.taobao.android.abilityidl.ability;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.kge;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.TYPE_USE})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION, AnnotationTarget.CLASS, AnnotationTarget.TYPE})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes4.dex */
public @interface ExecutorTaskStatus {
    public static final String BLOCKED = "BLOCKED";
    public static final a Companion = a.f8659a;
    public static final String ERROR = "ERROR";
    public static final String SUCCESS = "SUCCESS";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String BLOCKED = "BLOCKED";
        public static final String ERROR = "ERROR";
        public static final String SUCCESS = "SUCCESS";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8659a;

        static {
            kge.a(-889580212);
            f8659a = new a();
        }

        private a() {
        }
    }
}
