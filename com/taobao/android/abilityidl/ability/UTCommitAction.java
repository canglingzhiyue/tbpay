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
public @interface UTCommitAction {
    public static final a Companion = a.f8765a;
    public static final String click = "click";
    public static final String componentExposure = "componentExposure";
    public static final String custom = "custom";
    public static final String pageExposure = "pageExposure";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8765a;
        public static final String click = "click";
        public static final String componentExposure = "componentExposure";
        public static final String custom = "custom";
        public static final String pageExposure = "pageExposure";

        static {
            kge.a(-270428370);
            f8765a = new a();
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
                case -1349088399:
                    if (!str.equals("custom")) {
                        return null;
                    }
                    return "custom";
                case 94750088:
                    if (!str.equals("click")) {
                        return null;
                    }
                    return "click";
                case 570049718:
                    if (!str.equals("pageExposure")) {
                        return null;
                    }
                    return "pageExposure";
                case 1113764132:
                    if (!str.equals("componentExposure")) {
                        return null;
                    }
                    return "componentExposure";
                default:
                    return null;
            }
        }
    }
}
