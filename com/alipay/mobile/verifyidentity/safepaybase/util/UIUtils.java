package com.alipay.mobile.verifyidentity.safepaybase.util;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public final class UIUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static Pair<Integer, Integer> a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("4b5efeaa", new Object[]{context});
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i > i2 && i / i2 > 1.3333333333333333d) {
            return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i));
        }
        return new Pair<>(Integer.valueOf(i), Integer.valueOf(i2));
    }
}
