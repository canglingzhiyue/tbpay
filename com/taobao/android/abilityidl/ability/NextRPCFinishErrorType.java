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
public @interface NextRPCFinishErrorType {
    public static final String CANCEL = "CANCEL";
    public static final a Companion = a.f8713a;
    public static final String MTOP_FAILURE = "MTOP_FAILURE";
    public static final String TIMEOUT = "TIMEOUT";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String CANCEL = "CANCEL";
        public static final String MTOP_FAILURE = "MTOP_FAILURE";
        public static final String TIMEOUT = "TIMEOUT";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8713a;

        static {
            kge.a(-404412609);
            f8713a = new a();
        }

        private a() {
        }
    }
}
