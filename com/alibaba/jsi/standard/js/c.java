package com.alibaba.jsi.standard.js;

import com.alibaba.jsi.standard.JSEngine;
import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private JSEngine f3141a;
    private long b = 0;
    private Thread c = null;

    static {
        kge.a(176474190);
    }

    public c(JSEngine jSEngine) {
        this.f3141a = jSEngine;
        a();
    }

    public synchronized boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue();
        }
        if (this.b != 0) {
            if (this.c == Thread.currentThread()) {
                return true;
            }
            a(g4.b.i);
        }
        if (this.f3141a.isDisposed()) {
            throw new Error("JSEngine '" + this.f3141a.getEmbedderName() + "' has been disposed!");
        }
        Object engineCmd = Bridge.engineCmd(this.f3141a, 1, 0L);
        if (engineCmd instanceof Long) {
            this.b = ((Long) engineCmd).longValue();
            this.c = Thread.currentThread();
        }
        return this.b != 0;
    }

    public synchronized void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57a83e9", new Object[]{this});
        } else if (this.b == 0) {
        } else {
            if (this.c != Thread.currentThread()) {
                a("exit");
            }
            if (this.f3141a.isDisposed()) {
                return;
            }
            Bridge.engineCmd(this.f3141a, 2, this.b);
            this.b = 0L;
            this.c = null;
        }
    }

    private void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3a64c32", new Object[]{this, str});
            return;
        }
        throw new Error("Can not call EngineScope." + str + " across thread: current is" + Thread.currentThread() + ", while the scope has thread " + this.c);
    }
}
