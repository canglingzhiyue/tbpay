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
public @interface SystemError {
    public static final a Companion = a.f8741a;
    public static final String OPEN_BROWSER_ERROR = "OPEN_BROWSER_ERROR";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String OPEN_BROWSER_ERROR = "OPEN_BROWSER_ERROR";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8741a;

        static {
            kge.a(-594780441);
            f8741a = new a();
        }

        private a() {
        }
    }
}
