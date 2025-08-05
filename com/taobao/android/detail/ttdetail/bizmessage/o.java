package com.taobao.android.detail.ttdetail.bizmessage;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class o extends com.taobao.android.detail.ttdetail.communication.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String IDLE = "idle";
    public static final String SCROLLING = "scrolling";

    /* renamed from: a  reason: collision with root package name */
    public String f10509a;

    static {
        kge.a(399842075);
    }

    private o() {
    }

    public o(String str) {
        this.f10509a = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : this.f10509a;
    }
}
