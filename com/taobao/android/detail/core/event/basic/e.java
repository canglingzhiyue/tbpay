package com.taobao.android.detail.core.event.basic;

import com.android.alibaba.ip.runtime.IpChange;
import tb.emu;
import tb.enn;
import tb.kge;

/* loaded from: classes4.dex */
public class e extends enn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int TYPE_ON_ACTIVITY_PAUSE = 28;
    public static final int TYPE_ON_ACTIVITY_RESUME = 27;
    public static final int TYPE_ON_ACTIVITY_START = 26;
    public static final int TYPE_ON_ACTIVITY_STOP = 29;

    /* renamed from: a  reason: collision with root package name */
    private int f9700a;

    static {
        kge.a(1757819149);
    }

    @Override // com.taobao.android.trade.event.Event
    public Object getParam() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("a5850f14", new Object[]{this});
        }
        return null;
    }

    public e(int i) {
        this.f9700a = i;
        emu.a("com.taobao.android.detail.core.event.basic.GeneralEvent");
    }

    public int a() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue() : this.f9700a;
    }
}
