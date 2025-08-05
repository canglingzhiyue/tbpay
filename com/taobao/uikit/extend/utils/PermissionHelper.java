package com.taobao.uikit.extend.utils;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class PermissionHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "PermissionHelper";

    static {
        kge.a(-690978288);
    }

    public static boolean isPermissionGranted(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c057f509", new Object[]{activity, str})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 23 || ContextCompat.checkSelfPermission(activity, str) == 0) {
            return true;
        }
        ActivityCompat.requestPermissions(activity, new String[]{str}, 1);
        return false;
    }

    public static boolean isMiuiFloatWindowOpAllowed(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("253dbc30", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return checkOp(context, 24);
        }
        return (context.getApplicationInfo().flags & 134217728) == 134217728;
    }

    public static boolean isMezuFloatWindowOpAllowed(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1386b0ed", new Object[]{context})).booleanValue();
        }
        if (Build.VERSION.SDK_INT < 19) {
            return true;
        }
        return checkOp(context, 24);
    }

    public static boolean checkOp(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                Class.forName(appOpsManager.getClass().getName());
                int intValue = ((Integer) appOpsManager.getClass().getDeclaredMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue();
                Log.e(TAG, "0 invoke " + intValue);
                return intValue == 0;
            } catch (Exception unused) {
                Log.e(TAG, "CheckOp failed for some reason!");
            }
        } else {
            Log.e(TAG, "Below API 19 cannot invoke!");
        }
        return false;
    }
}
