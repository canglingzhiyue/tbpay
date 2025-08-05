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
public @interface AccelerometerShakeAxis {
    public static final String ANY = "ANY";
    public static final a Companion = a.f8624a;
    public static final String X = "X";
    public static final String Y = "Y";
    public static final String Z = "Z";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ANY = "ANY";
        public static final String X = "X";
        public static final String Y = "Y";
        public static final String Z = "Z";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8624a;

        static {
            kge.a(-639659014);
            f8624a = new a();
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
            if (hashCode != 64972) {
                switch (hashCode) {
                    case 88:
                        if (!str.equals("X")) {
                            return null;
                        }
                        return "X";
                    case 89:
                        if (!str.equals("Y")) {
                            return null;
                        }
                        return "Y";
                    case 90:
                        if (!str.equals("Z")) {
                            return null;
                        }
                        return "Z";
                    default:
                        return null;
                }
            } else if (!str.equals("ANY")) {
                return null;
            } else {
                return "ANY";
            }
        }
    }
}
