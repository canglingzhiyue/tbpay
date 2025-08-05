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
public @interface NextRPCAttachedResponseStrategy {
    public static final a Companion = a.f8712a;
    public static final String FULL = "FULL";
    public static final String IMMEDIATELY = "IMMEDIATELY";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String FULL = "FULL";
        public static final String IMMEDIATELY = "IMMEDIATELY";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8712a;

        static {
            kge.a(190441016);
            f8712a = new a();
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
            if (hashCode != 2169487) {
                if (hashCode != 352923870 || !str.equals("IMMEDIATELY")) {
                    return null;
                }
                return "IMMEDIATELY";
            } else if (!str.equals("FULL")) {
                return null;
            } else {
                return "FULL";
            }
        }
    }
}
