package com.taobao.appbundle.scheduler;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.appbundle.scheduler.internal.b;
import com.taobao.appbundle.scheduler.internal.g;
import tb.kge;

/* loaded from: classes6.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static a f16302a;
    private b b = b.a();

    static {
        kge.a(985301443);
    }

    private a() {
    }

    private static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("ae2e3bcf", new Object[0]);
        }
        if (f16302a == null) {
            synchronized (a.class) {
                if (f16302a == null) {
                    f16302a = new a();
                }
            }
        }
        return f16302a;
    }

    private b b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (b) ipChange.ipc$dispatch("1be516b7", new Object[]{this}) : this.b;
    }

    public static g a(Priority priority) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (g) ipChange.ipc$dispatch("8d9d102b", new Object[]{priority}) : a().b().a(priority);
    }
}
