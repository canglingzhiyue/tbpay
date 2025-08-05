package com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.content;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class b implements c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f9914a;

    static {
        kge.a(1422482687);
        kge.a(353707246);
    }

    @Override // com.taobao.android.detail.core.standard.widget.overpull.behavior.impl.content.c
    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f9914a = i;
        }
    }
}
