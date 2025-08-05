package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ihq;
import tb.ihz;

/* loaded from: classes9.dex */
public class q implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.taobao.zcache.g
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        ihz c = ihq.a().c(str);
        if (!c.g()) {
            return c.toString();
        }
        return null;
    }
}
