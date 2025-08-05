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
public @interface AudioContextError {
    public static final a Companion = a.f8634a;
    public static final String PLAYER_ERROR = "PLAYER_ERROR";
    public static final String PLAY_INVOKE_ERROR = "PLAY_INVOKE_ERROR";
    public static final String PREPARE_FAILED = "PREPARE_FAILED";
    public static final String UNPREPARED = "UNPREPARED";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String PLAYER_ERROR = "PLAYER_ERROR";
        public static final String PLAY_INVOKE_ERROR = "PLAY_INVOKE_ERROR";
        public static final String PREPARE_FAILED = "PREPARE_FAILED";
        public static final String UNPREPARED = "UNPREPARED";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8634a;

        static {
            kge.a(1250910813);
            f8634a = new a();
        }

        private a() {
        }
    }
}
