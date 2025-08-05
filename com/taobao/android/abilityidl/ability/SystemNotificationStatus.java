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
public @interface SystemNotificationStatus {
    public static final String AUTHORIZED = "AUTHORIZED";
    public static final a Companion = a.f8743a;
    public static final String DENIED = "DENIED";
    public static final String NOT_DETERMINED = "NOT_DETERMINED";
    public static final String UNKNOWN = "UNKNOWN";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String AUTHORIZED = "AUTHORIZED";
        public static final String DENIED = "DENIED";
        public static final String NOT_DETERMINED = "NOT_DETERMINED";
        public static final String UNKNOWN = "UNKNOWN";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8743a;

        static {
            kge.a(2144390542);
            f8743a = new a();
        }

        private a() {
        }
    }
}
