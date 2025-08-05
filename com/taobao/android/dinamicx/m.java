package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes.dex */
public class m {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f11887a;
    public r b;

    static {
        kge.a(-810273472);
    }

    public m(r rVar) {
        if (rVar == null) {
            DXEngineConfig dXEngineConfig = new DXEngineConfig(DXEngineConfig.DX_DEFAULT_BIZTYPE);
            this.f11887a = dXEngineConfig.f11775a;
            this.b = new r(dXEngineConfig);
            return;
        }
        this.b = rVar;
        this.f11887a = rVar.a().f11775a;
    }

    public m(DXEngineConfig dXEngineConfig) {
        this.f11887a = (dXEngineConfig == null ? new DXEngineConfig(DXEngineConfig.DX_DEFAULT_BIZTYPE) : dXEngineConfig).f11775a;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f11887a;
    }

    public DXEngineConfig b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DXEngineConfig) ipChange.ipc$dispatch("78a66ef1", new Object[]{this}) : this.b.a();
    }

    public r c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (r) ipChange.ipc$dispatch("6e05dc7c", new Object[]{this}) : this.b;
    }

    public am a(r rVar, aw awVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (am) ipChange.ipc$dispatch("4a569a26", new Object[]{this, rVar, awVar});
        }
        if (bx.p()) {
            return new at(rVar, awVar);
        }
        return new am(rVar, awVar);
    }
}
