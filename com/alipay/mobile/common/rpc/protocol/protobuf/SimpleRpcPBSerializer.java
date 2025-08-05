package com.alipay.mobile.common.rpc.protocol.protobuf;

import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class SimpleRpcPBSerializer extends PBSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SimpleRpcPBSerializer";

    /* renamed from: a  reason: collision with root package name */
    private byte[] f5509a;

    public SimpleRpcPBSerializer(int i, String str, Object obj) {
        super(i, str, obj);
    }

    @Override // com.alipay.mobile.common.rpc.protocol.protobuf.PBSerializer, com.alipay.mobile.common.rpc.protocol.Serializer
    public byte[] packet() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this});
        }
        try {
            LogCatUtil.debug("SimpleRpc", "====SimpleRpcPBSerializer====packet");
            if (this.f5509a != null) {
                return this.f5509a;
            }
            synchronized (this) {
                if (this.f5509a != null) {
                    return this.f5509a;
                } else if (this.mParams == null) {
                    LogCatUtil.warn(TAG, "mParams is null.");
                    this.f5509a = new byte[0];
                    return this.f5509a;
                } else if (!(this.mParams instanceof Object[])) {
                    LogCatUtil.warn(TAG, "mParams not instanceof Object[].");
                    this.f5509a = new byte[0];
                    return this.f5509a;
                } else {
                    Object[] objArr = (Object[]) this.mParams;
                    if (objArr.length <= 0) {
                        LogCatUtil.warn(TAG, "Protobuf mParams length=0");
                        this.f5509a = new byte[0];
                        return this.f5509a;
                    } else if (objArr.length != 3) {
                        LogCatUtil.warn(TAG, "SimpleRpcService should be 3 params, params.length=" + objArr.length);
                        return null;
                    } else {
                        this.f5509a = (byte[]) objArr[1];
                        try {
                            LogCatUtil.debug(TAG, "PB Data size=" + this.f5509a.length + ",PB Data=" + this.f5509a.toString());
                        } catch (Exception unused) {
                        }
                        return this.f5509a;
                    }
                }
            }
        } catch (Throwable th) {
            MonitorErrorLogHelper.log(TAG, th);
            throw new RpcException((Integer) 20, th);
        }
    }
}
