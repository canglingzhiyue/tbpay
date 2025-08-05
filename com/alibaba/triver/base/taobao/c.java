package com.alibaba.triver.base.taobao;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.File;
import tb.kge;

/* loaded from: classes3.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-159952915);
    }

    public static Boolean a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Boolean) ipChange.ipc$dispatch("410b752f", new Object[]{str}) : Boolean.valueOf(new File("/data/local/tmp/", str).exists());
    }
}
