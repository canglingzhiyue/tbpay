package com.taobao.android.searchbaseframe.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private com.taobao.android.searchbaseframe.net.c<?, ?> f15013a = null;
    private com.taobao.android.searchbaseframe.net.f<?, ?> b = null;
    private com.taobao.android.searchbaseframe.net.c<?, ?> c = null;
    private com.taobao.android.searchbaseframe.net.c<com.taobao.android.searchbaseframe.net.a, com.taobao.android.searchbaseframe.net.e> d = null;

    static {
        kge.a(-2053226786);
    }

    public com.taobao.android.searchbaseframe.net.c<?, ?> a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.net.c) ipChange.ipc$dispatch("3f785bba", new Object[]{this}) : this.f15013a;
    }

    public com.taobao.android.searchbaseframe.net.f<?, ?> b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.net.f) ipChange.ipc$dispatch("f8efe9b6", new Object[]{this}) : this.b;
    }

    public void a(com.taobao.android.searchbaseframe.net.f<?, ?> fVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828c9051", new Object[]{this, fVar});
        } else {
            this.b = fVar;
        }
    }

    public void a(com.taobao.android.searchbaseframe.net.c<?, ?> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("828b3334", new Object[]{this, cVar});
        } else {
            this.f15013a = cVar;
        }
    }

    public com.taobao.android.searchbaseframe.net.c<?, ?> c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.net.c) ipChange.ipc$dispatch("b26776f8", new Object[]{this}) : this.c;
    }

    public void b(com.taobao.android.searchbaseframe.net.c<?, ?> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8055975", new Object[]{this, cVar});
        } else {
            this.c = cVar;
        }
    }

    public com.taobao.android.searchbaseframe.net.c<com.taobao.android.searchbaseframe.net.a, com.taobao.android.searchbaseframe.net.e> d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (com.taobao.android.searchbaseframe.net.c) ipChange.ipc$dispatch("6bdf0497", new Object[]{this}) : this.d;
    }

    public void c(com.taobao.android.searchbaseframe.net.c<com.taobao.android.searchbaseframe.net.a, com.taobao.android.searchbaseframe.net.e> cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d7f7fb6", new Object[]{this, cVar});
        } else {
            this.d = cVar;
        }
    }
}
