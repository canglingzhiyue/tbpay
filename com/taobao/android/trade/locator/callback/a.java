package com.taobao.android.trade.locator.callback;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private d f15629a;
    private Map<String, Object> b;

    public a() {
    }

    public a(d dVar, Map<String, Object> map) {
        this.f15629a = dVar;
        this.b = map;
    }

    public d a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (d) ipChange.ipc$dispatch("e08f4928", new Object[]{this}) : this.f15629a;
    }
}
