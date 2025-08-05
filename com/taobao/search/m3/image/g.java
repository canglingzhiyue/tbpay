package com.taobao.search.m3.image;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.adapter.d;
import tb.kge;

/* loaded from: classes7.dex */
public abstract class g implements d.a, com.taobao.search.musie.img.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Object f19112a;

    static {
        kge.a(21745789);
        kge.a(1982418204);
        kge.a(-983160102);
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public void a(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6251244", new Object[]{this, obj});
        } else {
            this.f19112a = obj;
        }
    }

    @Override // com.taobao.android.weex_framework.adapter.d.a
    public Object b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("43b9c269", new Object[]{this}) : this.f19112a;
    }
}
