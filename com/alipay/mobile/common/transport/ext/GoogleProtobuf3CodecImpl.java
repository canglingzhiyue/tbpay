package com.alipay.mobile.common.transport.ext;

import mtopsdk.common.util.StringUtils;
import com.alipay.mobile.common.transport.utils.LogCatUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Type;
import tb.riy;

/* loaded from: classes3.dex */
public class GoogleProtobuf3CodecImpl implements ProtobufCodec {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private Class f5534a = null;
    private Class b = null;

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public String toString(Object obj) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("3cf5fa71", new Object[]{this, obj}) : "";
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public Object deserialize(Type type, byte[] bArr) {
        String str;
        if (type == null) {
            throw new IllegalArgumentException("type maybe null.");
        }
        if (!(type instanceof Class)) {
            throw new IllegalArgumentException("type is not Class Type.");
        }
        if (bArr == null) {
            throw new IllegalArgumentException("data maybe null.");
        }
        Class cls = (Class) type;
        if (!isPBBean(cls)) {
            throw new UnsupportedOperationException("[deserialize] Not support google protobuf , class = " + cls.getName());
        }
        try {
            return cls.getDeclaredMethod("parseFrom", byte[].class).invoke(cls, bArr);
        } catch (Throwable th) {
            String exportBase64RawResp = ProtobufCodecImpl.exportBase64RawResp(bArr);
            StringBuilder sb = new StringBuilder();
            sb.append("deserialize fail. type is ");
            sb.append(type.toString());
            sb.append(", ");
            if (!StringUtils.isEmpty(exportBase64RawResp)) {
                str = "pb data:[" + exportBase64RawResp + riy.ARRAY_END_STR;
            } else {
                str = "";
            }
            sb.append(str);
            LogCatUtil.error("GoogleProtobuf3CodecImpl", sb.toString(), th);
            throw new RuntimeException(th);
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public byte[] serialize(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("object maybe null.");
        }
        if (!isPBBean((Class) obj.getClass())) {
            throw new UnsupportedOperationException("[deserialize] Not support google protobuf , class = " + obj.getClass().getName());
        }
        try {
            return (byte[]) obj.getClass().getMethod("toByteArray", new Class[0]).invoke(obj, new Object[0]);
        } catch (Throwable th) {
            LogCatUtil.error("GoogleProtobuf3CodecImpl", "serialize fail. type is " + obj.getClass().getName(), th);
            throw new RuntimeException(th);
        }
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66457613", new Object[]{this, obj})).booleanValue();
        }
        if (obj == null) {
            LogCatUtil.warn("GoogleProtobuf3CodecImpl", "[isPBBean] object is null.");
            return false;
        }
        Class<?> cls = obj.getClass();
        return isGoogleProtobuf(cls) || isGoogleProtobufLite(cls);
    }

    @Override // com.alipay.mobile.common.transport.ext.ProtobufCodec
    public boolean isPBBean(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("16a8beae", new Object[]{this, cls})).booleanValue();
        }
        if (cls != null) {
            return isGoogleProtobuf(cls) || isGoogleProtobufLite(cls);
        }
        LogCatUtil.warn("GoogleProtobuf3CodecImpl", "[isPBBean] clazz is null.");
        return false;
    }

    public final boolean isGoogleProtobuf(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be05dac", new Object[]{this, cls})).booleanValue();
        }
        Class generatedMessageV3Class = getGeneratedMessageV3Class();
        return generatedMessageV3Class != null && generatedMessageV3Class.isAssignableFrom(cls);
    }

    public final boolean isGoogleProtobufLite(Class cls) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("634e8c9e", new Object[]{this, cls})).booleanValue();
        }
        Class generatedMessageLiteClass = getGeneratedMessageLiteClass();
        return generatedMessageLiteClass != null && generatedMessageLiteClass.isAssignableFrom(cls);
    }

    public Class getGeneratedMessageLiteClass() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("e530fb50", new Object[]{this});
        }
        this.b = null;
        try {
            this.b = Class.forName("com.google.protobuf.GeneratedMessageLite");
            if (this.b == null) {
                LogCatUtil.warn("GoogleProtobuf3CodecImpl", "[isGoogleProtobufLite] generatedMessageLiteClass is null");
            }
            return this.b;
        } catch (Throwable unused) {
            return this.b;
        }
    }

    public Class getGeneratedMessageV3Class() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Class) ipChange.ipc$dispatch("65aab8e1", new Object[]{this});
        }
        Class cls = this.f5534a;
        if (cls != null) {
            return cls;
        }
        try {
            this.f5534a = Class.forName("com.google.protobuf.GeneratedMessageV3");
            if (this.f5534a == null) {
                LogCatUtil.warn("GoogleProtobuf3CodecImpl", "[getGeneratedMessageV3Class] generatedMessageV3Class is null");
            }
            return this.f5534a;
        } catch (Throwable unused) {
            return null;
        }
    }
}
