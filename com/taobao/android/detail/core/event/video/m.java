package com.taobao.android.detail.core.event.video;

import com.android.alibaba.ip.runtime.IpChange;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class m extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f9739a;
    public boolean b;

    static {
        kge.a(1998562064);
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
