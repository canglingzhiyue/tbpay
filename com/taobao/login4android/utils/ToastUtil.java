package com.taobao.login4android.utils;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.thread.LoginThreadHelper;
import tb.kge;

/* loaded from: classes7.dex */
public class ToastUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ToastUtil";

    static {
        kge.a(484931469);
    }

    public static void showToast(final Context context, final CharSequence charSequence, final int i) {
        IpChange ipChange = $ipChange;
        boolean z = true;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd3e7a88", new Object[]{context, charSequence, new Integer(i)});
            return;
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (Build.VERSION.SDK_INT >= 17 ? activity.isFinishing() || activity.isDestroyed() : activity.isFinishing()) {
                z = false;
            }
            if (!z) {
                return;
            }
        }
        LoginThreadHelper.runOnUIThread(new Runnable() { // from class: com.taobao.login4android.utils.ToastUtil.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    Toast.makeText(context, charSequence, i).show();
                }
            }
        });
    }

    public static void show(Toast toast) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("adc87dd7", new Object[]{toast});
        } else if (toast == null) {
        } else {
            toast.show();
        }
    }
}
