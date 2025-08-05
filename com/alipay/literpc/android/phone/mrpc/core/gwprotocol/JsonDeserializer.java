package com.alipay.literpc.android.phone.mrpc.core.gwprotocol;

import com.alipay.literpc.android.phone.mrpc.core.RpcException;
import com.alipay.literpc.jsoncodec.JSONCodec;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class JsonDeserializer extends AbstractDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public JsonDeserializer(Type type, byte[] bArr) {
        super(type, bArr);
    }

    @Override // com.alipay.literpc.android.phone.mrpc.core.gwprotocol.Deserializer
    public Object parser() throws RpcException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("caac2ecc", new Object[]{this});
        }
        try {
            String str = new String(this.b);
            String str2 = "threadid = " + Thread.currentThread().getId() + "; rpc response:  " + str;
            JSONObject jSONObject = new JSONObject(str);
            int i = jSONObject.getInt("resultStatus");
            if (i != 1000) {
                throw new RpcException(Integer.valueOf(i), jSONObject.optString("tips"));
            }
            return this.f5303a == String.class ? jSONObject.optString("result") : JSONCodec.parseObject(jSONObject.optString("result"), this.f5303a);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("response  =");
            sb.append(new String(this.b));
            sb.append(":");
            sb.append(e);
            throw new RpcException((Integer) 10, sb.toString() == null ? "" : e.getMessage());
        }
    }
}
