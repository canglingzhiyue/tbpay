package com.ali.user.mobile.utils;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class SiteUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2042092239);
    }

    public static int getDefaultLoginSite() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("a8f24a7f", new Object[0])).intValue() : DataProviderFactory.getDataProvider().getSite();
    }
}
