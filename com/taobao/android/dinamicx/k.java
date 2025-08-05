package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliMonitorInterface;

/* loaded from: classes.dex */
public class k implements com.taobao.android.dinamicx.monitor.j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private volatile AliMonitorInterface f11877a;

    private synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56c6c68", new Object[]{this});
            return;
        }
        if (this.f11877a == null) {
            this.f11877a = com.taobao.android.s.a();
        }
    }

    @Override // com.taobao.android.dinamicx.monitor.j
    public void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{this, str, str2, str3, new Double(d)});
            return;
        }
        if (this.f11877a == null) {
            a();
        }
        if (this.f11877a == null) {
            return;
        }
        this.f11877a.a(str, str2, str3, d);
    }

    @Override // com.taobao.android.dinamicx.monitor.j
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        if (this.f11877a == null) {
            a();
        }
        if (this.f11877a == null) {
            return;
        }
        this.f11877a.a(str, str2, str3);
    }

    @Override // com.taobao.android.dinamicx.monitor.j
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        if (this.f11877a == null) {
            a();
        }
        if (this.f11877a == null) {
            return;
        }
        this.f11877a.a(str, str2, str3, str4, str5);
    }
}
