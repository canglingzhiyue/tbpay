package com.taobao.android.dinamicx.model;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public class DXJSONObjectForVM extends JSONObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY = "DX_USER_DEFINED_DATA";

    static {
        kge.a(362563980);
    }

    public void setData(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4f836cf", new Object[]{this, obj});
        } else {
            put(KEY, obj);
        }
    }

    public Object getData() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ipChange.ipc$dispatch("4ca84d6b", new Object[]{this}) : get(KEY);
    }
}
