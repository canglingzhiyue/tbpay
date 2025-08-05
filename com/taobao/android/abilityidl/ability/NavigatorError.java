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
public @interface NavigatorError {
    public static final String CLOSE_ERROR = "CLOSE_ERROR";
    public static final a Companion = a.f8710a;
    public static final String URL_INVALID = "URL_INVALID";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String CLOSE_ERROR = "CLOSE_ERROR";
        public static final String URL_INVALID = "URL_INVALID";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8710a;

        static {
            kge.a(-1237507981);
            f8710a = new a();
        }

        private a() {
        }
    }
}
