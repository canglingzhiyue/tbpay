package com.taobao.message.lab.comfrm.support.dinamic;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.bj;
import com.taobao.message.lab.comfrm.util.BeanUtil;
import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;
import tb.kge;

/* loaded from: classes7.dex */
public class DXDataProxy extends bj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(1217465054);
    }

    @Override // com.taobao.android.dinamicx.bj
    public Object updateValueWithActions(Object obj, JSONArray jSONArray) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("4d4c2bd8", new Object[]{this, obj, jSONArray});
        }
        return null;
    }

    @Override // com.taobao.android.dinamicx.bj
    public Object getValue(Object obj, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("f669ebca", new Object[]{this, obj, str});
        }
        if (obj instanceof List) {
            try {
                return ((List) obj).get(Integer.parseInt(str));
            } catch (Exception unused) {
                return null;
            }
        } else if (obj instanceof Array) {
            try {
                return Array.get(obj, Integer.parseInt(str));
            } catch (Exception unused2) {
                return null;
            }
        } else if (obj instanceof Map) {
            try {
                return ((Map) obj).get(str);
            } catch (Exception unused3) {
                return null;
            }
        } else {
            return BeanUtil.getRaw(obj, str);
        }
    }
}
