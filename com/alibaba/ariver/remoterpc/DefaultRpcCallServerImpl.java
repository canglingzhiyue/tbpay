package com.alibaba.ariver.remoterpc;

import android.os.Parcel;
import android.util.Log;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remoterpc.IRpcCaller;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.protocol.util.RPCProtoDesc;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.transport.ext.ProtobufCodecImpl;
import com.alipay.mobile.framework.service.common.MpaasRpcService;
import com.taobao.media.MediaConstant;
import java.lang.reflect.Method;
import java.util.ArrayList;
import tb.kge;

/* loaded from: classes2.dex */
public class DefaultRpcCallServerImpl extends IRpcCaller.Stub {
    private static final String TAG = "AriverRpc:DefaultRpcCallServerImpl";
    private MpaasRpcService mRpcService;

    static {
        kge.a(825818264);
    }

    public DefaultRpcCallServerImpl(MpaasRpcService mpaasRpcService) {
        this.mRpcService = mpaasRpcService;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f7  */
    @Override // com.alibaba.ariver.remoterpc.IRpcCaller
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.alibaba.ariver.remoterpc.RpcCallRet call(com.alibaba.ariver.remoterpc.RpcCallArgs r12) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.remoterpc.DefaultRpcCallServerImpl.call(com.alibaba.ariver.remoterpc.RpcCallArgs):com.alibaba.ariver.remoterpc.RpcCallRet");
    }

    Object[] unpacketArgs(Class cls, Method method, byte[] bArr, RPCProtoDesc rPCProtoDesc) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (rPCProtoDesc.isJsonV2() || rPCProtoDesc.isJsonV1() || rPCProtoDesc.isSimpleJsonV1() || rPCProtoDesc.isSimplePBV1()) {
            JSONArray parseArray = JSON.parseArray(EncodingUtils.getString(bArr, "UTF-8"));
            if (parseArray.size() != parameterTypes.length) {
                RVLogger.debug(TAG, "jsonArray.size() != types.length");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < parseArray.size(); i++) {
                arrayList.add(parseArray.getObject(i, parameterTypes[i]));
            }
            return arrayList.toArray();
        } else if (parameterTypes == null || parameterTypes.length <= 0 || bArr == null || !rPCProtoDesc.isPBV1()) {
            return null;
        } else {
            return new Object[]{new ProtobufCodecImpl().deserialize(parameterTypes[0], bArr)};
        }
    }

    RpcCallRet packetRet(Class cls, Method method, Object obj, RPCProtoDesc rPCProtoDesc, InnerRpcInvokeContext innerRpcInvokeContext) {
        RpcCallRet rpcCallRet = new RpcCallRet();
        rpcCallRet.isException = false;
        if (rPCProtoDesc.isJsonV2() || rPCProtoDesc.isJsonV1() || rPCProtoDesc.isSimpleJsonV1()) {
            try {
                rpcCallRet.data = (obj == null ? MediaConstant.DEFALUT_H265_HW_BLACK_LIST_FOR_DEGRADE_H264 : JSON.toJSONString(obj, SerializerFeature.DisableCircularReferenceDetect)).getBytes("UTF-8");
            } catch (Exception e) {
                RVLogger.d(TAG, "packetRet error " + Log.getStackTraceString(e));
            }
        } else if (rPCProtoDesc.isPBV1() || rPCProtoDesc.isSimplePBV1()) {
            rpcCallRet.data = new ProtobufCodecImpl().serialize(obj);
        }
        rpcCallRet.invokeContext = new RemoteRpcInvokeContext(innerRpcInvokeContext);
        return rpcCallRet;
    }

    RpcCallRet packetException(RpcException rpcException) {
        RemoteRpcException remoteRpcException = new RemoteRpcException(rpcException);
        RpcCallRet rpcCallRet = new RpcCallRet();
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.writeValue(remoteRpcException);
                rpcCallRet.data = obtain.marshall();
            } catch (Exception e) {
                RVLogger.e(TAG, "packetException error " + Log.getStackTraceString(e));
            }
            rpcCallRet.isException = true;
            return rpcCallRet;
        } finally {
            obtain.recycle();
        }
    }
}
