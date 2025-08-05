package com.taobao.avplayer.core.component;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWVideoScreenType;
import tb.kge;

/* loaded from: classes6.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public DWComponent f16485a;
    public DWComponent b;
    public DWComponent c;

    static {
        kge.a(-1144468376);
    }

    public DWComponent a(DWVideoScreenType dWVideoScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DWComponent) ipChange.ipc$dispatch("2e30c9a6", new Object[]{this, dWVideoScreenType});
        }
        if (dWVideoScreenType == DWVideoScreenType.NORMAL) {
            return this.f16485a;
        }
        if (dWVideoScreenType == DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            return this.c;
        }
        return this.b;
    }
}
