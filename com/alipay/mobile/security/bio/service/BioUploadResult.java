package com.alipay.mobile.security.bio.service;

import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* loaded from: classes3.dex */
public class BioUploadResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> extParams;
    public String nextProtocol;
    public int validationRetCode;
    public int productRetCode = 3001;
    public String subCode = "";
    public String subMsg = "";
    public boolean hasNext = false;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("BioUploadResult{productRetCode=");
        sb.append(this.productRetCode);
        sb.append(", validationRetCode=");
        sb.append(this.validationRetCode);
        sb.append(", hasNext=");
        sb.append(this.hasNext);
        sb.append(", subCode=");
        sb.append(this.subCode);
        sb.append(", subMsg=");
        sb.append(this.subMsg);
        sb.append(", nextProtocol='");
        sb.append(this.nextProtocol);
        sb.append('\'');
        sb.append(", extParams=");
        Map<String, String> map = this.extParams;
        sb.append(map == null ? "null" : StringUtil.collection2String(map.keySet()));
        sb.append('}');
        return sb.toString();
    }
}
