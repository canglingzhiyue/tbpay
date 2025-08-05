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
public @interface PermissionKeyType {
    public static final String ACTIVITY_MOTION = "ACTIVITY_MOTION";
    public static final String COARSE_LOCATION = "COARSE_LOCATION";
    public static final a Companion = a.f8722a;
    public static final String DAILY_ACTIVITIES = "DAILY_ACTIVITIES";
    public static final String FINE_LOCATION = "FINE_LOCATION";
    public static final String READ_AUDIO = "READ_AUDIO";
    public static final String READ_CALENDAR = "READ_CALENDAR";
    public static final String READ_CONTACTS = "READ_CONTACTS";
    public static final String READ_IMAGES = "READ_IMAGES";
    public static final String READ_PASTEBOARD = "READ_PASTEBOARD";
    public static final String READ_VIDEO = "READ_VIDEO";
    public static final String RECORD_AUDIO = "RECORD_AUDIO";
    public static final String TAKE_CAMERA = "TAKE_CAMERA";
    public static final String WRITE_AUDIO = "WRITE_AUDIO";
    public static final String WRITE_CALENDAR = "WRITE_CALENDAR";
    public static final String WRITE_CONTACTS = "WRITE_CONTACTS";
    public static final String WRITE_IMAGES = "WRITE_IMAGES";
    public static final String WRITE_VIDEO = "WRITE_VIDEO";

    /* loaded from: classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String ACTIVITY_MOTION = "ACTIVITY_MOTION";
        public static final String COARSE_LOCATION = "COARSE_LOCATION";
        public static final String DAILY_ACTIVITIES = "DAILY_ACTIVITIES";
        public static final String FINE_LOCATION = "FINE_LOCATION";
        public static final String READ_AUDIO = "READ_AUDIO";
        public static final String READ_CALENDAR = "READ_CALENDAR";
        public static final String READ_CONTACTS = "READ_CONTACTS";
        public static final String READ_IMAGES = "READ_IMAGES";
        public static final String READ_PASTEBOARD = "READ_PASTEBOARD";
        public static final String READ_VIDEO = "READ_VIDEO";
        public static final String RECORD_AUDIO = "RECORD_AUDIO";
        public static final String TAKE_CAMERA = "TAKE_CAMERA";
        public static final String WRITE_AUDIO = "WRITE_AUDIO";
        public static final String WRITE_CALENDAR = "WRITE_CALENDAR";
        public static final String WRITE_CONTACTS = "WRITE_CONTACTS";
        public static final String WRITE_IMAGES = "WRITE_IMAGES";
        public static final String WRITE_VIDEO = "WRITE_VIDEO";

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f8722a;

        static {
            kge.a(556491128);
            f8722a = new a();
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
                case -1072386312:
                    if (!str.equals("WRITE_IMAGES")) {
                        return null;
                    }
                    return "WRITE_IMAGES";
                case -392540863:
                    if (!str.equals("READ_IMAGES")) {
                        return null;
                    }
                    return "READ_IMAGES";
                case -46133530:
                    if (!str.equals("ACTIVITY_MOTION")) {
                        return null;
                    }
                    return "ACTIVITY_MOTION";
                case 22403397:
                    if (!str.equals("COARSE_LOCATION")) {
                        return null;
                    }
                    return "COARSE_LOCATION";
                case 63449724:
                    if (!str.equals("READ_PASTEBOARD")) {
                        return null;
                    }
                    return "READ_PASTEBOARD";
                case 512449334:
                    if (!str.equals("WRITE_AUDIO")) {
                        return null;
                    }
                    return "WRITE_AUDIO";
                case 521038035:
                    if (!str.equals("WRITE_CONTACTS")) {
                        return null;
                    }
                    return "WRITE_CONTACTS";
                case 531485659:
                    if (!str.equals("WRITE_VIDEO")) {
                        return null;
                    }
                    return "WRITE_VIDEO";
                case 910164926:
                    if (!str.equals("WRITE_CALENDAR")) {
                        return null;
                    }
                    return "WRITE_CALENDAR";
                case 1017485532:
                    if (!str.equals("READ_CONTACTS")) {
                        return null;
                    }
                    return "READ_CONTACTS";
                case 1107437128:
                    if (!str.equals("RECORD_AUDIO")) {
                        return null;
                    }
                    return "RECORD_AUDIO";
                case 1146135706:
                    if (!str.equals("FINE_LOCATION")) {
                        return null;
                    }
                    return "FINE_LOCATION";
                case 1227116493:
                    if (!str.equals("READ_AUDIO")) {
                        return null;
                    }
                    return "READ_AUDIO";
                case 1246152818:
                    if (!str.equals("READ_VIDEO")) {
                        return null;
                    }
                    return "READ_VIDEO";
                case 1406612423:
                    if (!str.equals("READ_CALENDAR")) {
                        return null;
                    }
                    return "READ_CALENDAR";
                case 1760211421:
                    if (!str.equals("TAKE_CAMERA")) {
                        return null;
                    }
                    return "TAKE_CAMERA";
                case 2000638451:
                    if (!str.equals("DAILY_ACTIVITIES")) {
                        return null;
                    }
                    return "DAILY_ACTIVITIES";
                default:
                    return null;
            }
        }
    }
}
