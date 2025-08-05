package com.taobao.android.live.plugin.atype.flexalocal.projectscreen.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.dlna.DLNADeviceInfo;
import tb.kge;

/* loaded from: classes6.dex */
public class ProjectScreenResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private int f13989a;
    private DLNADeviceInfo b;

    static {
        kge.a(710016614);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("56c6c6c", new Object[]{this})).booleanValue() : this.f13989a == 0;
    }

    public void a(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a821939b", new Object[]{this, new Integer(i)});
        } else {
            this.f13989a = i;
        }
    }

    public DLNADeviceInfo c() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (DLNADeviceInfo) ipChange.ipc$dispatch("d0db89f3", new Object[]{this}) : this.b;
    }

    public void a(DLNADeviceInfo dLNADeviceInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6134f3af", new Object[]{this, dLNADeviceInfo});
        } else {
            this.b = dLNADeviceInfo;
        }
    }
}
