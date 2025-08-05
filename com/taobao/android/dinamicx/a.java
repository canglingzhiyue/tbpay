package com.taobao.android.dinamicx;

import com.android.alibaba.ip.runtime.IpChange;
import tb.akt;

/* loaded from: classes.dex */
public class a implements IDXHardwareInterface {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.android.dinamicx.IDXHardwareInterface
    public int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5b", new Object[]{this})).intValue();
        }
        int a2 = akt.a();
        if (a2 == 0) {
            return 0;
        }
        if (a2 == 1) {
            return 1;
        }
        return a2 == 2 ? 2 : -1;
    }
}
