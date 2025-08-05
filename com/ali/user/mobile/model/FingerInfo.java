package com.ali.user.mobile.model;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.Comparator;
import tb.kge;

/* loaded from: classes2.dex */
public class FingerInfo implements Serializable, Comparator {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String key;
    public long loginTime;
    public String value;

    static {
        kge.a(-1501803611);
        kge.a(1028243835);
        kge.a(-2099169482);
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a9be197", new Object[]{this, obj, obj2})).intValue();
        }
        try {
            FingerInfo fingerInfo = (FingerInfo) obj;
            FingerInfo fingerInfo2 = (FingerInfo) obj2;
            if (fingerInfo.loginTime > fingerInfo2.loginTime) {
                return -1;
            }
            return fingerInfo.loginTime == fingerInfo2.loginTime ? 0 : 1;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }
}
