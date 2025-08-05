package com.alibaba.security.realidentity;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public abstract class RPEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public void onBiometricsFinish(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2bf3f44f", new Object[]{this, new Integer(i)});
        }
    }

    public void onBiometricsStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c8c970f", new Object[]{this});
        }
    }

    public void onFinish(RPResult rPResult, RPDetail rPDetail) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2f654c3", new Object[]{this, rPResult, rPDetail});
        } else {
            onFinish(rPResult, rPDetail.getCode(), rPDetail.getMsg());
        }
    }

    @Deprecated
    public void onFinish(RPResult rPResult, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str, str2});
        }
    }

    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
        }
    }
}
