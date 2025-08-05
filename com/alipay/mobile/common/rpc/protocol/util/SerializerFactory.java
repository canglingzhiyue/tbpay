package com.alipay.mobile.common.rpc.protocol.util;

import android.text.TextUtils;
import com.alipay.mobile.common.rpc.Config;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.RpcFactory;
import com.alipay.mobile.common.rpc.protocol.Deserializer;
import com.alipay.mobile.common.rpc.protocol.Serializer;
import com.alipay.mobile.common.rpc.protocol.json.JsonDeserializer;
import com.alipay.mobile.common.rpc.protocol.json.JsonDeserializerV2;
import com.alipay.mobile.common.rpc.protocol.json.JsonSerializer;
import com.alipay.mobile.common.rpc.protocol.json.JsonSerializerV2;
import com.alipay.mobile.common.rpc.protocol.json.SignJsonSerializer;
import com.alipay.mobile.common.rpc.protocol.json.SimpleRpcJsonSerializer;
import com.alipay.mobile.common.rpc.protocol.json.SimpleRpcJsonSerializerV2;
import com.alipay.mobile.common.rpc.protocol.protobuf.PBDeserializer;
import com.alipay.mobile.common.rpc.protocol.protobuf.PBSerializer;
import com.alipay.mobile.common.rpc.protocol.protobuf.SimpleRpcPBDeserializer;
import com.alipay.mobile.common.rpc.protocol.protobuf.SimpleRpcPBSerializer;
import com.alipay.mobile.common.rpc.transport.InnerRpcInvokeContext;
import com.alipay.mobile.common.rpc.util.RpcInvokerUtil;
import com.alipay.mobile.common.transport.Response;
import com.alipay.mobile.common.transport.TransportStrategy;
import com.alipay.mobile.common.transport.ext.ProtobufCodec;
import com.alipay.mobile.common.transport.ext.ProtobufCodecFactory;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.framework.service.annotation.OperationType;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes3.dex */
public class SerializerFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private RpcFactory f5510a;

    public SerializerFactory(RpcFactory rpcFactory) {
        this.f5510a = rpcFactory;
    }

    private boolean a(Object[] objArr, Method method, InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("247f9a7a", new Object[]{this, objArr, method, innerRpcInvokeContext})).booleanValue();
        }
        if (innerRpcInvokeContext.isRpcV2) {
            return true;
        }
        if (innerRpcInvokeContext.isGetMethod) {
            return false;
        }
        String rpcVersion = RpcInvokerUtil.getRpcVersion();
        if (TextUtils.equals(rpcVersion, RpcInvokerUtil.RPC_V2)) {
            return true;
        }
        if (TextUtils.equals(rpcVersion, RpcInvokerUtil.RPC_V1) || !a(innerRpcInvokeContext)) {
            return false;
        }
        if (!a(objArr, method)) {
            return TransportStrategy.isEnabledRpcV2();
        }
        return true;
    }

    private boolean a(InnerRpcInvokeContext innerRpcInvokeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21c99cf1", new Object[]{this, innerRpcInvokeContext})).booleanValue();
        }
        try {
            if (TransportStrategy.isAlipayUrl(innerRpcInvokeContext.gwUrl)) {
                LogCatUtil.info("SerializerFactory", "isSupportRpcV2ForEnv is true");
                return true;
            }
            LogCatUtil.info("SerializerFactory", "isSupportRpcV2ForEnv is false");
            return false;
        } catch (MalformedURLException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Illegal url config, url: ");
            sb.append(innerRpcInvokeContext != null ? innerRpcInvokeContext.gwUrl : "");
            throw new RpcException((Integer) 3002, sb.toString());
        }
    }

    public Serializer getSerializer(int i, String str, Method method, Object[] objArr, String str2, InnerRpcInvokeContext innerRpcInvokeContext, RPCProtoDesc rPCProtoDesc) {
        JsonSerializer jsonSerializer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Serializer) ipChange.ipc$dispatch("5ca4adef", new Object[]{this, new Integer(i), str, method, objArr, str2, innerRpcInvokeContext, rPCProtoDesc});
        }
        if (a(objArr, method, innerRpcInvokeContext)) {
            if (a(objArr, method)) {
                rPCProtoDesc.protoType = (byte) 3;
                return new PBSerializer(i, str, objArr);
            } else if (RpcInvokerUtil.isSimpleRpcAnnotation(((OperationType) method.getAnnotation(OperationType.class)).value())) {
                rPCProtoDesc.protoType = (byte) 2;
                return new SimpleRpcJsonSerializerV2(i, str, objArr);
            } else if (RpcInvokerUtil.isSimpleRpcBytesAnnotation(((OperationType) method.getAnnotation(OperationType.class)).value())) {
                rPCProtoDesc.protoType = (byte) 4;
                return new SimpleRpcPBSerializer(i, str, objArr);
            } else {
                rPCProtoDesc.protoType = (byte) 2;
                return new JsonSerializerV2(i, str, objArr);
            }
        }
        if (RpcInvokerUtil.isSimpleRpcAnnotation(((OperationType) method.getAnnotation(OperationType.class)).value())) {
            jsonSerializer = new SimpleRpcJsonSerializer(i, str, objArr);
            rPCProtoDesc.protoType = (byte) 1;
        } else if (RpcInvokerUtil.isSimpleRpcBytesAnnotation(((OperationType) method.getAnnotation(OperationType.class)).value())) {
            throw new IllegalArgumentException("alipay.client.executerpc.bytes can't use in RpcV1");
        } else {
            jsonSerializer = new JsonSerializer(i, str, objArr);
            jsonSerializer.setScene(str2);
            rPCProtoDesc.protoType = (byte) 0;
        }
        return new SignJsonSerializer(jsonSerializer, this.f5510a.getContext(), innerRpcInvokeContext.appKey, isReq2Online(), innerRpcInvokeContext);
    }

    public boolean isReq2Online() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e0e7f9c", new Object[]{this})).booleanValue();
        }
        Config config = this.f5510a.getConfig();
        if (TextUtils.isEmpty(config.getUrl())) {
            LogCatUtil.warn("rpc", "handler.getConfig().getUrl() is null");
            return false;
        }
        try {
            return new URL(config.getUrl()).getHost().lastIndexOf("alipay.com") != -1;
        } catch (MalformedURLException e) {
            LogCatUtil.warn("rpc", e);
            return false;
        }
    }

    public Deserializer getDeserializer(Type type, Response response, RPCProtoDesc rPCProtoDesc) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Deserializer) ipChange.ipc$dispatch("48a6ae01", new Object[]{this, type, response, rPCProtoDesc});
        }
        if (rPCProtoDesc.isJsonV2()) {
            return new JsonDeserializerV2(type, response);
        }
        if (rPCProtoDesc.isPBV1()) {
            return new PBDeserializer(type, response);
        }
        if (rPCProtoDesc.isSimplePBV1()) {
            return new SimpleRpcPBDeserializer(type, response);
        }
        return new JsonDeserializer(type, response.getResData());
    }

    private boolean a(Object[] objArr, Method method) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e6b7f3b5", new Object[]{this, objArr, method})).booleanValue();
        }
        try {
            ProtobufCodec defaultProtobufCodec = ProtobufCodecFactory.getDefaultProtobufCodec();
            if (defaultProtobufCodec == null) {
                return false;
            }
            if (objArr != null && objArr.length == 1 && defaultProtobufCodec.isPBBean(objArr[0])) {
                return true;
            }
            return defaultProtobufCodec.isPBBean((Class) method.getReturnType());
        } catch (Exception e) {
            LogCatUtil.error("SerializerFactory", e);
            return false;
        }
    }

    public String getContentType(RPCProtoDesc rPCProtoDesc) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("12df8f25", new Object[]{this, rPCProtoDesc}) : rPCProtoDesc.isJsonV2() ? "application/json" : rPCProtoDesc.isPBV1() ? HeaderConstant.HEADER_VALUE_PB_TYPE : HeaderConstant.HEADER_VALUE_OLD_TYPE;
    }
}
