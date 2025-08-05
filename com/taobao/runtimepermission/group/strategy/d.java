package com.taobao.runtimepermission.group.strategy;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.runtimepermission.group.a;
import com.taobao.speech.util.e;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static a a(String str) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d2477c3d", new Object[]{str});
        }
        switch (str.hashCode()) {
            case -1611296843:
                if (str.equals("LOCATION")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 73234372:
                if (str.equals("MEDIA")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 215175251:
                if (str.equals("CONTACTS")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 604302142:
                if (str.equals("CALENDAR")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1856013610:
                if (str.equals("MICROPHONE")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1980544805:
                if (str.equals("CAMERA")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2137382963:
                if (str.equals("PASTEBOARD")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return new c(Collections.unmodifiableMap(new HashMap<String, String>(2) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory$1
                    {
                        put("READ_CALENDAR", "android.permission.READ_CALENDAR");
                        put("WRITE_CALENDAR", "android.permission.WRITE_CALENDAR");
                    }
                }), false);
            case 1:
                return new c(Collections.unmodifiableMap(new HashMap<String, String>(2) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory$2
                    {
                        put("READ_CONTACTS", "android.permission.READ_CONTACTS");
                        put("WRITE_CONTACTS", "android.permission.WRITE_CONTACTS");
                    }
                }), false);
            case 2:
                return new c(Collections.unmodifiableMap(new HashMap<String, String>(1) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory$3
                    {
                        put("RECORD_AUDIO", "android.permission.RECORD_AUDIO");
                    }
                }), false);
            case 3:
                return new c(Collections.unmodifiableMap(new HashMap<String, String>(1) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory$4
                    {
                        put("TAKE_CAMERA", e.CAMERA);
                    }
                }), false);
            case 4:
                return new c(null, true);
            case 5:
                return new c(Collections.unmodifiableMap(new HashMap<String, String>(2) { // from class: com.taobao.runtimepermission.group.strategy.GroupedPermissionStrategyFactory$5
                    {
                        put("COARSE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION");
                        put("FINE_LOCATION", com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION);
                    }
                }), false);
            case 6:
                return new f();
            default:
                return new c(null, false);
        }
    }
}
