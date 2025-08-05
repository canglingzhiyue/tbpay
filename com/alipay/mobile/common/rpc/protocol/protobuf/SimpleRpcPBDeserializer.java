package com.alipay.mobile.common.rpc.protocol.protobuf;

import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MiscUtils;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class SimpleRpcPBDeserializer extends PBDeserializer {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SimpleRpcPBDeserializer(Type type, Response response) {
        super(type, response);
    }

    @Override // com.alipay.mobile.common.rpc.protocol.protobuf.PBDeserializer, com.alipay.mobile.common.rpc.protocol.Deserializer
    public Object parser() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("caac2ecc", new Object[]{this});
        }
        try {
            LogCatUtil.debug("SimpleRpc", "====SimpleRpcPBDeserializer====parser");
            RpcInvokerUtil.preProcessResponse(this.response);
            if (this.mType != Void.TYPE) {
                return this.mData;
            }
            return null;
        } catch (Throwable th) {
            if (th instanceof RpcException) {
                throw ((RpcException) th);
            }
            MonitorErrorLogHelper.log("SimpleRpcPBDeserializer", MiscUtils.getRootCause(th));
            throw new RpcException((Integer) 10, th);
        }
    }
}
