package com.taobao.android.weex_uikit.widget.text;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.m;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1034157479);
    }

    public static int a(Layout layout) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bfc35b80", new Object[]{layout})).intValue();
        }
        if (layout == null) {
            return 0;
        }
        int lineCount = layout.getLineCount();
        int i = 0;
        for (int i2 = 0; i2 < lineCount; i2++) {
            i = Math.max(i, (int) layout.getLineRight(i2));
        }
        return i;
    }

    public static int b(Layout layout) {
        IpChange ipChange = $ipChange;
        int i = 0;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c19cae9f", new Object[]{layout})).intValue();
        }
        if (layout == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 20 && (layout instanceof StaticLayout)) {
            int max = Math.max(0, layout.getLineCount() - 1);
            float lineDescent = layout.getLineDescent(max) - layout.getLineAscent(max);
            float spacingAdd = lineDescent - ((lineDescent - layout.getSpacingAdd()) / layout.getSpacingMultiplier());
            i = spacingAdd >= 0.0f ? (int) (spacingAdd + 0.5d) : -((int) ((-spacingAdd) + 0.5d));
        }
        return layout.getHeight() - i;
    }

    public static int a(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2619792e", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE) {
            return Math.min(i2, i3);
        }
        if (mode == 0) {
            return i3;
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.getSize(i);
        }
        throw new IllegalStateException("Unexpected size mode: " + View.MeasureSpec.getMode(i));
    }

    public static int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[0])).intValue() : m.f() ? 1 : 0;
    }
}
