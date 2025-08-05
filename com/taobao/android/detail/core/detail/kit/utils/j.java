package com.taobao.android.detail.core.detail.kit.utils;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RomUtils";

    static {
        kge.a(-1755313295);
        emu.a("com.taobao.android.detail.core.detail.kit.utils.RomUtils");
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return a(context, 24);
        }
        return (context.getApplicationInfo().flags & 134217728) == 134217728;
    }

    public static boolean a(Context context, int i) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            try {
                Class.forName(appOpsManager.getClass().getName());
                int intValue = ((Integer) appOpsManager.getClass().getDeclaredMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue();
                com.taobao.android.detail.core.utils.i.b(TAG, "0 invoke " + intValue);
                return i2 >= 21 ? intValue == 0 || 3 == intValue : intValue == 0;
            } catch (Exception e) {
                com.taobao.android.detail.core.utils.i.a(TAG, "invoke checkOp failed : ", e);
            }
        } else {
            com.taobao.android.detail.core.utils.i.a(TAG, "Below API 19 cannot invoke!");
        }
        return false;
    }
}
