package com.taobao.infoflow.taobao.subservice.biz.pop.lifecycle;

import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;
import tb.kyu;
import tb.lks;

/* loaded from: classes7.dex */
public class f implements lks.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private kyu f17505a;

    static {
        kge.a(-1630448066);
        kge.a(439987723);
    }

    @Override // tb.lks.c
    public void a(boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c194ce8", new Object[]{this, new Boolean(z), new Boolean(z2)});
        }
    }

    public f(kyu kyuVar) {
        this.f17505a = kyuVar;
    }

    @Override // tb.lks.c
    public void a(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f4273c", new Object[]{this, viewGroup, new Integer(i)});
        } else {
            this.f17505a.c().a(viewGroup, i);
        }
    }

    @Override // tb.lks.c
    public void a(ViewGroup viewGroup, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75913347", new Object[]{this, viewGroup, new Integer(i), new Integer(i2)});
        } else {
            this.f17505a.c().a(i, i2);
        }
    }
}
