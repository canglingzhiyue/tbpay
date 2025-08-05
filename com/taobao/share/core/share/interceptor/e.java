package com.taobao.share.core.share.interceptor;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.share.globalmodel.TBShareContent;
import java.util.ArrayList;
import tb.kge;
import tb.nyy;

/* loaded from: classes8.dex */
public class e implements b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-2004939688);
        kge.a(-1805296056);
    }

    @Override // com.taobao.share.core.share.interceptor.b
    public boolean b(ArrayList<String> arrayList, TBShareContent tBShareContent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("846ab17a", new Object[]{this, arrayList, tBShareContent, str})).booleanValue();
        }
        if ("true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isShowReturn", String.valueOf(true))) && com.taobao.share.globalmodel.e.b().d()) {
            nyy.a(b.TAG, "return: isShowReturn true");
            return true;
        } else if (!"true".equals(OrangeConfig.getInstance().getConfig("android_share_bizconfig", "isBusyReturn", String.valueOf(true))) || !com.taobao.share.globalmodel.e.b().a()) {
            return false;
        } else {
            nyy.a(b.TAG, "return: isInGetShareActivityInfo true");
            return true;
        }
    }
}
