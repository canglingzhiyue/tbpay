package com.taobao.media;

import com.alibaba.ut.abtest.UTABTest;
import com.alibaba.ut.abtest.Variation;
import com.alibaba.ut.abtest.VariationSet;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ddb;
import tb.kge;

/* loaded from: classes7.dex */
public class MediaABTestAdapter implements ddb {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String Tag = "MediaABTestAdapter";

    static {
        kge.a(1558738806);
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
