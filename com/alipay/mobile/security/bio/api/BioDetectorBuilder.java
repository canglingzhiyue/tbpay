package com.alipay.mobile.security.bio.api;

import android.content.Context;
import com.alipay.mobile.security.bio.module.MicroModule;
import com.alipay.mobile.security.bio.runtime.Runtime;
import com.alipay.mobile.security.bio.workspace.BioTransfer;
import com.alipay.mobile.security.bio.workspace.BioTransferLifecycleRegistry;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioDetectorBuilder {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static BioDetector create(Context context, MicroModule microModule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BioDetector) ipChange.ipc$dispatch("81d4a0dd", new Object[]{context, microModule});
        }
        if (context == null) {
            throw new IllegalArgumentException("context Can't be null");
        }
        BioTransfer bioTransfer = new BioTransfer(context, microModule);
        BioTransferLifecycleRegistry.getInstance().registerBioDetector(bioTransfer);
        return bioTransfer;
    }

    public static String getMetaInfos(Context context) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("23e7e3e9", new Object[]{context}) : Runtime.getMetaInfos(context, null);
    }

    public static String getMetaInfos(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("dfb26952", new Object[]{context, map}) : Runtime.getMetaInfos(context, map);
    }
}
