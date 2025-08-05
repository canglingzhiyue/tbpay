package com.taobao.uikit.extend.utils;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class RippleHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(998618929);
    }

    public static void applyColor(Drawable drawable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80998343", new Object[]{drawable, new Integer(i)});
        } else if (!(drawable instanceof RippleDrawable)) {
        } else {
            ((RippleDrawable) drawable).setColor(ColorStateList.valueOf(i));
        }
    }
}
