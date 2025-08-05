package com.taobao.trtc.utils;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import tb.kge;

/* loaded from: classes9.dex */
public class j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        kge.a(-194150444);
    }

    public static byte[] a(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("27137f8e", new Object[]{bArr});
        }
        Inflater inflater = new Inflater();
        inflater.setInput(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[bArr.length * 10];
        try {
            int inflate = inflater.inflate(bArr2);
            inflater.end();
            return Arrays.copyOfRange(bArr2, 0, inflate);
        } catch (DataFormatException e) {
            TrtcLog.a("TrtcZlibCompresser", "decompress exception, try use as uncompressed msg.");
            e.printStackTrace();
            return bArr;
        }
    }
}
