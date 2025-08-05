package com.taobao.taolive.room.openarchitecture.listener;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.pjm;
import tb.pjn;
import tb.pjo;
import tb.pjp;
import tb.pjq;

/* loaded from: classes8.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private pjq f21662a;
    private pjp b;
    private pjn c;
    private pjm d;
    private pjo e;

    static {
        kge.a(371494897);
        kge.a(563099626);
    }

    public boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63fccfb", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public Object q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("258fb1ba", new Object[]{this});
        }
        return null;
    }

    public void r(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93703f95", new Object[]{this, obj});
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("65bfbfd", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public void s(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dda1d8d6", new Object[]{this, obj});
        }
    }

    public boolean s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66a137e", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6782afb", new Object[]{this});
        }
    }

    public pjq bk_() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pjq) ipChange.ipc$dispatch("2750c652", new Object[]{this}) : this.f21662a;
    }

    public void a(pjq pjqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bdcdc1", new Object[]{this, pjqVar});
        } else {
            this.f21662a = pjqVar;
        }
    }

    public pjp l() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pjp) ipChange.ipc$dispatch("63ab453d", new Object[]{this}) : this.b;
    }

    public void a(pjp pjpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bd5962", new Object[]{this, pjpVar});
        } else {
            this.b = pjpVar;
        }
    }

    public pjn m() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pjn) ipChange.ipc$dispatch("6b5cea5e", new Object[]{this}) : this.c;
    }

    public void a(pjn pjnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bc70a4", new Object[]{this, pjnVar});
        } else {
            this.c = pjnVar;
        }
    }

    public pjm n() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pjm) ipChange.ipc$dispatch("730e8f9e", new Object[]{this}) : this.d;
    }

    public void a(pjm pjmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bbfc45", new Object[]{this, pjmVar});
        } else {
            this.d = pjmVar;
        }
    }

    public pjo o() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (pjo) ipChange.ipc$dispatch("7ac0353b", new Object[]{this}) : this.e;
    }

    public void a(pjo pjoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9bce503", new Object[]{this, pjoVar});
        } else {
            this.e = pjoVar;
        }
    }
}
