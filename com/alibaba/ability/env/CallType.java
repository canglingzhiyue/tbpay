package com.alibaba.ability.env;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import tb.kge;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.FIELD, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.SOURCE)
@kotlin.annotation.Retention(AnnotationRetention.SOURCE)
/* loaded from: classes2.dex */
public @interface CallType {
    public static final String ASYNC = "async";
    public static final a Companion = a.f1822a;
    public static final String SYNC = "sync";

    /* loaded from: classes2.dex */
    public static final class a {
        public static final String ASYNC = "async";
        public static final String SYNC = "sync";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f1822a;

        static {
            kge.a(-953000856);
            f1822a = new a();
        }

        private a() {
        }
    }
}
