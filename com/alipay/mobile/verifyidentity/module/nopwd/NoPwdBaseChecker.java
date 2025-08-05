package com.alipay.mobile.verifyidentity.module.nopwd;

import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import com.alipay.mobile.verifyidentity.module.fingerprint.FingerprintCheckActivity;
import com.alipay.mobile.verifyidentity.module.utils.DataHelper;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class NoPwdBaseChecker {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public FingerprintCheckActivity hostActivity;
    public DataHelper mDataHelper;
    public Handler mainHandler = new Handler(Looper.getMainLooper());
    public String type;

    public NoPwdBaseChecker(FingerprintCheckActivity fingerprintCheckActivity, DataHelper dataHelper) {
        this.mDataHelper = null;
        this.hostActivity = fingerprintCheckActivity;
        this.mDataHelper = dataHelper;
        this.type = dataHelper.predata_type;
    }

    public Resources getResources() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (Resources) ipChange.ipc$dispatch("36fe0307", new Object[]{this}) : this.hostActivity.getResources();
    }

    public String getString(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)}) : this.hostActivity.getString(i);
    }

    public void goToPwd(String str, AuthenticatorResponse authenticatorResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("568442bc", new Object[]{this, str, authenticatorResponse});
        } else {
            this.hostActivity.goToPwd(this.type, str, authenticatorResponse);
        }
    }

    public void goToPwd(String str, Object obj, String str2, int i, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d0437c", new Object[]{this, str, obj, str2, new Integer(i), str3});
        } else {
            this.hostActivity.goToPwd(this.type, str, obj, str2, i, str3);
        }
    }

    public void updateVerifyStatus(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a90588c5", new Object[]{this, str});
        } else {
            this.hostActivity.updateVerifyStatus(str);
        }
    }

    public void updateVerifyStatusWithScene(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da698ad", new Object[]{this, str, str2});
        } else {
            this.hostActivity.updateStatuesWithSecne(str, str2);
        }
    }

    public void checkByServer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7dbef29", new Object[]{this});
        } else {
            this.hostActivity.checkByServer();
        }
    }

    public String getVerifyId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b8b1b04f", new Object[]{this});
        }
        DataHelper dataHelper = this.mDataHelper;
        return (dataHelper == null || dataHelper.mModule == null) ? "" : this.mDataHelper.mModule.getVerifyId();
    }
}
