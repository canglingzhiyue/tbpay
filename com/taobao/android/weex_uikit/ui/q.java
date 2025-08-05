package com.taobao.android.weex_uikit.ui;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(478555482);
    }

    public static void a(View view, int i, int i2, int i3, int i4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5550ea", new Object[]{view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Boolean(z)});
            return;
        }
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (z || view.getMeasuredHeight() != i6 || view.getMeasuredWidth() != i5) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
        }
        if (!z && view.getLeft() == i && view.getTop() == i2 && view.getRight() == i3 && view.getBottom() == i4) {
            return;
        }
        view.layout(i, i2, i3, i4);
    }
}
