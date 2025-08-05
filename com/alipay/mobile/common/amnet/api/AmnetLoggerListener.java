package com.alipay.mobile.common.amnet.api;

import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transportext.amnet.Notepad;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AmnetLoggerListener implements Notepad {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean listened = false;

    @Override // com.alipay.mobile.common.transportext.amnet.Notepad
    public void print(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7290cb92", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            if (str.compareTo("DEBUG") == 0) {
                LogCatUtil.debug(str2, str3);
            } else if (str.compareTo("INFO") == 0) {
                LogCatUtil.info(str2, str3);
            } else if (str.compareTo("WARN") == 0) {
                LogCatUtil.warn(str2, str3);
            } else if (str.compareTo("ERROR") == 0) {
                LogCatUtil.error(str2, str3);
            } else if (str.compareTo("FATAL") == 0) {
                LogCatUtil.error(str2, str3);
            }
        } catch (Throwable unused) {
        }
    }
}
