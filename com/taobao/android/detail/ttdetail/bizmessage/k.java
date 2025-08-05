package com.taobao.android.detail.ttdetail.bizmessage;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class k extends com.taobao.android.detail.ttdetail.communication.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private String f10507a;
    private boolean b = false;

    static {
        kge.a(1713725461);
    }

    public static k a(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (k) ipChange.ipc$dispatch("3f03c130", new Object[]{str, new Boolean(z)});
        }
        k kVar = new k();
        kVar.f10507a = str;
        kVar.b = z;
        return kVar;
    }

    private k() {
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10507a;
    }

    public Boolean b() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("a5abcd26", new Object[]{this}) : Boolean.valueOf(this.b);
    }
}
