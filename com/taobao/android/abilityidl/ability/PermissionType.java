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
public @interface PermissionType {
    public static final String ACCESS_FINE_LOCATION = "ACCESS_FINE_LOCATION";
    public static final a Companion = a.f8725a;
    public static final String NFC = "NFC";
    public static final String READ_EXTERNAL_STORAGE = "READ_EXTERNAL_STORAGE";
    public static final String RECORD_AUDIO = "RECORD_AUDIO";
    public static final String WRITE_CALENDAR = "WRITE_CALENDAR";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACCESS_FINE_LOCATION = "ACCESS_FINE_LOCATION";
        public static final String NFC = "NFC";
        public static final String READ_EXTERNAL_STORAGE = "READ_EXTERNAL_STORAGE";
        public static final String RECORD_AUDIO = "RECORD_AUDIO";
        public static final String WRITE_CALENDAR = "WRITE_CALENDAR";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8725a;

        static {
            kge.a(-786461141);
            f8725a = new a();
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
                case 77195:
                    if (!str.equals("NFC")) {
                        return null;
                    }
                    return "NFC";
                case 303398256:
                    if (!str.equals("READ_EXTERNAL_STORAGE")) {
                        return null;
                    }
                    return "READ_EXTERNAL_STORAGE";
                case 766697727:
                    if (!str.equals("ACCESS_FINE_LOCATION")) {
                        return null;
                    }
                    return "ACCESS_FINE_LOCATION";
                case 910164926:
                    if (!str.equals("WRITE_CALENDAR")) {
                        return null;
                    }
                    return "WRITE_CALENDAR";
                case 1107437128:
                    if (!str.equals("RECORD_AUDIO")) {
                        return null;
                    }
                    return "RECORD_AUDIO";
                default:
                    return null;
            }
        }
    }
}
