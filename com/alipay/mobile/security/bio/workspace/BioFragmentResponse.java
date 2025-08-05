package com.alipay.mobile.security.bio.workspace;

import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioFragmentResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public int errorCode = 500;
    public Map<String, String> ext = new HashMap();
    public boolean isSucess;
    public String resultMessage;
    public String subCode;
    public String subMsg;
    public int suggest;
    public String token;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BioFragmentResponse{errorCode=" + this.errorCode + ", subcode=" + this.subCode + ", submsg='" + this.subMsg + "', suggest=" + this.suggest + ", isSucess=" + this.isSucess + ", token='" + this.token + "', resultMessage='" + this.resultMessage + "', ext=" + StringUtil.collection2String(this.ext.keySet()) + '}';
    }
}
