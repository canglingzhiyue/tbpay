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
public @interface PermissionStatus {
    public static final String AUTHORIZED = "AUTHORIZED";
    public static final String BIZ_DENIED = "BIZ_DENIED";
    public static final a Companion = a.f8724a;
    public static final String DENIED = "DENIED";
    public static final String PARTIAL_AUTHORIZED = "PARTIAL_AUTHORIZED";
    public static final String ROLLBACK = "ROLLBACK";
    public static final String UNSUPPORTED = "UNSUPPORTED";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String AUTHORIZED = "AUTHORIZED";
        public static final String BIZ_DENIED = "BIZ_DENIED";
        public static final String DENIED = "DENIED";
        public static final String PARTIAL_AUTHORIZED = "PARTIAL_AUTHORIZED";
        public static final String ROLLBACK = "ROLLBACK";
        public static final String UNSUPPORTED = "UNSUPPORTED";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8724a;

        static {
            kge.a(-1383931229);
            f8724a = new a();
        }

        private a() {
        }
    }
}
