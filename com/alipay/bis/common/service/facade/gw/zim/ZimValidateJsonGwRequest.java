package com.alipay.bis.common.service.facade.gw.zim;

import com.alipay.mobile.security.bio.utils.StringUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import tb.riy;

/* loaded from: classes3.dex */
public class ZimValidateJsonGwRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Map<String, String> bizData;
    public String zimData;
    public String zimId;

    public String toString() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ZimValidateJsonGwRequest{zimId='");
        sb.append(this.zimId);
        sb.append("', data='");
        if (this.zimData == null) {
            str = "null";
        } else {
            str = "[length=" + this.zimData.length() + riy.ARRAY_END_STR;
        }
        sb.append(str);
        sb.append("', bizData='");
        sb.append(StringUtil.map2String(this.bizData));
        sb.append("'");
        sb.append('}');
        return sb.toString();
    }
}
