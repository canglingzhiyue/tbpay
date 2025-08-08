package com.taobao.android.detail.core.performance.preload;

import mtopsdk.common.util.StringUtils;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ein;
import tb.emu;
import tb.kge;

/* loaded from: classes4.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(150604966);
        emu.a("com.taobao.android.detail.core.performance.preload.DetailPreloadBucketHelper");
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9f352ae", new Object[]{str});
        }
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        if (!"search".equals(str)) {
            return ein.a().d(str);
        }
        DetailPreloadBucket d = j.a().d(str);
        return d == null ? "" : d.bucketId;
    }
}
