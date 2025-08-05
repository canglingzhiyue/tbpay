package com.taobao.android.dinamicx;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes5.dex */
public abstract class bj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-615339494);
    }

    public abstract Object getValue(Object obj, String str);

    public boolean setValue(Object obj, String str, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8de60fbc", new Object[]{this, obj, str, obj2})).booleanValue();
        }
        return false;
    }

    public abstract Object updateValueWithActions(Object obj, JSONArray jSONArray);
}
