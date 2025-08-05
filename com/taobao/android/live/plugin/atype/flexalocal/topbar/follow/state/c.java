package com.taobao.android.live.plugin.atype.flexalocal.topbar.follow.state;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import tb.hkf;
import tb.hkh;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private a f14054a;
    private Context b;
    private b c;
    private hkh d;
    private com.taobao.alilive.aliliveframework.frame.a e;

    static {
        kge.a(406673493);
    }

    public c(Context context, hkh hkhVar, com.taobao.alilive.aliliveframework.frame.a aVar, TBLiveDataModel tBLiveDataModel, d dVar) {
        this.b = context;
        this.d = hkhVar;
        this.e = aVar;
        this.f14054a = new hkf(this, aVar, tBLiveDataModel, dVar);
    }

    public void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdd274e", new Object[]{this, bVar});
            return;
        }
        this.c = bVar;
        bVar.onStateChange(null, this.f14054a, false);
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Context) ipChange.ipc$dispatch("75941360", new Object[]{this}) : this.b;
    }

    public a b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("413db5b0", new Object[]{this}) : this.f14054a;
    }

    public hkh c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hkh) ipChange.ipc$dispatch("1e68d4b7", new Object[]{this}) : this.d;
    }

    public void a(a aVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1bba5dc5", new Object[]{this, aVar, new Boolean(z)});
            return;
        }
        a aVar2 = this.f14054a;
        if (aVar2 == aVar) {
            return;
        }
        b bVar = this.c;
        if (bVar != null) {
            bVar.onStateChange(aVar2, aVar, z);
        }
        a aVar3 = this.f14054a;
        if (aVar3 != null) {
            aVar3.c();
        }
        this.f14054a = aVar;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfdcb2ef", new Object[]{this, aVar});
        } else {
            a(aVar, false);
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("596b2eb", new Object[]{this});
            return;
        }
        this.f14054a = null;
        this.b = null;
        this.c = null;
    }
}
