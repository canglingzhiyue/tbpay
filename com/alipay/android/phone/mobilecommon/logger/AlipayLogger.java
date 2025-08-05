package com.alipay.android.phone.mobilecommon.logger;

import com.alipay.mobile.common.logging.api.LoggerFactory;
import com.alipay.mobile.security.bio.utils.Logger;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AlipayLogger extends Logger {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.security.bio.utils.Logger
    public String a(Throwable th) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("1003a7b3", new Object[]{this, th}) : "";
    }

    @Override // com.alipay.mobile.security.bio.utils.Logger
    public int verbose(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("921d9190", new Object[]{this, str, str2})).intValue();
        }
        LoggerFactory.getTraceLogger().verbose(str, str2);
        return 0;
    }

    @Override // com.alipay.mobile.security.bio.utils.Logger
    public int debug(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9757c961", new Object[]{this, str, str2})).intValue();
        }
        LoggerFactory.getTraceLogger().debug(str, str2);
        return 0;
    }

    @Override // com.alipay.mobile.security.bio.utils.Logger
    public int info(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f161e0bc", new Object[]{this, str, str2})).intValue();
        }
        LoggerFactory.getTraceLogger().info(str, str2);
        return 0;
    }

    @Override // com.alipay.mobile.security.bio.utils.Logger
    public int warn(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c21b5694", new Object[]{this, str, str2})).intValue();
        }
        LoggerFactory.getTraceLogger().warn(str, str2);
        return 0;
    }

    @Override // com.alipay.mobile.security.bio.utils.Logger
    public int error(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4a936c16", new Object[]{this, str, str2})).intValue();
        }
        LoggerFactory.getTraceLogger().error(str, str2);
        return 0;
    }
}
