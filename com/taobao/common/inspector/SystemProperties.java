package com.taobao.common.inspector;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes7.dex */
public class SystemProperties {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String RO_BOARD_PLATFORM = "ro.board.platform";
    public static final String RO_PRODUCT_BOARD = "ro.board.platform";

    static {
        kge.a(1124660171);
    }

    private static native String nGetString(String str);

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str}) : nGetString(str);
    }
}
