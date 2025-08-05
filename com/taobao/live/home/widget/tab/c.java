package com.taobao.live.home.widget.tab;

import android.content.Context;
import android.content.res.TypedArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.kge;

/* loaded from: classes7.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f17775a;

    static {
        kge.a(1289294765);
        f17775a = new int[]{R.attr.colorPrimary};
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e1d6460", new Object[]{context});
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f17775a);
        boolean z = !obtainStyledAttributes.hasValue(0);
        if (obtainStyledAttributes != null) {
            obtainStyledAttributes.recycle();
        }
        if (z) {
            throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
        }
    }
}
