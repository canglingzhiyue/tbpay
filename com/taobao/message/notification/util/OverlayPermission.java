package com.taobao.message.notification.util;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class OverlayPermission {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2007955237);
    }

    public static boolean hasPermission(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a17da9bc", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 23) {
            return Settings.canDrawOverlays(context);
        }
        return hasPermissionBelowMarshmallow(context);
    }

    public static boolean hasPermissionBelowMarshmallow(Context context) {
        try {
            if (Build.VERSION.SDK_INT < 19) {
                return true;
            }
            return ((Integer) AppOpsManager.class.getMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke((AppOpsManager) context.getSystemService("appops"), 24, Integer.valueOf(Binder.getCallingUid()), context.getApplicationContext().getPackageName())).intValue() == 0;
        } catch (Exception | NoClassDefFoundError unused) {
            return false;
        }
    }
}
