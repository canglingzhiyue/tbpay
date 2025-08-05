package com.taobao.detail.domain.template.android;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.HashMap;
import tb.kge;

/* loaded from: classes7.dex */
public class BaseDataVO implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String ID;
    public String condition;
    public String key;
    public HashMap<String, String> params;
    public String type;

    static {
        kge.a(2125126761);
        kge.a(1028243835);
    }

    public String getParams(String str) {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c0721e33", new Object[]{this, str});
        }
        if (str != null && str.length() > 0 && (hashMap = this.params) != null && hashMap.containsKey(str)) {
            return this.params.get(str);
        }
        return null;
    }
}
