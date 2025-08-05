package com.ta.utdid2.device;

import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.AESUtils;
import tb.kge;

/* loaded from: classes4.dex */
public class c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-850548193);
    }

    public String a(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str}) : AESUtils.decrypt(str);
    }
}
