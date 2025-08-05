package com.taobao.taolive.room.openarchitecture.listener;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pjf;
import tb.pjg;
import tb.pji;
import tb.ssr;

/* loaded from: classes8.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pjf f21661a;
    private pjg b;
    private pji c;
    private ssr d;

    static {
        kge.a(-1331761102);
        kge.a(563099626);
    }

    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        }
    }

    public pjg a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pjg) ipChange.ipc$dispatch("f092911", new Object[]{this}) : this.b;
    }

    public void a(pjg pjgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b9420b", new Object[]{this, pjgVar});
        } else {
            this.b = pjgVar;
        }
    }

    public pjf b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pjf) ipChange.ipc$dispatch("16bace51", new Object[]{this}) : this.f21661a;
    }

    public void a(pjf pjfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9b8cdac", new Object[]{this, pjfVar});
        } else {
            this.f21661a = pjfVar;
        }
    }

    public pji c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pji) ipChange.ipc$dispatch("1e6c740d", new Object[]{this}) : this.c;
    }

    public void a(pji pjiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ba2ac9", new Object[]{this, pjiVar});
        } else {
            this.c = pjiVar;
        }
    }

    public void a(ssr ssrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff5b9f86", new Object[]{this, ssrVar});
        } else {
            this.d = ssrVar;
        }
    }

    public ssr d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ssr) ipChange.ipc$dispatch("261f9969", new Object[]{this}) : this.d;
    }
}
