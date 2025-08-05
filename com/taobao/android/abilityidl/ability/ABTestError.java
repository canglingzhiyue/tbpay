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
public @interface ABTestError {
    public static final a Companion = a.f8618a;
    public static final String EXPERIMENT_NOT_FOUND = "EXPERIMENT_NOT_FOUND";
    public static final String INVALID_PARAM = "INVALID_PARAM";
    public static final String VARIATION_NOT_FOUND = "VARIATION_NOT_FOUND";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String EXPERIMENT_NOT_FOUND = "EXPERIMENT_NOT_FOUND";
        public static final String INVALID_PARAM = "INVALID_PARAM";
        public static final String VARIATION_NOT_FOUND = "VARIATION_NOT_FOUND";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8618a;

        static {
            kge.a(1579101283);
            f8618a = new a();
        }

        private a() {
        }
    }
}
