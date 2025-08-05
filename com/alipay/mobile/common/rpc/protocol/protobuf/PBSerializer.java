package com.alipay.mobile.common.rpc.protocol.protobuf;

import android.util.Base64;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.common.rpc.protocol.AbstractSerializer;
import com.alipay.mobile.common.transport.ext.ProtobufCodec;
import com.alipay.mobile.common.transport.ext.ProtobufCodecFactory;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.alipay.mobile.common.transport.utils.MonitorErrorLogHelper;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.security.MessageDigest;

/* loaded from: classes3.dex */
public class PBSerializer extends AbstractSerializer {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte VERSION = 2;

    /* renamed from: a  reason: collision with root package name */
    private int f5508a;
    private byte[] b;

    public static /* synthetic */ Object ipc$super(PBSerializer pBSerializer, String str, Object... objArr) {
        str.hashCode();
        throw new InstantReloadException(String.format("String switch could not find '%s'", str));
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public void setExtParam(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e618391", new Object[]{this, obj});
        }
    }

    public PBSerializer(int i, String str, Object obj) {
        super(str, obj);
        this.f5508a = i;
    }

    @Override // com.alipay.mobile.common.rpc.protocol.Serializer
    public byte[] packet() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (byte[]) ipChange.ipc$dispatch("1cd955ae", new Object[]{this}) : a();
    }

    private byte[] a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("a8212175", new Object[]{this});
        }
        try {
            if (this.b != null) {
                return this.b;
            }
            synchronized (this) {
                if (this.b != null) {
                    return this.b;
                } else if (this.mParams == null) {
                    LogCatUtil.warn("PBSerializer", "mParams is null.");
                    this.b = new byte[0];
                    return this.b;
                } else if (!(this.mParams instanceof Object[])) {
                    LogCatUtil.warn("PBSerializer", "mParams not instanceof Object[].");
                    this.b = new byte[0];
                    return this.b;
                } else {
                    Object[] objArr = (Object[]) this.mParams;
                    if (objArr.length <= 0) {
                        LogCatUtil.warn("PBSerializer", "Protobuf mParams length=0");
                        this.b = new byte[0];
                        return this.b;
                    } else if (objArr.length != 1) {
                        LogCatUtil.warn("PBSerializer", "Protobuf mParams noly support one inParameter, params.length=" + objArr.length);
                        return null;
                    } else {
                        ProtobufCodec defaultProtobufCodec = ProtobufCodecFactory.getDefaultProtobufCodec();
                        if (!defaultProtobufCodec.isPBBean(objArr[0])) {
                            LogCatUtil.warn("PBSerializer", "mParams not protobuf bean!");
                            this.b = new byte[0];
                            return this.b;
                        }
                        this.b = defaultProtobufCodec.serialize(objArr[0]);
                        try {
                            LogCatUtil.info("PBSerializer", "PB Data size=" + this.b.length + ". PB Data=" + this.b.toString() + ".PB Object String = " + defaultProtobufCodec.toString(objArr[0]));
                        } catch (Throwable unused) {
                        }
                        return this.b;
                    }
                }
            }
        } catch (Throwable th) {
            MonitorErrorLogHelper.log("PBSerializer", th);
            throw new RpcException((Integer) 20, th);
        }
    }

    public int getId() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("1ddaaf0b", new Object[]{this})).intValue() : this.f5508a;
    }

    public void setId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ecf45f", new Object[]{this, new Integer(i)});
        } else {
            this.f5508a = i;
        }
    }

    public String getRequestDataDigest() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("315012", new Object[]{this});
        }
        try {
            return new String(Base64.encode(MessageDigest.getInstance("MD5").digest(packet()), 0));
        } catch (Exception e) {
            LogCatUtil.warn("PBSerializer", e);
            return "";
        }
    }
}
