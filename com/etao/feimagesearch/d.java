package com.etao.feimagesearch;

import android.app.Activity;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import tb.cog;
import tb.coh;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class d implements cog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private ISBaseActivity f6662a;

    static {
        kge.a(170609096);
        kge.a(-1360076847);
    }

    public d(ISBaseActivity iSBaseActivity) {
        this.f6662a = iSBaseActivity;
    }

    @Override // tb.cog
    public Activity a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Activity) ipChange.ipc$dispatch("2162bf40", new Object[]{this}) : this.f6662a;
    }

    @Override // tb.cog
    public Intent b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Intent) ipChange.ipc$dispatch("ee89e30a", new Object[]{this}) : this.f6662a.getIntent();
    }

    @Override // tb.cog
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f6662a.a(str);
        }
    }

    @Override // tb.cog
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        } else {
            coh.a(this.f6662a, z, z2);
        }
    }
}
