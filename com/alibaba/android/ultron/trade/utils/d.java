package com.alibaba.android.ultron.trade.utils;

import android.content.Context;
import android.content.ContextWrapper;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bng;
import tb.kge;

/* loaded from: classes2.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-734332774);
    }

    public static boolean a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e1d6464", new Object[]{context})).booleanValue();
        }
        if (context instanceof bng) {
            return true;
        }
        return (context instanceof ContextWrapper) && (((ContextWrapper) context).getBaseContext() instanceof bng);
    }
}
