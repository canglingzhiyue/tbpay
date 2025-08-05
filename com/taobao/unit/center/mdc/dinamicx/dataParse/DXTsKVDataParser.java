package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.expr_v2.f;
import tb.fut;
import tb.fuw;
import tb.kge;

/* loaded from: classes9.dex */
public class DXTsKVDataParser implements fut {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_TSKV = 38193563468L;

    static {
        kge.a(-474205170);
        kge.a(1343895002);
    }

    @Override // tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        JSONObject jSONObject = new JSONObject();
        if (objArr == null || objArr.length == 0 || objArr.length % 2 != 0) {
            fuw.d("DXTsKVDataParser", "operationList 键值对数量不符合规范");
            return null;
        }
        for (int i = 0; i < objArr.length; i += 2) {
            int i2 = i + 1;
            jSONObject.put(objArr[i] instanceof f ? ((f) objArr[i]).D().toString() : objArr[i].toString(), objArr[i2] instanceof f ? ((f) objArr[i2]).D() : objArr[i2]);
        }
        return jSONObject;
    }
}
