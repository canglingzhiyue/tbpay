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
public @interface ImagePreviewCloseType {
    public static final String BACK = "BACK";
    public static final String CLICK = "CLICK";
    public static final a Companion = a.f8687a;
    public static final String ERROR = "ERROR";
    public static final String JUMP = "JUMP";
    public static final String SLIDE_DOWN = "SLIDE_DOWN";

    /* loaded from: classes4.dex */
    public static final class a {
        public static final String BACK = "BACK";
        public static final String CLICK = "CLICK";
        public static final String ERROR = "ERROR";
        public static final String JUMP = "JUMP";
        public static final String SLIDE_DOWN = "SLIDE_DOWN";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8687a;

        static {
            kge.a(1223054643);
            f8687a = new a();
        }

        private a() {
        }
    }
}
