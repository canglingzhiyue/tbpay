package com.taobao.share.core.share.interceptor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.globalmodel.TBShareContent;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes8.dex */
public abstract class c implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1252217205);
        kge.a(-1805296056);
    }

    public abstract void a(ArrayList<String> arrayList, TBShareContent tBShareContent, String str);

    @Override // com.taobao.share.core.share.interceptor.b
    public boolean b(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("846ab17a", new Object[]{this, arrayList, tBShareContent, str})).booleanValue();
        }
        a(arrayList, tBShareContent, str);
        return false;
    }
}
