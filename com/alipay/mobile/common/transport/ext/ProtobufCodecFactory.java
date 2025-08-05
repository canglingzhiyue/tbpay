package com.alipay.mobile.common.transport.ext;

import com.android.alibaba.ip.runtime.IpChange;

/* loaded from: classes3.dex */
public class ProtobufCodecFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static WireProtobufCodecImpl f5536a;
    private static GoogleProtobuf3CodecImpl b;
    private static ProtobufCodecImpl c;

    public static final ProtobufCodec getDefaultProtobufCodec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtobufCodec) ipChange.ipc$dispatch("88970ff5", new Object[0]);
        }
        ProtobufCodecImpl protobufCodecImpl = c;
        if (protobufCodecImpl != null) {
            return protobufCodecImpl;
        }
        synchronized (ProtobufCodecImpl.class) {
            if (c != null) {
                return c;
            }
            c = new ProtobufCodecImpl();
            return c;
        }
    }

    public static final ProtobufCodec getWireProtobufCodec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtobufCodec) ipChange.ipc$dispatch("64e8a2e5", new Object[0]);
        }
        WireProtobufCodecImpl wireProtobufCodecImpl = f5536a;
        if (wireProtobufCodecImpl != null) {
            return wireProtobufCodecImpl;
        }
        synchronized (WireProtobufCodecImpl.class) {
            if (f5536a != null) {
                return f5536a;
            }
            f5536a = new WireProtobufCodecImpl();
            return f5536a;
        }
    }

    public static final ProtobufCodec getGoogleProtobufCodec() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProtobufCodec) ipChange.ipc$dispatch("4bfe7419", new Object[0]);
        }
        GoogleProtobuf3CodecImpl googleProtobuf3CodecImpl = b;
        if (googleProtobuf3CodecImpl != null) {
            return googleProtobuf3CodecImpl;
        }
        synchronized (GoogleProtobuf3CodecImpl.class) {
            if (b != null) {
                return b;
            }
            b = new GoogleProtobuf3CodecImpl();
            return b;
        }
    }
}
