package com.taobao.android.cachecleaner.autoclear.biz.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import tb.kge;

/* loaded from: classes4.dex */
public class PageList implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    @JSONField(name = "subUrl")
    public String subUrl;
    @JSONField(name = "uris")
    public List<String> uris;

    static {
        kge.a(1081416221);
        kge.a(1028243835);
    }

    public boolean isMarch(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("829c5458", new Object[]{this, str, str2})).booleanValue();
        }
        List<String> list = this.uris;
        if (list == null || list.isEmpty() || !this.uris.contains(str)) {
            return false;
        }
        String str3 = this.subUrl;
        return str3 == null || str3.isEmpty() || (str2 != null && str2.contains(this.subUrl));
    }
}
