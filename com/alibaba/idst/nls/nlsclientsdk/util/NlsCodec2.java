package com.alibaba.idst.nls.nlsclientsdk.util;

import com.alibaba.idst.nls.internal.common.Config;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kge;

/* loaded from: classes2.dex */
public class NlsCodec2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static NlsCodec2 instanse;
    private static boolean sIsLibAvailable;

    public native long createDecoder();

    public native long createEncoder();

    public native int decode(long j, byte[] bArr, int i, short[] sArr);

    public native void destroyDecoder(long j);

    public native void destroyEncoder(long j);

    public native int encode(long j, short[] sArr, int i, byte[] bArr);

    static {
        kge.a(1132012397);
        sIsLibAvailable = true;
        if (Config.AUTO_LOAD_LIBS) {
            try {
                System.loadLibrary("ztcodec2");
            } catch (Throwable unused) {
                sIsLibAvailable = false;
            }
        }
        instanse = null;
    }

    public NlsCodec2() {
        instanse = this;
    }

    public boolean isAvailable() {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("f0d1d9ca", new Object[]{this})).booleanValue() : sIsLibAvailable;
    }

    public static NlsCodec2 getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (NlsCodec2) ipChange.ipc$dispatch("8bd14266", new Object[0]);
        }
        if (instanse == null) {
            instanse = new NlsCodec2();
        }
        return instanse;
    }
}
