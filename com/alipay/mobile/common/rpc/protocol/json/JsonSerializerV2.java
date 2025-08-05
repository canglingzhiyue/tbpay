package com.alipay.mobile.common.rpc.protocol.json;

import android.util.Base64;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public class JsonSerializerV2 extends JsonSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public JsonSerializerV2(int i, String str, Object obj) {
        super(i, str, obj);
    }

    @Override // com.alipay.mobile.common.rpc.protocol.json.JsonSerializer, com.alipay.mobile.common.rpc.protocol.Serializer
    public byte[] packet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        String requestDataJson = getRequestDataJson();
        try {
            byte[] bytes = requestDataJson.getBytes("UTF-8");
            LogCatUtil.printInfo("JsonSerializer", "bodyStr=" + requestDataJson);
            return bytes;
        } catch (Throwable th) {
            MonitorErrorLogHelper.log("JsonSerializer", th);
            StringBuilder sb = new StringBuilder();
            sb.append("response  =");
            sb.append(requestDataJson);
            sb.append(":");
            sb.append(th);
            throw new RpcException((Integer) 20, sb.toString() == null ? "" : th.getMessage());
        }
    }

    @Override // com.alipay.mobile.common.rpc.protocol.json.JsonSerializer
    public String getRequestDataDigest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("315012", new Object[]{this});
        }
        try {
            return new String(Base64.encode(MessageDigest.getInstance("MD5").digest(getRequestDataJson().getBytes()), 0));
        } catch (Exception e) {
            LogCatUtil.warn("JsonSerializer", e);
            return "";
        }
    }
}
