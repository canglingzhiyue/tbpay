package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.AliMonitorInterface;

/* loaded from: classes.dex */
public class f implements com.taobao.android.dinamic.dinamic.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private AliMonitorInterface f11873a = com.taobao.android.s.a();

    @Override // com.taobao.android.dinamic.dinamic.c
    public void a(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba8242", new Object[]{this, str, str2, new Double(d)});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f11873a;
        if (aliMonitorInterface == null) {
            return;
        }
        aliMonitorInterface.a(str, str2, d);
    }

    @Override // com.taobao.android.dinamic.dinamic.c
    public void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{this, str, str2, str3, new Double(d)});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f11873a;
        if (aliMonitorInterface == null) {
            return;
        }
        aliMonitorInterface.a(str, str2, str3, d);
    }

    @Override // com.taobao.android.dinamic.dinamic.c
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f11873a;
        if (aliMonitorInterface == null) {
            return;
        }
        aliMonitorInterface.a(str, str2, str3);
    }

    @Override // com.taobao.android.dinamic.dinamic.c
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
            return;
        }
        AliMonitorInterface aliMonitorInterface = this.f11873a;
        if (aliMonitorInterface == null) {
            return;
        }
        aliMonitorInterface.a(str, str2, str3, str4, str5);
    }
}
