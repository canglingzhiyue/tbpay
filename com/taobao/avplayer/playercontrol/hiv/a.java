package com.taobao.avplayer.playercontrol.hiv;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWContext;
import com.taobao.avplayer.DWVideoScreenType;
import tb.kge;

/* loaded from: classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(995189988);
    }

    public static boolean a(DWContext dWContext, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("99180c11", new Object[]{dWContext, new Boolean(z), new Boolean(z2), str})).booleanValue();
        }
        boolean equals = "true".equals(str);
        if (dWContext == null || !equals) {
            return false;
        }
        if (dWContext.screenType() == DWVideoScreenType.NORMAL) {
            return z;
        }
        if (dWContext.screenType() != DWVideoScreenType.LANDSCAPE_FULL_SCREEN && dWContext.screenType() != DWVideoScreenType.PORTRAIT_FULL_SCREEN) {
            return false;
        }
        return z2;
    }
}
