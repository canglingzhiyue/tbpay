package com.alipay.mobile.security.zim.api;

import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class ZIMResponse {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String bizData;
    public int code;
    public Map<String, String> extInfo = new HashMap();
    public String msg;
    public String reason;
    public String singleTag;
    public String subCode;

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ZIMResponse{code=");
        sb.append(this.code);
        sb.append(", subCode=");
        sb.append(this.subCode);
        sb.append(", msg=");
        sb.append(this.msg);
        sb.append(", reason='");
        sb.append(this.reason);
        sb.append('\'');
        sb.append(", bizData='");
        sb.append(this.bizData);
        sb.append('\'');
        sb.append(", singleTag='");
        sb.append(this.singleTag);
        sb.append('\'');
        sb.append(", extInfo.keySet()=");
        Map<String, String> map = this.extInfo;
        sb.append(map == null ? "null" : StringUtil.collection2String(map.keySet()));
        sb.append('}');
        return sb.toString();
    }
}
