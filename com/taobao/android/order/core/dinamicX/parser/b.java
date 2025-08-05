package com.taobao.android.order.core.dinamicX.parser;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import tb.fuf;
import tb.kge;

/* loaded from: classes6.dex */
public class b extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_GETINDEXBYID = -6566810280767110228L;

    static {
        kge.a(2033281361);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length <= 2) {
            return -1;
        }
        String valueOf = String.valueOf(objArr[0]);
        String valueOf2 = String.valueOf(objArr[1]);
        if (!(objArr[2] instanceof JSONArray)) {
            return -1;
        }
        JSONArray jSONArray = (JSONArray) objArr[2];
        if (TextUtils.isEmpty(valueOf) || TextUtils.isEmpty(valueOf2)) {
            return -1;
        }
        for (int i = 0; i < jSONArray.size(); i++) {
            Object obj = jSONArray.get(i);
            if ((obj instanceof JSONObject) && valueOf2.equals(((JSONObject) obj).get(valueOf))) {
                return Integer.valueOf(i);
            }
        }
        return -1;
    }
}
