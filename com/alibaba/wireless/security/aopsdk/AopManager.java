package com.alibaba.wireless.security.aopsdk;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class AopManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AopManager mInstance;

    public static synchronized AopManager getInstance() {
        synchronized (AopManager.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AopManager) ipChange.ipc$dispatch("65d95380", new Object[0]);
            }
            if (mInstance == null) {
                mInstance = new AopManager();
            }
            return mInstance;
        }
    }

    public void setDelegate(AopBridge aopBridge) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fcff68a", new Object[]{this, aopBridge});
        }
    }
}
