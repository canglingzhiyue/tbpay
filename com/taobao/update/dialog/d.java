package com.taobao.update.dialog;

import android.content.res.Resources;
import android.util.TypedValue;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(956217213);
    }

    public static int dpToPx(float f, Resources resources) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("d9a51b2a", new Object[]{new Float(f), resources})).intValue() : (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
