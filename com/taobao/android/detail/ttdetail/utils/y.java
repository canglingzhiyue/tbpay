package com.taobao.android.detail.ttdetail.utils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.support.v4.app.Fragment;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class y {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1323548243);
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9eca1003", new Object[]{context})).booleanValue();
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        ((Activity) context).finish();
        return true;
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 17 && activity.isDestroyed()) {
                return true;
            }
        }
        return false;
    }

    public static Context a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("52552462", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        Context context = view.getContext();
        return context instanceof com.taobao.android.detail.ttdetail.performance.e ? ((com.taobao.android.detail.ttdetail.performance.e) context).getBaseContext() : context;
    }

    public static Context a(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("914ff242", new Object[]{fragment});
        }
        if (fragment == null) {
            return null;
        }
        Context context = fragment.getContext();
        return context instanceof com.taobao.android.detail.ttdetail.performance.e ? ((com.taobao.android.detail.ttdetail.performance.e) context).getBaseContext() : context;
    }

    public static Context a(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("8414b519", new Object[]{dialog});
        }
        if (dialog == null) {
            return null;
        }
        Context context = dialog.getContext();
        return context instanceof com.taobao.android.detail.ttdetail.performance.e ? ((com.taobao.android.detail.ttdetail.performance.e) context).getBaseContext() : context;
    }
}
