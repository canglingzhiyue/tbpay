package com.taobao.pexode.entity;

import android.graphics.Bitmap;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f18703a;
    private final InterfaceC0750a b;
    private long c;

    /* renamed from: com.taobao.pexode.entity.a$a  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC0750a {
        void a(long j);
    }

    static {
        kge.a(-721874786);
    }

    public a(Bitmap bitmap, long j, InterfaceC0750a interfaceC0750a) {
        this.f18703a = bitmap;
        this.c = j;
        this.b = interfaceC0750a;
    }

    public Bitmap a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Bitmap) ipChange.ipc$dispatch("bc740346", new Object[]{this}) : this.f18703a;
    }

    public long b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("57a83dd", new Object[]{this})).longValue() : this.c;
    }

    public synchronized void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5889b6a", new Object[]{this});
            return;
        }
        if (this.c != 0) {
            this.b.a(this.c);
            this.c = 0L;
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        try {
            c();
            super.finalize();
        } catch (Throwable unused) {
        }
    }
}
