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
public @interface FileEncodingType {
    public static final String ASCII = "ASCII";
    public static final String BASE64 = "BASE64";
    public static final a Companion = a.f8678a;
    public static final String HEX = "HEX";
    public static final String LATIN1 = "LATIN1";
    public static final String UCS2 = "UCS2";
    public static final String UTF16 = "UTF16";
    public static final String UTF8 = "UTF8";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ASCII = "ASCII";
        public static final String BASE64 = "BASE64";
        public static final String HEX = "HEX";
        public static final String LATIN1 = "LATIN1";
        public static final String UCS2 = "UCS2";
        public static final String UTF16 = "UTF16";
        public static final String UTF8 = "UTF8";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8678a;

        static {
            kge.a(-1170185013);
            f8678a = new a();
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
                case -2056547891:
                    if (!str.equals("LATIN1")) {
                        return null;
                    }
                    return "LATIN1";
                case 71419:
                    if (!str.equals("HEX")) {
                        return null;
                    }
                    return "HEX";
                case 2599245:
                    if (!str.equals("UCS2")) {
                        return null;
                    }
                    return "UCS2";
                case 2615185:
                    if (!str.equals("UTF8")) {
                        return null;
                    }
                    return "UTF8";
                case 62568241:
                    if (!str.equals("ASCII")) {
                        return null;
                    }
                    return "ASCII";
                case 81070572:
                    if (!str.equals("UTF16")) {
                        return null;
                    }
                    return "UTF16";
                case 1952093519:
                    if (!str.equals("BASE64")) {
                        return null;
                    }
                    return "BASE64";
                default:
                    return null;
            }
        }
    }
}
