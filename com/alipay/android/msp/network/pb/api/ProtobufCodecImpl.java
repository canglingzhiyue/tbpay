package com.alipay.android.msp.network.pb.api;

import com.alipay.android.msp.framework.wire.Message;
import com.alipay.android.msp.framework.wire.Wire;
import com.alipay.android.msp.plugin.IProtobufCodec;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import tb.riy;

/* loaded from: classes3.dex */
public class ProtobufCodecImpl implements IProtobufCodec {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ProtobufCodec";

    @Override // com.alipay.android.msp.plugin.IProtobufCodec
    public String toString(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3cf5fa71", new Object[]{this, obj}) : "";
    }

    @Override // com.alipay.android.msp.plugin.IProtobufCodec
    public Object deserialize(Type type, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d52caa36", new Object[]{this, type, bArr});
        }
        if (!(type instanceof Class)) {
            throw new RuntimeException("type is not Class Type.");
        }
        try {
            return new Wire(new Class[0]).parseFrom(bArr, (Class) type);
        } catch (Throwable th) {
            LogUtil.record(8, TAG, "deserialize", th.getMessage());
            throw new RuntimeException(th);
        }
    }

    @Override // com.alipay.android.msp.plugin.IProtobufCodec
    public byte[] serialize(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e93ef1ba", new Object[]{this, obj});
        }
        if (!(obj instanceof Message)) {
            return null;
        }
        return ((Message) obj).toByteArray();
    }

    @Override // com.alipay.android.msp.plugin.IProtobufCodec
    public boolean isPBBean(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66457613", new Object[]{this, obj})).booleanValue() : obj instanceof Message;
    }

    @Override // com.alipay.android.msp.plugin.IProtobufCodec
    public boolean isPBBean(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16a8beae", new Object[]{this, cls})).booleanValue() : Message.class.isAssignableFrom(cls);
    }

    private static String byte2hex(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("15ba6d01", new Object[]{bArr});
        }
        String str = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0".concat(String.valueOf(hexString));
            }
            str = str + " " + hexString;
        }
        return str;
    }

    private void logByteArray(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcfdf51b", new Object[]{this, bArr});
            return;
        }
        try {
            String byte2hex = byte2hex(bArr);
            LogUtil.record(2, TAG, "logByteArray", "PB字节 size=[" + bArr.length + "],  content=[" + byte2hex + riy.ARRAY_END_STR);
        } catch (Throwable th) {
            LogUtil.record(4, TAG, "logByteArray", th.getMessage());
        }
    }
}
