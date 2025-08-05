package com.alibaba.android.split.core.splitinstall;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.asi;
import tb.kge;

/* loaded from: classes2.dex */
public class t implements asi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-662335701);
        kge.a(683384201);
    }

    @Override // tb.asi
    public g a(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("7ecfbfe", new Object[]{this, context}) : new i(new k(context), context);
    }
}
