package com.taobao.android.detail.core.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class k extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f9706a;
    public String b;
    public String c;
    public String d;

    static {
        kge.a(-247213195);
    }

    public String a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("aff6e538", new Object[]{this}) : "宝贝推荐";
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }
}
