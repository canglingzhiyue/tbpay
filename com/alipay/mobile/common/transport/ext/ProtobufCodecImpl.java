package com.alipay.mobile.common.transport.ext;

import android.util.Base64;
import com.alipay.mobile.common.transport.config.TransportConfigureItem;
import com.alipay.mobile.common.transport.config.TransportConfigureManager;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public class ProtobufCodecImpl implements ProtobufCodec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public String toString(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3cf5fa71", new Object[]{this, obj}) : "";
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public Object deserialize(Type type, byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("d52caa36", new Object[]{this, type, bArr});
        }
        Class cls = (Class) type;
        ProtobufCodec wireProtobufCodec = ProtobufCodecFactory.getWireProtobufCodec();
        if (wireProtobufCodec.isPBBean(cls)) {
            return wireProtobufCodec.deserialize(type, bArr);
        }
        ProtobufCodec googleProtobufCodec = ProtobufCodecFactory.getGoogleProtobufCodec();
        if (googleProtobufCodec.isPBBean(cls)) {
            return googleProtobufCodec.deserialize(type, bArr);
        }
        throw new UnsupportedOperationException("Unknown pd type, class = " + cls.getName());
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public byte[] serialize(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("e93ef1ba", new Object[]{this, obj});
        }
        if (obj == null) {
            throw new IllegalArgumentException("object is null");
        }
        ProtobufCodec wireProtobufCodec = ProtobufCodecFactory.getWireProtobufCodec();
        if (wireProtobufCodec.isPBBean(obj)) {
            return wireProtobufCodec.serialize(obj);
        }
        ProtobufCodec googleProtobufCodec = ProtobufCodecFactory.getGoogleProtobufCodec();
        if (googleProtobufCodec.isPBBean(obj)) {
            return googleProtobufCodec.serialize(obj);
        }
        throw new UnsupportedOperationException("Unknown pd type, class = " + obj.getClass().getName());
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("66457613", new Object[]{this, obj})).booleanValue() : ProtobufCodecFactory.getWireProtobufCodec().isPBBean(obj) || ProtobufCodecFactory.getGoogleProtobufCodec().isPBBean(obj);
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Class cls) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("16a8beae", new Object[]{this, cls})).booleanValue() : ProtobufCodecFactory.getWireProtobufCodec().isPBBean(cls) || ProtobufCodecFactory.getGoogleProtobufCodec().isPBBean(cls);
    }

    public static String exportBase64RawResp(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5e3f2bd", new Object[]{bArr});
        }
        try {
            return bArr.length > TransportConfigureManager.getInstance().getIntValue(TransportConfigureItem.EXPORT_RES_DATA_LIMIT) ? "" : Base64.encodeToString(bArr, 11);
        } catch (Throwable th) {
            LogCatUtil.warn("ProtobufCodec", "exportBase64RawResp fail", th);
            return "";
        }
    }
}
