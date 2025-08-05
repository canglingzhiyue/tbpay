package com.taobao.android.home.component.utils;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class l {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(601911903);
    }

    public static void a(View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3afcd9", new Object[]{view, new Integer(i)});
        } else if (view == null) {
        } else {
            view.setVisibility(i);
        }
    }
}
