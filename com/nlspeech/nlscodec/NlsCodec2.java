package com.nlspeech.nlscodec;

import com.alibaba.idst.nls.internal.common.Config;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes4.dex */
public class NlsCodec2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private static boolean f8094a;
    private static NlsCodec2 b;

    public native long createDecoder();

    public native long createEncoder();

    public native int decode(long j, byte[] bArr, int i, short[] sArr);

    public native void destroyDecoder(long j);

    public native void destroyEncoder(long j);

    public native int encode(long j, short[] sArr, int i, byte[] bArr);

    static {
        kge.a(-1398089084);
        f8094a = true;
        if (Config.AUTO_LOAD_LIBS) {
            try {
                System.loadLibrary("ztcodec2");
            } catch (Throwable unused) {
                f8094a = false;
            }
        }
        b = null;
    }

    public NlsCodec2() {
        b = this;
    }

    public static NlsCodec2 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsCodec2) ipChange.ipc$dispatch("76a3ea95", new Object[0]);
        }
        if (b == null) {
            b = new NlsCodec2();
        }
        return b;
    }
}
