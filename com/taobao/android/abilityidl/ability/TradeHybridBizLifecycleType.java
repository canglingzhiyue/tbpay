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
public @interface TradeHybridBizLifecycleType {
    public static final String BIZ_FAILED = "BIZ_FAILED";
    public static final String BIZ_READY = "BIZ_READY";
    public static final a Companion = a.f8748a;

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String BIZ_FAILED = "BIZ_FAILED";
        public static final String BIZ_READY = "BIZ_READY";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8748a;

        static {
            kge.a(-18341921);
            f8748a = new a();
        }

        private a() {
        }
    }
}
