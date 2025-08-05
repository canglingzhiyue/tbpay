package com.taobao.android.sku.utils;

import android.content.Context;
import android.os.Build;
import android.support.v4.app.NotificationManagerCompat;
import android.text.TextUtils;
import android.widget.Toast;
import com.alibaba.android.ultron.vfw.widget.a;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class p {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_CUSTOM = 4;
    public static final int TYPE_DEFAULT = 1;
    public static final int TYPE_FAILED = 3;
    public static final int TYPE_SUCCESS = 2;

    static {
        kge.a(405009327);
    }

    public static void a(Context context, int i, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93897a37", new Object[]{context, new Integer(i), str, str2});
        } else if (TextUtils.isEmpty(str)) {
        } else {
            if ("HUAWEI".equalsIgnoreCase(Build.MANUFACTURER) && Build.VERSION.SDK_INT >= 21 && Build.VERSION.SDK_INT < 29 && !NotificationManagerCompat.from(context).areNotificationsEnabled()) {
                a.a(context, str);
                return;
            }
            ToastView toastView = new ToastView(context);
            Toast toast = new Toast(context);
            toast.setGravity(16, 0, 0);
            toast.setDuration(1);
            toast.setView(toastView);
            if (i == 1) {
                toastView.showDefault(str);
            } else if (i == 2) {
                toastView.showSuccess(str);
            } else if (i == 3) {
                toastView.showFailed(str);
            } else if (i == 4) {
                toastView.showWithIcon(str, str2);
            }
            toast.show();
        }
    }
}
