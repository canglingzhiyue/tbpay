package com.alipay.mobile.verifyidentity.module.password.pay.model;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class VerifyRequestModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bioPayUsableStrategy;
    public String encryptPwd;
    public String from;
    public String interruptGap;
    public String isSimplePPW;
    public String mngRequest;
    public Boolean needOpenBioPay;
    public String needOtherVerifyPay;
    public Map<String, Object> predata;
    public String pwdResume;

    public void setIsSimplePPW(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a5d82aa", new Object[]{this, str, new Boolean(z)});
        } else {
            this.isSimplePPW = String.valueOf(z);
        }
    }

    public void setInterruptGap(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6098dd48", new Object[]{this, new Long(j)});
        } else {
            this.interruptGap = String.valueOf(SystemClock.elapsedRealtime() - j);
        }
    }
}
