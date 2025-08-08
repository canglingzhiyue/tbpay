package com.taobao.android.behavix.utils;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.dro;
import tb.dsb;
import tb.kge;

/* loaded from: classes.dex */
public abstract class b implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f9213a;

    static {
        kge.a(2000574258);
        kge.a(-1390502639);
    }

    public abstract void a();

    public b(String str) {
        this.f9213a = str;
    }

    public b() {
    }

    public String b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("367c9fd7", new Object[]{this}) : this.f9213a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            if (!StringUtils.isEmpty(b())) {
                dro.b(Thread.currentThread().getName(), b());
            }
            a();
        } catch (Exception e) {
            a(e);
        } catch (Throwable th) {
            if (d.a()) {
                throw th;
            }
            String str = this.f9213a;
            if (str == null) {
                str = "BaseSafeRunnable";
            }
            dsb.a(str, "Throwable", null, th);
        }
        dro.f(Thread.currentThread().getName());
    }

    public void a(Exception exc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd91d31e", new Object[]{this, exc});
            return;
        }
        String str = this.f9213a;
        if (str == null) {
            str = "BaseSafeRunnable";
        }
        dsb.a(str, null, null, exc);
    }
}
