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
public @interface ScreenOrientation {
    public static final a Companion = a.f8734a;
    public static final String landscape = "landscape";
    public static final String portrait = "portrait";
    public static final String unknown = "unknown";
    public static final String unspecified = "unspecified";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8734a;
        public static final String landscape = "landscape";
        public static final String portrait = "portrait";
        public static final String unknown = "unknown";
        public static final String unspecified = "unspecified";

        static {
            kge.a(505414994);
            f8734a = new a();
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
                case -1626174665:
                    if (!str.equals("unspecified")) {
                        return null;
                    }
                    return "unspecified";
                case -284840886:
                    if (!str.equals("unknown")) {
                        return null;
                    }
                    return "unknown";
                case 729267099:
                    if (!str.equals("portrait")) {
                        return null;
                    }
                    return "portrait";
                case 1430647483:
                    if (!str.equals("landscape")) {
                        return null;
                    }
                    return "landscape";
                default:
                    return null;
            }
        }
    }
}
