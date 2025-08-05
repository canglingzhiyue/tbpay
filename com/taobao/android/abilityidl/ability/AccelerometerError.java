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
public @interface AccelerometerError {
    public static final String ACCELEROMETER_DETECT_ERR = "ACCELEROMETER_DETECT_ERR";
    public static final String ACCELEROMETER_NOT_AVAILABLE = "ACCELEROMETER_NOT_AVAILABLE";
    public static final a Companion = a.f8623a;

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String ACCELEROMETER_DETECT_ERR = "ACCELEROMETER_DETECT_ERR";
        public static final String ACCELEROMETER_NOT_AVAILABLE = "ACCELEROMETER_NOT_AVAILABLE";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8623a;

        static {
            kge.a(2023956091);
            f8623a = new a();
        }

        private a() {
        }
    }
}
