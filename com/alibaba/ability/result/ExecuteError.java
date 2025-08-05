package com.alibaba.ability.result;

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
public @interface ExecuteError {
    public static final a Companion = a.f1981a;
    public static final String abilityInternalError = "500";
    public static final String abilityNotFound = "404";
    public static final String apiNotFound = "501";
    public static final String parametersNotCorrect = "400";

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f1981a;
        public static final String abilityInternalError = "500";
        public static final String abilityNotFound = "404";
        public static final String apiNotFound = "501";
        public static final String parametersNotCorrect = "400";

        static {
            kge.a(-1133345081);
            f1981a = new a();
        }

        private a() {
        }
    }
}
