package com.taobao.android.detail.ttdetail.widget;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1049355561);
    }

    public static void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a2155e7", new Object[]{marginLayoutParams});
        } else if (marginLayoutParams == null) {
        } else {
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.bottomMargin = 0;
        }
    }
}
