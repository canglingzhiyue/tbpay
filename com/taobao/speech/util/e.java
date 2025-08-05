package com.taobao.speech.util;

import android.content.Context;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.util.ArrayMap;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes8.dex */
public class e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CAMERA = "android.permission.CAMERA";
    public static final String RECORD_AUDIO = "android.permission.RECORD_AUDIO";

    /* renamed from: a  reason: collision with root package name */
    private static final Map<String, String> f19708a;

    static {
        ArrayMap arrayMap = new ArrayMap();
        f19708a = arrayMap;
        arrayMap.put(CAMERA, "OP_CAMERA");
        f19708a.put("android.permission.RECORD_AUDIO", "OP_RECORD_AUDIO");
    }

    public static boolean a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("61b6362e", new Object[]{context, str})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return ActivityCompat.checkSelfPermission(context, "android.permission.RECORD_AUDIO") == 0;
        } else if (Build.VERSION.SDK_INT < 18) {
            return true;
        } else {
            return b(context, str);
        }
    }

    private static boolean b(Context context, String str) {
        int i;
        Method declaredMethod;
        String str2;
        Object systemService = context.getSystemService("appops");
        try {
            declaredMethod = systemService.getClass().getDeclaredMethod("checkOpNoThrow", Integer.TYPE, Integer.TYPE, String.class);
            declaredMethod.setAccessible(true);
            str2 = f19708a.get(str);
        } catch (Exception unused) {
            Log.e("SearchPermissionUtil", "check permission error");
            i = -1;
        }
        if (str2 == null) {
            return false;
        }
        Field declaredField = systemService.getClass().getDeclaredField(str2);
        declaredField.setAccessible(true);
        i = ((Integer) declaredMethod.invoke(systemService, Integer.valueOf(((Integer) declaredField.get(systemService)).intValue()), Integer.valueOf(context.getApplicationInfo().uid), context.getPackageName())).intValue();
        return i == 0;
    }
}
