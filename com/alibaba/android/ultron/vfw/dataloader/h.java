package com.alibaba.android.ultron.vfw.dataloader;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class h {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public com.alibaba.android.ultron.engine.template.b f2699a;
    public d b;

    static {
        kge.a(-1033562838);
    }

    public com.alibaba.android.ultron.engine.template.b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.alibaba.android.ultron.engine.template.b) ipChange.ipc$dispatch("70623b3d", new Object[]{this}) : this.f2699a;
    }

    public void a(com.alibaba.android.ultron.engine.template.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0d51f77", new Object[]{this, bVar});
        } else {
            this.f2699a = bVar;
        }
    }

    public d b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("af8283e6", new Object[]{this}) : this.b;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5ead625", new Object[]{this, dVar});
        } else {
            this.b = dVar;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5889b6e", new Object[]{this})).booleanValue();
        }
        com.alibaba.android.ultron.engine.template.b bVar = this.f2699a;
        if (bVar == null) {
            return true;
        }
        return bVar.f2568a;
    }
}
