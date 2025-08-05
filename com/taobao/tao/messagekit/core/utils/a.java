package com.taobao.tao.messagekit.core.utils;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ACCSClient;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.AccsException;
import tb.kge;

/* loaded from: classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1555658639);
    }

    public static long a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56c6c5c", new Object[0])).longValue();
        }
        try {
            return AccsClientConfig.getConfigByTag(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG) != null ? ACCSClient.getAccsClient(AccsClientConfig.V2_EXCLUSIVE_CONFIGTAG).getServerTime() : ACCSClient.getAccsClient().getServerTime();
        } catch (AccsException unused) {
            return 0L;
        }
    }
}
