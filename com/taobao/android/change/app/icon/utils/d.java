package com.taobao.android.change.app.icon.utils;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.change.app.icon.model.AppIconComponentName;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.kge;

/* loaded from: classes4.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "ChangeAppIcon.PmUtils";

    static {
        kge.a(-773138406);
    }

    public static String a(Context context, AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91090d0f", new Object[]{context, appIconComponentName});
        }
        try {
            ActivityInfo a2 = a(context, appIconComponentName.clzPath);
            int i = appIconComponentName.iconResId;
            if (i <= 0) {
                i = a2.getIconResource();
            }
            Drawable drawable = context.getResources().getDrawable(i);
            if (drawable == null) {
                drawable = a2.loadIcon(context.getPackageManager());
            }
            Bitmap a3 = a.a(drawable);
            if (a3 == null) {
                return null;
            }
            return a.a(a3);
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "getAppIconBase64Str error", th);
            return null;
        }
    }

    public static ActivityInfo a(Context context, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ActivityInfo) ipChange.ipc$dispatch("9123bf62", new Object[]{context, str}) : Intent.makeMainActivity(new ComponentName(context, str)).resolveActivityInfo(context.getPackageManager(), 640);
    }

    public static void b(Context context, AppIconComponentName appIconComponentName) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f1b7c32", new Object[]{context, appIconComponentName});
        } else {
            appIconComponentName.state = context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, appIconComponentName.clzPath));
        }
    }
}
