package com.taobao.taolive.sdk.playcontrol;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.core.interfaces.ISmallWindowStrategy;
import java.lang.ref.WeakReference;
import tb.kge;

/* loaded from: classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<a> f21880a = null;
    private ISmallWindowStrategy b;

    static {
        kge.a(-961765080);
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2be31345", new Object[]{this, aVar});
        } else if (aVar == null) {
        } else {
            aVar.a(this.b);
            this.f21880a = new WeakReference<>(aVar);
        }
    }

    public a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("6a7c0d8b", new Object[]{this});
        }
        WeakReference<a> weakReference = this.f21880a;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
            return;
        }
        WeakReference<a> weakReference = this.f21880a;
        if (weakReference == null || weakReference.get() == null || this.f21880a.get().e() == null) {
            return;
        }
        this.f21880a.get().e().o();
    }

    public void a(ISmallWindowStrategy iSmallWindowStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4d14aa", new Object[]{this, iSmallWindowStrategy});
        } else {
            this.b = iSmallWindowStrategy;
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        WeakReference<a> weakReference = this.f21880a;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.b = null;
    }
}
