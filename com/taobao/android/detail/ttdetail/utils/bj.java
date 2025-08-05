package com.taobao.android.detail.ttdetail.utils;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class bj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-358528869);
    }

    public static boolean a(ViewGroup viewGroup, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f39d30cf", new Object[]{viewGroup, view})).booleanValue();
        }
        if (viewGroup != null && view != null) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (viewGroup.getChildAt(i) == view) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9501e36a", new Object[]{view});
            return;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) parent).removeView(view);
    }
}
