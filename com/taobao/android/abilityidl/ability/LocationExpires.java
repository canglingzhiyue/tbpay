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
public @interface LocationExpires {
    public static final a Companion = a.f8699a;
    public static final String FIR_MIN = "FIR_MIN";
    public static final String FOR_MIN = "FOR_MIN";
    public static final String HALF_DAY = "HALF_DAY";
    public static final String HALF_HOUR = "HALF_HOUR";
    public static final String NO_CACHE = "NO_CACHE";
    public static final String ONE_DAY = "ONE_DAY";
    public static final String ONE_HOUR = "ONE_HOUR";
    public static final String ONE_MIN = "ONE_MIN";
    public static final String SEC_MIN = "SEC_MIN";
    public static final String THR_MIN = "THR_MIN";
    public static final String TWO_HOUR = "TWO_HOUR";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String FIR_MIN = "FIR_MIN";
        public static final String FOR_MIN = "FOR_MIN";
        public static final String HALF_DAY = "HALF_DAY";
        public static final String HALF_HOUR = "HALF_HOUR";
        public static final String NO_CACHE = "NO_CACHE";
        public static final String ONE_DAY = "ONE_DAY";
        public static final String ONE_HOUR = "ONE_HOUR";
        public static final String ONE_MIN = "ONE_MIN";
        public static final String SEC_MIN = "SEC_MIN";
        public static final String THR_MIN = "THR_MIN";
        public static final String TWO_HOUR = "TWO_HOUR";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8699a;

        static {
            kge.a(-465569523);
            f8699a = new a();
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
                case -1672717289:
                    if (!str.equals("TWO_HOUR")) {
                        return null;
                    }
                    return "TWO_HOUR";
                case -1617752220:
                    if (!str.equals("NO_CACHE")) {
                        return null;
                    }
                    return "NO_CACHE";
                case -1606411996:
                    if (!str.equals("SEC_MIN")) {
                        return null;
                    }
                    return "SEC_MIN";
                case -1480724419:
                    if (!str.equals("ONE_HOUR")) {
                        return null;
                    }
                    return "ONE_HOUR";
                case -619168047:
                    if (!str.equals("THR_MIN")) {
                        return null;
                    }
                    return "THR_MIN";
                case -601958909:
                    if (!str.equals("ONE_DAY")) {
                        return null;
                    }
                    return "ONE_DAY";
                case -601950023:
                    if (!str.equals("ONE_MIN")) {
                        return null;
                    }
                    return "ONE_MIN";
                case -130688542:
                    if (!str.equals("FIR_MIN")) {
                        return null;
                    }
                    return "FIR_MIN";
                case 41086364:
                    if (!str.equals("FOR_MIN")) {
                        return null;
                    }
                    return "FOR_MIN";
                case 729849200:
                    if (!str.equals("HALF_DAY")) {
                        return null;
                    }
                    return "HALF_DAY";
                case 1150621296:
                    if (!str.equals("HALF_HOUR")) {
                        return null;
                    }
                    return "HALF_HOUR";
                default:
                    return null;
            }
        }
    }
}
