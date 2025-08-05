package com.alibaba.openid.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bzi;
import tb.bzk;
import tb.cwo;
import tb.kge;

/* loaded from: classes.dex */
public class e implements bzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private boolean f3169a = false;

    static {
        kge.a(184409005);
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
        if (!this.f3169a) {
            cwo.a(context);
            this.f3169a = true;
        }
        boolean a2 = cwo.a();
        bzk.a("getOAID", "isSupported", Boolean.valueOf(a2));
        if (a2) {
            return cwo.b(context);
        }
        return null;
    }
}
