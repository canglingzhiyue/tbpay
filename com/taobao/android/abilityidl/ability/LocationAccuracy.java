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
public @interface LocationAccuracy {
    public static final a Companion = a.f8697a;
    public static final String HIGH_MODE = "HIGH_MODE";
    public static final String LOW_MODE = "LOW_MODE";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String HIGH_MODE = "HIGH_MODE";
        public static final String LOW_MODE = "LOW_MODE";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8697a;

        static {
            kge.a(696097680);
            f8697a = new a();
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
            int hashCode = str.hashCode();
            if (hashCode != -1011211314) {
                if (hashCode != 2123057696 || !str.equals("HIGH_MODE")) {
                    return null;
                }
                return "HIGH_MODE";
            } else if (!str.equals("LOW_MODE")) {
                return null;
            } else {
                return "LOW_MODE";
            }
        }
    }
}
