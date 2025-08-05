package com.alipay.mobile.common.transport.ext;

import android.text.TextUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.squareup.wire.Message;
import com.squareup.wire.i;
import java.lang.reflect.Type;
import tb.riy;

/* loaded from: classes3.dex */
public class WireProtobufCodecImpl implements ProtobufCodec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public String toString(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3cf5fa71", new Object[]{this, obj}) : "";
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public Object deserialize(Type type, byte[] bArr) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d52caa36", new Object[]{this, type, bArr});
        }
        if (type == null) {
            throw new IllegalArgumentException("type maybe null.");
        }
        if (!(type instanceof Class)) {
            throw new IllegalArgumentException("type is not Class Type.");
        }
        try {
            return new i(new Class[0]).a(bArr, (Class) type);
        } catch (Throwable th) {
            String exportBase64RawResp = ProtobufCodecImpl.exportBase64RawResp(bArr);
            StringBuilder sb = new StringBuilder();
            sb.append("deserialize fail. type is ");
            sb.append(type.toString());
            sb.append(", ");
            if (!TextUtils.isEmpty(exportBase64RawResp)) {
                str = "pb data:[" + exportBase64RawResp + riy.ARRAY_END_STR;
            } else {
                str = "";
            }
            sb.append(str);
            LogCatUtil.error("WireProtobufCodecImpl", sb.toString(), th);
            throw new RuntimeException(th);
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
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

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66457613", new Object[]{this, obj})).booleanValue() : obj instanceof Message;
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16a8beae", new Object[]{this, cls})).booleanValue();
        }
        try {
            return Message.class.isAssignableFrom(cls);
        } catch (Throwable th) {
            LogCatUtil.warn("WireProtobufCodecImpl", "isPBBean class " + th.toString());
            return false;
        }
    }
}
