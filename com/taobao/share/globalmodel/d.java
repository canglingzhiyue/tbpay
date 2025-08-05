package com.taobao.share.globalmodel;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes8.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f19630a;
    private b b;

    static {
        kge.a(1058191677);
    }

    public d(String str, b bVar) {
        this.f19630a = str;
        this.b = bVar;
    }

    public b a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("5b0e1027", new Object[]{this}) : this.b;
    }
}
