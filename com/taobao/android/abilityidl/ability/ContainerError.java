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
public @interface ContainerError {
    public static final a Companion = a.f8645a;
    public static final String PRERENDER_PERMISSION_INVALID = "PRERENDER_PERMISSION_INVALID";
    public static final String PRERENDER_POOL_FULL = "PRERENDER_POOL_FULL";
    public static final String PRERENDER_UNKNOWN_SYSTEM_ERROR = "PRERENDER_UNKNOWN_SYSTEM_ERROR";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String PRERENDER_PERMISSION_INVALID = "PRERENDER_PERMISSION_INVALID";
        public static final String PRERENDER_POOL_FULL = "PRERENDER_POOL_FULL";
        public static final String PRERENDER_UNKNOWN_SYSTEM_ERROR = "PRERENDER_UNKNOWN_SYSTEM_ERROR";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8645a;

        static {
            kge.a(-2067716855);
            f8645a = new a();
        }

        private a() {
        }
    }
}
