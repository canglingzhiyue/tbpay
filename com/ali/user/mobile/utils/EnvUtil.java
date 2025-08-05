package com.ali.user.mobile.utils;

import com.ali.user.mobile.app.dataprovider.DataProviderFactory;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class EnvUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(2055743209);
    }

    public static int getAlimmsdk_env() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f6c884da", new Object[0])).intValue();
        }
        if (DataProviderFactory.getDataProvider().getEnvType() == 1) {
            return 2;
        }
        return DataProviderFactory.getDataProvider().getEnvType() == 2 ? 1 : 0;
    }
}
