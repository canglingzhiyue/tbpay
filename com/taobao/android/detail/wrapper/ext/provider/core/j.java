package com.taobao.android.detail.wrapper.ext.provider.core;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliLoginInterface;
import tb.emu;
import tb.kge;

/* loaded from: classes5.dex */
public class j implements com.taobao.android.detail.datasdk.protocol.adapter.core.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AliLoginInterface f11340a;

    static {
        kge.a(-1084986811);
        kge.a(-61612596);
    }

    public j(AliLoginInterface aliLoginInterface) {
        emu.a("com.taobao.android.detail.wrapper.ext.provider.core.TBLoginProvider");
        if (aliLoginInterface == null) {
            throw new IllegalArgumentException("TBLoginProvider: aliLoginInterface is null");
        }
        this.f11340a = aliLoginInterface;
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.d
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821d36c", new Object[]{this, new Boolean(z)});
        } else {
            this.f11340a.a(z);
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.f11340a.a();
        }
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.d
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f11340a.b();
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.d
    public String d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("43881515", new Object[]{this}) : this.f11340a.d();
    }

    @Override // com.taobao.android.detail.datasdk.protocol.adapter.core.d
    public String e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("ca0dcfb4", new Object[]{this}) : this.f11340a.e();
    }
}
