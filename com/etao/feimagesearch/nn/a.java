package com.etao.feimagesearch.nn;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicInteger;
import tb.kge;

/* loaded from: classes3.dex */
public abstract class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f6887a;
    public String b;
    private boolean c = false;

    static {
        kge.a(-803596887);
        f6887a = new AtomicInteger(0);
    }

    public a(String str) {
        this.b = str;
        f6887a.set(f6887a.incrementAndGet() % 100);
    }

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
        } else {
            this.c = false;
        }
    }
}
