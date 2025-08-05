package com.taobao.android.icart.recommend;

import android.support.v7.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import tb.jnq;
import tb.kge;
import tb.osc;

/* loaded from: classes5.dex */
public abstract class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(413143254);
    }

    public abstract void a();

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        }
    }

    public abstract void a(String str);

    public abstract void a(jnq<RecyclerView> jnqVar);

    public void a(osc oscVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8816b79", new Object[]{this, oscVar});
        }
    }

    public abstract void b();

    public abstract void c();

    public abstract void d();

    public abstract void e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();
}
