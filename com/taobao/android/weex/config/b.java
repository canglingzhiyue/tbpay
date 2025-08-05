package com.taobao.android.weex.config;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes6.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private WeexUnicornConfig f15859a;
    private c b;
    private a c;
    private d d;
    private boolean e;
    private String f;
    private Boolean g;

    static {
        kge.a(-371069526);
    }

    public WeexUnicornConfig a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WeexUnicornConfig) ipChange.ipc$dispatch("b6cda656", new Object[]{this}) : this.f15859a;
    }

    public void a(WeexUnicornConfig weexUnicornConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9f49d0", new Object[]{this, weexUnicornConfig});
        } else {
            this.f15859a = weexUnicornConfig;
        }
    }

    public c b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (c) ipChange.ipc$dispatch("c715bf2b", new Object[]{this}) : this.b;
    }

    public void a(c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea58a86", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    public a c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (a) ipChange.ipc$dispatch("28685b8c", new Object[]{this}) : this.c;
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea4a1c8", new Object[]{this, aVar});
        } else {
            this.c = aVar;
        }
    }

    public d d() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("89baf888", new Object[]{this}) : this.d;
    }

    public void a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ea5fee5", new Object[]{this, dVar});
        } else {
            this.d = dVar;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("5a4ca70", new Object[]{this})).booleanValue() : this.e;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("50938a53", new Object[]{this}) : this.f;
    }

    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }

    public Boolean g() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("18a3cb6b", new Object[]{this}) : this.g;
    }
}
