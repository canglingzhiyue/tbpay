package com.alipay.android.msp.network.decorator;

import android.os.Build;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.android.msp.framework.db.MspDBHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class DynamicHostEnvelopDecorator extends BaseDecorator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    public byte[] todo(byte[] bArr, String str) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("2d80787f", new Object[]{this, bArr, str});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, (Object) Build.MODEL);
        jSONObject2.put("namespace", (Object) this.c.getNamespace());
        jSONObject2.put("api_name", (Object) this.c.getApiName());
        jSONObject2.put("api_version", (Object) this.c.getApiVersion());
        jSONObject2.put("params", (Object) JSON.parseObject(new String(bArr)));
        jSONObject.put("data", (Object) jSONObject2);
        String jSONObject3 = jSONObject.toString();
        if (!TextUtils.isEmpty(this.c.getRequestKey())) {
            jSONObject3 = this.c.getRequestKey() + "=" + jSONObject3;
        }
        byte[] bytes = jSONObject3.getBytes();
        if (this.b == null) {
            return bytes;
        }
        this.b.setRequestConfig(this.c);
        return this.b.todo(bytes, str);
    }

    @Override // com.alipay.android.msp.network.decorator.BaseDecorator
    /* renamed from: undo */
    public Object mo541undo(Object obj) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("3e30bf8b", new Object[]{this, obj});
        }
        JSONObject jSONObject = (JSONObject) obj;
        try {
            LogUtil.record(2, "DynamicHostEnvelopDecorator.undo", jSONObject.toJSONString());
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("data").getJSONObject("params");
        if (jSONObject2.containsKey(MspGlobalDefine.SESSION)) {
            this.c.setSessionId(jSONObject2.getString(MspGlobalDefine.SESSION));
        }
        if (this.b != null) {
            this.b.setRequestConfig(this.c);
            return this.b.mo541undo(jSONObject2);
        }
        return jSONObject2.toString();
    }
}
