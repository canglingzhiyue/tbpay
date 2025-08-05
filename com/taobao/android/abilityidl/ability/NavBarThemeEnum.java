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
public @interface NavBarThemeEnum {
    public static final String AUTO = "AUTO";
    public static final a Companion = a.f8703a;
    public static final String DARK = "DARK";
    public static final String LIGHT = "LIGHT";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String AUTO = "AUTO";
        public static final String DARK = "DARK";
        public static final String LIGHT = "LIGHT";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8703a;

        static {
            kge.a(1292211688);
            f8703a = new a();
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
            if (hashCode == 2020783) {
                if (!str.equals("AUTO")) {
                    return null;
                }
                return "AUTO";
            } else if (hashCode == 2090870) {
                if (!str.equals("DARK")) {
                    return null;
                }
                return "DARK";
            } else if (hashCode != 72432886 || !str.equals("LIGHT")) {
                return null;
            } else {
                return "LIGHT";
            }
        }
    }
}
