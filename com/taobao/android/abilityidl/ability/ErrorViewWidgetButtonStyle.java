package com.taobao.android.abilityidl.ability;

import com.android.alibaba.ip.runtime.IpChange;
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
public @interface ErrorViewWidgetButtonStyle {
    public static final String BUTTON_STYLE_ALL = "BUTTON_STYLE_ALL";
    public static final String BUTTON_STYLE_FEEDBACK = "BUTTON_STYLE_FEEDBACK";
    public static final String BUTTON_STYLE_NONE = "BUTTON_STYLE_NONE";
    public static final String BUTTON_STYLE_NORMAL_ACTION = "BUTTON_STYLE_NORMAL_ACTION";
    public static final a Companion = a.f8654a;

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String BUTTON_STYLE_ALL = "BUTTON_STYLE_ALL";
        public static final String BUTTON_STYLE_FEEDBACK = "BUTTON_STYLE_FEEDBACK";
        public static final String BUTTON_STYLE_NONE = "BUTTON_STYLE_NONE";
        public static final String BUTTON_STYLE_NORMAL_ACTION = "BUTTON_STYLE_NORMAL_ACTION";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8654a;

        static {
            kge.a(-1851198800);
            f8654a = new a();
        }

        private a() {
        }

        public final String a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
            }
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1536117677:
                    if (!str.equals("BUTTON_STYLE_NONE")) {
                        return null;
                    }
                    return "BUTTON_STYLE_NONE";
                case -1221345837:
                    if (!str.equals("BUTTON_STYLE_NORMAL_ACTION")) {
                        return null;
                    }
                    return "BUTTON_STYLE_NORMAL_ACTION";
                case -742301434:
                    if (!str.equals("BUTTON_STYLE_ALL")) {
                        return null;
                    }
                    return "BUTTON_STYLE_ALL";
                case 2050351904:
                    if (!str.equals("BUTTON_STYLE_FEEDBACK")) {
                        return null;
                    }
                    return "BUTTON_STYLE_FEEDBACK";
                default:
                    return null;
            }
        }
    }
}
