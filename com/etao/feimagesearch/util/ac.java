package com.etao.feimagesearch.util;

import com.android.alibaba.ip.runtime.IpChange;
import tb.cot;
import tb.kge;

/* loaded from: classes4.dex */
public abstract class ac implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile String f7006a;

    static {
        kge.a(-837529746);
        kge.a(-1390502639);
    }

    public abstract void a();

    public void a(Throwable th) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb9ad88d", new Object[]{this, th});
        }
    }

    public ac() {
        this.f7006a = "RUNNABLE";
    }

    public ac(String str) {
        this.f7006a = "RUNNABLE";
        this.f7006a = str;
    }

    public void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dd7e573", new Object[]{this, str});
        } else {
            this.f7006a = str;
        }
    }

    public String c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("bd025a76", new Object[]{this}) : this.f7006a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            a();
        } catch (Throwable th) {
            cot.a("RunnableEx", "Runnable Exception: " + this.f7006a, th);
            a(th);
        }
    }
}
