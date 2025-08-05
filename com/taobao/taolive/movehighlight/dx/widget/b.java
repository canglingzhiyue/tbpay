package com.taobao.taolive.movehighlight.dx.widget;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.HashMap;
import tb.fuf;
import tb.kge;

/* loaded from: classes8.dex */
public class b extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_HIGHLIGHTSTRTOMAP = 8990062587502094563L;

    static {
        kge.a(1651026519);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < objArr.length; i++) {
            if (objArr[i] != null && !TextUtils.isEmpty(String.valueOf(objArr[i]))) {
                String[] split = String.valueOf(objArr[i]).split(":");
                if (split.length == 2) {
                    hashMap.put(split[0], split[1]);
                }
            }
        }
        return JSON.toJSONString(hashMap);
    }
}
