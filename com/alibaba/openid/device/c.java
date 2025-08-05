package com.alibaba.openid.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bzi;
import tb.bzk;
import tb.kge;

/* loaded from: classes2.dex */
public class c implements bzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(434793721);
        kge.a(981749981);
    }

    @Override // tb.bzi
    public String a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bbc5dc40", new Object[]{this, context});
        }
        if (context == null) {
            return null;
        }
        boolean a2 = com.meizu.flyme.openidsdk.c.a();
        bzk.a("getOAID", "isSupported", Boolean.valueOf(a2));
        if (a2) {
            return com.meizu.flyme.openidsdk.c.a(context);
        }
        return null;
    }
}
