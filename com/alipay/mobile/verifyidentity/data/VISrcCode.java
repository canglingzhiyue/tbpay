package com.alipay.mobile.verifyidentity.data;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class VISrcCode {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String PREFIX_0 = "A-0-";
    public static final String PREFIX_1 = "A-1-";

    public VerifyIdentityResult addEngineCode(VerifyIdentityResult verifyIdentityResult, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifyIdentityResult) ipChange.ipc$dispatch("e2ca3c15", new Object[]{this, verifyIdentityResult, str}) : a(verifyIdentityResult, PREFIX_0, str);
    }

    public VerifyIdentityResult addProdCode(VerifyIdentityResult verifyIdentityResult, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (VerifyIdentityResult) ipChange.ipc$dispatch("d9628b60", new Object[]{this, verifyIdentityResult, str}) : a(verifyIdentityResult, PREFIX_1, str);
    }

    public VerifyIdentityResult addProdCode(VerifyIdentityResult verifyIdentityResult, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityResult) ipChange.ipc$dispatch("721052d6", new Object[]{this, verifyIdentityResult, str, str2});
        }
        return a(verifyIdentityResult, "A-" + str + "-", str2);
    }

    private static VerifyIdentityResult a(VerifyIdentityResult verifyIdentityResult, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VerifyIdentityResult) ipChange.ipc$dispatch("743fa89a", new Object[]{verifyIdentityResult, str, str2});
        }
        if (verifyIdentityResult == null) {
            return null;
        }
        if (verifyIdentityResult.getExtInfo() == null) {
            verifyIdentityResult.setExtInfo(new HashMap<>());
        }
        HashMap<String, Object> extInfo = verifyIdentityResult.getExtInfo();
        extInfo.put(VerifyIdentityResult.SRC_CODE_KEY, str + str2);
        return verifyIdentityResult;
    }
}
