package com.taobao.unit.center.mdc.dinamicx.dataParse;

import com.alibaba.fastjson.JSONArray;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import java.util.ArrayList;
import java.util.List;
import tb.fuf;
import tb.fuw;
import tb.kge;

/* loaded from: classes9.dex */
public class DXDataParserMpCopyList extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_MPCOPYLIST = 7449801160192418078L;

    static {
        kge.a(988306778);
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        if (objArr == null || objArr.length != 1) {
            fuw.d("DXDataSourceCopy", "args 长度不符合规范");
            return null;
        } else if (objArr[0] instanceof JSONArray) {
            JSONArray jSONArray = new JSONArray();
            jSONArray.addAll((JSONArray) objArr[0]);
            return jSONArray;
        } else if (objArr[0] instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) objArr[0]);
            return arrayList;
        } else {
            if (objArr[0] != null) {
                fuw.d("DXDataSourceCopy", "无法处理的类型" + objArr[0].getClass().toString());
            }
            return null;
        }
    }
}
