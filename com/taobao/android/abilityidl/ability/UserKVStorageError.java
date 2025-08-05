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
public @interface UserKVStorageError {
    public static final a Companion = a.f8767a;
    public static final String NOT_LOGIN = "NOT_LOGIN";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String NOT_LOGIN = "NOT_LOGIN";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8767a;

        static {
            kge.a(-1897829147);
            f8767a = new a();
        }

        private a() {
        }
    }
}
