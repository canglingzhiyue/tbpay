package com.taobao.statistic;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Properties;
import tb.kge;

@Deprecated
/* loaded from: classes8.dex */
public class UTExtendApi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(672745007);
    }

    public static void updateNextPageProperties(Properties properties) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63d96261", new Object[]{properties});
        } else {
            TBS.updateNextPageProperties(properties);
        }
    }
}
