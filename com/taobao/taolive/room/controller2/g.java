package com.taobao.taolive.room.controller2;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.service.TBLiveRecEngineV2;
import com.taobao.taolive.sdk.model.BaseRecModel;
import tb.dds;
import tb.ddt;
import tb.ddu;
import tb.ddw;
import tb.irm;
import tb.kge;
import tb.pib;
import tb.pkp;

/* loaded from: classes8.dex */
public class g extends com.taobao.taolive.sdk.core.e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public irm C;
    public pkp s;
    private TBLiveRecEngineV2.RecModel v;
    private String w;
    private a x;
    private pib y;

    static {
        kge.a(1384081865);
    }

    public static /* synthetic */ Object ipc$super(g gVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode != 639143848) {
            if (hashCode != 768226629) {
                throw new InstantReloadException(String.format("String switch could not find '%s'", str));
            }
            return super.e();
        }
        return super.d();
    }

    @Override // tb.phq
    public /* synthetic */ BaseRecModel r() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (BaseRecModel) ipChange.ipc$dispatch("77924a51", new Object[]{this}) : w();
    }

    public g() {
        this.g = new com.taobao.taolive.sdk.core.i(this);
    }

    public pib t() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pib) ipChange.ipc$dispatch("a1386ac2", new Object[]{this}) : this.y;
    }

    public void a(pib pibVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9a8e4af", new Object[]{this, pibVar});
        } else {
            this.y = pibVar;
        }
    }

    public a u() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("12e49725", new Object[]{this}) : this.x;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ddee391", new Object[]{this, aVar});
        } else {
            this.x = aVar;
        }
    }

    public String v() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("b8ef3443", new Object[]{this}) : this.w;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.w = str;
        }
    }

    public TBLiveRecEngineV2.RecModel w() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (TBLiveRecEngineV2.RecModel) ipChange.ipc$dispatch("dd916e64", new Object[]{this}) : this.v;
    }

    public void a(TBLiveRecEngineV2.RecModel recModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2b29f74", new Object[]{this, recModel});
        } else {
            this.v = recModel;
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.a
    public dds d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (dds) ipChange.ipc$dispatch("26188fa8", new Object[]{this}) : super.d();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.a
    public ddu e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ddu) ipChange.ipc$dispatch("2dca3545", new Object[]{this});
        }
        ddu e = super.e();
        return e != null ? e : ddw.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.a
    public com.taobao.taolive.sdk.core.b f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.taolive.sdk.core.b) ipChange.ipc$dispatch("4b88b043", new Object[]{this}) : this.g;
    }

    @Override // com.taobao.alilive.aliliveframework.frame.a
    public ddt i() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ddt) ipChange.ipc$dispatch("4c90caa2", new Object[]{this}) : com.taobao.taolive.sdk.playcontrol.c.a(this);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.a
    public boolean m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("6158678", new Object[]{this})).booleanValue() : (this.t instanceof c) && ((c) this.t).b();
    }
}
