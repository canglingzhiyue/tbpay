package com.alibaba.openid.device;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import tb.bzi;
import tb.bzk;
import tb.kge;
import tb.rrw;

/* loaded from: classes2.dex */
public class b implements bzi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private rrw f3168a;
    private boolean b = false;
    private boolean c = false;

    static {
        kge.a(755108672);
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
        if (!this.b) {
            this.f3168a = new rrw();
            this.c = this.f3168a.a(context, (rrw.a<String>) null) == 1;
            this.b = true;
        }
        bzk.a("getOAID", "isSupported", Boolean.valueOf(this.c));
        if (this.c && this.f3168a.b()) {
            return this.f3168a.a();
        }
        return null;
    }
}
