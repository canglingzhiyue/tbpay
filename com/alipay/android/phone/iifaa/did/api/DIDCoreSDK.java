package com.alipay.android.phone.iifaa.did.api;

import com.android.alibaba.ip.runtime.IpChange;
import tb.ifi;
import tb.ipg;

/* loaded from: classes3.dex */
public class DIDCoreSDK {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static ifi mTrustedCertServiceIns;

    public static ifi getTrustedCertService() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ifi) ipChange.ipc$dispatch("78ceb443", new Object[0]);
        }
        if (mTrustedCertServiceIns == null) {
            synchronized (ifi.class) {
                if (mTrustedCertServiceIns == null) {
                    mTrustedCertServiceIns = new ipg();
                }
            }
        }
        return mTrustedCertServiceIns;
    }
}
