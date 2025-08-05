package com.alibaba.ability.inject;

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
/* loaded from: classes2.dex */
public @interface LoggingLevel {
    public static final a Companion = a.f1971a;
    public static final int DEBUG = 4;
    public static final int ERROR = 1;
    public static final int INFO = 3;
    public static final int OFF = 0;
    public static final int VERBOSE = 5;
    public static final int WARN = 2;

    /* loaded from: classes2.dex */
    public static final class a {
        public static final int DEBUG = 4;
        public static final int ERROR = 1;
        public static final int INFO = 3;
        public static final int OFF = 0;
        public static final int VERBOSE = 5;
        public static final int WARN = 2;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f1971a;

        static {
            kge.a(-807535579);
            f1971a = new a();
        }

        private a() {
        }
    }
}
