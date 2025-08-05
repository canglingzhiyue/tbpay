package com.etao.feimagesearch.cip.camera;

import android.app.Activity;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes3.dex */
public class g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(950569405);
    }

    public static int a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("68a25ad", new Object[]{activity})).intValue();
        }
        WindowManager windowManager = (WindowManager) activity.getSystemService(com.taobao.android.weex_framework.util.a.ATOM_EXT_window);
        if (windowManager == null) {
            return 90;
        }
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 0) {
            return 0;
        }
        if (rotation != 1) {
            if (rotation == 2) {
                return 180;
            }
            if (rotation == 3) {
                return 270;
            }
        }
        return 90;
    }
}
