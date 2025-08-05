package com.taobao.taobaoavsdk.widget.extra;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ddb;
import tb.kge;

/* loaded from: classes8.dex */
public class c implements ddb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1366800977);
        kge.a(-74003351);
    }

    @Override // tb.ddb
    public String getBucket(String str, String str2) {
        Variation variation;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("96a61b05", new Object[]{this, str, str2});
        }
        try {
            VariationSet activate = UTABTest.activate(str, str2);
            return (activate == null || activate.size() <= 0 || (variation = activate.getVariation("bucket")) == null) ? "" : variation.getValueAsString("bucket");
        } catch (Throwable unused) {
            return "";
        }
    }
}
