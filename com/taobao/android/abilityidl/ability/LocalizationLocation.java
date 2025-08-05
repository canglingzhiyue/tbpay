package com.taobao.android.abilityidl.ability;

import com.alibaba.wireless.security.SecExceptionCode;
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
public @interface LocalizationLocation {
    public static final String AU = "AU";
    public static final String CA = "CA";
    public static final String CN = "CN";
    public static final a Companion = a.f8695a;
    public static final String GE = "GE";
    public static final String GLOBAL = "GLOBAL";
    public static final String HK = "HK";
    public static final String JP = "JP";
    public static final String KG = "KG";
    public static final String KH = "KH";
    public static final String KR = "KR";
    public static final String KZ = "KZ";
    public static final String MN = "MN";
    public static final String MO = "MO";
    public static final String MY = "MY";
    public static final String NZ = "NZ";
    public static final String PH = "PH";
    public static final String SG = "SG";
    public static final String TH = "TH";
    public static final String TW = "TW";
    public static final String UZ = "UZ";
    public static final String VN = "VN";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String AU = "AU";
        public static final String CA = "CA";
        public static final String CN = "CN";
        public static final String GE = "GE";
        public static final String GLOBAL = "GLOBAL";
        public static final String HK = "HK";
        public static final String JP = "JP";
        public static final String KG = "KG";
        public static final String KH = "KH";
        public static final String KR = "KR";
        public static final String KZ = "KZ";
        public static final String MN = "MN";
        public static final String MO = "MO";
        public static final String MY = "MY";
        public static final String NZ = "NZ";
        public static final String PH = "PH";
        public static final String SG = "SG";
        public static final String TH = "TH";
        public static final String TW = "TW";
        public static final String UZ = "UZ";
        public static final String VN = "VN";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8695a;

        static {
            kge.a(-1080135632);
            f8695a = new a();
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
                case 2100:
                    if (!str.equals("AU")) {
                        return null;
                    }
                    return "AU";
                case 2142:
                    if (!str.equals("CA")) {
                        return null;
                    }
                    return "CA";
                case 2155:
                    if (!str.equals("CN")) {
                        return null;
                    }
                    return "CN";
                case 2270:
                    if (!str.equals("GE")) {
                        return null;
                    }
                    return "GE";
                case 2307:
                    if (!str.equals("HK")) {
                        return null;
                    }
                    return "HK";
                case 2374:
                    if (!str.equals("JP")) {
                        return null;
                    }
                    return "JP";
                case 2396:
                    if (!str.equals("KG")) {
                        return null;
                    }
                    return "KG";
                case 2397:
                    if (!str.equals("KH")) {
                        return null;
                    }
                    return "KH";
                case SecExceptionCode.SEC_ERROR_UNIFIED_SECURITY_GET_WUA_FAILED /* 2407 */:
                    if (!str.equals("KR")) {
                        return null;
                    }
                    return "KR";
                case 2415:
                    if (!str.equals("KZ")) {
                        return null;
                    }
                    return "KZ";
                case 2465:
                    if (!str.equals("MN")) {
                        return null;
                    }
                    return "MN";
                case 2466:
                    if (!str.equals("MO")) {
                        return null;
                    }
                    return "MO";
                case 2476:
                    if (!str.equals("MY")) {
                        return null;
                    }
                    return "MY";
                case 2508:
                    if (!str.equals("NZ")) {
                        return null;
                    }
                    return "NZ";
                case 2552:
                    if (!str.equals("PH")) {
                        return null;
                    }
                    return "PH";
                case 2644:
                    if (!str.equals("SG")) {
                        return null;
                    }
                    return "SG";
                case 2676:
                    if (!str.equals("TH")) {
                        return null;
                    }
                    return "TH";
                case 2691:
                    if (!str.equals("TW")) {
                        return null;
                    }
                    return "TW";
                case 2725:
                    if (!str.equals("UZ")) {
                        return null;
                    }
                    return "UZ";
                case 2744:
                    if (!str.equals("VN")) {
                        return null;
                    }
                    return "VN";
                case 2105276323:
                    if (!str.equals("GLOBAL")) {
                        return null;
                    }
                    return "GLOBAL";
                default:
                    return null;
            }
        }
    }
}
