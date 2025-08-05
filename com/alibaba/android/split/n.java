package com.alibaba.android.split;

import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import tb.kge;

/* loaded from: classes.dex */
public class n implements s {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-1880734561);
        kge.a(2138826819);
    }

    @Override // com.alibaba.android.split.s
    public SplitFileInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplitFileInfo) ipChange.ipc$dispatch("e48f8455", new Object[]{this, str});
        }
        DynamicFeatureInfo c = com.android.tools.bundleInfo.b.a().c(str);
        if (c == null) {
            return null;
        }
        SplitFileInfo splitFileInfo = new SplitFileInfo();
        splitFileInfo.url = c.url;
        splitFileInfo.status = c.status;
        splitFileInfo.appVersion = c.appVersion;
        splitFileInfo.version = c.version;
        splitFileInfo.md5 = c.md5;
        splitFileInfo.fileSize = c.size;
        splitFileInfo.splitName = c.featureName;
        return splitFileInfo;
    }
}
