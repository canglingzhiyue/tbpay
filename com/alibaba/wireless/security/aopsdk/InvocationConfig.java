package com.alibaba.wireless.security.aopsdk;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class InvocationConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Object matchedRule;
    public int matchedStrategyId;
    public Object newReturnValue;
    public Throwable newThrowable;
    public boolean shouldBlock;
    public boolean shouldCacheResult;
    public boolean shouldCallback;
    public boolean shouldCatch;
    public boolean shouldChangeReturnValue;
    public boolean shouldIntercept;

    public int getRuleId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ae389a27", new Object[]{this})).intValue();
        }
        return 0;
    }
}
