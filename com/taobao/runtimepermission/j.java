package com.taobao.runtimepermission;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes7.dex */
public class j {

    /* loaded from: classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final ArrayMap<String, String> sPermissionMapping;

        static {
            ArrayMap<String, String> arrayMap = new ArrayMap<>();
            sPermissionMapping = arrayMap;
            arrayMap.put("android.permission.READ_CONTACTS", "OP_READ_CONTACTS");
            sPermissionMapping.put(com.taobao.speech.util.e.CAMERA, "OP_CAMERA");
            sPermissionMapping.put("android.permission.WRITE_SETTINGS", "OP_WRITE_SETTINGS");
            sPermissionMapping.put("android.permission.ACCESS_COARSE_LOCATION", "OP_COARSE_LOCATION");
            sPermissionMapping.put(com.taobao.tao.homepage.a.ACCESS_FINE_LOCATION, "OP_FINE_LOCATION");
            sPermissionMapping.put("android.permission.VIBRATE", "OP_VIBRATE");
            sPermissionMapping.put("android.permission.SYSTEM_ALERT_WINDOW", "OP_SYSTEM_ALERT_WINDOW");
            sPermissionMapping.put("android.permission.RECORD_AUDIO", "OP_RECORD_AUDIO");
            sPermissionMapping.put("android.permission.WAKE_LOCK", "OP_WAKE_LOCK");
        }

        public static boolean a(Context context, String[] strArr) {
            Object systemService = context.getSystemService("appops");
            try {
                Method declaredMethod = systemService.getClass().getDeclaredMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
                declaredMethod.setAccessible(true);
                for (String str : strArr) {
                    String str2 = sPermissionMapping.get(str);
                    if (str2 != null) {
                        Field declaredField = systemService.getClass().getDeclaredField(str2);
                        declaredField.setAccessible(true);
                        if (((Integer) declaredMethod.invoke(systemService, Integer.valueOf(((Integer) declaredField.get(systemService)).intValue()), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue() != 0) {
                            return false;
                        }
                    }
                }
                return true;
            } catch (Exception unused) {
                return false;
            }
        }
    }
}
