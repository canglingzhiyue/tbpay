package com.taobao.zcache;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes9.dex */
public class d implements g {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(302903905);
        kge.a(1648685489);
    }

    @Override // com.taobao.zcache.g
    public String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{this, str});
        }
        try {
            System.loadLibrary(str);
            return null;
        } catch (Throwable th) {
            return th.getMessage();
        }
    }
}
