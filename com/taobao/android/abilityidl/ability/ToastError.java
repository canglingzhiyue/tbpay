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
public @interface ToastError {
    public static final String CONTENT_EMPTY = "CONTENT_EMPTY";
    public static final a Companion = a.f8747a;

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String CONTENT_EMPTY = "CONTENT_EMPTY";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8747a;

        static {
            kge.a(1470752675);
            f8747a = new a();
        }

        private a() {
        }
    }
}
