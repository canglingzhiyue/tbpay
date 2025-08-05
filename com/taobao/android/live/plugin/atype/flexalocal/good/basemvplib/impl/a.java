package com.taobao.android.live.plugin.atype.flexalocal.good.basemvplib.impl;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.c;
import tb.hgu;
import tb.hgv;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class a<P extends hgv> implements hgu {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public P f13750a;
    public c l;

    static {
        kge.a(-1113447241);
        kge.a(550995450);
    }

    public a() {
    }

    public a(c cVar) {
        this.l = cVar;
    }

    @Override // tb.hgu
    public void a(hgv hgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebef0821", new Object[]{this, hgvVar});
        } else {
            this.f13750a = hgvVar;
        }
    }
}
