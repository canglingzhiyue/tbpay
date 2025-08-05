package com.alipay.vi.android.phone.mrpc.core.gwprotocol;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.vi.mobile.common.rpc.RpcException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class JsonDeserializer extends AbstractDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public JsonDeserializer(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.vi.android.phone.mrpc.core.gwprotocol.Deserializer
    public Object parser() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("caac2ecc", new Object[]{this});
        }
        try {
            JSONObject parseObject = JSON.parseObject(new String(this.mData));
            int intValue = parseObject.getIntValue("resultStatus");
            String string = parseObject.getString("tips");
            if (intValue == 1000) {
                return this.mType == String.class ? parseObject.getString("result") : JSON.parseObject(parseObject.getString("result"), this.mType, new Feature[0]);
            }
            RpcException rpcException = new RpcException(Integer.valueOf(intValue), string);
            if (intValue == 1002 && (jSONObject = parseObject.getJSONObject(Constants.KEY_CONTROL)) != null) {
                rpcException.setControl(jSONObject.toJSONString());
            }
            throw rpcException;
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder("response  =");
            sb.append(new String(this.mData));
            sb.append(":");
            sb.append(e);
            throw new RpcException((Integer) 10, sb.toString() == null ? "" : e.getMessage());
        }
    }
}
