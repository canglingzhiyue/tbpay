package com.taobao.android.ucp.view;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.kge;
import tb.njr;

/* loaded from: classes6.dex */
public class c extends a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<njr> f15716a;

    static {
        kge.a(646795122);
    }

    public c(njr njrVar) {
        this.f15716a = new WeakReference<>(njrVar);
    }

    @Override // com.taobao.android.ucp.view.b
    public boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("57a83ed", new Object[]{this})).booleanValue() : this.f15716a.get() != null;
    }

    @Override // com.taobao.android.ucp.view.b
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this});
        }
        njr njrVar = this.f15716a.get();
        return njrVar != null ? njrVar.a() : "";
    }
}
