package com.ali.user.open.ucc.biz;

import java.util.HashMap;
import java.util.Map;
import tb.kge;

/* loaded from: classes2.dex */
public class UccBizContants {
    public static Map<String, Long> mBusyControlMap = null;
    public static final long mBusyControlThreshold = 500;
    public static Map<String, Integer> mTrustLoginErrorTime;

    static {
        kge.a(334971282);
        mTrustLoginErrorTime = new HashMap();
        mBusyControlMap = new HashMap();
    }
}
