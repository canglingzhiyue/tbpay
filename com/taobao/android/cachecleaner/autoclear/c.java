package com.taobao.android.cachecleaner.autoclear;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static volatile c c;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f9280a;
    private final HandlerThread b = new HandlerThread("cache_clear");

    static {
        kge.a(1707606566);
    }

    private c() {
        this.b.start();
        this.f9280a = new Handler(this.b.getLooper());
    }

    public static c a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("7b44290f", new Object[0]);
        }
        if (c == null) {
            synchronized (c.class) {
                if (c == null) {
                    c = new c();
                }
            }
        }
        return c;
    }

    public boolean a(Runnable runnable) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("39112ea", new Object[]{this, runnable})).booleanValue() : this.f9280a.post(runnable);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (Build.VERSION.SDK_INT >= 18) {
            this.b.quitSafely();
        } else {
            this.b.quit();
        }
    }
}
