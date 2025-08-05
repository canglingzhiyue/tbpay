package com.alipay.security.mobile.util;

import android.os.Bundle;
import com.alipay.security.mobile.api.AuthenticatorApi;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedList;
import java.util.List;

/* loaded from: classes3.dex */
public class LogCollect {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static List<AuthenticatorApi.FpServiceErrItem> errs = new LinkedList();

    public static synchronized void parseLog(Bundle bundle) {
        synchronized (LogCollect.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a8a04a3c", new Object[]{bundle});
            }
        }
    }

    public static synchronized List<AuthenticatorApi.FpServiceErrItem> getErr() {
        synchronized (LogCollect.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("dce3b051", new Object[0]);
            } else if (errs.size() > 0) {
                List<AuthenticatorApi.FpServiceErrItem> list = errs;
                errs = new LinkedList();
                return list;
            } else {
                return errs;
            }
        }
    }
}
