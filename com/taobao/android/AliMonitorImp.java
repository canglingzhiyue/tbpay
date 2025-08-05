package com.taobao.android;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes.dex */
public class AliMonitorImp implements AliMonitorInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static final AliMonitorImp f8601a = new AliMonitorImp();

    private AliMonitorImp() {
    }

    public static AliMonitorImp getInstance() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (AliMonitorImp) ipChange.ipc$dispatch("7def4396", new Object[0]) : f8601a;
    }

    @Override // com.taobao.android.AliMonitorInterface
    public void a(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dba8242", new Object[]{this, str, str2, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, d);
        }
    }

    @Override // com.taobao.android.AliMonitorInterface
    public void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0bf98b8", new Object[]{this, str, str2, str3, new Double(d)});
        } else {
            AppMonitor.Counter.commit(str, str2, str3, d);
        }
    }

    @Override // com.taobao.android.AliMonitorInterface
    public void a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("929ad046", new Object[]{this, str, str2, str3});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    @Override // com.taobao.android.AliMonitorInterface
    public void a(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b9da5a", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }
}
