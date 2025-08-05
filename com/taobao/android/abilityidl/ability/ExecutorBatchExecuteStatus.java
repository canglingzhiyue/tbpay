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
public @interface ExecutorBatchExecuteStatus {
    public static final String ALL_SUCCESS_DONE = "ALL_SUCCESS_DONE";
    public static final a Companion = a.f8657a;
    public static final String ERROR_STOP = "ERROR_STOP";
    public static final String WITH_ERROR_DONE = "WITH_ERROR_DONE";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String ALL_SUCCESS_DONE = "ALL_SUCCESS_DONE";
        public static final String ERROR_STOP = "ERROR_STOP";
        public static final String WITH_ERROR_DONE = "WITH_ERROR_DONE";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8657a;

        static {
            kge.a(-1005045342);
            f8657a = new a();
        }

        private a() {
        }
    }
}
