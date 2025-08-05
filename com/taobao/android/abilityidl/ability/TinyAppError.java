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
public @interface TinyAppError {
    public static final String ALREADY_SHOW = "ALREADY_SHOW";
    public static final String BEYOND_FATIGUE = "BEYOND_FATIGUE";
    public static final a Companion = a.f8746a;
    public static final String FORBID_ADD_TO_HOME_PAGE = "FORBID_ADD_TO_HOME_PAGE";
    public static final String SHORT_STAY = "SHORT_STAY";
    public static final String TINY_APP_SERVER_FORBID_SHOW = "TINY_APP_SERVER_FORBID_SHOW";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String ALREADY_SHOW = "ALREADY_SHOW";
        public static final String BEYOND_FATIGUE = "BEYOND_FATIGUE";
        public static final String FORBID_ADD_TO_HOME_PAGE = "FORBID_ADD_TO_HOME_PAGE";
        public static final String SHORT_STAY = "SHORT_STAY";
        public static final String TINY_APP_SERVER_FORBID_SHOW = "TINY_APP_SERVER_FORBID_SHOW";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8746a;

        static {
            kge.a(-1594414839);
            f8746a = new a();
        }

        private a() {
        }
    }
}
