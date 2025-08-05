package com.taobao.android.order.core.dinamicX.parser;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import mtopsdk.network.impl.ResponseProtocolType;
import tb.fuf;
import tb.hzq;
import tb.hzy;
import tb.iaa;
import tb.kge;

/* loaded from: classes6.dex */
public class r extends fuf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long DX_PARSER_ID = 8239620625987298144L;
    public static final String PARSER_TAG = "tdStepLabelsAppendInValues";

    static {
        kge.a(-486158526);
    }

    public static /* synthetic */ Object ipc$super(r rVar, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // tb.fuf, tb.fut
    public Object evalWithArgs(Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ccd8bd96", new Object[]{this, objArr, dXRuntimeContext});
        }
        hzy.a("TDStepLabelsAppendInVal", "evalWithArgs", "----");
        try {
            return a(objArr, dXRuntimeContext);
        } catch (Exception unused) {
            iaa.a(dXRuntimeContext.m(), "TDStepLabelsAppendInVal", PARSER_TAG, "解析异常", null);
            return null;
        }
    }

    private Object a(Object[] objArr, DXRuntimeContext dXRuntimeContext) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("ebd01cf8", new Object[]{this, objArr, dXRuntimeContext});
        }
        String a2 = hzq.a(objArr, 1, new Class[]{JSONArray.class});
        if (!TextUtils.isEmpty(a2)) {
            throw new RuntimeException(a2);
        }
        JSONArray jSONArray = (JSONArray) objArr[0];
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < jSONArray.size(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject != null && !TextUtils.isEmpty(jSONObject.getString("value"))) {
                if (!TextUtils.isEmpty(jSONObject.getString("name"))) {
                    sb.append(jSONObject.getString("name"));
                    sb.append(ResponseProtocolType.COMMENT);
                }
                sb.append(jSONObject.getString("value"));
                sb.append("\n");
            }
        }
        return sb.toString().trim();
    }
}
