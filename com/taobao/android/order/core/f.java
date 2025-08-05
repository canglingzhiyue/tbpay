package com.taobao.android.order.core;

import com.android.alibaba.ip.runtime.IpChange;
import tb.hzx;
import tb.hzy;
import tb.hzz;
import tb.iac;
import tb.kge;

/* loaded from: classes6.dex */
public class f {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static hzz f14629a;
    private static hzx b;
    private static iac c;

    static {
        kge.a(1575526640);
    }

    public static hzz a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hzz) ipChange.ipc$dispatch("f05c476", new Object[0]) : f14629a;
    }

    public static void a(hzz hzzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfc9830", new Object[]{hzzVar});
        } else if (hzzVar == null) {
        } else {
            f14629a = hzzVar;
            hzy.a("OrderAdapterManager", "setAppMonitorAdapter", hzzVar.getClass().getName());
        }
    }

    public static hzx b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (hzx) ipChange.ipc$dispatch("16b76997", new Object[0]) : b;
    }

    public static void a(hzx hzxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecfbaf72", new Object[]{hzxVar});
        } else if (hzxVar == null) {
        } else {
            b = hzxVar;
            hzy.a("OrderAdapterManager", "setAppMonitorAdapter", hzxVar.getClass().getName());
        }
    }

    public static void a(iac iacVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed46b0ad", new Object[]{iacVar});
        } else if (iacVar == null) {
        } else {
            c = iacVar;
            hzy.a("OrderAdapterManager", "setTrackPointAdapter", iacVar.getClass().getName());
        }
    }

    public static iac c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (iac) ipChange.ipc$dispatch("1e6922f1", new Object[0]) : c;
    }
}
