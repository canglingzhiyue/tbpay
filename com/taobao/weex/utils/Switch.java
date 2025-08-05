package com.taobao.weex.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes9.dex */
public class Switch {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-803450899);
    }

    public static Boolean isSwitchOn(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("962b944b", new Object[]{str}) : Boolean.valueOf(new File("/data/local/tmp/", str).exists());
    }
}
